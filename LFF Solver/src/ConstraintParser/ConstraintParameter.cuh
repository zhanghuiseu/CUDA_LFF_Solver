/*
 * ConstraintParameter.cuh
 *
 *  Created on: Oct 14, 2017
 *      Author: zy
 */

#ifndef CONSTRAINTPARAMETER_CUH_
#define CONSTRAINTPARAMETER_CUH_

#include <string>
#include <vector>
#include <iostream>

#include "./../model/RuntimeValue.h"
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
	 * 约束的Type信息
	 * */
	static bool constraintVarType[NUM_OF_PARAM];

	/*
	 * 约束变量名字信息
	 * */
	static string constraintVarName[NUM_OF_PARAM];

	/*
	 * 基于路径约束的以来分析结果
	 * */
	static bool constraintDependencyRela[NUM_OF_PARAM];

	/*
	 * 这个函数是用来获取约束的信息
	 * */
	static vector< vector<string> > getConstraintInfo()
	{
		vector< vector<string> > res;
		vector<string> one;
		one.push_back("x*x < 9");
		one.push_back("x*y < 0");
		res.push_back(one);

		vector<string> two;
		two.push_back(" y>=z ");
		res.push_back(two);

		return res;
	}

	static vector< vector<RuntimeValue*> > getCoveredInfo(double* nums)
	{
		vector< vector<RuntimeValue*> > res;
		vector<RuntimeValue*> one;
		RuntimeValue* tmp = getConstraintValue00(nums[0],nums[1],nums[2]);
		one.push_back(tmp);
		tmp = getConstraintValue01(nums[0],nums[1],nums[2]);
		one.push_back(tmp);
		res.push_back(one);

		vector<RuntimeValue*> two;
		tmp = getConstraintValue10(nums[0],nums[1],nums[2]);
		two.push_back(tmp);
		res.push_back(two);

		return res;
	}

	/*
	 * 下面是最后在CPU对求出的可行解向量做验证的函数，
	 * 主要就是计算每一个简单子约束的运行时刻值，以及每一个简单自约束的满足情况
	 * */
	static RuntimeValue* getConstraintValue00(double x,double y,double z)
	{
		double value = 9 - x*x;
		bool isCovered = (9 > x*x) * true;
		RuntimeValue* one = new RuntimeValue(value,isCovered);
		return one;
	}

	static RuntimeValue* getConstraintValue01(double x,double y,double z)
	{
		double value = 0 - x*y;
		bool isCovered = (0 > x*y) * true;
		RuntimeValue* one = new RuntimeValue(value,isCovered);
		return one;
	}

	static RuntimeValue* getConstraintValue10(double x,double y,double z)
	{
		double value = y - z;
		bool isCovered = (y > z) * true;
		RuntimeValue* one = new RuntimeValue(value,isCovered);
		return one;
	}

};

string ConstraintParameter::constraintName = "benchmark01";
bool ConstraintParameter::constraintVarType[NUM_OF_PARAM] = {1,1,1};
string ConstraintParameter::constraintVarName[NUM_OF_PARAM] = {"x","y","z"};
bool ConstraintParameter::constraintDependencyRela[NUM_OF_PARAM] = {true,true,true};

#endif /* CONSTRAINTPARAMETER_CUH_ */
