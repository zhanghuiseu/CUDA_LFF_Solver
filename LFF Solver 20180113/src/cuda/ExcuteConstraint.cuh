	/*
	 * ExcuteConstraint.cuh
	 * 
	 * ***************   Notice   ***************
	 * Auto Generated By ATPC on:2018-01-13 18:06:07
	 * Author: ZhangHui
	 * 
	 */ 

	#ifndef EXCUTECONSTRAINT_CUH_
	#define EXCUTECONSTRAINT_CUH_

	#include <iostream>

	#include "./../ConstraintParser/ConstraintParameter.cuh"
	#include "./../model/Coodinate.cuh"
	#include "./../model/Interval.cuh"
	#include "./../model/Priority.cuh"
	#include "./../model/FullCoveredInfo.cuh"
	#include "./../model/PredictValue.cuh"
	#include "./../model/PredictValueWithOne.cuh"
	#include "./../solver/type.h"
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
	 * 这里采用的编码函数命名编码规则是这样的:
	 * getRuntimeValue_i_j表示计算第i个析取范式的第j个约束的运行时刻值
	 * */ 
	/*
	 * 第0个约束的CUDA计算函数
	 * */ 
	__device__ void getRuntimeValue_0_0(FloatType x , FloatType y , FloatType z , FloatType w , FloatType t , FloatType v , Coodinate* res );

	/*
	 * 第1个约束的CUDA计算函数
	 * */ 
	__device__ void getRuntimeValue_0_1(FloatType x , FloatType y , FloatType z , FloatType w , FloatType t , FloatType v , Coodinate* res );

	/*
	 * 第2个约束的CUDA计算函数
	 * */ 
	__device__ void getRuntimeValue_0_2(FloatType x , FloatType y , FloatType z , FloatType w , FloatType t , FloatType v , Coodinate* res );

	/*
	 * 第3个约束的CUDA计算函数
	 * */ 
	__device__ void getRuntimeValue_0_3(FloatType x , FloatType y , FloatType z , FloatType w , FloatType t , FloatType v , Coodinate* res );

	/*
	 * 第4个约束的CUDA计算函数
	 * */ 
	__device__ void getRuntimeValue_0_4(FloatType x , FloatType y , FloatType z , FloatType w , FloatType t , FloatType v , Coodinate* res );

	/*
	 * 第5个约束的CUDA计算函数
	 * */ 
	__device__ void getRuntimeValue_0_5(FloatType x , FloatType y , FloatType z , FloatType w , FloatType t , FloatType v , Coodinate* res );

	/*
	 * 第6个约束的CUDA计算函数
	 * */ 
	__device__ void getRuntimeValue_0_6(FloatType x , FloatType y , FloatType z , FloatType w , FloatType t , FloatType v , Coodinate* res );

	/*
	 * 第7个约束的CUDA计算函数
	 * */ 
	__device__ void getRuntimeValue_0_7(FloatType x , FloatType y , FloatType z , FloatType w , FloatType t , FloatType v , Coodinate* res );

	/*
	 * 第8个约束的CUDA计算函数
	 * */ 
	__device__ void getRuntimeValue_0_8(FloatType x , FloatType y , FloatType z , FloatType w , FloatType t , FloatType v , Coodinate* res );

	/*
	 * 第9个约束的CUDA计算函数
	 * */ 
	__device__ void getRuntimeValue_0_9(FloatType x , FloatType y , FloatType z , FloatType w , FloatType t , FloatType v , Coodinate* res );

	/*
	 * 第10个约束的CUDA计算函数
	 * */ 
	__device__ void getRuntimeValue_0_10(FloatType x , FloatType y , FloatType z , FloatType w , FloatType t , FloatType v , Coodinate* res );

	/*
	 * 第11个约束的CUDA计算函数
	 * */ 
	__device__ void getRuntimeValue_0_11(FloatType x , FloatType y , FloatType z , FloatType w , FloatType t , FloatType v , Coodinate* res );

	/*
	 * 第12个约束的CUDA计算函数
	 * */ 
	__device__ void getRuntimeValue_0_12(FloatType x , FloatType y , FloatType z , FloatType w , FloatType t , FloatType v , Coodinate* res );


	/*
	 * 下面是所有的  约束  在  各个搜索方向  的获取运行时刻值的关系（假如n个约束m个搜索方向，那么一共 m*n 个函数）
	 * */ 

	/*
	 * 第0个约束在第0个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_0_0(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第0个约束在第1个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_0_1(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第0个约束在第2个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_0_2(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第0个约束在第3个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_0_3(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第0个约束在第4个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_0_4(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第0个约束在第5个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_0_5(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);



	/*
	 * 第1个约束在第0个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_1_0(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第1个约束在第1个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_1_1(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第1个约束在第2个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_1_2(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第1个约束在第3个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_1_3(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第1个约束在第4个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_1_4(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第1个约束在第5个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_1_5(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);



	/*
	 * 第2个约束在第0个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_2_0(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第2个约束在第1个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_2_1(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第2个约束在第2个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_2_2(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第2个约束在第3个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_2_3(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第2个约束在第4个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_2_4(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第2个约束在第5个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_2_5(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);



	/*
	 * 第3个约束在第0个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_3_0(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第3个约束在第1个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_3_1(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第3个约束在第2个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_3_2(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第3个约束在第3个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_3_3(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第3个约束在第4个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_3_4(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第3个约束在第5个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_3_5(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);



	/*
	 * 第4个约束在第0个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_4_0(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第4个约束在第1个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_4_1(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第4个约束在第2个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_4_2(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第4个约束在第3个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_4_3(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第4个约束在第4个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_4_4(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第4个约束在第5个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_4_5(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);



	/*
	 * 第5个约束在第0个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_5_0(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第5个约束在第1个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_5_1(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第5个约束在第2个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_5_2(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第5个约束在第3个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_5_3(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第5个约束在第4个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_5_4(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第5个约束在第5个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_5_5(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);



	/*
	 * 第6个约束在第0个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_6_0(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第6个约束在第1个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_6_1(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第6个约束在第2个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_6_2(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第6个约束在第3个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_6_3(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第6个约束在第4个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_6_4(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第6个约束在第5个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_6_5(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);



	/*
	 * 第7个约束在第0个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_7_0(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第7个约束在第1个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_7_1(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第7个约束在第2个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_7_2(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第7个约束在第3个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_7_3(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第7个约束在第4个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_7_4(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第7个约束在第5个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_7_5(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);



	/*
	 * 第8个约束在第0个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_8_0(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第8个约束在第1个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_8_1(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第8个约束在第2个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_8_2(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第8个约束在第3个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_8_3(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第8个约束在第4个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_8_4(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第8个约束在第5个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_8_5(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);



	/*
	 * 第9个约束在第0个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_9_0(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第9个约束在第1个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_9_1(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第9个约束在第2个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_9_2(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第9个约束在第3个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_9_3(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第9个约束在第4个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_9_4(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第9个约束在第5个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_9_5(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);



	/*
	 * 第10个约束在第0个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_10_0(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第10个约束在第1个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_10_1(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第10个约束在第2个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_10_2(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第10个约束在第3个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_10_3(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第10个约束在第4个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_10_4(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第10个约束在第5个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_10_5(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);



	/*
	 * 第11个约束在第0个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_11_0(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第11个约束在第1个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_11_1(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第11个约束在第2个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_11_2(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第11个约束在第3个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_11_3(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第11个约束在第4个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_11_4(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第11个约束在第5个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_11_5(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);



	/*
	 * 第12个约束在第0个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_12_0(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第12个约束在第1个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_12_1(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第12个约束在第2个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_12_2(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第12个约束在第3个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_12_3(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第12个约束在第4个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_12_4(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第12个约束在第5个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_12_5(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);



	/*
	 * 复合约束的并行计算模块,注意，这个函数还可以使用CUDA提供的流加速计算
	 * */ 
	void calaRuntimeValue(int paraIndex,Coodinate* dev_predictArray,FloatType* dev_parameter,const int row,const int col);

	/*
	 *  这个核函数是为了寻找可行解
	 * */ 
	__global__ void calaFeasibleSolution(FullCoveredInfo* dev_coveredInfo,Coodinate* dev_predictArray,const int calaMatCol);

	/*
	 * 判断是否有满足复合约束的可行解,CPU验证模块
	 * */ 
	bool checkisFullCovered(FullCoveredInfo* dev_coveredInfo,Coodinate* initArray, bool &findSolution,const int row,const int col);

	/*
	 * 就是区间交运算的计算
	 * */ 
	__global__ void calaFinalIntervel(Interval* dev_finalIntervel,Interval* dev_interval,const int calaArraySize);

	/*
	 * 根据预测的序列生成predct矩阵
	 * */ 
	__global__ void generatePredictMat(Coodinate* dev_predictArray,PredictValueWithOne* dev_finalAllPredictValue,const int col);

	/*
	 * 并行计算所有的预测解向量的优先级
	 * */ 
	__global__ void calaPriority(Priority* dev_priority,Coodinate* dev_calaArray,const int row,const int Size);



	#endif /* EXCUTECONSTRAINT_CUH_ */