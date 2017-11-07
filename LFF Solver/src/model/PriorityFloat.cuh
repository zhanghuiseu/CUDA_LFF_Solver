/*
 * PriorityFloat.cuh
 *
 *  Created on: Nov 3, 2017
 *      Author: zy
 */

#ifndef PRIORITYFLOAT_CUH_
#define PRIORITYFLOAT_CUH_

/*
 * 这个类主要保存的是每一个解的优先级信息，主要包含两部分信息
 *    1) 优先级的信息，这个是0-1的浮点数
 *    2） 复合约束是否被满足的信息，这个是一个bool类型
 * */
class PriorityFloat
{
public:
	float priority;
	bool isFullCovered;

	/*
	 * 默认构造函数，不过可能没用
	 * */
	PriorityFloat()
	{
		this->priority = 0.f;
		this->isFullCovered =false;
	}

	void setPriority(float priority)
	{
		this->priority = priority;
	}

	double getProority()
	{
		return this->priority;
	}

	void setIsFullCovered(bool is)
	{
		this->isFullCovered = is;
	}

	bool getIsFullCovered()
	{
		return this->isFullCovered;
	}

};



#endif /* PRIORITYFLOAT_CUH_ */