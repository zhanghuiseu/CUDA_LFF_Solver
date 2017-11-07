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

#include "./../ConstraintParser/ConstraintParameter.cuh"

using namespace std;

class SolverParameter
{
public:
	/**
	 *最后得到的解（是可行解或者最优解）
	 */
	static double* finalParams;
	/**
	 *最后覆盖度
	 */
	static double finalCovered;

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
	static const double PREDICT_BOUNDARY = 5.0;

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
    static const int countOfRepeation = 1;

	/**
	 * 目标程序执行的总时间
	 */
	static double function_time;

	/**
	 * 目标程序执行的总次数
	 */
	static int function_frequency;

	/*
	 * 函数时间和频率的重置
	 * */
	static void reset()
	{
		function_time = 0.0;
		function_frequency = 0.0;
	}

	/**
	 * 单次运行总时间
	 */
	static double totalTime[countOfRepeation];

	/**
	 * 单次运行总次数
	 */
	static int totalFrequency[countOfRepeation];

	/**
	 * 单次运行中函数执行时间
	 */
	static double algorithmTime[countOfRepeation];

	/**
	 * 单次覆盖率（覆盖路径的条数）
	 */
	static int coveredRatio[countOfRepeation];
	static bool findResult[countOfRepeation];

	/**
	 * 生成随机初始值的取值点，默认取0
     */
	static double START_POINT;

	/**
	 * 最大步长
	 * <p>从自变参数生成池中衍生新的值时，向两边扩展的最大步长
	 * <p>向外扩展的步长为(0,MAX_STEP)内的随机值 ，默认取5
	 */
	static double MAX_STEP;

	/**
	 * 用户定制的输入参数值
	 */
	static const bool IS_CUSTOMIZED = false;
	static double CUSTOMIZED_PARAMS[ConstraintParameter::NUM_OF_PARAM] ;

	/**
	 * 是否需要精细搜索
	 */
	static const bool NEED_REFINED_SEARCH = true;

	/**
	 * 最大预测区间
	 */
	static const double MAX_PREDICT_BOUNDARY = 20.0;

	/**
	 * 最小预测区间 for zy  0.1
	 */
	static const double MIN_PREDICT_BOUNDARY = 0.1;

	/**
	 * 取值调整粒度
	 */
	static const double ADJUST_RATIO_DOUBLE_ZERO = 1e-40;     //1e-40;
	static const double ADUJST_RATIO_DOUBLE = 1e-40;         // 1e-40;
	static const int ADJUST_GRANULARITY_INTEGER = 1;
	static double ZeroToleranceDegree  ;

};

#endif /* SOLVERPARAMETER_H_ */
