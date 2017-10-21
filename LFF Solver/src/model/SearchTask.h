/*
 * SearchTask.h
 *
 *  Created on: Oct 21, 2017
 *      Author: zy
 */

#ifndef SEARCHTASK_H_
#define SEARCHTASK_H_

#include <iostream>

#include "./../solver/SolverParameter.h"
#include "./../ConstraintParser/ConstraintParameter.cuh"

using namespace std;

class SearchTask
{
public:

	/*
	 * 默认的构造函数，很不建议使用这个空的构造函数
	 * */
	SearchTask();

	/*
	 * 默认的构造函数，建议使用这个构造函数，这里选择的深度复制
	 * */
	SearchTask(double* init,double pri,int index,int change);

	/*
	 * 析构函数
	 * */
	~SearchTask();

	/*
	 * 所有的set和get函数，注意这里我们使用double*动态的申请空间
	 * */
	void setInitInputs(double* init);
	double* getInitInputs();
	void setSearchIndex(int index);
	int getSearchIndex();
	void setPriority(double pri);
	double getPriority();
	void setChangeTime(int change);
	int getChangeTime();

	/*
	 * 搜索变量的下标
	 * */
	int searchIndex;

	/*
	 * 输入数据的数组的长度
	 * */
	int ArraySize ;

	/*
	 * 出事的程序输入数据
	 * */
    double* initInputs;

    /*
     * 当前任务的优先级
     * */
    double priority;

    /*
	 * 搜索变量下标已经更迭的次数
	 */
    int changeTime;

};

#endif /* SEARCHTASK_H_ */
