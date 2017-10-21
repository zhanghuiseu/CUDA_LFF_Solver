		/*
		 * ConstraintParameter.cpp
		 *
		 *  Created on: Oct 21, 2017
		 *      Author: zy
		 */


		#include "./../model/RuntimeValue.h"
		#include "ConstraintParameter.cuh"


		/*
		 *约束的名字信息
		 * */
		string ConstraintParameter::constraintName = "benchmark01";

		/*
		 * 约束的变量类型，使用bool变量表示，1表示浮点数，0表示整形
		 * */
		bool ConstraintParameter::constraintVarType[NUM_OF_PARAM] = {1,1,1};

		/*
		 * 变量的名字信息
		 * */
		string ConstraintParameter::constraintVarName[NUM_OF_PARAM] = {"x","y","z"};

		/*
		 * 变量的整体依赖关系，使用bool变量表示，1表示相关，0表示不相关
		 * */
		bool ConstraintParameter::constraintDependencyRela[NUM_OF_PARAM] = {true,true,true};


		/*
		 * 这个函数是用来获取约束的信息
		 * */
		vector< vector<string> > ConstraintParameter::getConstraintInfo()
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

		vector< vector<RuntimeValue*> > ConstraintParameter::getCoveredInfo(double* nums)
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
		RuntimeValue* ConstraintParameter::getConstraintValue00(double x,double y,double z)
		{
			double value = 9 - x*x;
			bool isCovered = (9 > x*x) * true;
			RuntimeValue* one = new RuntimeValue(value,isCovered);
			return one;
		}

		RuntimeValue* ConstraintParameter::getConstraintValue01(double x,double y,double z)
		{
			double value = 0 - x*y;
			bool isCovered = (0 > x*y) * true;
			RuntimeValue* one = new RuntimeValue(value,isCovered);
			return one;
		}

		RuntimeValue* ConstraintParameter::getConstraintValue10(double x,double y,double z)
		{
			double value = y - z;
			bool isCovered = (y > z) * true;
			RuntimeValue* one = new RuntimeValue(value,isCovered);
			return one;
		}
