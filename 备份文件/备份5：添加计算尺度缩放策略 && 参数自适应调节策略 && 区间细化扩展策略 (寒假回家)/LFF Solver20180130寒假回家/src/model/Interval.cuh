/*
 * Interval.cuh
 *
 *  Created on: Oct 14, 2017
 *      Author: zhanghui
 */

#ifndef INTERVAL_CUH_
#define INTERVAL_CUH_

#include "./../solver/type.h"

/*
 * 这个是处理计算区间，不过采用的是双精度FloatType
 * 不过要记住的是这些数据结构署要在CUDA中使用的数据结构
 * 所以这里的数据结构不允许出现任何的指针等等数据，必须要使用实际类型的存储
 * */
class Interval
{
public:

	FloatType left;
	FloatType right;
	bool hasIntervel;

	/*
	 * 默认构造函数，不过可能没用
	 * */
	Interval()
	{
		this->left = 0;
		this->right = 0;
		this->hasIntervel = true;
	}

	void setInterval(FloatType left,FloatType right)
	{
		this->left = left;
		this->right = right;
	}

	void setLeft(FloatType left)
	{
		this->left = left;
	}

	FloatType getLeft()
	{
		return this->left;
	}

	void setRight(FloatType right)
	{
		this->right = right;
	}

	FloatType getRight()
	{
		return this->right;
	}

	void setHasIntervel(bool hasIntervel)
	{
		this->hasIntervel = hasIntervel;
	}

	bool getHasIntervel()
	{
		return this->hasIntervel;
	}

};

#endif /* INTERVAL_CUH_ */
