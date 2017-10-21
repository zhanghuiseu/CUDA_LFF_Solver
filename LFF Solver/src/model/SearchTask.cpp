/*
 * SearchTask.cpp
 *
 *  Created on: Oct 21, 2017
 *      Author: zy
 */

#include <iostream>

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
	this->initInputs = new double[this->ArraySize];
	for(int i = 0; i < this->ArraySize; i++)
		this->initInputs[i] = 0;

	this->priority = 0;
	this->searchIndex = 0;
	this->changeTime = 0;
}

/*
 * 默认的构造函数，建议使用这个构造函数，这里选择的深度复制
 * */
SearchTask::SearchTask(double* init,double pri,int index,int change)
{
	this->ArraySize = ConstraintParameter::NUM_OF_PARAM;

	this->initInputs = new double[this->ArraySize];
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
 * 所有的set和get函数，注意这里我们使用double*动态的申请空间
 * */
void SearchTask::setInitInputs(double* init)
{
	for(int i = 0; i < this->ArraySize; i++)
		this->initInputs[i] = init[i];
}
double* SearchTask::getInitInputs()
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

void SearchTask::setPriority(double pri)
{
	this->priority = pri;
}

double SearchTask::getPriority()
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


