/*
 * ConstraintParameter.cuh
 *
 *  Created on: Oct 14, 2017
 *      Author: zy
 */

#ifndef CONSTRAINTPARAMETER_CUH_
#define CONSTRAINTPARAMETER_CUH_

#include <string>
#include <iostream>
using namespace std;

/*
 * 这个类是经过约束依赖分析分析
 * */
class ConstraintParameter
{
public:
	/*
	 * 目标约束的参数数量
	 * */
	static const int NUM_OF_PARAM = 3;
	/*
	 * 约束的名字信息
	 * */
	static string constraintName;

	/*
	 * 约束的名字信息
	 * */
	static bool constraintType[NUM_OF_PARAM];


};

string ConstraintParameter::constraintName = "benchmark01:atr ";

bool ConstraintParameter::constraintType[NUM_OF_PARAM] = {1,1,1};

#endif /* CONSTRAINTPARAMETER_CUH_ */
