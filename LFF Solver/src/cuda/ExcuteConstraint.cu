		/*
		 * ExcuteConstraint.cu
		 *
		 *  Created on: Nov 4, 2017
		 *      Author: zy
		 */
		#include <iostream>

		#include "./../ConstraintParser/ConstraintParameter.cuh"
		#include "./../model/CoodinateDouble.cuh"
		#include "./../model/CoodinateFloat.cuh"
		#include "./../model/IntervalDouble.cuh"
		#include "./../model/IntervalFloat.cuh"
		#include "./../model/PriorityDouble.cuh"
		#include "./../model/PriorityFloat.cuh"
		#include "./../solver/ATG.h"
		#include "./../solver/PCATG.h"
		#include "./../solver/ConstantValue.h"
		#include "ExcuteConstraint.cuh"
		#include "HardwareStrategy.cuh"

		#include "cuda_runtime.h"
		#include "device_launch_parameters.h"
		#include <stdio.h>

		using namespace std;

		/*
		 * 这个文件是函数获取运行时刻的各种函数的实现
		 * */

		/*
		 * 注意这里计算有两部的计算优化：
		 * 1）在计算运行时刻值的时候，顺便把子约束满足情况计算了
		 * 2）计算子约束的满足情况的时候没有使用if等判断分支结构，
		 *    同时使用到已经计算好的运行时刻值去减少复杂的浮点数计算过程
		 *  这里采用的编码函数命名编码规则是这样的
		 *  getRuntimeValue_i_j表示计算第i个析取范式的第j个约束的运行时刻值
		 * */
		__device__ void getRuntimeValue_0_0(double& x,double& y,double& z,CoodinateDouble& res)
		{
			res.y = 9 - x*y*z;
			res.isCovered = (res.y >= 0) * true;
			return ;
		}

		__device__ void getRuntimeValue_0_1(double& x,double& y,double& z,CoodinateDouble& res)
		{
			res.y = z - x*y;
			res.isCovered = (res.y > 0) * true;
			return ;
		}

		__device__ void getRuntimeValue_0_2(double& x,double& y,double& z,CoodinateDouble& res)
		{
			res.y =  y - z;
			res.isCovered = ( res.y > 0) * true;
			return ;
		}

		/*
		 * 下面是计算某一个析取范式的第一个约束在index=0,1,2搜索方向的计算过程
		 * */
		__global__ void calaConstraint_0_0_0(CoodinateDouble* dev_predictArray,double* dev_parameter,
				const int base,const int SIZE)
		{
			int i = threadIdx.x + blockIdx.x*blockDim.x;
			while (i < SIZE)
			{
				getRuntimeValue_0_0(dev_predictArray[i+base].x,dev_parameter[1],dev_parameter[2],dev_predictArray[i+base]);
				i += gridDim.x * blockDim.x;
			}
		}

		__global__ void calaConstraint_0_0_1(CoodinateDouble* dev_predictArray,double* dev_parameter,
				const int base,const int SIZE)
		{
			int i = threadIdx.x + blockIdx.x*blockDim.x;
			while (i < SIZE)
			{
				getRuntimeValue_0_0(dev_parameter[0],dev_predictArray[i+base].x,dev_parameter[2],dev_predictArray[i+base]);
				i += gridDim.x * blockDim.x;
			}
		}

		__global__ void calaConstraint_0_0_2(CoodinateDouble* dev_predictArray,double* dev_parameter,
				const int base,const int SIZE)
		{
			int i = threadIdx.x + blockIdx.x*blockDim.x;
			while (i < SIZE)
			{
				getRuntimeValue_0_0(dev_parameter[0],dev_parameter[1],dev_predictArray[i+base].x,dev_predictArray[i+base]);
				i += gridDim.x * blockDim.x;
			}
		}

		/*
		 * 下面是计算某一个析取范式的第二个约束在index=0,1,2搜索方向的计算过程
		 * */
		__global__ void calaConstraint_0_1_0(CoodinateDouble* dev_predictArray,double* dev_parameter,
				const int base,const int SIZE)
		{

			int i = threadIdx.x + blockIdx.x*blockDim.x;
			while (i < SIZE)
			{
				getRuntimeValue_0_1(dev_predictArray[i+base].x,dev_parameter[1],dev_parameter[2],dev_predictArray[i+base]);
				i += gridDim.x * blockDim.x;
			}
		}

		__global__ void calaConstraint_0_1_1(CoodinateDouble* dev_predictArray,double* dev_parameter,
				const int base,const int SIZE)
		{
			int i = threadIdx.x + blockIdx.x*blockDim.x;
			while (i < SIZE)
			{
				getRuntimeValue_0_1(dev_parameter[0],dev_predictArray[i+base].x,dev_parameter[2],dev_predictArray[i+base]);
				i += gridDim.x * blockDim.x;
			}
		}

		__global__ void calaConstraint_0_1_2(CoodinateDouble* dev_predictArray,double* dev_parameter,
				const int base,const int SIZE)
		{
			int i = threadIdx.x + blockIdx.x*blockDim.x;
			while (i < SIZE)
			{
				getRuntimeValue_0_1(dev_parameter[0],dev_parameter[1],dev_predictArray[i+base].x,dev_predictArray[i+base]);
				i += gridDim.x * blockDim.x;
			}
		}

		/*
		 * 下面是计算某三个析取范式的第二个约束在index=0,1,2搜索方向的计算过程
		 * */
		__global__ void calaConstraint_0_2_0(CoodinateDouble* dev_predictArray,double* dev_parameter,
				const int base,const int SIZE)
		{
			int i = threadIdx.x + blockIdx.x*blockDim.x;
			while (i < SIZE)
			{
				getRuntimeValue_0_2(dev_predictArray[i+base].x,dev_parameter[1],dev_parameter[2],dev_predictArray[i+base]);
				i += gridDim.x * blockDim.x;
			}
		}

		__global__ void calaConstraint_0_2_1(CoodinateDouble* dev_predictArray,double* dev_parameter,
				const int base,const int SIZE)
		{
			int i = threadIdx.x + blockIdx.x*blockDim.x;
			while (i < SIZE)
			{
				getRuntimeValue_0_2(dev_parameter[0],dev_predictArray[i+base].x,dev_parameter[2],dev_predictArray[i+base]);
				i += gridDim.x * blockDim.x;
			}
		}

		__global__ void calaConstraint_0_2_2(CoodinateDouble* dev_predictArray,double* dev_parameter,
				const int base,const int SIZE)
		{
			int i = threadIdx.x + blockIdx.x*blockDim.x;
			while (i < SIZE)
			{
				getRuntimeValue_0_2(dev_parameter[0],dev_parameter[1],dev_predictArray[i+base].x,dev_predictArray[i+base]);
				i += gridDim.x * blockDim.x;
			}
		}

		/*
		 * 复合约束的并行计算模块
		 * @注意，这个函数还可以使用CUDA提供的流加速计算
		 * */
		void calaRuntimeValue(int paraIndex,CoodinateDouble* dev_predictArray,double* dev_parameter,
				const int row,const int col)
		{
			Block res = HardwareStrategy::getHardwareStrategy(col);
			//根据不同的搜索方向做判断
			if(paraIndex == 0)
			{
				calaConstraint_0_0_0<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_predictArray,dev_parameter,0*col,col);
				calaConstraint_0_1_0<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_predictArray,dev_parameter,1*col,col);
				calaConstraint_0_2_0<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_predictArray,dev_parameter,2*col,col);

			}else if(paraIndex == 1)
			{
				calaConstraint_0_0_1<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_predictArray,dev_parameter,0*col,col);
				calaConstraint_0_1_1<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_predictArray,dev_parameter,1*col,col);
				calaConstraint_0_2_1<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_predictArray,dev_parameter,2*col,col);
			}
			else if(paraIndex == 2)
			{
				calaConstraint_0_0_2<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_predictArray,dev_parameter,0*col,col);
				calaConstraint_0_1_2<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_predictArray,dev_parameter,1*col,col);
				calaConstraint_0_2_2<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_predictArray,dev_parameter,2*col,col);
			}else
			{
				cout<<"You Should Never Get Here. In Function Of: "<<endl;
			}
		}

		__global__ void calaFeasibleSolution(FullCoveredInfo* dev_coveredInfo,CoodinateDouble* dev_predictArray,const int SIZE)
		{
			int i = threadIdx.x + blockIdx.x*blockDim.x;
			while (i < SIZE)
			{
				dev_coveredInfo[i].isCovered = dev_predictArray[i].isCovered
						                 & dev_predictArray[i+SIZE].isCovered
						               & dev_predictArray[i+2*SIZE].isCovered;
				dev_coveredInfo[i].index = i;
				i += gridDim.x * blockDim.x;
			}
		}


		/*
		 * 这个是CPU计算模块，是用来验证上面的calaRuntimeValue()函数的验证函数
		 * */
		void checkExcuteConstraint(int paraIndex,CoodinateDouble* all,double* parameter,const int row,const int col)
		{
			double x = 0;
			double y = 0;
			double z = 0;
			//根据不同的搜索方向做判断
			if(paraIndex == 0)
			{
				for(int i = 0; i < col; i++)
				{
					x = all[i].x;
					y = parameter[1];
					z = parameter[2];
					all[i].y = 9 - x*y*z;
					all[i].isCovered = (9 >= x*y*z)*true;
				}

				for(int i = col; i < 2*col; i++)
				{
					x = all[i].x;
					y = parameter[1];
					z = parameter[2];
					all[i].y = z - x*y;
					all[i].isCovered = (z - x*y >0)*true;
				}

				for(int i = 2*col; i < 3*col; i++)
				{
					x = all[i].x;
					y = parameter[1];
					z = parameter[2];
					all[i].y =  y - z;
					all[i].isCovered = ( y - z > 0)*true;
				}

			}else if(paraIndex == 1)
			{
				for(int i = 0; i < col; i++)
				{
					x = parameter[0];
					y = all[i].x;
					z = parameter[2];
					all[i].y = 9 - x*y*z;
					all[i].isCovered = (9 >= x*y*z)*true;
				}Block res = HardwareStrategy::getHardwareStrategy(col);

				for(int i = col; i < 2*col; i++)
				{
					x = parameter[0];
					y = all[i].x;
					z = parameter[2];
					all[i].y = z - x*y;
					all[i].isCovered = (z - x*y >0)*true;
				}

				for(int i = 2*col; i < 3*col; i++)
				{
					x = parameter[0];
					y = all[i].x;
					z = parameter[2];
					all[i].y =  y - z;
					all[i].isCovered = ( y - z > 0)*true;
				}
			}
			else if(paraIndex == 2)
			{
				for(int i = 0; i < col; i++)
				{
					x = parameter[0];
					y = parameter[1];
					z = all[i].x;
					all[i].y = 9 - x*y*z;
					all[i].isCovered = (9 >= x*y*z)*true;
				}

				for(int i = col; i < 2*col; i++)
				{
					x = parameter[0];
					y = parameter[1];
					z = all[i].x;
					all[i].y = z - x*y;
					all[i].isCovered = (z - x*y >0)*true;
				}

				for(int i = 2*col; i < 3*col; i++)
				{
					x = parameter[0];
					y = parameter[1];
					z = all[i].x;
					all[i].y =  y - z;
					all[i].isCovered = ( y - z > 0)*true;
				}
			}else
			{
				cout<<"You Should Never Get Here. In Function Of: "<<endl;
			}
		}


		/*
		 * 判断是否有满足复合约束的可行解
		 * CPU验证模块
		 * */
		bool checkisFullCovered(FullCoveredInfo* coveredInfo,FullCoveredInfo* dev_coveredInfo,CoodinateDouble* initArray,
				bool &findSolution,const int row,const int col)
		{
			cudaMemcpy(coveredInfo,dev_coveredInfo,col * sizeof(FullCoveredInfo),cudaMemcpyDeviceToHost);
			for(int i=0;i<col;i++)
			{
				double x=0,y=0,z=0;
				if(ATG::currentSearchParamIndex==0)
				{
					x = initArray[i].x;
					y = ATG::parameters[1];
					z = ATG::parameters[2];
				}else if(ATG::currentSearchParamIndex==1)
				{
					x = ATG::parameters[0];
					y = initArray[i].x;
					z = ATG::parameters[2];
				}else if(ATG::currentSearchParamIndex==2)
				{
					x = ATG::parameters[0];
					y = ATG::parameters[1];
					z = initArray[i].x;
				}else
				{
					cout<<"FFFUCK  YOU   *************   "<<endl;
				}
				bool tmpp = (9-x*y*z >=0) && (z-x*y>0) && (y-z>0);
				if(coveredInfo[i].isCovered == tmpp)
				{
					if(tmpp)
					{
						findSolution = true;
						//cout<<"Index: "<<i<<" ( "<<x<<" , "<<y<<" , "<<z<<" )"<<endl;
					}
				}else
				{
					cout<<"*************  Not Equal  ******************"<<endl;
					return false;
				}
			}
			return true;
		}


		/*
		 * 节点复制函数
		 * */
		__device__ void copyCoodinateDouble(CoodinateDouble* res,CoodinateDouble* a)
		{
			res->x = a->x;
			res->y = a->y;
			res->isCovered = a->isCovered;
			return ;
		}

		/*
		 * CUDA归并函数，就是先计算向量的初始地址，然后逐个复制即可
		 * */
		__global__ void mergeByCuda(CoodinateDouble* dev_mergeArray,const int mergeArraySize,
				                    CoodinateDouble* dev_calaArray,const int calaArraySize,
				                    CoodinateDouble* dev_predictArray,const int predictArraySize,const int row)
		{
			int index = threadIdx.x + blockIdx.x*blockDim.x;
			if(index < row)
			{
				CoodinateDouble* res = dev_mergeArray   +  index * mergeArraySize;
				CoodinateDouble* a   = dev_calaArray    +  index * calaArraySize;
				CoodinateDouble* b   = dev_predictArray +  index * predictArraySize;
				int i = 0; // index for a
				int j = 0; // index for b
				int k = 0; // index for res
				bool isOver = false;
				while(isOver == false)
				{
					if(i == calaArraySize  && j < predictArraySize)
					{
						copyCoodinateDouble( (res+k) , (b+j) );
						j = j + 1;
						k = k + 1;
					}else if(i < calaArraySize  && j == predictArraySize)
					{
						copyCoodinateDouble( (res+k) , (a+i) );
						i = i + 1;
						k = k + 1;
					}else if( (a+i)->x < (b+j)->x )
					{
						copyCoodinateDouble( (res+k) , (a+i) );
						i = i + 1;
						k = k + 1;
					}else
					{
						copyCoodinateDouble( (res+k) , (b+j) );
						j = j + 1;
						k = k + 1;
					}
					isOver = (i == calaArraySize) & (j == predictArraySize);
				}
			}
		}


		/*
		 * 使用CUDA把dev_calaArray和dev_predictArray合并到dev_mergeArray
		 * */
		void merge(CoodinateDouble* dev_mergeArray,const int mergeArraySize,CoodinateDouble* dev_calaArray,const int calaArraySize,
				CoodinateDouble* dev_predictArray,const int predictArraySize,const int row)
		{
			Block res = HardwareStrategy::getHardwareStrategy(row);
			mergeByCuda<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_mergeArray, mergeArraySize, dev_calaArray, calaArraySize,
					dev_predictArray, predictArraySize, row);
		}



