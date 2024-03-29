		/*
		 * SolverParameter.cpp
		 *
		 *  Created on: Oct 21, 2017
		 *      Author: zy
		 */
		#include "SolverParameter.h"
		#include <cmath>

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
		int SolverParameter::MAX_NUM_OF_PREDICT_PARAM = 10;
		int SolverParameter::MAX_NUM_OF_GENERATE_CYCLE = 5;
		double SolverParameter::function_time = 0;
		int SolverParameter::function_frequency = 0;
		int SolverParameter::SEARCH_STRATEGY = 0;
		int SolverParameter::Cala_Strategy = 0;
		double SolverParameter::START_POINT = 0;
		double SolverParameter::MAX_STEP = 5;

		//注意这个参数的初始化有点特殊，这里使用到了函数指针
		double SolverParameter::ZeroToleranceDegree = (numeric_limits<double>::min)() ;


		double SolverParameter::totalTime[countOfRepeation] = {0.0};
		int SolverParameter::totalFrequency[countOfRepeation] = {0};
		double SolverParameter::algorithmTime[countOfRepeation] = {0.0};
		int SolverParameter::coveredRatio[countOfRepeation] = {0};
		bool SolverParameter::findResult[countOfRepeation] = {0};
		double SolverParameter::CUSTOMIZED_PARAMS[ConstraintParameter::NUM_OF_PARAM] ={0};

