/*
 * PriorityDouble.cuh
 *
 *  Created on: Nov 3, 2017
 *      Author: zhanghui
 */

#ifndef PRIORITY_CUH_
#define PRIORITY_CUH_

#include "./../solver/type.h"

/*
 * 这个类主要保存的是每一个解的优先级信息，主要包含两部分信息
 *    1) 优先级的信息，这个是0-1的浮点数
 *    2） 对应优先级的当前向量的值，这里不直接保存index了，可以节约一次拷贝开销
 * */
class Priority
{
public:
	FloatType priority;
	FloatType x;

	/*
	 * 默认构造函数，不过可能没用
	 * */
	Priority()
	{
		this->priority = 0.0;
		this->x = 0.0;
	}

	void setX(FloatType x)
	{
		this->x = x;
	}

	FloatType getX()
	{
		return this->x;
	}

	void setPriority(FloatType priority)
	{
		this->priority = priority;
	}

	FloatType getPriority()
	{
		return this->priority;
	}

};

#endif /* PRIORITY_CUH_ */
