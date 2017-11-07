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
	#include "./../model/CoodinateFloat.cuh"
	#include "./../model/IntervalDouble.cuh"
	#include "./../model/IntervalFloat.cuh"
	#include "./../model/PriorityDouble.cuh"
	#include "./../model/PriorityFloat.cuh"
	#include "./../model/FullCoveredInfo.cuh"
    #include "./../solver/ATG.h"
	#include "./../solver/PCATG.h"
	#include "./../solver/ConstantValue.h"

	#include "cuda_runtime.h"
	#include "device_launch_parameters.h"
	#include "ExcuteConstraint.cuh"
	#include "./../ConstraintParser/ConstraintParameter.cuh"

	using namespace std;


	int ParallelATG::generateTestDataForSolver(const int MaxTryParamSize)
	{
		//选择当前的显卡
		cudaError_t cudaStatus = cudaSetDevice(0);

		//当前的的搜索变量传输到显卡GPU
		double* dev_parameters = NULL;
		cudaMalloc((void**)&dev_parameters, ConstraintParameter::NUM_OF_PARAM * sizeof(double));
		cudaMemcpy(dev_parameters,ATG::parameters,ConstraintParameter::NUM_OF_PARAM * sizeof(double),cudaMemcpyHostToDevice);

		//在当前搜索点的周围随机抽点
		const int row = ConstraintParameter::Num_Of_Constraints;
		const int col = ParallelATG::RandomLengthInt;
		CoodinateDouble* predictArray = new CoodinateDouble[row*col];
		CoodinateDouble (*predictMat)[col] = (CoodinateDouble(*)[col])predictArray;
		ParallelATG::initRandomMatrix(predictMat,row,col);

		//随机点传输到显卡
		CoodinateDouble* dev_predictArray = NULL;
		cudaMalloc((void**)&dev_predictArray, row * col * sizeof(CoodinateDouble));
		cudaMemcpy(dev_predictArray,predictArray,row * col * sizeof(CoodinateDouble),cudaMemcpyHostToDevice);

		calaRuntimeValue(ATG::currentSearchParamIndex,dev_predictArray,dev_parameters,row,col);

		FullCoveredInfo* coveredInfo = new FullCoveredInfo[col];
		FullCoveredInfo* dev_coveredInfo = NULL;
		cudaMalloc((void**)&dev_coveredInfo, col * sizeof(FullCoveredInfo));
		cudaMemcpy(dev_coveredInfo,coveredInfo,col * sizeof(FullCoveredInfo),cudaMemcpyHostToDevice);

		//给所有的测试用例生成最终的覆盖结果，用于下面的获取可行解的index
		ParallelATG::isFullCovered(coveredInfo,dev_coveredInfo,dev_predictArray,row,col);

		//CPU验证模块
		bool findSolution = false;
		bool check=checkisFullCovered(coveredInfo,dev_coveredInfo,predictArray,findSolution,row,col);
        cout<<"*****  Check Over，Res:  "<<boolalpha<<check<<endl;
        cout<<"*****  Find   Solution:  "<<findSolution<<endl;

        ParallelATG::getFullCoveredIndex(coveredInfo,dev_coveredInfo,predictArray,row,col);
		/*
		 * @TODO
		 * 这里添加第一次随机抽点的执行结果
		 * 就是针对coveredInfo[0]的判断
		 * */


        //尝试的测试点的数量，用于搜索任务的参数上限的判断
		int tryParamNum = col;
		//最终结果的判定
		bool isCoveredTargetPC = false;

		//这个保存的是已经计算过的结果的指针和对应的元素的Size
		CoodinateDouble* dev_calaArray = NULL;

		//注意这里保存的是计算矩阵的的列的数量，由于行数是等于约束的数量，所以这里就是用col做计数
		int calaArraySize = 0;
		int predictArraySize = col;


		while(tryParamNum < MaxTryParamSize  && isCoveredTargetPC == false)
		{
			/*
			 * @合并calaArray和predictArray到calaArray，分为下面两种情况：
			 * 1）calaArray为NULL，直接把predictArray赋值给calaArray
			 * 2) 二者都不为空，合并predictArray和calaArray到mergeArray，返回mergeArray即可，同时calaArray和predictArray内存释放掉
			 * */
			dev_calaArray = ParallelATG::mergePredictArrayToCalaArray(dev_calaArray, calaArraySize, dev_predictArray, predictArraySize, row);
			calaArraySize = calaArraySize + predictArraySize;
			dev_predictArray = NULL;
			predictArraySize = 0;

			isCoveredTargetPC = true;

			/*
			 * @TODO
			 *  LFF的分类和计算
			 * */

			/*
			 * @TODO
			 *  区间交运算
			 * */

			/*
			 * @TODO
			 *  预测可行解
			 * */

			/*
			 * @TODO
			 *  收集零点
			 * */

			/*
			 * @TODO
			 *  合并预测解和零点
			 * */

			/*
			 * @TODO
			 *  做计算和判断
			 * */
			tryParamNum+=1;
		}






/*
   			verfifyExcuteConstraint(ATG::currentSearchParamIndex,initArray,ATG::parameters,row,col);
			CoodinateDouble* initArrayFromGPU = new CoodinateDouble[row*col];
			cudaMemcpy(initArrayFromGPU, dev_initArray, SIZE * sizeof(CoodinateDouble), cudaMemcpyDeviceToHost);
			for(int i=0;i<row*col;i++)
			{
				if(initArray[i].x == initArrayFromGPU[i].x
				&& initArray[i].y == initArrayFromGPU[i].y
				&&initArray[i].isCovered == initArrayFromGPU[i].isCovered)
				{ }
				else
				{
					cout<<"Not EQual  ";
					cout<<"( "<<initArray[i].x<<" , "<<initArray[i].y<<" , "<<initArray[i].isCovered<<" ) ";
					cout<<"( "<<initArrayFromGPU[i].x<<" , "<<initArrayFromGPU[i].y<<" , "<<initArrayFromGPU[i].isCovered<<" ) "<<endl;

				}
			}
 * */

		cudaFree( dev_predictArray);
		cudaFree( dev_parameters);

		return 1;
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
	void ParallelATG::isFullCovered(FullCoveredInfo* coveredInfo,FullCoveredInfo* dev_coveredInfo,CoodinateDouble* dev_predictArray,
			const int row,const int col)
	{
		Block res = HardwareStrategy::getHardwareStrategy(col);
		calaFeasibleSolution<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_coveredInfo , dev_predictArray , col);
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
	 * 上一轮的预测点执行结束之后判断是否存在已经覆盖复合约束的解向量
	 * 假如存在，直接返回对应的index即可
	 * 否则参与接下来的预测
	 * */
	void ParallelATG::getFullCoveredIndex(FullCoveredInfo* coveredInfo,FullCoveredInfo* dev_coveredInfo,CoodinateDouble* dev_predictArray,
			const int row,const int col)
	{
		int size = col/2;
		int step = (col+1)/2;
		while(size > 0)
		{
			Block res = HardwareStrategy::getHardwareStrategy(size);
			findFullCoverIndex<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_coveredInfo,step,size);
			//cudaDeviceSynchronize();
			size = step/2;
			step = (step+1)/2;
		}
		cudaMemcpy(coveredInfo,dev_coveredInfo,1 * sizeof(FullCoveredInfo),cudaMemcpyDeviceToHost);

		cout<<"The Predict Solution FullCovered Info Is As Following: Index： "<<coveredInfo[0].index<<endl;
		if(coveredInfo[0].isCovered)
		{
			cout<<"Find The Solution: ";
			double x=0,y=0,z=0;
			int i = coveredInfo[0].index;
			if(ATG::currentSearchParamIndex==0)
			{
				x = dev_predictArray[i].x;
				y = ATG::parameters[1];
				z = ATG::parameters[2];
			}else if(ATG::currentSearchParamIndex==1)
			{
				x = ATG::parameters[0];
				y = dev_predictArray[i].x;
				z = ATG::parameters[2];
			}else if(ATG::currentSearchParamIndex==2)
			{
				x = ATG::parameters[0];
				y = ATG::parameters[1];
				z = dev_predictArray[i].x;
			}else
				cout<<"You Should Never Get Here !!!"<<endl;

			bool tmpp = (9-x*y*z >=0) && (z-x*y>0) && (y-z>0);
			if(coveredInfo[i].isCovered == tmpp)
			{
				if(tmpp)
					cout<<"( "<<x<<" , "<<y<<" , "<<z<<" )"<<endl;

			}else
				cout<<"************* Not Equal   You Should Never Get Here *************"<<endl;
		}else
			cout<<"No No No Find The Solution !!!"<<endl;
	}


	/*
	 * 把calaArray和predictArray合并到一起，这里做的就是一个简单的归并，
	 * 关于这个函数并行化的做法的效率问题：
	 * 我查阅过并行版本的归并排序mergeSort，它的合并部分就是这么做的，所以这里也采用这样的做法
	 * */
	CoodinateDouble* ParallelATG::mergePredictArrayToCalaArray(CoodinateDouble* dev_calaArray,const int calaArraySize,
			CoodinateDouble* dev_predictArray,const int predictArraySize,const int row)
	{
		if(calaArraySize == 0)
		{
			return dev_predictArray;
		}else
		{
			//申请最终的合并的序列
			CoodinateDouble* dev_mergeArray = NULL;
			const int mergeArraySize = calaArraySize + predictArraySize;
			const int finalSize = mergeArraySize * row;
			cudaMalloc((void**)&dev_mergeArray, finalSize * sizeof(CoodinateDouble));

			//使用CUDA并行化合并部分
			merge(dev_mergeArray,mergeArraySize,dev_calaArray,calaArraySize, dev_predictArray,predictArraySize,row);

			//释放做过合并的元素序列
			cudaFree( dev_calaArray);
			cudaFree( dev_predictArray);

			//返回合并后的结果
			return dev_mergeArray;
		}
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
		const int col = 1000;
		CoodinateDouble* a = new CoodinateDouble[row*col];
		for(int i = 0; i < row*col; i++)
		{
			a[i].x = rand()%2000;
			a[i].y = a[i].x /100;
			a[i].isCovered = false;
		}
		for(int i = 0; i < row; i++)
			sort(a+i*col,a+(i+1)*col,cmp);

		CoodinateDouble* dev_a = NULL;
		cudaMalloc((void**)&dev_a, row*col*sizeof(CoodinateDouble));
		cudaMemcpy(dev_a,a,row*col*sizeof(CoodinateDouble),cudaMemcpyHostToDevice);

		const int row1 = ConstraintParameter::Num_Of_Constraints;
		const int col1 = 3000;
		CoodinateDouble* b = new CoodinateDouble[row1*col1];
		for(int i = 0; i < row1*col1; i++)
		{
			b[i].x = rand()%2000;
			b[i].y = b[i].x;
			b[i].isCovered = true;
		}

		for(int i = 0; i < row1; i++)
			sort(b+i*col1,b+(i+1)*col1,cmp);


		CoodinateDouble* dev_b = NULL;
		cudaMalloc((void**)&dev_b, row1*col1 * sizeof(CoodinateDouble));
		cudaMemcpy(dev_b,b,row1*col1 * sizeof(CoodinateDouble),cudaMemcpyHostToDevice);


		const int row2 = ConstraintParameter::Num_Of_Constraints;
		const int col2 = col1 + col;
		CoodinateDouble* c = new CoodinateDouble[row2*col2];
		CoodinateDouble* dev_c = NULL;
		cudaMalloc((void**)&dev_c, row2*col2 * sizeof(CoodinateDouble));

		CoodinateDouble* cc = new CoodinateDouble[row2*col2];
		for(int i = 0; i < row2; i++)
		{
			for(int j=0;j<col2;j++)
			{
				int k=i*col2+j;
				if(j<col)
				{
					cc[k].x = a[i*col+j].x;
					cc[k].y = a[i*col+j].y;
					cc[k].isCovered = a[i*col+j].isCovered;
				}else
				{
					cc[k].x = b[i*col1+j-col].x;
					cc[k].y = b[i*col1+j-col].y;
					cc[k].isCovered = b[i*col1+j-col].isCovered;
				}
			}
		}
		for(int i = 0; i < row1; i++)
			sort(cc+i*col2,cc+(i+1)*col2,cmp);


		cout<<"Merg:^^^^^^^^^^^^^^^^^^^^^^^^^^"<<endl;
		merge(dev_c,col2,dev_a,col,dev_b,col1,row);
		cudaMemcpy(c,dev_c,row2*col2 * sizeof(CoodinateDouble),cudaMemcpyDeviceToHost);

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
		for(int i=0;i<row2*col2;i++)
		{
			if(c[i].x==cc[i].x )
			{
				if(c[i].isCovered==true)
				{
					if(c[i].x != c[i].y)
						cout<<"TTTTTTTTTTTT"<<endl;
				}else
				{
					if(c[i].x /100 != c[i].y)
						cout<<"FFFFFFFFFF"<<endl;
				}
			}else
				cout<<"*****************  NOT EQUAL *************  "<<endl;
		}

		cout<<"Array A IS AS Following "<<endl;
		for(int i = 0; i < row; i++)
		{
			for(int j=0;j<col;j++)
			{
				int k=i*col+j;
				cout<<"( "<<a[k].x<<" , "<<a[k].y<<" , "<<a[k].isCovered<<" ) , ";
				//cout<<a[k].x<<" , ";
			}
			cout<<endl;
		}

		cout<<endl<<"Array B IS AS Following "<<endl;
		for(int i = 0; i < row1; i++)
		{
			for(int j=0;j<col1;j++)
			{
				int k=i*col1+j;
				cout<<"( "<<b[k].x<<" , "<<b[k].y<<" , "<<b[k].isCovered<<" ) , ";
				//cout<<b[k].x<<" , ";
			}
			cout<<endl;
		}

		cout<<endl<<"Array C IS AS Following "<<endl;
		for(int i = 0; i < row2; i++)
		{
			for(int j=0;j<col2;j++)
			{
				int k=i*col2+j;
				cout<<"( "<<c[k].x<<" , "<<c[k].y<<" , "<<c[k].isCovered<<" ) , ";
				//cout<<c[k].x<<" , ";
			}
			cout<<endl;
		}

		cudaFree(dev_a);
		cudaFree(dev_b);
		cudaFree(dev_c);
	}


