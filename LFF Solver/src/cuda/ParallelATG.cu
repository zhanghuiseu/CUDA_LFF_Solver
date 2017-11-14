	/*
	 * ParallelATG.cu
	 *
	 *  Created on: Nov 4, 2017
	 *      Author: zy
	 */

	#include <iostream>
	#include <algorithm>

	#include "ParallelATG.cuh"
	#include "./../ConstraintParser/ConstraintParameter.cuh"
	#include "./../model/CoodinateDouble.cuh"
	#include "./../model/IntervalDouble.cuh"
	#include "./../model/PriorityDouble.cuh"
	#include "./../model/FullCoveredInfo.cuh"
	#include "./../model/PredictValue.cuh"
    #include "./../solver/ATG.h"
	#include "./../solver/PCATG.h"
	#include "./../solver/ConstantValue.h"
	#include "./../solver/SolverParameter.h"
	#include "./../ErrorHandle/ErrorHandle.cuh"
	#include "./../model/Classification.cuh"
	#include "CLF.cuh"
	#include "ExcuteConstraint.cuh"
	#include "./../ConstraintParser/ConstraintParameter.cuh"

	#include "cuda_runtime.h"
	#include "device_launch_parameters.h"
	#include "device_functions.hpp"
	#include "math_functions.h"
	#include <thrust/host_vector.h>
	#include <thrust/device_vector.h>
	#include <thrust/generate.h>
	#include <thrust/sort.h>
	#include <thrust/copy.h>


	using namespace std;


	bool ParallelATG::generateTestDataForSolver(const int MaxTryParamSize)
	{
		//ParallelATG::testExtremeRumtimeValue();
		//ParallelATG::testMergeFunction();
		cudaError_t cudaStatus;
		//当前的的搜索变量传输到显卡GPU
		double* dev_parameters = NULL;
		cudaStatus = cudaMalloc((void**)&dev_parameters, ConstraintParameter::NUM_OF_PARAM * sizeof(double));
		ErrorHandle::dealError(cudaStatus,"cudaMalloc((void**)&dev_parameters, ConstraintParameter::NUM_OF_PARAM * sizeof(double));");
		cudaStatus = cudaMemcpy(dev_parameters,ATG::parameters,ConstraintParameter::NUM_OF_PARAM * sizeof(double),cudaMemcpyHostToDevice);
		ErrorHandle::dealError(cudaStatus,"cudaMemcpy(dev_parameters,ATG::parameters,ConstraintParameter::NUM_OF_PARAM * sizeof(double),cudaMemcpyHostToDevice);");

		//在当前搜索点的周围随机抽点
		const int row = ConstraintParameter::Num_Of_Constraints;
		const int col = ParallelATG::RandomLengthInt;
		CoodinateDouble* predictArray = new CoodinateDouble[row*col];
		CoodinateDouble (*predictMat)[col] = (CoodinateDouble(*)[col])predictArray;
		ParallelATG::initRandomMatrix(predictMat,row,col);

		//随机点传输到显卡
		CoodinateDouble* dev_predictArray = NULL;
		cudaStatus = cudaMalloc((void**)&dev_predictArray, row * col * sizeof(CoodinateDouble));
		ErrorHandle::dealError(cudaStatus,"cudaMalloc((void**)&dev_predictArray, row * col * sizeof(CoodinateDouble));");
		cudaStatus = cudaMemcpy(dev_predictArray,predictArray,row * col * sizeof(CoodinateDouble),cudaMemcpyHostToDevice);
		ErrorHandle::dealError(cudaStatus,"cudaMemcpy(dev_predictArray,predictArray,row * col * sizeof(CoodinateDouble),cudaMemcpyHostToDevice);");

		//并行计算所有的预测解的运行时刻值
		calaRuntimeValue(ATG::currentSearchParamIndex,dev_predictArray,dev_parameters,row,col);

		//申请覆盖确认的空间
		FullCoveredInfo* dev_coveredInfo = NULL;
		cudaStatus = cudaMalloc((void**)&dev_coveredInfo, col * sizeof(FullCoveredInfo));
		ErrorHandle::dealError(cudaStatus,"cudaMalloc((void**)&dev_coveredInfo, col * sizeof(FullCoveredInfo));");

		//给所有的测试用例生成最终的覆盖结果，用于下面的获取可行解的index
		ParallelATG::isFullCovered(dev_coveredInfo,dev_predictArray,row,col);

		//CPU验证模块
		bool findSolution = false;
		bool check=checkisFullCovered(dev_coveredInfo,predictArray,findSolution,row,col);
        cout<<"*****  Check Over，Res:  "<<boolalpha<<check<<endl;
        cout<<"*****  Find   Solution:  "<<findSolution<<endl;

        FullCoveredInfo* coveredInfo = new FullCoveredInfo();
        ParallelATG::getFullCoveredIndex(coveredInfo,dev_coveredInfo,row,col);

        //打印相应的关系
		cout<<"Now Search Point "<<ATG::parameters[ATG::currentSearchParamIndex]<<endl;
		for(int i=0;i<ConstraintParameter::NUM_OF_PARAM ;i++)
			cout<<ATG::parameters[i]<<" , ";
		cout<<endl;
		cout<<"The Predict Solution FullCovered Info Is As Following: Index： "<<coveredInfo->index<<endl;
		cout<<"The Predict Solution FullCovered Info Is As Following: VaildNum： "<<coveredInfo->vaildNum<<endl;

		//第一次运行结果的初步判断，
		bool isCoveredTargetPC = false;
        if(coveredInfo[0].isCovered)
        {
        	cout<<"**********************    Find Solutions     **********************"<<endl;
        	//设置返回结果
        	isCoveredTargetPC = true;
        	//设置解向量
        	ATG::parameters[ATG::currentSearchParamIndex] = predictArray[coveredInfo[0].index].x;

        	//离开之前做一下内存清理
    		delete coveredInfo;
    		cudaFree( dev_predictArray);
    		cudaFree( dev_parameters);
        	return isCoveredTargetPC;
        }

		//这个保存的是已经计算过的结果的指针和对应的元素的Size
		CoodinateDouble* dev_calaArray = NULL;
		/*
		 * 注意这里保存的是计算矩阵的的列的数量，行数是等于约束的数量，
		 * 而且这里的预测的size，采用的是列的数量col
		 * */
		int calaArraySize = 0;
		int predictArraySize = col;
		int vaildPredictArraySize = coveredInfo->vaildNum;

        /*
         * 尝试的测试点的数量，用于搜索任务的参数上限的判断,
         * */
		int tryParamNum = col;
		while(tryParamNum < MaxTryParamSize + 1024 && isCoveredTargetPC == false)
		{
			cout<<"############  Cala CLFF Loop:  "<<endl;
			/*
			 * @合并calaArray和predictArray到calaArray，分为下面两种情况：
			 * 1）calaArray为NULL，直接把predictArray赋值给calaArray
			 * 2) 二者都不为空，合并predictArray和calaArray到mergeArray，返回mergeArray即可，同时calaArray和predictArray内存释放掉
			 * 关于清楚运行时刻值的异常值处理，ZY的做法没有做任何的处理
			 * LFF Solver的做法是这样的，先计算运行时刻值，然后计算所有解的优先级，假如存在解，直接返回，否者的话，挑选合格的解添加到下一轮去做运算
			 * */
			dev_calaArray = ParallelATG::mergePredictArrayToCalaArray(dev_coveredInfo,dev_calaArray, calaArraySize, dev_predictArray, predictArraySize,vaildPredictArraySize,row);
			calaArraySize = calaArraySize + vaildPredictArraySize;
			dev_predictArray = NULL;
			vaildPredictArraySize = 0;

			/*
			 * 申请内存并做分类
			 * */
			Classification* dev_classification = NULL;
			cudaStatus = cudaMalloc((void**)&dev_classification, row * calaArraySize * sizeof(Classification));
			ErrorHandle::dealError(cudaStatus,"cudaMalloc((void**)&dev_classification, row * calaArraySize * sizeof(Classification));");
			//分类操作
			ParallelATG::classificationForAllCase(dev_classification,dev_calaArray,calaArraySize,row);

			//申请每两个点的拟合的接区间
			IntervalDouble* dev_intervel = NULL;
			cudaStatus = cudaMalloc((void**)&dev_intervel, row * calaArraySize * sizeof(IntervalDouble));
			ErrorHandle::dealError(cudaStatus,"cudaMalloc((void**)&dev_intervel, row * calaArraySize * sizeof(IntervalDouble));");
			ParallelATG::calsCLFF(dev_intervel,dev_classification,dev_calaArray,calaArraySize,row);

			/*
			 * 区间交运算
			 * */
			IntervalDouble* dev_finalIntervel = NULL;
			cudaStatus = cudaMalloc((void**)&dev_finalIntervel, calaArraySize * sizeof(IntervalDouble));
			ErrorHandle::dealError(cudaStatus,"cudaMalloc((void**)&dev_intersectionIntervel, calaArraySize * sizeof(IntervalDouble));");
			ParallelATG::intersectionIntervel(dev_finalIntervel,dev_intervel,calaArraySize);

			/*
			 * 预测可行解
			 * */
			PredictValue* dev_PredictValue = NULL;
			cudaStatus = cudaMalloc((void**)&dev_PredictValue,calaArraySize * sizeof(PredictValue));
			ErrorHandle::dealError(cudaStatus,"cudaMalloc((void**)&dev_PredictValue,calaArraySize * sizeof(PredictValue));");

			ParallelATG::calaPredictValueFromFinalInterval(dev_PredictValue,dev_finalIntervel,calaArraySize);

			int PredictValueSize = ParallelATG::calaPredictValueSize(dev_PredictValue,calaArraySize);
			cout<<"Vaild Predict Num is "<<PredictValueSize<<endl;

			/*
			 * 收集零点
			 * */
			//申请零点的内存
			PredictValue* dev_ZerosValue = NULL;
			cudaStatus = cudaMalloc((void**)&dev_ZerosValue, row * calaArraySize * sizeof(PredictValue));
			ErrorHandle::dealError(cudaStatus,"cudaMalloc((void**)&dev_ZerosValue, row * calaArraySize * sizeof(PredictValue));");
			//根据分类信息和点的位置 使用区间细化规则和扩展规则 来计算所有的可能的预测解
			ParallelATG::collectZeros(dev_ZerosValue,dev_classification,dev_calaArray,calaArraySize,row);
			//统计所有的零点的预测解的数量,依据的是区间细化规则和扩展规则
			vector<int> count = ParallelATG::calaValidZeroNum(dev_ZerosValue,calaArraySize,row);

			/*
			 *  根据区间细化和区间扩展的规则，收集所有的valid和预测解
			 * */
			int finalAllPredictValueSize = 0;
			//收集合并零点
			PredictValue* dev_finalAllPredictValue = ParallelATG::collectValidZero(count,dev_ZerosValue,calaArraySize,row,dev_PredictValue,PredictValueSize,finalAllPredictValueSize);
			cout<<"经过区间扩展和区间细化得到的有效的预测解的数量： "<<finalAllPredictValueSize<<endl;

			//生成这一轮的预测解
			dev_predictArray = NULL;
			cudaStatus = cudaMalloc((void**)&dev_predictArray, row * finalAllPredictValueSize * sizeof(CoodinateDouble));
			ErrorHandle::dealError(cudaStatus,"cudaMalloc((void**)&dev_predictArray, row * col * sizeof(CoodinateDouble));");

			/*
			 * 下面是针对预测解的运行时刻值计算，然后找到可行解
			 * */
			int col = finalAllPredictValueSize;
			//根据预测的解向量生成预测矩阵
			ParallelATG::gereratePredictArray(dev_predictArray,row,col,dev_finalAllPredictValue);

			//并行计算所有的预测解的运行时刻值
			calaRuntimeValue(ATG::currentSearchParamIndex,dev_predictArray,dev_parameters,row,col);

			//申请覆盖确认的空间
			FullCoveredInfo* dev_coveredInfo = NULL;
			cudaStatus = cudaMalloc((void**)&dev_coveredInfo, col * sizeof(FullCoveredInfo));
			ErrorHandle::dealError(cudaStatus,"cudaMalloc((void**)&dev_coveredInfo, col * sizeof(FullCoveredInfo));");

			//给所有的测试用例生成最终的覆盖结果，用于下面的获取可行解的index
			ParallelATG::isFullCovered(dev_coveredInfo,dev_predictArray,row,col);

			//CPU验证模块
/*			bool findSolution = false;
			bool check=checkisFullCovered(dev_coveredInfo,predictArray,findSolution,row,col);
	        cout<<"*****  Check Over，Res:  "<<boolalpha<<check<<endl;
	        cout<<"*****  Find   Solution:  "<<findSolution<<endl;*/

	        ParallelATG::getFullCoveredIndex(coveredInfo,dev_coveredInfo,row,col);
			cout<<"The Predict Solution FullCovered Info Is As Following: Index： "<<coveredInfo->index<<endl;
			cout<<"The Predict Solution FullCovered Info Is As Following: VaildNum： "<<coveredInfo->vaildNum<<endl;

			//运行结果的初步判断，
	        if(coveredInfo[0].isCovered)
	        {
	        	//设置返回结果
	        	isCoveredTargetPC = true;
	        	//设置解向量
	        	CoodinateDouble* ans=new CoodinateDouble();
	        	int offset = coveredInfo[0].index;
	        	cudaStatus = cudaMemcpy(ans,dev_predictArray,offset * sizeof(CoodinateDouble),cudaMemcpyDeviceToHost);
	        	ErrorHandle::dealError(cudaStatus,"cudaMemcpy(ans,dev_predictArray,offset * sizeof(CoodinateDouble),cudaMemcpyDeviceToHost);");
	        	ATG::parameters[ATG::currentSearchParamIndex] = ans->x;

	        	//离开之前做一下内存清理
	        	delete ans;
	    		delete coveredInfo;
	    		cudaFree( dev_predictArray);
	    		cudaFree( dev_parameters);
	        	break;
	        }else
	        {
				tryParamNum += col;
				cudaFree(dev_classification);
				cudaFree(dev_intervel);
				cudaFree(dev_finalIntervel);
				cudaFree(dev_PredictValue);
				cudaFree(dev_ZerosValue);
				cudaFree(dev_finalAllPredictValue);
	        }
		}


		delete coveredInfo;
		cudaFree( dev_predictArray);
		cudaFree( dev_parameters);

		if(isCoveredTargetPC)
			cout<<"**********************    Find Solutions     **********************"<<endl;
		else
			cout<<"**********************    No No NO Solutions     **********************"<<endl;
		return isCoveredTargetPC;
	}



	/*
	 * 完成第一步的初始化，初始化的思想是在给出的当前的搜索的起点周围扩展，分为下面两种情况
	 * 1）对于整形int： 直接[i-RandomLengthInt/2,i+RandomLengthInt/2]做扩展，step一般为1
	 * 2）对于浮点型float：直接[i-RandomLengthFloat/2,i+RandomLengthFloat/2]做扩展，step一般为1
	 * */
	void ParallelATG::initRandomMatrix(CoodinateDouble (*mat)[ParallelATG::RandomLengthInt],int row,int col)
	{
		int currentIndex = ATG::currentSearchParamIndex;
		int center = ATG::parameters[currentIndex];

		//浮点数部分的初始化
		if(ConstraintParameter::constraintVarType[currentIndex]==ConstantValue::FloatType)
		{
			int begin = center - (ParallelATG::RandomLengthFloat / 2 -1);
			int left = begin, right = begin;
			for(int i = 0; i < col; i++)
			{
				left = begin + i * ParallelATG::StepDouble;
				right = left + ParallelATG::StepDouble;
				if (PCATG::random() <= 0.5)
					mat[0][i].x = PCATG::random()*(right - left) + left;
				else
					mat[0][i].x = right - PCATG::random()*(right - left);
			}

			mat[0][col/2].x = center;

			for(int i = 1; i < row; i++)
			{
				for(int j = 0; j < col; j++)
				{
					mat[i][j].x = mat[0][j].x;
				}
			}

		}else
		{   //整数部分的初始化
			int begin = center - (ParallelATG::RandomLengthInt / 2 -1);
			int left = begin;
			for(int i = 0; i < col; i++)
			{
				left = begin + i * ParallelATG::StepInt;
				mat[0][i].x = left;
			}

			for(int i = 1; i < row; i++)
			{
				for(int j = 0; j < col; j++)
				{
					mat[i][j].x = mat[0][j].x;
				}
			}
		}
		return;
	}


	/*
	 * 判断是否有满足复合约束的可行解
	 * */
	void ParallelATG::isFullCovered(FullCoveredInfo* dev_coveredInfo,CoodinateDouble* dev_predictArray,
			const int row,const int col)
	{
		Block res = HardwareStrategy::getHardwareStrategy(col);
		calaFeasibleSolution<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_coveredInfo , dev_predictArray , col);
		cudaError_t cudaStatus = cudaGetLastError();
		ErrorHandle::dealError(cudaStatus,"calaFeasibleSolution<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_coveredInfo , dev_predictArray , col);");
	}


	/*
	 *  这个核函数是在上一轮的预测解中寻找可行解
	 *  利用了折半查找的思想，不过这里使用并行化直接查找
	 * */
	__global__ void findFullCoverIndex(FullCoveredInfo* dev_coveredInfo,const int step,const int SIZE)
	{
		int i = threadIdx.x + blockIdx.x*blockDim.x;
		/*
		 *  这里的条件判断，需要注意，首先要在数组范围内，不可以越界
		 *  其次，假如第一个元素已经标记覆盖了，直接返回，无需再接下去做计算
		 *  假如第一个元素还没有标记覆盖，那么就去做折半的比较，比较规则如下：
		 *  如果dev_coveredInfo[i]标记为覆盖，无需去和dev_coveredInfo[i+step]作比较
		 *  如果dev_coveredInfo[i]标记为未覆盖，直接把dev_coveredInfo[i+step]信息赋值即可
		 *
		 * */
		bool condition = (i < SIZE) & (dev_coveredInfo[0].isCovered==false) & (dev_coveredInfo[i].isCovered==false);
		if (condition)
		{
			dev_coveredInfo[i].isCovered = dev_coveredInfo[i+step].isCovered;
			dev_coveredInfo[i].index = dev_coveredInfo[i+step].index;
		}
	}

	/*
	 *  这个核函数是计算所有的有效的接向量的数量
	 *  利用了折半查找的思想，不过这里使用并行化直接查找
	 * */
	__global__ void sumOfVaildSolution(FullCoveredInfo* dev_coveredInfo,const int step,const int SIZE)
	{
		int i = threadIdx.x + blockIdx.x*blockDim.x;
		/*
		 *  这里的条件判断，需要注意，首先要在数组范围内，不可以越界
		 *  就是规约求和
		 * */
		if (i < SIZE)
		{
			dev_coveredInfo[i].vaildNum += dev_coveredInfo[i+step].vaildNum;
		}
	}

	/*
	 * 上一轮的预测点执行结束之后判断是否存在已经覆盖复合约束的解向量
	 * 假如存在，直接返回对应的index即可
	 * 否则参与接下来的预测
	 * */
	void ParallelATG::getFullCoveredIndex(FullCoveredInfo* coveredInfo,FullCoveredInfo* dev_coveredInfo,const int row,const int col)
	{
		cudaError_t cudaStatus;
		int size = col/2;
		int step = (col+1)/2;
		while(size > 0)
		{
			//计算分配硬件资源
			Block res = HardwareStrategy::getHardwareStrategy(size);

			//并行寻找测试用例index
			findFullCoverIndex<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_coveredInfo,step,size);
			cudaStatus = cudaGetLastError();
			ErrorHandle::dealError(cudaStatus,"findFullCoverIndex<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_coveredInfo,step,size);");

			//并行规约计算有效的solution的数量
			sumOfVaildSolution<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_coveredInfo,step,size);
			cudaStatus = cudaGetLastError();
			ErrorHandle::dealError(cudaStatus,"sumOfVaildSolution<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_coveredInfo,step,size);");

			//cudaDeviceSynchronize();
			size = step/2;
			step = (step+1)/2;
		}
		cudaStatus = cudaMemcpy(coveredInfo,dev_coveredInfo,1 * sizeof(FullCoveredInfo),cudaMemcpyDeviceToHost);
		ErrorHandle::dealError(cudaStatus,"cudaMemcpy(coveredInfo,dev_coveredInfo,1 * sizeof(FullCoveredInfo),cudaMemcpyDeviceToHost);");
	}


	/*
	 * 把calaArray和predictArray合并到一起，这里做的就是一个简单的归并，
	 * 关于这个函数并行化的做法的效率问题：
	 * 我查阅过并行版本的归并排序mergeSort，它的合并部分就是这么做的，所以这里也采用这样的做法
	 * */
	CoodinateDouble* ParallelATG::mergePredictArrayToCalaArray(FullCoveredInfo* dev_coveredInfo,CoodinateDouble* dev_calaArray,const int calaArraySize,
			CoodinateDouble* dev_predictArray,const int predictArraySize,const int vaildPredictArraySize, const int row)
	{
		if(calaArraySize == 0 && predictArraySize == vaildPredictArraySize)
		{
			return dev_predictArray;
		}else
		{
			//申请最终的合并的序列
			CoodinateDouble* dev_mergeArray = NULL;
			//注意这里使用的是有效的Size
			const int mergeArraySize = calaArraySize + vaildPredictArraySize;
			const int finalSize = mergeArraySize * row;
			cudaError_t cudaStatus = cudaMalloc((void**)&dev_mergeArray, finalSize * sizeof(CoodinateDouble));
			ErrorHandle::dealError(cudaStatus,"cudaMalloc((void**)&dev_mergeArray, finalSize * sizeof(CoodinateDouble));");

			//使用CUDA并行化合并部分
			merge(dev_coveredInfo,dev_mergeArray,mergeArraySize,dev_calaArray,calaArraySize, dev_predictArray,predictArraySize,row);

			//释放做过合并的元素序列
			cudaFree( dev_calaArray);
			cudaFree( dev_predictArray);

			//返回合并后的结果
			return dev_mergeArray;
		}
	}


	/*
	 *  根据节点的信息计算并更新分类信息
	 *  注意，上述的case0-5都是相互独立的，也即是说。两个点的只能属于case0-5的其中一个
	 * */
	__global__ void classification(Classification* dev_classification,CoodinateDouble* dev_calaArray,
			const int calaArraySize,const int cmpType)
	{
		int i = threadIdx.x + blockIdx.x*blockDim.x;
		bool condition = (i>=1) & (i < calaArraySize);
		if(condition)
		{
			CoodinateDouble* a = dev_calaArray + i - 1;
			CoodinateDouble* b = dev_calaArray + i;
			dev_classification[i].zero  = ((a->x)*(b->y)-(b->x)*(a->y))/((b->y)-(a->y));
			dev_classification[i].case0 = case0(a,b,cmpType);
			dev_classification[i].case1 = case1(a,b,cmpType);
			dev_classification[i].case2 = case2(a,b,cmpType);
			dev_classification[i].case3 = case3(a,b,cmpType);
			dev_classification[i].case4 = case4(a,b,cmpType);
			dev_classification[i].case5 = case5(a,b,cmpType);
			dev_classification[i].hasIntervel = (dev_classification[i].case0 | dev_classification[i].case2 | dev_classification[i].case3);

			//下面是测试代码
			int calaType = (int)(dev_classification[i].case0)*1
					     + (int)(dev_classification[i].case1)*2
					     + (int)(dev_classification[i].case2)*4
					     + (int)(dev_classification[i].case3)*8
					     + (int)(dev_classification[i].case4)*16
					     + (int)(dev_classification[i].case5)*32;
			//printf("calatype:  %d\n",calaType);
/*			if(calaType!=1 && calaType!=2 && calaType!=4 && calaType!=8 && calaType!=16 && calaType!=32)
			{
				printf("Thread %d Classification Type case0: %d ,case1: %d ,case2: %d ,case3: %d ,case4: %d ,case5: %d , calaType: %d point a(%f,%f),b(%f,%f)\n"
				,i ,(int)(dev_classification[i].case0),(int)(dev_classification[i].case1),(int)(dev_classification[i].case2),
				 (int)(dev_classification[i].case3),(int)(dev_classification[i].case4),(int)(dev_classification[i].case5),
				 calaType,a->x,a->y,b->x,b->y
				 );
			}*/
			//if(dev_classification[i].case5)
				//printf("case4：(%f,%f),(%f,%f) Zeros: %f\n",a->x,a->y,b->x,b->y,dev_classification[i].zero);
		}
	}


	/*
	 * 启动分类操作
	 * */
	void ParallelATG::classificationForAllCase(Classification* dev_classification,CoodinateDouble* dev_calaArray,
				const int calaArraySize,const int row)
	{
		cudaError_t cudaStatus;
		Block res = HardwareStrategy::getHardwareStrategy(calaArraySize);
		for(int i=0;i<row;i++)
		{
			//计算当前的偏移量以及对应约束的比较运算符类型
			int base = calaArraySize * i;
			int cmpType = ConstraintParameter::cinstraintCompType[i];

			//分类操作
			classification<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_classification + base,dev_calaArray + base,calaArraySize,cmpType);

			cudaStatus = cudaGetLastError();
			ErrorHandle::dealError(cudaStatus,"classification<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_classification + base,dev_calaArray + base,calaArraySize,cmpType);");
		}
	}

	/*
	 * 解区间的初始化
	 * */
	__global__ void initIntervel(IntervalDouble* dev_interval,CoodinateDouble* dev_calaArray,const int calaArraySize)
	{
		int i = threadIdx.x + blockIdx.x*blockDim.x;
		bool condition = (i>=1) & (i < calaArraySize);
		if(condition)
		{
			dev_interval[i].left  = dev_calaArray[i-1].x;
			dev_interval[i].right = dev_calaArray[i].x;
		}
	}

	/*
	 * 根据分类情况分别计算可行解区间
	 * 一共6中情况，如下，分别表示case0-5
	 *  100000 32 case5
	 *  010000 16 case4
	 *  001000 8  case3
	 *  000100 4  case2
	 *  000010 2  case1
	 *  000001 1  case0
	 *  000000 这种情况不可能出现
	 * */
	__global__ void calaIntervelForCase0(IntervalDouble* dev_interval,Classification* dev_classification,CoodinateDouble* dev_calaArray,
			const int calaArraySize)
	{
		int i = threadIdx.x + blockIdx.x*blockDim.x;
		bool condition = (i>=1) & (i < calaArraySize);
		if( condition & dev_classification[i].case0 )
		{
			//等式、不等式、均大于等于0，解是全区间
			dev_interval[i].left = dev_calaArray[i-1].x;
			dev_interval[i].right = dev_calaArray[i].x;
			dev_interval[i].hasIntervel = true;
		}
	}

	__global__ void calaIntervelForCase1(IntervalDouble* dev_interval,Classification* dev_classification,CoodinateDouble* dev_calaArray,
			const int calaArraySize)
	{
		int i = threadIdx.x + blockIdx.x*blockDim.x;
		bool condition = (i>=1) & (i < calaArraySize);
		if( condition & dev_classification[i].case1 )
		{
			//斜率不存在，无解
			dev_interval[i].left = dev_calaArray[i-1].x;
			dev_interval[i].right = dev_calaArray[i].x;
			dev_interval[i].hasIntervel = false;
		}
	}

	__global__ void calaIntervelForCase2(IntervalDouble* dev_interval,Classification* dev_classification,CoodinateDouble* dev_calaArray,
			const int calaArraySize)
	{
		int i = threadIdx.x + blockIdx.x*blockDim.x;
		bool condition = (i>=1) & (i < calaArraySize);
		if( condition & dev_classification[i].case2 )
		{
			//零点落在中间，左边区间
			dev_interval[i].left = dev_calaArray[i-1].x;
			dev_interval[i].right = dev_classification[i].zero;
			dev_interval[i].hasIntervel = true;
		}
	}

	__global__ void calaIntervelForCase3(IntervalDouble* dev_interval,Classification* dev_classification,CoodinateDouble* dev_calaArray,
			const int calaArraySize)
	{
		int i = threadIdx.x + blockIdx.x*blockDim.x;
		bool condition = (i>=1) & (i < calaArraySize);
		if( condition & dev_classification[i].case3 )
		{
			//零点落在中间，右边边区间
			dev_interval[i].left = dev_classification[i].zero;
			dev_interval[i].right = dev_calaArray[i].x;
			dev_interval[i].hasIntervel = true;
		}
	}

	__global__ void calaIntervelForCase4(IntervalDouble* dev_interval,Classification* dev_classification,CoodinateDouble* dev_calaArray,
			const int calaArraySize)
	{
		int i = threadIdx.x + blockIdx.x*blockDim.x;
		bool condition = (i>=1) & (i < calaArraySize);
		if( condition & dev_classification[i].case4 )
		{
			//均小于0，无解，零点落在左边
			dev_interval[i].left = dev_calaArray[i-1].x;
			dev_interval[i].right = dev_calaArray[i].x;
			dev_interval[i].hasIntervel = false;
		}
	}

	__global__ void calaIntervelForCase5(IntervalDouble* dev_interval,Classification* dev_classification,CoodinateDouble* dev_calaArray,
			const int calaArraySize)
	{
		int i = threadIdx.x + blockIdx.x*blockDim.x;
		bool condition = (i>=1) & (i < calaArraySize);
		if( condition & dev_classification[i].case5 )
		{
			//均小于0，无解，零点落在右边边
			dev_interval[i].left = dev_calaArray[i-1].x;
			dev_interval[i].right = dev_calaArray[i].x;
			dev_interval[i].hasIntervel = false;
		}
	}

	/*
	 * 计算拟合函数，其实就是计算可行解区间
	 * */
	void ParallelATG::calsCLFF(IntervalDouble* dev_interval,Classification* dev_classification,CoodinateDouble* dev_calaArray,
			const int calaArraySize,const int row)
	{
		cudaError_t cudaStatus;
		Block res = HardwareStrategy::getHardwareStrategy(calaArraySize);

		//区间的初始化
		for(int i=0;i<row;i++)
		{
			int base = calaArraySize * i;
			initIntervel<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_interval+base,dev_calaArray+base,calaArraySize);
			cudaStatus = cudaGetLastError();
			ErrorHandle::dealError(cudaStatus,"calaIntervelForCase0<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_interval+base,dev_classification+base,dev_calaArray+base,calaArraySize);");
		}

		//根据分类去计算解区间
		for(int i=0;i<row;i++)
		{
			//计算当前的偏移量以及对应约束的比较运算符类型
			int base = calaArraySize * i;

			calaIntervelForCase1<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_interval+base,dev_classification+base,dev_calaArray+base,calaArraySize);
			cudaStatus = cudaGetLastError();
			ErrorHandle::dealError(cudaStatus,"calaIntervelForCase1<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_interval+base,dev_classification+base,dev_calaArray+base,calaArraySize);");

			calaIntervelForCase4<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_interval+base,dev_classification+base,dev_calaArray+base,calaArraySize);
			cudaStatus = cudaGetLastError();
			ErrorHandle::dealError(cudaStatus,"calaIntervelForCase4<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_interval+base,dev_classification+base,dev_calaArray+base,calaArraySize);");

			calaIntervelForCase5<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_interval+base,dev_classification+base,dev_calaArray+base,calaArraySize);
			cudaStatus = cudaGetLastError();
			ErrorHandle::dealError(cudaStatus,"calaIntervelForCase5<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_interval+base,dev_classification+base,dev_calaArray+base,calaArraySize);");

			calaIntervelForCase2<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_interval+base,dev_classification+base,dev_calaArray+base,calaArraySize);
			cudaStatus = cudaGetLastError();
			ErrorHandle::dealError(cudaStatus,"calaIntervelForCase2<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_interval+base,dev_classification+base,dev_calaArray+base,calaArraySize);");

			calaIntervelForCase3<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_interval+base,dev_classification+base,dev_calaArray+base,calaArraySize);
			cudaStatus = cudaGetLastError();
			ErrorHandle::dealError(cudaStatus,"calaIntervelForCase3<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_interval+base,dev_classification+base,dev_calaArray+base,calaArraySize);");

			calaIntervelForCase0<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_interval+base,dev_classification+base,dev_calaArray+base,calaArraySize);
			cudaStatus = cudaGetLastError();
			ErrorHandle::dealError(cudaStatus,"calaIntervelForCase0<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_interval+base,dev_classification+base,dev_calaArray+base,calaArraySize);");

		}
	}

	/*
	 * 区间交运算
	 * */
	void ParallelATG::intersectionIntervel(IntervalDouble* dev_finalIntervel,IntervalDouble* dev_interval,const int calaArraySize)
	{
		cudaError_t cudaStatus;
		Block res = HardwareStrategy::getHardwareStrategy(calaArraySize);
		calaFinalIntervel<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_finalIntervel,dev_interval,calaArraySize);
		cudaStatus = cudaGetLastError();
		ErrorHandle::dealError(cudaStatus,"calaIntervelForCase3<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_interval+base,dev_classification+base,dev_calaArray+base,calaArraySize);");

	}

	/*
	 * 计算黄金分割点
	 * */
	__device__ double getGoldenPoint(double left,double right)
	{
		return (right - left)* SolverParameter::GoldenPointRatio + left;
	}

	/*
	 * 计算黄金分割点
	 * */
	__global__ void calaGoldenPoint(PredictValue* dev_PredictValue,IntervalDouble* dev_finalIntervel,const int calaArraySize)
	{
		int i = threadIdx.x + blockIdx.x*blockDim.x;
		bool condition = (i>=1) & (i<calaArraySize);
		if(condition)
		{
			dev_PredictValue[i].value = getGoldenPoint(dev_finalIntervel[i].left,dev_finalIntervel[i].right);
			dev_PredictValue[i].isValid = dev_finalIntervel[i].hasIntervel;

			//if(dev_PredictValue[i].isValid)
				//printf("Exist Predict Intervel(%f , %f , %d),GoldenPoint:%f\n", dev_finalIntervel[i].left,dev_finalIntervel[i].right,dev_finalIntervel[i].hasIntervel,dev_PredictValue[i].value);
		}
	}

	/*
	 * 根据归并区间生成测试用例
	 * */
	void ParallelATG::calaPredictValueFromFinalInterval(PredictValue* dev_PredictValue,IntervalDouble* dev_finalIntervel,const int calaArraySize)
	{
		cudaError_t cudaStatus;
		Block res = HardwareStrategy::getHardwareStrategy(calaArraySize);
		calaGoldenPoint<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_PredictValue,dev_finalIntervel,calaArraySize);
		cudaStatus = cudaGetLastError();
		ErrorHandle::dealError(cudaStatus,"calaGoldenPoint<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_PredictValue,dev_finalIntervel,calaArraySize);");
	}

	/*
	 * 初始化函数
	 * */
	__global__ void initCount(int* dev_count,PredictValue* dev_PredictValue,const int Size)
	{
		int i = threadIdx.x + blockIdx.x*blockDim.x;
		if (i < Size)
		{
			dev_count[i] = (int)(dev_PredictValue[i].isValid);
			dev_count[0] = 0;
		}
	}

	/*
	 * 使用二分查找计算有效的值的数量
	 * */
	__global__ void calaPredictNum(int* dev_count,const int step,const int Size)
	{
		int i = threadIdx.x + blockIdx.x*blockDim.x;
		//这里的条件判断，需要注意，首先要在数组范围内，不可以越界 , 就是规约求和
		if (i < Size)
		{
			dev_count[i] += dev_count[i+step];
		}
	}
	/*
	 * 统计预测值的数量
	 * */
	int ParallelATG::calaPredictValueSize(PredictValue* dev_PredictValue,const int calaArraySize)
	{
		int* dev_count = NULL;
		cudaError_t cudaStatus = cudaMalloc((void**)&dev_count,calaArraySize * sizeof(int));
		ErrorHandle::dealError(cudaStatus,"cudaMalloc((void**)&dev_count,calaArraySize * sizeof(int));");

		Block res = HardwareStrategy::getHardwareStrategy(calaArraySize);
		initCount<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_count,dev_PredictValue,calaArraySize);
		cudaStatus = cudaGetLastError();
		ErrorHandle::dealError(cudaStatus,"initCount<<<res.NumOfBlock , res.ThreadPreBlock>>>dev_count,dev_PredictValue,calaArraySize);");

		int size = calaArraySize/2;
		int step = (calaArraySize+1)/2;
		while(size > 0)
		{
			//计算分配硬件资源
			res = HardwareStrategy::getHardwareStrategy(size);
			//并行规约计算有效的的数量
			calaPredictNum<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_count,step,size);
			cudaStatus = cudaGetLastError();
			ErrorHandle::dealError(cudaStatus,"calaPredictNum<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_count,step,size);");
			size = step/2;
			step = (step+1)/2;
		}

		int* count = new int(0);
		cudaStatus = cudaMemcpy(count,dev_count,1 * sizeof(int),cudaMemcpyDeviceToHost);
		ErrorHandle::dealError(cudaStatus,"cudaMemcpy(count,dev_count,1 * sizeof(int),cudaMemcpyDeviceToHost);");

		int num = *count;
		delete count;
		cudaFree(dev_count);
		return num;
	}

	/*
	 * 收集零点部分，这是case4的处理部分
	 * */
	__global__ void collectZerosForCase4(PredictValue* dev_ZerosValue,Classification* dev_classification,
			CoodinateDouble* dev_calaArray,const int calaArraySize)
	{
		int i = threadIdx.x + blockIdx.x*blockDim.x;
		bool condition = (i>=1) & (i<calaArraySize);
		if( condition & dev_classification[i].case4
			& (i>=2) & (dev_classification[i].zero >= dev_calaArray[i-2].x))
		{
			dev_ZerosValue[i].value = getGoldenPoint(dev_calaArray[i-2].x,dev_classification[i].zero);
			dev_ZerosValue[i].isValid = true;

			//printf("Exist Case4:(%f,%f),GoldenValue:%f\n",dev_calaArray[i-2].x,dev_classification[i].zero,dev_ZerosValue[i].value);
		}
	}

	/*
	 * 区间细化部分：
	 * 收集零点部分，这是case5的处理部分
	 * */
	__global__ void collectZerosForCase5(PredictValue* dev_ZerosValue,Classification* dev_classification,
			CoodinateDouble* dev_calaArray,const int calaArraySize)
	{
		int i = threadIdx.x + blockIdx.x*blockDim.x;
		bool condition = (i>=1) & (i<calaArraySize);
		if( condition & dev_classification[i].case5
			& (i+1<calaArraySize) & (dev_classification[i].zero <= dev_calaArray[i+1].x) )
		{
			dev_ZerosValue[i].value = getGoldenPoint(dev_classification[i].zero,dev_calaArray[i+1].x);
			dev_ZerosValue[i].isValid = true;

			//printf("Exist Case5:(%f,%f),GoldenValue:%f\n",dev_classification[i].zero,dev_calaArray[i+1].x,dev_ZerosValue[i].value);
		}
	}

	/*
	 * 区间扩展部分，case4和5一起考虑的
	 * */
	__global__ void collectZerosIntervalExtendCase4And5(PredictValue* dev_ZerosValue,Classification* dev_classification,
			CoodinateDouble* dev_calaArray,const int calaArraySize)
	{
		int i = threadIdx.x + blockIdx.x*blockDim.x;
		bool condition = ((i==1) & dev_classification[i].case4)
				       | ((i==1) & dev_classification[i].case5)
				       | ((i==calaArraySize-1) & dev_classification[i].case4)
				       | ((i==calaArraySize-1) & dev_classification[i].case5);
		if( condition)
		{
			dev_ZerosValue[i].value = dev_classification[i].zero;
			dev_ZerosValue[i].isValid = true;

			//printf("Exist Case4 && Case5:%f\n",dev_classification[i].zero);
		}
	}

	/*
	 * 初始化工作
	 * */
	__global__ void initPredictValue(PredictValue* dev_PredictValue,const int Size)
	{
		int i = threadIdx.x + blockIdx.x*blockDim.x;
		if (i < Size)
		{
			dev_PredictValue[i].value = 0.0;
			dev_PredictValue[i].isValid = false;
		}
	}

	/*
	 * 收集所有的不可解的零点
	 * */
	void ParallelATG::collectZeros(PredictValue* dev_ZerosValue,Classification* dev_classification,CoodinateDouble* dev_calaArray,
			const int calaArraySize,const int row)
	{
		cudaError_t cudaStatus;
		Block res = HardwareStrategy::getHardwareStrategy(calaArraySize);
		for(int i=0;i<row;i++)
		{
			//计算当前的偏移量以及对应约束的比较运算符类型
			int base = calaArraySize * i;
			initPredictValue<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_ZerosValue+base,calaArraySize);
			cudaStatus = cudaGetLastError();
			ErrorHandle::dealError(cudaStatus,"initPredictValue<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_ZerosValue+base,calaArraySize);");
		}


		for(int i=0;i<row;i++)
		{
			//计算当前的偏移量以及对应约束的比较运算符类型
			int base = calaArraySize * i;
			collectZerosForCase4<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_ZerosValue+base,dev_classification+base,dev_calaArray+base,calaArraySize);
			cudaStatus = cudaGetLastError();
			ErrorHandle::dealError(cudaStatus,"collectZerosForCase4<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_ZerosValue+base,dev_classification+base,dev_calaArray+base,calaArraySize);");

			collectZerosForCase5<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_ZerosValue+base,dev_classification+base,dev_calaArray+base,calaArraySize);
			cudaStatus = cudaGetLastError();
			ErrorHandle::dealError(cudaStatus,"collectZerosForCase5<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_ZerosValue+base,dev_classification+base,dev_calaArray+base,calaArraySize);");

			collectZerosIntervalExtendCase4And5<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_ZerosValue+base,dev_classification+base,dev_calaArray+base,calaArraySize);
			cudaStatus = cudaGetLastError();
			ErrorHandle::dealError(cudaStatus,"collectZerosIntervalExtendCase4And5<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_ZerosValue+base,dev_classification+base,dev_calaArray+base,calaArraySize);");

		}
	}

	/*
	 * 统计所有的零点的预测解的数量
	 * 依据的是区间细化规则和扩展规则
	 * */
	vector<int> ParallelATG::calaValidZeroNum(PredictValue* dev_ZerosValue,const int calaArraySize,const int row)
	{
		//申请内存空间
		int* dev_count = NULL;
		cudaError_t cudaStatus = cudaMalloc((void**)&dev_count,row * calaArraySize * sizeof(int));
		ErrorHandle::dealError(cudaStatus,"cudaMalloc((void**)&dev_count,row * calaArraySize * sizeof(int));");

		Block res = HardwareStrategy::getHardwareStrategy(calaArraySize);
		for(int i=0;i<row;i++)
		{
			int base = i*calaArraySize;
			initCount<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_count+base,dev_ZerosValue+base,calaArraySize);
			cudaStatus = cudaGetLastError();
			ErrorHandle::dealError(cudaStatus,"initCount<<<res.NumOfBlock , res.ThreadPreBlock>>>dev_count,dev_PredictValue,calaArraySize);");
		}

		vector<int> num(row,0);
		int sum=0;
		int* count = new int(0);
		for(int i=0;i<row;i++)
		{
			int base = i*calaArraySize;
			int size = calaArraySize/2;
			int step = (calaArraySize+1)/2;
			while(size > 0)
			{
				//计算分配硬件资源
				res = HardwareStrategy::getHardwareStrategy(size);
				//并行规约计算有效的的数量
				calaPredictNum<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_count+base,step,size);
				cudaStatus = cudaGetLastError();
				ErrorHandle::dealError(cudaStatus,"calaPredictNum<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_count,step,size);");
				size = step/2;
				step = (step+1)/2;
			}
			cudaStatus = cudaMemcpy(count,dev_count+base,1 * sizeof(int),cudaMemcpyDeviceToHost);
			ErrorHandle::dealError(cudaStatus,"cudaMemcpy(count,dev_count+base,1 * sizeof(int),cudaMemcpyDeviceToHost);");
			num[i] = *count;
			sum += *count;
		}

		//下面是每一行的有效的预测解的计数
/*		cout<<endl;
		for(int i=0;i<row;i++)
			cout<<num[i]<<"  ";
		cout<<endl<<endl;*/

		delete count;
		cudaFree(dev_count);
		return num;
	}

	__device__ bool cmp(PredictValue a,PredictValue b)
	{
		return a.value<=b.value;
	}
	/*
	 * 收集计算好的零点预测解
	 * */
	__global__ void collectSortZeros(PredictValue** dev_zeroArray,PredictValue** dev_res,int* dev_size,const int calaArraySize,const int Size)
	{
		int index = threadIdx.x + blockIdx.x*blockDim.x;
		if( index < Size)
		{
			PredictValue* one = dev_zeroArray[index];
			PredictValue* target = dev_res[index];
			int targetSize = dev_size[index];
			for(int i=0,k=0;i<calaArraySize && k<targetSize;i++)
			{
				if(one[i].isValid)
				{
					target[k].value = one[i].value;
					target[k].isValid = one[i].isValid;
					k++;
				}
			}
			thrust::sort(target,target+targetSize,cmp);
		}
	}


	__global__ void printAll(PredictValue** dev_res,int* dev_size,const int Size)
	{
		int index = threadIdx.x + blockIdx.x*blockDim.x;
		if( index < Size )
		{
			PredictValue* one = dev_res[index];
			int oneSize = dev_size[index];
			for(int i=0;i<oneSize;i++)
				printf("Final Sorted Value(%f,%d) Size: %d index: %d\n",one[i].value,one[i].isValid,oneSize,i);
		}
	}

	/*
	 * 合并每两个有序的链表
	 * */
	__global__ void mergeTwoPredictArray(PredictValue* dev_one,const int oneSize,
			PredictValue* dev_lastArray,const int lastSize,PredictValue* dev_now,const int nowSize,const int Size)
	{
		int index = threadIdx.x + blockIdx.x*blockDim.x;
		if( index < Size )
		{
			int i=0;
			int j=0;
			int k=0;
			while(i<lastSize && j<nowSize)
			{
				if(dev_lastArray[i].value <= dev_now[j].value)
				{
					dev_one[k].isValid = dev_lastArray[i].isValid;
					dev_one[k].value = dev_lastArray[i].value;
					i++;
					k++;
				}else
				{
					dev_one[k].isValid = dev_now[j].isValid;
					dev_one[k].value = dev_now[j].value;
					j++;
					k++;
				}
			}
			while(i<lastSize)
			{
				dev_one[k].isValid = dev_lastArray[i].isValid;
				dev_one[k].value = dev_lastArray[i].value;
				i++;
				k++;
			}
			while(j<nowSize)
			{
				dev_one[k].isValid = dev_now[j].isValid;
				dev_one[k].value = dev_now[j].value;
				j++;
				k++;
			}
		}
	}

	__global__ void getAll(PredictValue* dev_one,const int oneSize,const int Size)
	{
		int index = threadIdx.x + blockIdx.x*blockDim.x;
		if( index < Size )
		{
			for(int i=0;i<oneSize;i++)
				printf("Final Predit Array: (%f,%d) calaSize: %d  index: %d\n",
						dev_one[i].value,dev_one[i].isValid,oneSize,i);
		}
	}

	/*
	 * 统计所有的零点的预测解的数量
	 * 依据的是区间细化规则和扩展规则
	 * */
	PredictValue* ParallelATG::collectValidZero(vector<int> num,PredictValue* dev_ZerosValue,const int calaArraySize,const int row,
			PredictValue* dev_PredictValue,const int PredictValueSize,int &finalAllPredictValueSize)
	{
		cudaError_t cudaStatus;
		const int SIZE = row+1;

		//指针数组设置所有的指针
		PredictValue** zeroArray = new PredictValue*[SIZE];
		for(int i=0;i<row;i++)
		{
			int base = i*calaArraySize;
			zeroArray[i]=(dev_ZerosValue+base);
		}
		zeroArray[row]=dev_PredictValue;
		num.push_back(PredictValueSize);

		//在显存中申请指针位置，并复制到GPU
		PredictValue** dev_zeroArray=NULL;
		cudaStatus = cudaMalloc((void**)&(dev_zeroArray),SIZE * sizeof(PredictValue*));
		ErrorHandle::dealError(cudaStatus,"cudaMalloc((void**)&(dev_zeroArray),SIZE * sizeof(PredictValue*));");
		cudaMemcpy(dev_zeroArray,zeroArray,SIZE * sizeof(PredictValue*),cudaMemcpyHostToDevice);

		//CPU中设置各个地址
		PredictValue** res=new PredictValue*[SIZE];
		for(int i=0;i<SIZE;i++)
		{
			cudaStatus = cudaMalloc((void**)&(res[i]),num[i] * sizeof(PredictValue));
			ErrorHandle::dealError(cudaStatus,"cudaMalloc((void**)&(res[i]),num[i] * sizeof(PredictValue));");
		}

		//在显存中申请指针位置，并复制到GPU
		PredictValue** dev_res=NULL;
		cudaStatus = cudaMalloc((void**)&(dev_res),SIZE * sizeof(PredictValue*));
		ErrorHandle::dealError(cudaStatus,"cudaMalloc((void**)&(dev_res),SIZE * sizeof(PredictValue*));");
		cudaMemcpy(dev_res,res,SIZE * sizeof(PredictValue*),cudaMemcpyHostToDevice);

		//设置各个数组的size
		int* size=new int[SIZE];
		for(int i=0;i<SIZE;i++)
		{
			size[i]=num[i];
		}

		//各个dev的size的记录
		int* dev_size=NULL;
		cudaStatus = cudaMalloc((void**)&(dev_size),SIZE * sizeof(int));
		ErrorHandle::dealError(cudaStatus,"cudaMalloc((void**)&(dev_size),SIZE * sizeof(int));");
		cudaMemcpy(dev_size,size,SIZE * sizeof(int),cudaMemcpyHostToDevice);

		//设置并发硬件参数，同事并发收集可行解
		Block stra = HardwareStrategy::getHardwareStrategy(SIZE);
		collectSortZeros<<<stra.NumOfBlock,stra.ThreadPreBlock>>>(dev_zeroArray,dev_res,dev_size,calaArraySize,SIZE);
		cudaStatus = cudaGetLastError();
		ErrorHandle::dealError(cudaStatus,"collectSortZeros<<<stra.NumOfBlock,stra.ThreadPreBlock>>>(dev_zeroArray,dev_res,calaArraySize,SIZE);");

		//测试代码
/*		printAll<<<stra.NumOfBlock,stra.ThreadPreBlock>>>(dev_res,dev_size,SIZE);
		cudaStatus = cudaGetLastError();
		ErrorHandle::dealError(cudaStatus,"printAll<<<stra.NumOfBlock,stra.ThreadPreBlock>>>(dev_res,dev_size,SIZE);");
		cout<<endl;*/

		//下面是
		int lastSize = 0;
		PredictValue* dev_lastArray = NULL;

		int calaSize = 1;
		stra = HardwareStrategy::getHardwareStrategy(calaSize);
		for(int i=0;i<SIZE;i++)
		{
			if(num[i]>0)
			{
				//设置one的size，并申请缓存
				int oneSize = lastSize + num[i];
				PredictValue* dev_one=NULL;
				cudaStatus = cudaMalloc((void**)&(dev_one),oneSize * sizeof(PredictValue));
				ErrorHandle::dealError(cudaStatus,"cudaMalloc((void**)&(dev_one),oneSize * sizeof(PredictValue));");

				//合并数组原始
				mergeTwoPredictArray<<<stra.NumOfBlock,stra.ThreadPreBlock>>>(dev_one,oneSize,dev_lastArray,lastSize,res[i],num[i],calaSize);

				//释放指针，并设置修改last指针
				cudaFree(dev_lastArray);
				dev_lastArray = dev_one;
				lastSize = oneSize;
			}
		}

		PredictValue* dev_finalAllPredictValue = dev_lastArray;
		finalAllPredictValueSize = lastSize;

		//测试代码
/*		stra = HardwareStrategy::getHardwareStrategy(1);
		getAll<<<stra.NumOfBlock,stra.ThreadPreBlock>>>(dev_finalAllPredictValue,finalAllPredictValueSize,1);*/

		delete zeroArray;
		cudaFree(dev_zeroArray);

		for(int i=0;i<SIZE;i++)
			cudaFree(res[i]);
		delete res;
		cudaFree(dev_res);

		delete size;
		cudaFree(dev_size);

		return dev_finalAllPredictValue;
	}

	/*
	 * 一个打印函数
	 * */
	__global__ void printMat(CoodinateDouble* dev_predictArray,const int row,const int col)
	{
		int i = threadIdx.x + blockIdx.x*blockDim.x;
		if( i < 1 )
		{
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					int k=i*col+j;
					printf("%f , ",dev_predictArray[k].x);
				}
				printf("\n");
			}
		}
	}

	/*
	 * 根据预测的可能的解向量（一个一维数组），生成预测矩阵（一个矩阵）
	 * */
	void ParallelATG::gereratePredictArray(CoodinateDouble* dev_predictArray,const int row ,const int finalAllPredictValueSize,PredictValue* dev_finalAllPredictValue)
	{
		cudaError_t cudaStatus;
		Block res = HardwareStrategy::getHardwareStrategy(finalAllPredictValueSize);
		generatePredictMat<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_predictArray,dev_finalAllPredictValue,finalAllPredictValueSize);
		cudaStatus = cudaGetLastError();
		ErrorHandle::dealError(cudaStatus,"generatePredictMat<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_predictArray,dev_finalAllPredictValue,finalAllPredictValueSize);");

		//测试打印函数
		//printMat<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_predictArray,row,finalAllPredictValueSize);
	}

	/*
	 * 打印函数,这个函数就是打印随机矩阵
	 * */
	void ParallelATG::printRandomMat(CoodinateDouble (*initMat)[ParallelATG::RandomLengthInt],int row,int col)
	{
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				cout<<initMat[i][j].x<<"  "<<initMat[i][j].y<<"  "<<initMat[i][j].isCovered<<endl;
			}
			cout<<endl;
		}
	}


	/*
	 * 下面的是关于归并核函数的测试函数
	 * */
	bool cmp(CoodinateDouble a , CoodinateDouble b)
	{
		return a.x <= b.x;
	}

	void ParallelATG::testMergeFunction()
	{
		const int row = ConstraintParameter::Num_Of_Constraints;
		const int col = 0;
		CoodinateDouble* a = new CoodinateDouble[row*col];
		for(int i = 0; i < row*col; i++)
		{
			a[i].x = i*5;
			a[i].y = a[i].x - 1;
			a[i].isCovered = false;
		}
		for(int i = 0; i < row; i++)
			;//thrust::sort(a+i*col,a+(i+1)*col,cmp);

		CoodinateDouble* dev_a = NULL;
		cudaMalloc((void**)&dev_a, row*col*sizeof(CoodinateDouble));
		cudaMemcpy(dev_a,a,row*col*sizeof(CoodinateDouble),cudaMemcpyHostToDevice);

		const int row1 = ConstraintParameter::Num_Of_Constraints;
		const int col1 = 100;
		CoodinateDouble* b = new CoodinateDouble[row1*col1];
		for(int i = 0; i < row1*col1; i++)
		{
			b[i].x = i;
			b[i].y = b[i].x+1;
			b[i].isCovered = true;
		}

		for(int i = 0; i < row1; i++)
			;//thrust::sort(b+i*col1,b+(i+1)*col1,cmp);

		CoodinateDouble* dev_b = NULL;
		cudaMalloc((void**)&dev_b, row1*col1 * sizeof(CoodinateDouble));
		cudaMemcpy(dev_b,b,row1*col1 * sizeof(CoodinateDouble),cudaMemcpyHostToDevice);

		FullCoveredInfo* coveredInfo = new FullCoveredInfo[col1];
		for(int i=0;i<col1;i++)
		{
			coveredInfo[i].index=i;
			coveredInfo[i].isCovered = false;
			coveredInfo[i].isVaild = i%2==0 ? true : false ;
			coveredInfo[i].vaildNum = 1;
		}
		int vaildSize = col1/2;

		FullCoveredInfo* dev_coveredInfo=NULL;
		cudaMalloc((void**)&dev_coveredInfo, col1 * sizeof(FullCoveredInfo));
		cudaMemcpy(dev_coveredInfo,coveredInfo,col1 * sizeof(FullCoveredInfo),cudaMemcpyHostToDevice);

		const int row2 = ConstraintParameter::Num_Of_Constraints;
		const int col2 = vaildSize + col;
		CoodinateDouble* c = new CoodinateDouble[row2*col2];
		CoodinateDouble* dev_c = NULL;
		cudaMalloc((void**)&dev_c, row2*col2 * sizeof(CoodinateDouble));


		cout<<"Merge Begin:@@@@@@@@@@@@@@@@@@@@@@@@@@@@   "<<endl;
		merge(dev_coveredInfo,dev_c,col2,dev_a,col,dev_b,col1,row);
		cudaMemcpy(c,dev_c,row2*col2 * sizeof(CoodinateDouble),cudaMemcpyDeviceToHost);

		//判断merge的顺序是否有问题
		for(int i = 0; i < row2; i++)
		{
			for(int j=0;j<col2;j++)
			{
				int k=i*col2+j;
				if(j>=1)
				{
					if(c[k].x < c[k-1].x)
						cout<<"Merge WRONG!!!!!!!!!!"<<endl;
				}
			}
		}

		cout<<"Array A IS AS Following "<<endl;
		for(int i = 0; i < row; i++)
		{
			for(int j=0;j<col;j++)
			{
				int k=i*col+j;
				//cout<<"( "<<a[k].x<<" , "<<a[k].y<<" , "<<a[k].isCovered<<" ) , ";
				cout<<a[k].x<<" , ";
			}
			cout<<endl;
		}

		cout<<endl<<"Array B IS AS Following "<<endl;
		for(int i=0;i<col1;i++)
			cout<<coveredInfo[i].isVaild<<" , ";
		cout<<endl;
		for(int i = 0; i < row1; i++)
		{
			for(int j=0;j<col1;j++)
			{
				int k=i*col1+j;
				//cout<<"( "<<b[k].x<<" , "<<b[k].y<<" , "<<b[k].isCovered<<" ) , ";
				//if(coveredInfo[j].isVaild)
					cout<<b[k].x<<" , ";
			}
			cout<<endl;
		}

		cout<<endl<<"Array C IS AS Following "<<endl;
		for(int i = 0; i < row2; i++)
		{
			for(int j=0;j<col2;j++)
			{
				int k=i*col2+j;
				//cout<<"( "<<c[k].x<<" , "<<c[k].y<<" , "<<c[k].isCovered<<" ) , ";
				cout<<c[k].x<<" , ";
			}
			cout<<endl;
		}


		cudaFree(dev_coveredInfo);
		cudaFree(dev_a);
		cudaFree(dev_b);
		cudaFree(dev_c);
	}

	/*
	 * 测试核函数，这个是测试极端函数值的一个函数
	 * */
	__global__ void testExtremeValue(double* dev_a,double* dev_b,double* dev_res,const int SIZE)
	{
		int i = threadIdx.x + blockIdx.x*blockDim.x;
		if(i == 0)
		{
			isfinite(1.1);
		    //nan
			double x = sqrt(-1.0);
			printf("sqrt(-1.0); %f  isnan: %d  isinf: %d  isinfinite: %d \n",x,isnan(x),isinf(x),isfinite(x));
			x = log(-1.0);
			printf("log(-1.0); %f  isnan: %d  isinf: %d  isinfinite: %d \n",x,isnan(x),isinf(x),isfinite(x));
			x = 0.0/0.0;
			printf("0.0/0.0 %f  isnan: %d  isinf: %d  isinfinite: %d \n",x,isnan(x),isinf(x),isfinite(x));
			x = 0.0*sqrt(-1.0);
			printf("0.0*sqrt(-1) %f  isnan: %d  isinf: %d  isinfinite: %d \n",x,isnan(x),isinf(x),isfinite(x));
			x = sqrt(-1.0)/sqrt(-1.0);
			printf("sqrt(-1)/sqrt(-1) %f isnan: %d  isinf: %d  isinfinite: %d \n",x,isnan(x),isinf(x),isfinite(x));
			x = sqrt(-1.0)-sqrt(-1.0);
			printf("sqrt(-1)-sqrt(-1) %f  isnan: %d  isinf: %d  isinfinite: %d \n",x,isnan(x),isinf(x),isfinite(x));

		    //inf
			x = 1/0.0 ;
			printf("1/0.0  %f  isnan: %d  isinf: %d  isinfinite: %d \n",x,isnan(x),isinf(x),isfinite(x));
			x = -1/0.0;
			printf("-1/0.0 %f  isnan: %d  isinf: %d  isinfinite: %d \n",x,isnan(x),isinf(x),isfinite(x));
			x = 0.0+1/0.0;
			printf("0.0+1/0.0 %f isnan: %d  isinf: %d  isinfinite: %d \n",x,isnan(x),isinf(x),isfinite(x));
			x = log(0.0);
			printf("log(0) %f isnan: %d  isinf: %d  isinfinite: %d \n",x,isnan(x),isinf(x),isfinite(x));

			x = 1123523;
			printf("x = 1123523 %f isnan: %d  isinf: %d  isinfinite: %d \n",x,isnan(x),isinf(x),isfinite(x));
			x = 11212.245;
			printf("x = 1123523 %f isnan: %d  isinf: %d  isinfinite: %d \n",x,isnan(x),isinf(x),isfinite(x));
			x = -11212.245;
			printf("x = -1123523 %f isnan: %d  isinf: %d  isinfinite: %d \n",x,isnan(x),isinf(x),isfinite(x));
		}
	}

	void ParallelATG::testExtremeRumtimeValue()
	{
		cout<<"****************** 极端测试用例如下 ******************"<<endl;
		const int SIZE = 10;
		double* a=new double[SIZE];
		for(int i=0;i<SIZE;i++)
			a[i] = i;

		double* b=new double[SIZE];
		for(int i=0;i<SIZE;i++)
			b[i]=0;
		double* res=new double[SIZE];

		double* dev_a = NULL;
		cudaMalloc((void**)&dev_a, SIZE*sizeof(double));
		cudaMemcpy(dev_a,a,SIZE*sizeof(double),cudaMemcpyHostToDevice);

		double* dev_b = NULL;
		cudaMalloc((void**)&dev_b, SIZE*sizeof(double));
		cudaMemcpy(dev_b,b,SIZE*sizeof(double),cudaMemcpyHostToDevice);

		double* dev_res = NULL;
		cudaMalloc((void**)&dev_res, SIZE*sizeof(double));

		testExtremeValue<<<1,32>>>(dev_a,dev_b,dev_res,SIZE);
		cudaError_t cudaStatus = cudaGetLastError();			//计算当前的偏移量以及对应约束的比较运算符类型
		if (cudaStatus != cudaSuccess)
		{
			cout << "addKernel launch failed: " <<cudaGetErrorString(cudaStatus)<<endl;
		}

		cudaMemcpy(res,dev_res,SIZE*sizeof(double),cudaMemcpyDeviceToHost);
		for(int i=0;i<SIZE;i++)
			cout<<"( "<<a[i]<<" , "<<b[i]<<" , "<<res[i]<<" ) , ";
		cout<<endl<<endl<<endl<<endl;


		cudaFree(dev_a);
		cudaFree(dev_b);
		cudaFree(dev_res);
	}


