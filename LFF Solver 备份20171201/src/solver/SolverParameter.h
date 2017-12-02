/*
 * SolverParameter.h
 *
 *  Created on: Oct 14, 2017
 *      Author: zy
 */

#ifndef SOLVERPARAMETER_H_
#define SOLVERPARAMETER_H_

#include <iostream>
#include <limits>

#include "type.h"
#include "./../ConstraintParser/ConstraintParameter.cuh"

using namespace std;

class SolverParameter
{
public:
	/**
	 *最后得到的解（是可行解或者最优解）
	 */
	static FloatType* finalParams;

	/**
	 *最后覆盖度
	 */
	static FloatType finalCovered;

	/**
	 * 结束一次查找前，预测出的参数个数的上限(100,200,400) --- T
	 * 默认是 50
	 */
	static  int MAX_NUM_OF_PREDICT_PARAM ;

	/**
	 * 预测的轮数上限(1,2,4) --- N
	 * 默认是 5
	 */
	static  int MAX_NUM_OF_GENERATE_CYCLE;

	/**
	 * 生成预测值的小区间大小(2,5,10)) --- I
	 */
	static const FloatType PREDICT_BOUNDARY = 5.0;

	/**
	 * 变量搜索方式
	 * SEARCH_STRATEGY_ALL = 0,<p>SEARCH_STRATEGY_ONE_BY_ONE = 1
	 * 下面是搜索策略和计算策略
	 */
	static int SEARCH_STRATEGY;
	static int Cala_Strategy;

	/**
	 *  ATG实验过程重复执行次数，
	 *  默认是 7
	 */
    static const int countOfRepeation = 20;

	/**
	 * 目标程序执行的总时间
	 */
	static FloatType function_time;

	/**
	 * 目标程序执行的总次数
	 */
	static int function_frequency;

	/*
	 * 函数时间和频率的重置
	 * */
	static void reset()
	{
		SolverParameter::function_time = 0.0;
		SolverParameter::function_frequency = 0;

		SolverParameter::finalCovered = 0.0;
		for(int i=0;i<ConstraintParameter::NUM_OF_PARAM ;i++)
			SolverParameter::finalParams[i] = 0;
	}

	/**
	 * 单次运行总时间
	 */
	static FloatType totalTime[countOfRepeation];

	/**
	 * 单次运行总次数
	 */
	static int totalFrequency[countOfRepeation];

	/**
	 * 单次运行中函数执行时间
	 */
	static FloatType algorithmTime[countOfRepeation];

	/**
	 * 单次覆盖率（覆盖路径的条数）
	 */
	static int coveredRatio[countOfRepeation];
	static bool findResult[countOfRepeation];

	/**
	 * 生成随机初始值的取值点，默认取0
     */
	static FloatType START_POINT;

	/**
	 * 最大步长
	 * <p>从自变参数生成池中衍生新的值时，向两边扩展的最大步长
	 * <p>向外扩展的步长为(0,MAX_STEP)内的随机值 ，默认取5
	 */
	static FloatType MAX_STEP;

	/**
	 * 用户定制的输入参数值
	 */
	static bool IS_CUSTOMIZED;
	static FloatType CUSTOMIZED_PARAMS[ConstraintParameter::NUM_OF_PARAM] ;

	/**
	 * 是否需要精细搜索
	 */
	static const bool NEED_REFINED_SEARCH = true;

	/**
	 * 最大预测区间
	 */
	static const FloatType MAX_PREDICT_BOUNDARY = 20.0;

	/**
	 * 最小预测区间 for zy  0.1
	 */
	static const FloatType MIN_PREDICT_BOUNDARY = 0.1;

	/**
	 * 取值调整粒度
	 * 假如这里调整到1e-40的时候，浮点数的等于操作就分不清了，1e-40对于浮点数是区分不出来的
	 */
	static const FloatType ADJUST_RATIO_DOUBLE_ZERO = 1e-15; //ZY  1e-40;
	static const FloatType ADUJST_RATIO_DOUBLE = 1e-15;     //ZY  1e-40;
	static const int ADJUST_GRANULARITY_INTEGER = 1;
	static FloatType ZeroToleranceDegree  ;

	/*
	 * 黄金分割点的参数
	 * (sqrt(5)-1)/(sqrt(5)+1)
	 * */
	static const FloatType GoldenPointRatio = 0.38196601125010515;

};

#endif /* SOLVERPARAMETER_H_ */
