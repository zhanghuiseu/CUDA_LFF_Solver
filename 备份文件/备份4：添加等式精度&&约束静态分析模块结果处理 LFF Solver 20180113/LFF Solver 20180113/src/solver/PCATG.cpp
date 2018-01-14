	/*
	 * PCATG.cpp
	 *
	 *  Created on: Oct 14, 2017
	 *      Author: zhanghui
	 */

	#include <iostream>
	#include <string>
	#include <stdlib.h>
	#include <ctime>
	#include <cmath>

	#include "type.h"
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
	bool PCATG::generateTestDataForSolver(int paramIndex, FloatType* seed, int round,
			int nextRoundSeedIndex, const int max_num_of_predict_param)
	{
		//设置当前的搜索变量方向
		ATG::currentSearchParamIndex = paramIndex;

		//初始化部分，主要是根据seed来完成ATG::parameter的初始化
		initialParameter(seed);

		//某一方向的初始化
		bool isCovered = ParallelATG::generateTestDataForSolver(max_num_of_predict_param);
		FloatType pri = ATG::currentSearchParamPriotity;

		/*
		 * 设置最终的参数，这个分为两种情况
		 *  1）找到解，那么这就是找到的解向量
		 *  2）没找到，那么这就是找到的覆盖度最高的向量
		 * */
        if(isCovered == true)
        {
    		for(int i=0;i<ConstraintParameter::NUM_OF_PARAM ;i++)
    			SolverParameter::finalParams[i] = ATG::parameters[i];
    		SolverParameter::finalCovered = ATG::currentSearchParamPriotity;
        }else if(ATG::currentSearchParamPriotity > SolverParameter::finalCovered)
        {
    		for(int i=0;i<ConstraintParameter::NUM_OF_PARAM ;i++)
    			SolverParameter::finalParams[i] = ATG::parameters[i];
    		SolverParameter::finalCovered = ATG::currentSearchParamPriotity;
        }

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

		//count++;
/*		if(count == 100)
			return true;
		else
			return false;*/

		//cout<<"**********            "<<(paramIndex)<<"     "<<nextRoundSeedIndex<<"   Count: "<<count++<<endl<<endl<<endl;


		return isCovered;
	}

	/*
	 * 生成初始搜索点，一共有两种可能情况：
	 * 1）给定的起始搜索点
	 * 2）未给定，直接随机生成起初点
	 * */
	void PCATG::initialParameter(FloatType*& initParams)
	{
		ATG::currentSearchParamPriotity = 0.0;
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
			FloatType leftMin = ConstraintParameter::minNum;
			FloatType rightMax = ConstraintParameter::maxNum;

			//注意，我们只在最初的其实搜索点中使用到定义域
			//根据随机生成的点直接作为LFF的起始搜索点
			for(int i = 0; i < ConstraintParameter::NUM_OF_PARAM; i++)
			{
				FloatType left = ConstraintParameter::left[i];
				FloatType right = ConstraintParameter::right[i];

				if(left == leftMin && right == rightMax)
				{
					//这个是全定义域的情况(<--,-->)，这种情况下实在Start周围随机生成初始点，一般情况下start是0
					setRandom(i, SolverParameter::START_POINT, ConstantValue::INTERVAL_LEFT_OPEN);
					//cout<<"——————————————————————————> 起始搜索是全域区间"<<endl;
				}
				else if(left > leftMin && right == rightMax)
				{
					//这种情况是(left,-->),那么就在left的右边加一个随机值，然后做搜索起始点
					setRandom(i, left + rand(), ConstantValue::INTERVAL_LEFT_OPEN);
					//cout<<"——————————————————————————> 起始搜索是右区间"<<left<<" , "<<rightMax<<endl;
				}else  if(left == leftMin && right < rightMax)
				{
					//这种情况是(<--,right),那么就在right的左边加一个随机值，然后做搜索起始点
					setRandom(i, right - rand(), ConstantValue::INTERVAL_LEFT_OPEN);
					//cout<<"——————————————————————————> 起始搜索是左区间"<<leftMin<<" , "<<right<<endl;
				}else if(left > leftMin && right < rightMax)
				{
					//这种情况是(left,right)的封闭区间，那么直接取中点作为搜索起始点
					setRandom(i, (right-left)/2+left, ConstantValue::INTERVAL_LEFT_OPEN);
					//cout<<"——————————————————————————> 起始搜索是封闭区间"<<left<<" , "<<right<<endl;
				}


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
	void PCATG::setRandom(int paramIndex, FloatType value, int mode)
	{
		FloatType leftBoundary  = value - SolverParameter::PREDICT_BOUNDARY;
		FloatType rightBoundary = value + SolverParameter::PREDICT_BOUNDARY;

		if (mode == ConstantValue::INTERVAL_BOTH_OPEN)
		{
			FloatType random = PCATG::random();
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
	FloatType PCATG::random()
	{
		return (FloatType)(rand())/(FloatType)(RAND_MAX);
	}




	/*
	 * 随机数测试函数
	 *
	 * */
	void testRandom()
	{
		const int SIZE = 1000000;
		vector<int> count(10,0);
		vector<FloatType> r(SIZE,0);
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

