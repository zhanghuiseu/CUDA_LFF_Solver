	/*
	 * ATG.cpp
	 *
	 *  Created on: Oct 14, 2017
	 *      Author: zy
	 */


	#include <iostream>
	#include <string>
	#include <cmath>

	#include "ATG.h"
	#include "PCATG.h"
	#include "SolverParameter.h"
	#include "ConstantValue.h"
	#include "./../ConstraintParser/ConstraintParameter.cuh"
	#include "./../model/SearchTask.h"

	using namespace std;


	/*
	 *  下面是使用到的ATG类的static的初始化部分参数
	 * */

	/**
	 * 当前搜素变量的下标
	 */
	int ATG::currentSearchParamIndex = 0;

	/**
	 * 存储每一轮的种子搜索点(对每一个变量的搜索都可得到下一轮的种子搜索点）
	 */
	SearchTask* ATG::seeds = NULL;
	SearchTask* ATG::nextSeeds = NULL;

	/**
	 * 存储第一轮中以随机值开始搜索的每一个变量方向上最优点的覆盖节点数
	 */
	int ATG::NumOfCoveredNodes[ConstraintParameter::NUM_OF_PARAM] ={0};

	/**
	 * 当前输入向量
	 */
	double ATG::parameters[ConstraintParameter::NUM_OF_PARAM] ={0};


	/*
	 * 策略的设置函数
	 * */
	void ATG::setStrategy()
	{
		SolverParameter::MAX_NUM_OF_PREDICT_PARAM = 10;
		SolverParameter::MAX_NUM_OF_GENERATE_CYCLE = ConstraintParameter::NUM_OF_PARAM;

		if(ConstraintParameter::NUM_OF_PARAM >=5)   //zy   >6
		{
			SolverParameter::SEARCH_STRATEGY = ConstantValue::SEARCH_STRATEGY_ONE_BY_ONE;
			SolverParameter::Cala_Strategy = ConstantValue::SEARCH_STRATEGY_ONE_BY_ONE;
		}
		else
		{
			SolverParameter::SEARCH_STRATEGY = ConstantValue::SEARCH_STRATEGY_ALL;
			SolverParameter::Cala_Strategy = ConstantValue::SEARCH_STRATEGY_ALL;
		}
	}

	/*
	 * LFF Solver 测试用例生成
	 * 这个函数主要是多变量和单变量策略调度模块
	 * */
	int ATG::generateTestDataForSolver()
	{
		/*
		 * 计算之前要注意策略的初始化
		 * */
		this->setStrategy();

		//下面就是根据不同的策略完成不同的计算
		int isCovered = -1;
		if(SolverParameter::SEARCH_STRATEGY == ConstantValue::SEARCH_STRATEGY_ALL)
			isCovered = this->generateTestDataForSolverByAll();
		else
			isCovered = this->generateTestDataForSolverByOneByOne();
		return isCovered;
	}

	/*
	 * 这个函数函数是多变量交叉搜索的实现
	 * */
	int ATG::generateTestDataForSolverByAll()
	{
		this->pcatg.generateTestDataForSolver();

		int num_of_param = ConstraintParameter::NUM_OF_PARAM;
		int isCovered = -1;
		int round = 0;
		while(round < SolverParameter::MAX_NUM_OF_GENERATE_CYCLE && isCovered<=-1)
		{
		    int paramIndex;
		    //第一轮，以随机值与指定值开始搜索
		    if(round == 0)
		    {
		    	int max_num_of_predict_param = SolverParameter::MAX_NUM_OF_PREDICT_PARAM;

		    	//这个if属于用户定制的数据的处理程序
		    	if(SolverParameter::IS_CUSTOMIZED)
		    	{
		    		max_num_of_predict_param /= 2;
		    	}

			    seeds = new SearchTask[num_of_param];
			    paramIndex = 0;

		        // 对所有参数执行ATG
		        while(paramIndex < num_of_param && isCovered <= -1)
		        {
		        	//isCovered = generateTestDataForParamForSolver(paramIndex, null, round, paramIndex, max_num_of_predict_param);
		        	isCovered = this->pcatg.generateTestDataForSolver();

		        	//这个if属于用户定制的数据的处理程序
		        	if(isCovered == -1 && SolverParameter::IS_CUSTOMIZED)
		        	{
		        		//TODO
			        }

			        paramIndex ++;
		        }
		    }
		    else
		    {
		    	/*
		    	 * 其余轮，以上一轮生成的最优点开始搜索
		    	 * */

			    //计算本轮生成的种子数
			    int seedsNum = (int) (num_of_param * pow((num_of_param - 1), round - 1));
			    int nextRoundSeedsNum = seedsNum * (num_of_param - 1);
			    nextSeeds = new SearchTask[nextRoundSeedsNum];

			    int seedIndex = 0;
			    int nextRoundSeedIndex = 0;
			    while(seedIndex < seedsNum && isCovered <= -1)
			    {
			    	paramIndex = 0;
			    	while(paramIndex < num_of_param && isCovered <= -1)
			    	{
					    if(paramIndex != seeds[seedIndex].getSearchIndex())
					    {
				            // 以给定值为初始参数进行ATG
			                //isCovered = generateTestDataForParamForSolver(paramIndex,seeds[seedIndex].getInitInputs(), round, nextRoundSeedIndex, MAX_NUM_OF_PREDICT_PARAM);

					    	isCovered = this->pcatg.generateTestDataForSolver();

					    	nextRoundSeedIndex ++;
					    }
				        paramIndex ++;
				    }
				    seedIndex ++;
			    }
			    //将新生成的最优点作为下一轮的初始种子
		        seeds = nextSeeds;
		    }
		    round ++;
		}
	}

	/*
	 * 这个函数是单变量一次搜索的实现
	 * */
	int ATG::generateTestDataForSolverByOneByOne()
	{
		this->pcatg.generateTestDataForSolver();

		int num_of_param = ConstraintParameter::NUM_OF_PARAM;
		int isCovered = -1;
		int round = 0;

		//下面是单变量依次搜索
	    while(round < SolverParameter::MAX_NUM_OF_GENERATE_CYCLE && isCovered <= -1)
	    {
		    int paramIndex = 0;
            // 对所有参数执行ATG
		    double* seed = NULL;
            while(paramIndex < num_of_param && isCovered <= -1)
            {

            	/*
            	if(round ==0 && paramIndex == 0)
        	    	seed = NULL;
        	    else
        	    	seed = ATG::seedArray;
        	    isCovered = generateTestDataForParamForSolver(paramIndex, seed, -1, paramIndex, MAX_NUM_OF_PREDICT_PARAM);
            	 *
            	 * */
            	this->pcatg.generateTestDataForSolver();
        	    paramIndex ++;
            }
            round ++;
	    }
		return isCovered;
	}


