	/*
	* ExcuteConstraint.cuh
	*
	*  Created on: Nov 4, 2017
	*      Author: zy
	*/

	#ifndef EXCUTECONSTRAINT_CUH_
	#define EXCUTECONSTRAINT_CUH_

	#include <iostream>

	#include "./../ConstraintParser/ConstraintParameter.cuh"
	#include "./../model/CoodinateDouble.cuh"
	#include "./../model/IntervalDouble.cuh"
	#include "./../model/PriorityDouble.cuh"
	#include "./../model/FullCoveredInfo.cuh"
	#include "./../model/PredictValue.cuh"
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
	 * 这个文件是函数获取运行时刻的各种函数的声明
	 * */

	/*
	 * 注意这里计算有两部的计算优化：
	 * 1）在计算运行时刻值的时候，顺便把子约束满足情况计算了
	 * 2）计算子约束的满足情况的时候没有使用if等判断分支结构，
	 *    同时使用到已经计算好的运行时刻值去减少复杂的浮点数计算过程
	 *  这里采用的编码函数命名编码规则是这样的
	 *  getRuntimeValue_i_j表示计算第i个析取范式的第j个约束的运行时刻值
	 * */
	__device__ void getRuntimeValue_0_0(double& x,double& y,double& z,CoodinateDouble& res);
	__device__ void getRuntimeValue_0_1(double& x,double& y,double& z,CoodinateDouble& res);
	__device__ void getRuntimeValue_0_2(double& x,double& y,double& z,CoodinateDouble& res);

	__global__ void calaConstraint_0_0_0(CoodinateDouble* dev_predictArray,double* dev_parameter,const int base,const int calaMatCol);
	__global__ void calaConstraint_0_0_1(CoodinateDouble* dev_predictArray,double* dev_parameter,const int base,const int calaMatCol);
	__global__ void calaConstraint_0_0_2(CoodinateDouble* dev_predictArray,double* dev_parameter,const int base,const int calaMatCol);

	__global__ void calaConstraint_0_1_0(CoodinateDouble* dev_predictArray,double* dev_parameter,const int base,const int calaMatCol);
	__global__ void calaConstraint_0_1_1(CoodinateDouble* dev_predictArray,double* dev_parameter,const int base,const int calaMatCol);
	__global__ void calaConstraint_0_1_2(CoodinateDouble* dev_predictArray,double* dev_parameter,const int base,const int calaMatCol);

	__global__ void calaConstraint_0_2_0(CoodinateDouble* dev_predictArray,double* dev_parameter,const int base,const int calaMatCol);
	__global__ void calaConstraint_0_2_1(CoodinateDouble* dev_predictArray,double* dev_parameter,const int base,const int calaMatCol);
	__global__ void calaConstraint_0_2_2(CoodinateDouble* dev_predictArray,double* dev_parameter,const int base,const int calaMatCol);


	/*
	 * 复合约束的并行计算模块
	 * @注意，这个函数还可以使用CUDA提供的流加速计算
	 * */
	void calaRuntimeValue(int paraIndex,CoodinateDouble* dev_predictArray,double* dev_parameter,const int row,const int col);

	/*
	 * 这个是CPU计算模块，是用来验证上面的calaRuntimeValue()函数的验证函数
	 * */
	void checkExcuteConstraint(int paraIndex,CoodinateDouble* all,double* parameter,const int row,const int col);

	/*
	 * 这个核函数是为了寻找可行解
	 * */
	__global__ void calaFeasibleSolution(FullCoveredInfo* dev_coveredInfo,CoodinateDouble* dev_predictArray,const int calaMatCol);

	/*
	 * 判断是否有满足复合约束的可行解
	 * CPU验证模块
	 * */
	bool checkisFullCovered(FullCoveredInfo* dev_coveredInfo,CoodinateDouble* initArray,
			bool &findSolution,const int row,const int col);

	/*
	 * 节点复制函数
	 * */
	__device__ void copyCoodinateDouble(CoodinateDouble* res,CoodinateDouble* a);

	/*
	 * CUDA归并函数，就是先计算向量的初始地址，然后逐个复制即可
	 * */
	__global__ void mergeByCuda(FullCoveredInfo* dev_coveredInfo,
			                    CoodinateDouble* dev_mergeArray,const int mergeArraySize,
			                    CoodinateDouble* dev_predictArray,const int predictArraySize,const int row);

	/*
	 * CUDA归并函数，就是先计算向量的初始地址，然后逐个复制即可
	 * */
	__global__ void mergeByCuda(FullCoveredInfo* dev_coveredInfo,
			                    CoodinateDouble* dev_mergeArray,const int mergeArraySize,
			                    CoodinateDouble* dev_calaArray,const int calaArraySize,
			                    CoodinateDouble* dev_predictArray,const int predictArraySize,const int row);


	/*
	 * 使用CUDA把dev_calaArray和dev_predictArray合并到dev_mergeArray
	 * */
	void merge(FullCoveredInfo* dev_coveredInfo,CoodinateDouble* dev_mergeArray,const int mergeArraySize,CoodinateDouble* dev_calaArray,const int calaArraySize,
			CoodinateDouble* dev_predictArray,const int predictArraySize,const int row);


	/*
	 * 就是区间交运算的计算
	 * */
	__global__ void calaFinalIntervel(IntervalDouble* dev_finalIntervel,IntervalDouble* dev_interval,const int calaArraySize);


	__global__ void generatePredictMat(CoodinateDouble* dev_predictArray,PredictValue* dev_finalAllPredictValue,const int col);

	#endif /* EXCUTECONSTRAINT_CUH_ */
