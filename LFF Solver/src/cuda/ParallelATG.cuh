/*
 * ParallelATG.cuh
 *
 *  Created on: Nov 4, 2017
 *      Author: zy
 */

#ifndef PARALLELATG_CUH_
#define PARALLELATG_CUH_

	#include <iostream>

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
	#include "HardwareStrategy.cuh"

	#include "cuda_runtime.h"
	#include "device_launch_parameters.h"

	using namespace std;

	/*
	 * 下面是部分声明的核函数
	 * */

	/*
	 *  这个核函数是在上一轮的预测解中寻找可行解
	 *  利用了折半查找的思想，不过这里使用并行化直接查找
	 * */
	__global__ void findFullCoverIndex(FullCoveredInfo* dev_coveredInfo,const int step,const int SIZE);


class ParallelATG
{
public:
	/*
	 * 这个是设计好的随机取点的范围长度,就是在某一个点周围的[i-len/2,i+len/2]这个区间作为起始区间去做搜索
	 * */
	static const int RandomLengthInt = 1024;
	static const int StepInt = 1;
	static const int RandomLengthFloat = 1024;
	static const int StepDouble = 1;

public:
	/*
	 * 这个是CUDA并行化的入口
	 * */
	static int generateTestDataForSolver(const int MaxTryParamSize);

	/*
	 * 完成第一步的初始化，初始化的思想是在给出的当前的搜索的起点周围扩展，分为下面两种情况
	 * 1）对于整形int： 直接[i-RandomLengthInt/2,i+RandomLengthInt/2]做扩展，step一般为1
	 * 2）对于浮点型float：直接[i-RandomLengthFloat/2,i+RandomLengthFloat/2]做扩展，step一般为1
	 * */
	static void initRandomMatrix(CoodinateDouble (*initMat)[RandomLengthInt],int row,int col);


	/*
	 * 判断是否有满足复合约束的可行解
	 * */
	static void isFullCovered(FullCoveredInfo* coveredInfo,FullCoveredInfo* dev_coveredInfo,CoodinateDouble* dev_all,const int row,const int col);

	/*
	 * 上一轮的预测点执行结束之后判断是否存在已经覆盖复合约束的解向量
	 * 假如存在，直接返回对应的index即可
	 * 否则参与接下来的预测
	 * */
	static void getFullCoveredIndex(FullCoveredInfo* coveredInfo,FullCoveredInfo* dev_coveredInfo,CoodinateDouble* dev_all,
			const int row,const int col);

	/*
	 * 把calaArray和predictArray合并到一起，这里做的就是一个简单的归并，
	 * 关于这个函数并行化的做法的效率问题：
	 * 我查阅过并行版本的归并排序mergeSort，它的合并部分就是这么做的，所以这里也采用这样的做法
	 * */
	static CoodinateDouble* mergePredictArrayToCalaArray(CoodinateDouble* dev_calaArray,const int calaArraySize,
			CoodinateDouble* dev_predictArray,const int predictArraySize,const int row);

	/*
	 * 打印函数
	 * */
	static void printRandomMat(CoodinateDouble (*initMat)[RandomLengthInt],int row,int col);

	static void testMergeFunction();

};

#endif /* PARALLELATG_CUH_ */
