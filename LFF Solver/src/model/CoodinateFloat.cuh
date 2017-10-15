/*
 * CoodinateFloat.cuh
 *
 *  Created on: Oct 14, 2017
 *      Author: zy
 */

#ifndef COODINATEFLOAT_CUH_
#define COODINATEFLOAT_CUH_

/*
 * 这个是处理计算区间，不过采用的是单精度float
 * 不过要记住的是这些数据结构署要在CUDA中使用的数据结构
 * 所以这里的数据结构不允许出现任何的指针等等数据，必须要使用实际类型的存储
 * */
class CoodinateFloat
{
public:

	float x;
	float y;

	/*
	 * 默认构造函数，不过可能没用
	 * */
	CoodinateFloat()
	{
		this->x = 0.0f;
		this->y = 0.0f;
	}

	void setX(double x)
	{
		this->x = x;
	}

	float getX()
	{
		return this->x;
	}

	void setY(double y)
	{
		this->y = y;
	}

	float getY()
	{
		return this->y;
	}

};



#endif /* COODINATEFLOAT_CUH_ */
