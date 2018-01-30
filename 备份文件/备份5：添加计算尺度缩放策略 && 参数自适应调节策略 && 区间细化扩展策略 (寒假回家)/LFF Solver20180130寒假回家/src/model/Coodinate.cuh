/*
 * Coodinate.cuh
 *
 *  Created on: Oct 14, 2017
 *      Author: zhanghui
 */

#ifndef COODINATE_CUH_
#define COODINATE_CUH_

#include "./../solver/type.h"


/*
 * 这个是处理计算区间，不过采用的是双精度FloatType
 * 不过要记住的是这些数据结构署要在CUDA中使用的数据结构
 * 所以这里的数据结构不允许出现任何的指针等等数据，必须要使用实际类型的存储
 *
 * isVaild是为了判断运行结果是否是NaN或者infinite(无限的)
 * 这里直接使用的是CUDA Math提供的isfinite来判断的
 * */
class Coodinate
{
public:

	FloatType x;
	FloatType y;
	bool isCovered;
	bool isValid;

	/*
	 * 默认构造函数，不过可能没用
	 * */
	Coodinate()
	{
		this->x = 0;
		this->y = 0;
		this->isCovered = false;
		this->isValid = false;
	}

	void setX(FloatType x)
	{
		this->x = x;
	}

	FloatType getX()
	{
		return this->x;
	}

	void setY(FloatType y)
	{
		this->y = y;
	}

	FloatType getY()
	{
		return this->y;
	}

	void setIsCovered(bool isCovered)
	{
		this->isCovered = isCovered;
	}

	bool getIsCovered()
	{
		return this->isCovered;
	}

	void setIsValid(bool isValid)
	{
		this->isValid = isValid;
	}

	bool getIsValid()
	{
		return this->isValid;
	}
};




#endif /* COODINATE_CUH_ */
