	/*
	 * SearchTask.cpp
	 *
	 *  Created on: Oct 21, 2017
	 *      Author: zhanghui
	 */

	#include <iostream>

	#include "./../solver/type.h"
	#include "SearchTask.h"
	#include "./../solver/SolverParameter.h"
	#include "./../ConstraintParser/ConstraintParameter.cuh"

	using namespace std;


	/*
	 * 默认的构造函数
	 * */
	SearchTask::SearchTask()
	{
		this->ArraySize = ConstraintParameter::NUM_OF_PARAM;
		this->initInputs = new FloatType[this->ArraySize];
		for(int i = 0; i < this->ArraySize; i++)
			this->initInputs[i] = 0;

		this->priority = 0;
		this->searchIndex = 0;
		this->changeTime = 0;
		this->needSearch = true;
	}

	/*
	 * 默认的构造函数，建议使用这个构造函数，这里选择的深度复制
	 * */
	SearchTask::SearchTask(FloatType* init,FloatType pri,int index,int change,bool needSearch)
	{
		this->ArraySize = ConstraintParameter::NUM_OF_PARAM;

		this->initInputs = new FloatType[this->ArraySize];
		for(int i = 0; i < this->ArraySize; i++)
			this->initInputs[i] = init[i];

		this->priority = pri;
		this->searchIndex = index;
		this->changeTime = change;
		this->needSearch = needSearch;
	}

	/*
	 * 这个类似复制构造函数，就是做一次当前任务的所有的信息的深度复制
	 * 注意这里不负责needSearch的赋值
	 * */
	void SearchTask::copyAll(FloatType* init,FloatType pri,int index,int change)
	{
		for(int i = 0; i < this->ArraySize; i++)
			this->initInputs[i] = init[i];

		this->priority = pri;
		this->searchIndex = index;
		this->changeTime = change;
	}

	/*
	 * 析构函数
	 * */
	SearchTask::~SearchTask()
	{
		delete [] this->initInputs;
	}

	/*
	 * 所有的set和get函数，注意这里我们使用FloatType*动态的申请空间
	 * */
	void SearchTask::setInitInputs(FloatType* init)
	{
		for(int i = 0; i < this->ArraySize; i++)
			this->initInputs[i] = init[i];
	}
	FloatType* SearchTask::getInitInputs()
	{
		return this->initInputs;
	}

	void SearchTask::setSearchIndex(int index)
	{
		this->searchIndex = index;
	}

	int SearchTask::getSearchIndex()
	{
		return this->searchIndex;
	}

	void SearchTask::setPriority(FloatType pri)
	{
		this->priority = pri;
	}

	FloatType SearchTask::getPriority()
	{
		return this->priority;
	}

	void SearchTask::setChangeTime(int change)
	{
		this->changeTime = change;
	}

	int SearchTask::getChangeTime()
	{
		return this->changeTime;
	}

	void SearchTask::setNeedSearch(bool needSearch)
	{
		this->needSearch = needSearch;
	}

	bool SearchTask::getNeedSearch()
	{
		return this->needSearch;
	}

