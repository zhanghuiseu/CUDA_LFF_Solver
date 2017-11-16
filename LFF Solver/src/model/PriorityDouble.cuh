/*
 * PriorityDouble.cuh
 *
 *  Created on: Nov 3, 2017
 *      Author: zy
 */

#ifndef PRIORITYDOUBLE_CUH_
#define PRIORITYDOUBLE_CUH_

/*
 * 这个类主要保存的是每一个解的优先级信息，主要包含两部分信息
 *    1) 优先级的信息，这个是0-1的浮点数
 *    2） 对应优先级的当前向量的值，这里不直接保存index了，可以节约一次拷贝开销
 * */
class PriorityDouble
{
public:
	double priority;
	double x;

	/*
	 * 默认构造函数，不过可能没用
	 * */
	PriorityDouble()
	{
		this->priority = 0.0;
		this->x = 0.0;
	}

	void setX(double x)
	{
		this->x = x;
	}

	double getX()
	{
		return this->x;
	}

	void setPriority(double priority)
	{
		this->priority = priority;
	}

	double getPriority()
	{
		return this->priority;
	}

};

#endif /* PRIORITYDOUBLE_CUH_ */
