/*
 * SearchTask.h
 *
 *  Created on: Oct 21, 2017
 *      Author: zhanghui
 */

#ifndef SEARCHTASK_H_
#define SEARCHTASK_H_

#include <iostream>

#include "./../solver/type.h"
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
	 * 注意这里不负责needSearch的赋值
	 * */
	SearchTask(FloatType* init,FloatType pri,int index,int change,bool needSearch);

	/*
	 * 这个类似复制构造函数，就是做一次当前任务的所有的信息的深度复制
	 * */
	void copyAll(FloatType* init,FloatType pri,int index,int change);

	/*
	 * 析构函数
	 * */
	~SearchTask();

	/*
	 * 所有的set和get函数，注意这里我们使用FloatType*动态的申请空间
	 * */
	void setInitInputs(FloatType* init);
	FloatType* getInitInputs();
	void setSearchIndex(int index);
	int getSearchIndex();
	void setPriority(FloatType pri);
	FloatType getPriority();
	void setChangeTime(int change);
	int getChangeTime();
	void setNeedSearch(bool needSearch);
	bool getNeedSearch();

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
    FloatType* initInputs;

    /*
     * 当前任务的优先级
     * */
    FloatType priority;

    /*
	 * 搜索变量下标已经更迭的次数
	 */
    int changeTime;

    /*
	 * 根据复合约束的以来信息来确定是否要搜素
	 */
    bool needSearch;
};

#endif /* SEARCHTASK_H_ */
