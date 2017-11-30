/*
 * ConstraintParameter.cuh
 * 
 * ***************   Notice   ***************
 * Auto Generated By ATPC on:2017-11-29 17:43:05
 * Author: ZhangHui
 * 
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
	static const int NUM_OF_PARAM = 6;

	/*
	 * 约束的名字信息
	 * */ 
	static string constraintName;

	/*
	 * 约束的变量类型，使用bool变量表示，1表示浮点数，0表示整形
	 * */ 
	static bool constraintVarType[NUM_OF_PARAM];

	/*
	 * 变量的名字信息
	 * */ 
	static string constraintVarName[NUM_OF_PARAM];

	/*
	 * 变量的整体依赖关系，使用bool变量表示，1表示相关，0表示不相关
	 * */ 
	static bool constraintDependencyRela[NUM_OF_PARAM];

	/*
	 * 所有的约束的数量
	 * */ 
	static const int Num_Of_Constraints = 10;

	/*
	 * 所有的约束的比较运算符的类型信息
	 * */ 
	static int constraintCompType[Num_Of_Constraints];

	/*
	 * 这个函数是用来获取约束的信息
	 * */ 
	static vector< vector<string> > getConstraintInfo();
	static vector< vector<RuntimeValue*> > getCoveredInfo(double* nums);

	/*
	 * 下面是最后在CPU对求出的可行解向量做验证的函数，
	 * 主要就是计算每一个简单子约束的运行时刻值，以及每一个简单自约束的满足情况
	 * */ 
	static RuntimeValue* getConstraintValue_0_0(double x , double y , double z , double w , double t , double v);
	static RuntimeValue* getConstraintValue_0_1(double x , double y , double z , double w , double t , double v);
	static RuntimeValue* getConstraintValue_0_2(double x , double y , double z , double w , double t , double v);
	static RuntimeValue* getConstraintValue_0_3(double x , double y , double z , double w , double t , double v);
	static RuntimeValue* getConstraintValue_0_4(double x , double y , double z , double w , double t , double v);
	static RuntimeValue* getConstraintValue_0_5(double x , double y , double z , double w , double t , double v);
	static RuntimeValue* getConstraintValue_0_6(double x , double y , double z , double w , double t , double v);
	static RuntimeValue* getConstraintValue_0_7(double x , double y , double z , double w , double t , double v);
	static RuntimeValue* getConstraintValue_0_8(double x , double y , double z , double w , double t , double v);
	static RuntimeValue* getConstraintValue_0_9(double x , double y , double z , double w , double t , double v);
};

#endif /* CONSTRAINTPARAMETER_CUH_ */
