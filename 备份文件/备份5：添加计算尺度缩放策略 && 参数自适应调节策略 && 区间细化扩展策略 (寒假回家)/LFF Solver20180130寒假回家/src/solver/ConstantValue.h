/*
 * ConstantValue.h
 *
 *  Created on: Oct 21, 2017
 *      Author: zhanghui
 */

#ifndef CONSTANTVALUE_H_
#define CONSTANTVALUE_H_

#include <iostream>
#include <cmath>

using namespace std;

class ConstantValue
{
public:

	/*
	 * 这个是定义> ， >= ，<  ， <=等4中情况，
	 * 在这里我们不区分上述的四种情况
	 * */
	static const int GreatOrGreatEqual = 1;

	/*
	 * 这个是定义等于==的情况
	 * */
	static const int Equal = 0;


	/*
	 * 这个是定义不等于！=的情况
	 * */
	static const int NotEqual = -1;

	/**
	 * 分支节点
	 */
	static const int BRANCH_NODE = 15;

	/**
	 * 全开区间
	 */
	static const int INTERVAL_BOTH_OPEN = 0;

	/**
	 * 左开区间
	 */
	static const int INTERVAL_LEFT_OPEN = 1;

	/**
	 * 右开区间
	 */
	static const int INTERVAL_RIGHT_OPEN = 2;

	/**
	 * 全闭区间
	 */
	static const int INTERVAL_BOTH_CLOSED = 3;


	/**
	 * 拟合线段与横轴交点在区间左侧
	 */
	static const int LEFT = 1;

	/**
	 * 拟合线段与横轴交点在区间右侧
	 */
	static const int RIGHT = 2;

	/**
	 * 拟合线段与横轴交点不在区间外
	 */
	static const int INSIDE = 0;

	/**
	 * 变量搜索方式为全变量交叉搜索
	 */
	static const int SEARCH_STRATEGY_ALL = 0;

	/**
	 * 变量搜索方式为按变量下标顺序搜索
	 */
	static const int SEARCH_STRATEGY_ONE_BY_ONE = 1;


	/*
	 * 约束的变量类型，使用bool变量表示，1表示浮点数，0表示整形
	 * 浮点数表示类型
	 * */
	static const bool FloatType = true;

	/*
	 * 整形表示类型
	 * */
	static const bool IntType = false;
};
#endif /* CONSTANTVALUE_H_ */
