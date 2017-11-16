	/*
	 * PCATG.cpp
	 *
	 *  Created on: Oct 14, 2017
	 *      Author: zy
	 */

	#include <iostream>
	#include <string>
	#include <stdlib.h>
	#include <ctime>
	#include <cmath>

	#include "ATG.h"
	#include "PCATG.h"
	#include "ConstantValue.h"
	#include "./../model/SearchTask.h"
	#include "./../cuda/ParallelATG.cuh"

	using namespace std;

	static int count = 0;
	/*
	 * 每一个搜索方向的计算，也就是CUDA并行计算模块
	 * */
	bool PCATG::generateTestDataForSolver(int paramIndex, double* seed, int round,
			int nextRoundSeedIndex, const int max_num_of_predict_param)
	{
		//设置当前的搜索变量方向
		ATG::currentSearchParamIndex = paramIndex;

		//初始化部分，主要是根据seed来完成ATG::parameter的初始化
		initialParameter(seed);

		//某一方向的初始化
		bool isCovered = ParallelATG::generateTestDataForSolver(max_num_of_predict_param);
		double pri = ATG::currentSearchParamPriotity;

		/*
		 * 运算完成后的结果返回部分
		 * */
		if(round == -1)
			ATG::seedArray = ATG::parameters;
		//第一轮，且是以随机值开始搜索
		else if(seed==NULL)
			ATG::seeds[nextRoundSeedIndex]->copyAll(ATG::parameters, pri, paramIndex, round);
		//第一轮，且是以指定值开始搜索
		else if (round == 0)
			ATG::seeds[nextRoundSeedIndex]->copyAll(ATG::parameters, pri, paramIndex, round);
		//非第一轮
		else
			ATG::nextSeeds[nextRoundSeedIndex]->copyAll(ATG::parameters, pri, paramIndex, round);

		cout<<"**********            "<<(paramIndex)<<"     "<<nextRoundSeedIndex<<"   Count: "<<count++<<endl<<endl<<endl;

		//return false;
		return isCovered;
	}

	/*
	 * 生成初始搜索点，一共有两种可能情况：
	 * 1）给定的起始搜索点
	 * 2）未给定，直接随机生成起初点
	 * */
	void PCATG::initialParameter(double*& initParams)
	{
		if(initParams != NULL)
		{
			//根据给定的初始值直接作为LFF的起始搜索点
			// 手动设置初始值
			for(int i = 0; i < ConstraintParameter::NUM_OF_PARAM; i++)
			{
				ATG::parameters[i] = initParams[i];
			}
		}else
		{
			//根据随机生成的点直接作为LFF的起始搜索点
			for(int i = 0; i < ConstraintParameter::NUM_OF_PARAM; i++)
			{
				setRandom(i, SolverParameter::START_POINT, ConstantValue::INTERVAL_LEFT_OPEN);
			}
		}
	}

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
	void PCATG::setRandom(int paramIndex, double value, int mode)
	{
		double leftBoundary  = value - SolverParameter::PREDICT_BOUNDARY;
		double rightBoundary = value + SolverParameter::PREDICT_BOUNDARY;

		if (mode == ConstantValue::INTERVAL_BOTH_OPEN)
		{
			double random = PCATG::random();
			while(random == 0.0)
			{
				random = PCATG::random();
			}
			ATG::parameters[paramIndex] = random*(rightBoundary - leftBoundary) + leftBoundary;
		}
		else if (mode == ConstantValue::INTERVAL_LEFT_OPEN)
		{
			ATG::parameters[paramIndex] = rightBoundary - PCATG::random()*(rightBoundary - leftBoundary);
		}
		else if (mode == ConstantValue::INTERVAL_RIGHT_OPEN)
		{
			ATG::parameters[paramIndex] = PCATG::random()*(rightBoundary - leftBoundary) + leftBoundary;
		}
		else if (mode == ConstantValue::INTERVAL_BOTH_CLOSED)
		{
			if (PCATG::random() <= 0.5)
			{
				ATG::parameters[paramIndex] = PCATG::random()*(rightBoundary - leftBoundary) + leftBoundary;
			}
			else
			{
				ATG::parameters[paramIndex] = rightBoundary - PCATG::random()*(rightBoundary - leftBoundary);
			}
		}

		//约束的变量类型，使用bool变量表示，1表示浮点数，0表示整形
		if(ConstraintParameter::constraintVarType[paramIndex]==false)
		{
			ATG::parameters[paramIndex] =round(ATG::parameters[paramIndex]);
		}
	}

	/*
	 * 由于这个CUDA暂时不支持C++11以上的版本，所以这里没有办法使用最新的生成浮点数的系统标准
	 * 所以这里直接使用了最经典的rand()函数获取随机数
	 * */
	double PCATG::random()
	{
		return (double)(rand())/(double)(RAND_MAX);
	}




	/*
	 * 随机数测试函数
	 *
	 * */
	void testRandom()
	{
		const int SIZE = 1000000;
		vector<int> count(10,0);
		vector<double> r(SIZE,0);
		for(int i=0;i<SIZE;i++)
		{
			r[i] = PCATG::random();
		}

		for(int i=0;i<SIZE;i++)
		{
			if(r[i]<=0.1)
				count[0]++;
			else if(r[i]<=0.2)
				count[1]++;
			else if(r[i]<=0.3)
				count[2]++;
			else if(r[i]<=0.4)
				count[3]++;
			else if(r[i]<=0.5)
						count[4]++;
			else if(r[i]<=0.6)
				count[5]++;
			else if(r[i]<=0.7)
				count[6]++;
			else if(r[i]<=0.8)
				count[7]++;
			else if(r[i]<=0.9)
				count[8]++;
			else
				count[9]++;
		}

		for(int i=0;i<10;i++)
			cout<<count[i]<<"   ";
		cout<<endl;
	}

