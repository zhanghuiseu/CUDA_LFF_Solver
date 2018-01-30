	/*
	 * ParallelATG.cuh
	 *
	 *  Created on: Nov 4, 2017
	 *      Author: zhanghui
	 */

	#ifndef PARALLELATG_CUH_
	#define PARALLELATG_CUH_

	#include <iostream>

	#include "./../ConstraintParser/ConstraintParameter.cuh"
	#include "./../model/Coodinate.cuh"
	#include "./../model/Interval.cuh"
	#include "./../model/Priority.cuh"
	#include "./../model/FullCoveredInfo.cuh"
	#include "./../model/Classification.cuh"
	#include "./../model/PredictValue.cuh"
	#include "./../model/PredictValueWithOne.cuh"
    #include "./../solver/ATG.h"
    #include "./../solver/type.h"
	#include "./../solver/PCATG.h"
	#include "./../solver/type.h"
	#include "HardwareStrategy.cuh"
	#include "ParallelATG.cuh"
	#include "CLF.cuh"

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
	__global__ void findFullCoverIndex(FullCoveredInfo* dev_coveredInfo,const int step,const int Size);


	/*
	 * 节点复制函数
	 * */
	__device__ void copyCoodinate(Coodinate* res,Coodinate* a);


	/*
	 * CUDA归并函数，就是先计算向量的初始地址，然后逐个复制即可
	 * */
	__global__ void mergeByCuda(FullCoveredInfo* dev_coveredInfo,
			                    Coodinate* dev_mergeArray,const int mergeArraySize,
			                    Coodinate* dev_predictArray,const int predictArraySize,const int row);


	/*
	 * CUDA归并函数，就是先计算向量的初始地址，然后逐个复制即可
	 * */
	__global__ void mergeByCuda(FullCoveredInfo* dev_coveredInfo,
			                    Coodinate* dev_mergeArray,const int mergeArraySize,
			                    Coodinate* dev_calaArray,const int calaArraySize,
			                    Coodinate* dev_predictArray,const int predictArraySize,const int row);


	/*
	 *  这个核函数是计算所有的有效的接向量的数量
	 *  利用了折半查找的思想，不过这里使用并行化直接查找
	 * */
	__global__ void sumOfVaildSolution(FullCoveredInfo* dev_coveredInfo,const int step,const int SIZE);


	/*
	 * 测试核函数，这个是测试极端函数值的一个函数
	 * */
	__global__ void testExtremeValue(FloatType* dev_a,FloatType* dev_b,FloatType* dev_res,const int SIZE);


	/*
	 *  根据节点的信息计算并更新分类信息
	 *  注意，上述的case0-5都是相互独立的，也即是说。两个点的只能属于case0-5的其中一个
	 * */
	__global__ void classification(Classification* dev_classification,Coodinate* dev_calaArray,
			const int calaArraySize,const int cmpType);


	/*
	 * 解区间的初始化
	 * */
	__global__ void initIntervel(Interval* dev_interval,Coodinate* dev_calaArray,const int calaArraySize);


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
	__global__ void calaIntervelForCase0(Interval* dev_interval,Classification* dev_classification,Coodinate* dev_calaArray,
			const int calaArraySize);
	__global__ void calaIntervelForCase1(Interval* dev_interval,Classification* dev_classification,Coodinate* dev_calaArray,
			const int calaArraySize);
	__global__ void calaIntervelForCase2(Interval* dev_interval,Classification* dev_classification,Coodinate* dev_calaArray,
			const int calaArraySize);
	__global__ void calaIntervelForCase3(Interval* dev_interval,Classification* dev_classification,Coodinate* dev_calaArray,
			const int calaArraySize);
	__global__ void calaIntervelForCase4(Interval* dev_interval,Classification* dev_classification,Coodinate* dev_calaArray,
			const int calaArraySize);
	__global__ void calaIntervelForCase5(Interval* dev_interval,Classification* dev_classification,Coodinate* dev_calaArray,
			const int calaArraySize);



	/*
	 * 计算黄金分割点
	 * */
	__global__ void calaGoldenPoint(PredictValue* dev_PredictValue,Interval* dev_finalIntervel,const int calaArraySize);

	__device__ FloatType getGoldenPoint(FloatType left,FloatType right);


	/*
	 * 初始化工作
	 * */
	__global__ void initPredictValue(PredictValue* dev_PredictValue,const int calaArraySize);


	/*
	 * 初始化函数
	 * */
	__global__ void initCount(int* dev_count,PredictValue* dev_PredictValue,const int Size);


	/*
	 * 使用二分查找计算有效的值的数量
	 * */
	__global__ void calaPredictNum(int* dev_count,const int step,const int Size);


	/*
	 * 收集零点部分，这是case4的处理部分
	 * */
	__global__ void collectZerosForCase4(PredictValue* dev_ZerosValue,Classification* dev_classification,
			Coodinate* dev_calaArray,const int calaArraySize,bool isDouble);


	/*
	 * 收集零点部分，这是case5的处理部分
	 * */
	__global__ void collectZerosForCase5(PredictValue* dev_ZerosValue,Classification* dev_classification,
			Coodinate* dev_calaArray,const int calaArraySize,bool isDouble);


	/*
	 * 区间扩展部分，case4和5一起考虑的
	 * */
	__global__ void collectZerosIntervalExtendCase4And5(PredictValue* dev_ZerosValue,Classification* dev_classification,
			Coodinate* dev_calaArray,const int calaArraySize,bool isDouble);


	/*
	 * 收集计算好的零点预测解
	 * */
	__global__ void collectSortZeros(PredictValue** dev_zeroArray,PredictValueWithOne** dev_res,int* dev_size,
			const int calaArraySize,const int Size,bool isDouble);


	/*
	 * 打印函数
	 * */
	__global__ void printAll(PredictValue** dev_res,int* dev_size,const int Size);


	/*
	 * 合并每两个有序的链表
	 * */
	__global__ void mergeTwoPredictArray(PredictValueWithOne* dev_one,const int oneSize,
			PredictValueWithOne* dev_lastArray,const int lastSize,PredictValueWithOne* dev_now,const int nowSize,const int Size);


	/*
	 * 使用规约并行获取最大的优先级以及对应的当前变量
	 * */
	__global__ void getMaxPriority(Priority* dev_priority,const int step,const int Size);




class ParallelATG
{
public:

	/*
	 * 并行流的声明
	 * 注意大多数的并行任务的数量是约束的数量，也即矩阵的行数，但是有一个情况需要多一个，所以这里就设置
	 * 约束数量+1个并行流任务
	 * */
	static const int NumOfStream = ConstraintParameter::Num_Of_Constraints+1;
	static cudaStream_t stream[NumOfStream];

	/*
	 * 这个是设计好的随机取点的范围长度,就是在某一个点周围的[i-len/2,i+len/2]这个区间作为起始区间去做搜索
	 * 我们随机取点的数量就是 RandomLengthInt个数量，一般对于Int的步长就是1，
	 * 对于Float，当步长step为1的时候RandomLengthFloat和Int的一样。所以也即
	 * StepDouble*RandomLengthFloat =  StepInt*RandomLengthInt
	 * */
	static const int RandomLengthInt = 8;
	static const int StepInt = 1;
	static const int RandomLengthFloat = 8;
	static const int StepDouble = 1;

public:
	/*
	 * 这个是CUDA并行化的入口
	 * */
	static bool generateTestDataForSolver(int MaxTryParamSize);

	/*
	 * 并行流的声明，销毁以及同步
	 * */
	static void mallocStream();
	static void destoryStream();
	static void synStream(const int size=NumOfStream);


	/*
	 * 完成第一步的初始化，初始化的思想是在给出的当前的搜索的起点周围扩展，分为下面两种情况
	 * 1）对于整形int： 直接[i-RandomLengthInt/2,i+RandomLengthInt/2]做扩展，step一般为1
	 * 2）对于浮点型float：直接[i-RandomLengthFloat/2,i+RandomLengthFloat/2]做扩展，step一般为1
	 * */
	static void initRandomMatrix(Coodinate* predictArray,const int row,const int col);


	/*
	 * 判断是否有满足复合约束的可行解
	 * */
	static void isFullCovered(FullCoveredInfo* dev_coveredInfo,Coodinate* dev_all,const int row,const int col);


	/*
	 * 上一轮的预测点执行结束之后判断是否存在已经覆盖复合约束的解向量
	 * 假如存在，直接返回对应的index即可
	 * 否则参与接下来的预测
	 * */
	static void getFullCoveredIndex(FullCoveredInfo* coveredInfo,FullCoveredInfo* dev_coveredInfo,const int row,const int col);


	/*
	 * 使用CUDA把dev_calaArray和dev_predictArray合并到dev_mergeArray
	 * */
	static void merge(FullCoveredInfo* dev_coveredInfo,Coodinate* dev_mergeArray,const int mergeArraySize,Coodinate* dev_calaArray,const int calaArraySize,
			Coodinate* dev_predictArray,const int predictArraySize,const int row);


	/*
	 * 把calaArray和predictArray合并到一起，这里做的就是一个简单的归并，
	 * 关于这个函数并行化的做法的效率问题：
	 * 我查阅过并行版本的归并排序mergeSort，它的合并部分就是这么做的，所以这里也采用这样的做法
	 * */
	static Coodinate* mergePredictArrayToCalaArray(FullCoveredInfo* dev_coveredInfo,Coodinate* dev_calaArray,const int calaArraySize,
				Coodinate* dev_predictArray,const int predictArraySize,const int vaildPredictArraySize, const int row);


	/*
	 * 启动分类操作
	 * */
	static void classificationForAllCase(Classification* dev_classification,Coodinate* dev_calaArray,
				const int calaArraySize,const int row);


	/*
	 * 计算拟合函数，其实就是计算可行解区间
	 * */
	static void calsCLFF(Interval* dev_intervel,Classification* dev_classification,Coodinate* dev_calaArray,
			const int calaArraySize,const int row);


	/*
	 * 区间交运算
	 * */
	static void intersectionIntervel(Interval* dev_finalIntervel,Interval* dev_interval,const int calaArraySize);


	/*
	 * 根据归并区间生成测试用例
	 * */
	static void calaPredictValueFromFinalInterval(PredictValue* dev_PredictValue,Interval* dev_finalIntervel,const int calaArraySize);


	/*
	 * 统计预测值的数量
	 * */
	static int calaPredictValueSize(PredictValue* dev_PredictValue,const int calaArraySize);


	/*
	 * 收集所有的不可解的零点
	 * */
	static void collectZeros(PredictValue* dev_ZerosValue,Classification* dev_classification,Coodinate* dev_calaArray,
			const int calaArraySize,const int row,bool isDouble);


	/*
	 * 统计所有的零点的预测解的数量
	 * 依据的是区间细化规则和扩展规则
	 * */
	static vector<int> calaValidZeroNum(PredictValue* dev_ZerosValue,const int calaArraySize,const int row);


	/*
	 * 统计所有的零点的预测解的数量
	 * 依据的是区间细化规则和扩展规则
	 * */
	static PredictValueWithOne* collectValidZero(vector<int> num,PredictValue* dev_ZerosValue,const int calaArraySize,const int row,
			PredictValue* dev_PredictValue,const int PredictValueSize,int &finalAllPredictValueSize);


	/*
	 * 根据预测的可能的解向量（一个一维数组），生成预测矩阵（一个二维矩阵）
	 * */
	static void gereratePredictArray(Coodinate* dev_predictArray,const int row ,const int col,PredictValueWithOne* dev_finalAllPredictValue);


	/*
	 * 计算每一个解向量的优先级
	 * */
	static void calaPriorityForCalaArray(Priority* dev_priority,Coodinate* dev_calaArray,
			const int row,const int calaArraySize);


	/*
	 * 使用规约计算得到优先级最大的值以及对应的当前变量
	 * */
	static void calaMaxPriority(Priority* maxPriority,Priority* dev_priority,const int calaArraySize);


	/*
	 * 打印函数
	 * */
	static void printRandomMat(Coodinate (*initMat)[RandomLengthInt],int row,int col);


	/*
	 * merge合并过程的测试函数
	 * */
	static void testMergeFunction();


	/*
	 * 验证运行时刻值得测试函数
	 * */
	static void testExtremeRumtimeValue();

};

#endif /* PARALLELATG_CUH_ */
