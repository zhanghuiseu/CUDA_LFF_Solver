/*
 * FullCoveredInfo.cuh
 *
 *  Created on: Nov 6, 2017
 *      Author: zy
 */

#ifndef FULLCOVEREDINFO_CUH_
#define FULLCOVEREDINFO_CUH_


/*
 *  这个是为了计算上一轮的预测解而专门设计的一个数据结构，
 *  不过，可能有这样的疑问：为什么不直接使用PriorityDouble或者PriorityFloat呢？
 *  这是为了节约显存，所以专门设计了一个精简的数据结构，要是使用PriorityDouble，会费一点显存
 *  FullCoveredInfo主要包含以下两方面的信息：
 *  1）一个析取范式是否在一个解向量下是否被全覆盖
 *  2）他的index是什么，这个在寻找解向量的时候使用到
 * */
class FullCoveredInfo
{
public:
	bool isCovered;
	int index;

	FullCoveredInfo()
	{
		this->isCovered =false;
		this->index = -1;
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
};


#endif /* FULLCOVEREDINFO_CUH_ */