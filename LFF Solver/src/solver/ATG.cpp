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
	SearchTask** ATG::seeds = NULL;
	SearchTask** ATG::nextSeeds = NULL;

	/**
	 * 上一变量方向上搜索的最优解
	 */
	double* ATG::seedArray = NULL;

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
		SolverParameter::MAX_NUM_OF_GENERATE_CYCLE = 1;

		/*
		 * 对于约束参数数量大于一定数量的时候才使用多变量交叉搜索，
		 * 否则直接使用单变量交叉搜索
		 * */
		if(ConstraintParameter::NUM_OF_PARAM >=6)   //zy   >6
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
		int num_of_param = ConstraintParameter::NUM_OF_PARAM;
		int max_num_of_predict_param = SolverParameter::MAX_NUM_OF_PREDICT_PARAM;
		int isCovered = -1;
		int round = 0;

		while(round < SolverParameter::MAX_NUM_OF_GENERATE_CYCLE && isCovered<=-1)
		{
		    int paramIndex = 0;
		    //第一轮，以随机值与指定值开始搜索
		    if(round == 0)
		    {
		    	//这个if属于用户定制的数据的处理程序
		    	if(SolverParameter::IS_CUSTOMIZED)
		    		max_num_of_predict_param /= 2;

		    	//给seeds申请空间
		    	this->mallocForSeed(ConstraintParameter::NUM_OF_PARAM);

			    paramIndex = 0;
		        // 对所有参数执行ATG
		        while(paramIndex < ConstraintParameter::NUM_OF_PARAM && isCovered <= -1)
		        {
		        	//基于复杂约束依赖分析的搜索空间递减工作,然后标记下一个节点的needSearch
		        	if(ConstraintParameter::constraintDependencyRela[paramIndex] == true)
			        	isCovered = this->pcatg.generateTestDataForSolver(paramIndex, NULL, round, paramIndex, max_num_of_predict_param);
		        	else
		        		ATG::seeds[paramIndex]->setNeedSearch(false);

		        	//这个if属于用户定制的数据的处理程序
		        	if(isCovered == -1 && SolverParameter::IS_CUSTOMIZED)
		        	{
			            double* initParams = new double[num_of_param];
				    	for (int i=0; i<num_of_param; i++)
				    	{
				    		//使用初始值来赋值
						    for (int j=0; j<num_of_param; j++)
						    	initParams[j] = SolverParameter::CUSTOMIZED_PARAMS[i];

				        	//基于复杂约束依赖分析的搜索空间递减工作,然后标记下一个节点的needSearch
				        	if(ConstraintParameter::constraintDependencyRela[paramIndex] == true)
						    	isCovered = this->pcatg.generateTestDataForSolver(paramIndex,initParams, round, paramIndex, max_num_of_predict_param);
						    else
						    {
						    	ATG::seeds[paramIndex]->setNeedSearch(false);
						    	continue;
						    }

						    if (isCovered > -1)
						    	 break;
					    }
				    	delete [] initParams;
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
			    //给nextSeeds申请空间
			    this->mallocForNextSeed(nextRoundSeedsNum);

			    int seedIndex = 0;
			    int nextRoundSeedIndex = 0;
			    while(seedIndex < seedsNum && isCovered <= -1)
			    {
			    	paramIndex = 0;
			    	while(paramIndex < num_of_param && isCovered <= -1)
			    	{
					    if(paramIndex != seeds[seedIndex]->getSearchIndex())
					    {
					    	/*
					    	 * 给定值为初始参数进行ATG
					    	 * 基于复杂约束依赖分析的搜索空间递减工作,然后标记下一个节点的needSearch
					    	 * */
				        	if(seeds[seedIndex]->getNeedSearch()==true && ConstraintParameter::constraintDependencyRela[paramIndex] == true)
				        		isCovered = this->pcatg.generateTestDataForSolver(paramIndex,seeds[seedIndex]->getInitInputs(), round, nextRoundSeedIndex, max_num_of_predict_param);
				        	else
				        		ATG::nextSeeds[nextRoundSeedIndex]->setNeedSearch(false);

				        	nextRoundSeedIndex++;
					    }
				        paramIndex++;
				    }
				    seedIndex++;
			    }
			    //将新生成的最优点作为下一轮的初始种子
			    this->freeForSeed(seedsNum);
		        seeds = nextSeeds;
		    }
		    round++;
		}

		//最后释放一部分内存
		int seedsNum = (int) (num_of_param * pow((num_of_param - 1), round - 1));
		this->freeForSeed(seedsNum);
		ATG::seeds = ATG::nextSeeds = NULL;
	}

	/*
	 * 这个函数是单变量一次搜索的实现
	 * */
	int ATG::generateTestDataForSolverByOneByOne()
	{
		int num_of_param = ConstraintParameter::NUM_OF_PARAM;
		int isCovered = -1;
		int max_num_of_predict_param = SolverParameter::MAX_NUM_OF_PREDICT_PARAM;

		ATG::seedArray = new double[num_of_param];

		//下面是单变量依次搜索
		int round = 0;
	    while(round < SolverParameter::MAX_NUM_OF_GENERATE_CYCLE && isCovered <= -1)
	    {
            // 对所有参数执行ATG
		    double* seed = NULL;
		    int paramIndex = 0;
            while(paramIndex < num_of_param && isCovered <= -1)
            {
            	if(round ==0 && paramIndex == 0)
        	    	seed = NULL;
        	    else
        	    	seed = ATG::seedArray;

	        	//基于复杂约束依赖分析的搜索空间递减工作
	        	if(ConstraintParameter::constraintDependencyRela[paramIndex] == true)
	        	{
	        		isCovered = this->pcatg.generateTestDataForSolver(paramIndex, seed, -1, paramIndex, max_num_of_predict_param);
	        	}

        	    paramIndex++;
            }
            round++;
	    }

	    //最后的内存的析构处理
	    delete [] ATG::seedArray;

		return isCovered;
	}


	/*
	 * 这个函数主要负责给seed来申请内存
	 * */
	void ATG::mallocForSeed(const int SIZE)
	{
		ATG::seeds = new SearchTask*[SIZE];
		for(int i = 0; i < SIZE; i++)
			ATG::seeds[i] = new SearchTask();
	}

	/*
	 * 这个函数主要负责给nextSeed来申请内存
	 * */
	void ATG::mallocForNextSeed(const int SIZE)
	{
		ATG::nextSeeds = new SearchTask*[SIZE];
		for(int i = 0; i < SIZE; i++)
			ATG::nextSeeds[i] = new SearchTask();
	}

	/*
	 * 这个函数主要负责seed的内存的析构处理
	 * */
	void ATG::freeForSeed(const int SIZE)
	{
		for(int i = 0; i < SIZE; i++)
			delete ATG::seeds[i];
		delete [] ATG::seeds;
	}

	/*
	 * 这个函数主要负责nextSeed的内存的析构处理
	 * 不过似乎没用到
	 * */
	void ATG::freeForNextSeed(const int SIZE)
	{
		for(int i = 0; i < SIZE; i++)
			delete ATG::nextSeeds[i];
		delete [] ATG::nextSeeds;
	}

