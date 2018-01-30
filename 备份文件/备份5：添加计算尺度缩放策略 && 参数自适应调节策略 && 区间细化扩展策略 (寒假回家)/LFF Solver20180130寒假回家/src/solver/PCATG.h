/*
 * PCATG.h
 *
 *  Created on: Oct 14, 2017
 *      Author: zhanghui
 */

#ifndef PCATG_H_
#define PCATG_H_

#include <iostream>
#include <stdlib.h>
#include <ctime>

#include "type.h"

using namespace std;

class PCATG
{
public:
	PCATG()
	{

	}
	~PCATG()
	{

	}

	/*
	 * 每一个搜索方向的计算，也就是CUDA并行计算模块
	 * */
	bool generateTestDataForSolver(int paramIndex, FloatType* seed, int round,
			int nextRoundSeedIndex, int max_num_of_predict_param);

	/*
	 * 生成初始搜索点，一共有两种可能情况：
	 * 1）给定的起始搜索点
	 * 2）未给定，直接随机生成起初点
	 * */
	void initialParameter(FloatType*& initParams);

	/**
	 * 将第paramIndex个参数设为随机值
	 * @param paramIndex
	 * @param leftBoundary
	 * @param rightBoundary
	 * @param mode
	 * @INTERVAL_BOTH_OPEN：在(leftBoundary, rightBoundary)内产生随机值
	 * @INTERVAL_RIGHT_OPEN：在[leftBoundary, rightBoundary)内产生随机值
	 * @INTERVAL_LEFT_OPEN：在(leftBoundary, rightBoundary]内产生随机值
	 * @INTERVAL_BOTH_CLOSED：在[leftBoundary, rightBoundary]内产生随机值
	 */
	void setRandom(int paramIndex, FloatType value, int mode);

	/*
	 * 由于这个CUDA暂时不支持C++11以上的版本，所以这里没有办法使用最新的生成浮点数的系统标准
	 * 所以这里直接使用了最经典的rand()函数获取随机数
	 * */
	static FloatType random();

};

#endif /* PCATG_H_ */
