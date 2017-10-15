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
	 */
	static const int MAX_NUM_OF_PREDICT_PARAM = 50;

	/**
	 * 预测的轮数上限(1,2,4) --- N
	 */
	static const int MAX_NUM_OF_GENERATE_CYCLE =5;

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
	 *  ATG实验过程重复执行次数
	 */
    static const int countOfRepeation = 7;

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

	/**
	 * 当前搜素变量的下标
	 */
	static int currentSearchParamIndex;
};


/*
 *  使用这样的结构来获取各个类型的最大值和最小值
    cout<<(numeric_limits<int>::max)() <<endl;
	cout<<(numeric_limits<int>::min)() <<endl;
	cout<<(numeric_limits<double>::max)() <<endl;
	cout<<(numeric_limits<double>::min)() <<endl;
 * */

/*
 * 静态变量必须类外初始化
 * */
double* SolverParameter::finalParams = NULL;
double SolverParameter::finalCovered = 0;
double SolverParameter::function_time = 0;
int SolverParameter::function_frequency = 0;
int SolverParameter::SEARCH_STRATEGY = 0;
int SolverParameter::Cala_Strategy = 0;
double SolverParameter::START_POINT = 0;
double SolverParameter::MAX_STEP = 5;
int SolverParameter::currentSearchParamIndex = 0;

//注意这个参数的初始化有点特殊，这里使用到了函数指针
double SolverParameter::ZeroToleranceDegree = (numeric_limits<double>::min)() ;


double SolverParameter::totalTime[countOfRepeation] = {0.0};
int SolverParameter::totalFrequency[countOfRepeation] = {0};
double SolverParameter::algorithmTime[countOfRepeation] = {0.0};
int SolverParameter::coveredRatio[countOfRepeation] = {0};
bool SolverParameter::findResult[countOfRepeation] = {0};
double SolverParameter::CUSTOMIZED_PARAMS[ConstraintParameter::NUM_OF_PARAM] ={0};

#endif /* SOLVERPARAMETER_H_ */
