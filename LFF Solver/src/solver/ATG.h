/*
 * ATG.h
 *
 *  Created on: Oct 14, 2017
 *      Author: zy
 */

#ifndef ATG_H_
#define ATG_H_

#include "PCATG.h"
#include "./../model/SearchTask.h"

class ATG
{
public:
	ATG()
	{
		this->pcatg = PCATG();
	}
	~ATG()
	{

	}

	/*
	 * LFF Solver 测试用例生成
	 * 这个函数主要是多变量和单变量策略调度模块
	 * */
	int generateTestDataForSolver();

	/*
	 * 这个函数函数是多变量交叉搜索的实现
	 * */
	int generateTestDataForSolverByAll();

	/*
	 * 这个函数是单变量一次搜索的实现
	 * */
	int generateTestDataForSolverByOneByOne();

	/*
	 * 策略的设置函数
	 * */
	void setStrategy();

private:
	PCATG pcatg;

	/**
	 * 当前搜素变量的下标
	 */
	static int currentSearchParamIndex;

	/**
	 * 存储每一轮的种子搜索点(对每一个变量的搜索都可得到下一轮的种子搜索点）
	 */
	static SearchTask* seeds;
	static SearchTask* nextSeeds;

	/**
	 * 上一变量方向上搜索的最优解
	 */
	static double* seedArray;

	/**
	 * 存储第一轮中以随机值开始搜索的每一个变量方向上最优点的覆盖节点数
	 */
	static int NumOfCoveredNodes[ConstraintParameter::NUM_OF_PARAM] ;

	/**
	 * 当前输入向量
	 */
	static double parameters[ConstraintParameter::NUM_OF_PARAM] ;
};



#endif /* ATG_H_ */
