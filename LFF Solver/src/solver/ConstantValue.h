/*
 * ConstantValue.h
 *
 *  Created on: Oct 21, 2017
 *      Author: zy
 */

#ifndef CONSTANTVALUE_H_
#define CONSTANTVALUE_H_

class ConstantValue
{
public:
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

};
#endif /* CONSTANTVALUE_H_ */
