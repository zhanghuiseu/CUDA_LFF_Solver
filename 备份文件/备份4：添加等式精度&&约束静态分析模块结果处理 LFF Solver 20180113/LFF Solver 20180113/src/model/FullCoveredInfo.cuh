/*
 * FullCoveredInfo.cuh
 *
 *  Created on: Nov 6, 2017
 *      Author: zhanghui
 */

#ifndef FULLCOVEREDINFO_CUH_
#define FULLCOVEREDINFO_CUH_

#include "./../solver/type.h"

/*
 *  这个是为了计算上一轮的预测解而专门设计的一个数据结构，
 *  不过，可能有这样的疑问：为什么不直接使用Priority?
 *  这是为了节约显存，所以专门设计了一个精简的数据结构，要是使用Priority，会费一点显存
 *  FullCoveredInfo主要包含以下两方面的信息：
 *  1）一个析取范式是否在一个解向量下是否被全覆盖
 *  2）他的index是什么，这个在寻找解向量的时候使用到
 *  3) isVaild 是表示当前的解向量是否是有效的，也即只要不是Nan或Inf就是有效的，默认是有效的
 *  4）vaildNum是为了使用规约求和来统计当前预测向量的所有的vaild的向量
 * */
class FullCoveredInfo
{
public:
	bool isCovered;
	int index;

	bool isVaild;
	int vaildNum;


	FullCoveredInfo()
	{
		this->isCovered =false;
		this->isVaild = true;
		this->index = -1;
		this->vaildNum = this->isVaild;
	}

	void setIsCovered(bool isCovered)
	{
		this->isCovered = isCovered;
	}

	bool getIsCovered()
	{
		return this->isCovered;
	}

	void setIndex(int index)
	{
		this->index = index;
	}

	int getIndex()
	{
		return this->index;
	}

	void setIsvaild(bool isVaild)
	{
		this->isVaild = isVaild;
	}

	bool getIsVaild()
	{
		return this->isVaild;
	}

	void setVaildNum(int vaildNum)
	{
		this->vaildNum = vaildNum;
	}

	int getVaildNum()
	{
		return this->vaildNum;
	}
};


#endif /* FULLCOVEREDINFO_CUH_ */
