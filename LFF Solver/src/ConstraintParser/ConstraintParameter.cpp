		/*
		 * ConstraintParameter.cpp
		 *
		 *  Created on: Oct 21, 2017
		 *      Author: zy
		 */

		#include <iostream>

		#include "./../solver/ConstantValue.h"
		#include "./../model/RuntimeValue.h"
		#include "ConstraintParameter.cuh"

		using namespace std;


		/*
		 *约束的名字信息
		 * */
		string ConstraintParameter::constraintName = "benchmark01";

		/*
		 * 约束的变量类型，使用bool变量表示，1表示浮点数，0表示整形
		 * */
		bool ConstraintParameter::constraintVarType[NUM_OF_PARAM] = {1,0,1};

		/*
		 * 变量的名字信息
		 * */
		string ConstraintParameter::constraintVarName[NUM_OF_PARAM] = {"x","y","z"};

		/*
		 * 变量的整体依赖关系，使用bool变量表示，1表示相关，0表示不相关
		 * */
		bool ConstraintParameter::constraintDependencyRela[NUM_OF_PARAM] = {true,true,true};

		/*
		 *  所有的约束的比较运算符的类型信息
		 *  1 表示> , >= , < , <=四种情况
		 *  0 表示 == 情况
		 * -1 表示 ！= 情况
		 * */
		int ConstraintParameter::cinstraintCompType[Num_Of_Constraints] = {1,1,1};


		/*
		 * 这个函数是用来获取约束的信息
		 * */
		vector< vector<string> > ConstraintParameter::getConstraintInfo()
		{
			vector< vector<string> > res;

			vector<string> HeQv1;
			HeQv1.push_back("9 > x*y*z");
			HeQv1.push_back("z > x*y");
			HeQv1.push_back(" y > z ");
			res.push_back(HeQv1);

			return res;
		}

		vector< vector<RuntimeValue*> > ConstraintParameter::getCoveredInfo(double* nums)
		{
			vector< vector<RuntimeValue*> > res;

			vector<RuntimeValue*> HeQv1;
			RuntimeValue* tmp00 = getConstraintValue_0_0(nums[0],nums[1],nums[2]);
			HeQv1.push_back(tmp00);
			RuntimeValue* tmp01 = getConstraintValue_0_1(nums[0],nums[1],nums[2]);
			HeQv1.push_back(tmp01);
			RuntimeValue* tmp02 = getConstraintValue_0_2(nums[0],nums[1],nums[2]);
			HeQv1.push_back(tmp02);
			res.push_back(HeQv1);

			return res;
		}

		/*
		 * 下面是最后在CPU对求出的可行解向量做验证的函数，
		 * 主要就是计算每一个简单子约束的运行时刻值，以及每一个简单自约束的满足情况
		 * */
		RuntimeValue* ConstraintParameter::getConstraintValue_0_0(double x,double y,double z)
		{
			double value =9 - x*y*z;
			bool isCovered = (9 > x*y*z) * true;
			RuntimeValue* one = new RuntimeValue(value,isCovered);
			return one;
		}

		RuntimeValue* ConstraintParameter::getConstraintValue_0_1(double x,double y,double z)
		{
			double value = z - x*y;
			bool isCovered = (z > x*y) * true;
			RuntimeValue* one = new RuntimeValue(value,isCovered);
			return one;
		}

		RuntimeValue* ConstraintParameter::getConstraintValue_0_2(double x,double y,double z)
		{
			double value = y - z;
			bool isCovered = (y > z) * true;
			RuntimeValue* one = new RuntimeValue(value,isCovered);
			return one;
		}