/*
 * CoodinateDouble.cuh
 *
 *  Created on: Oct 14, 2017
 *      Author: zy
 */

#ifndef COODINATEDOUBLE_CUH_
#define COODINATEDOUBLE_CUH_

/*
 * 这个是处理计算区间，不过采用的是双精度double
 * 不过要记住的是这些数据结构署要在CUDA中使用的数据结构
 * 所以这里的数据结构不允许出现任何的指针等等数据，必须要使用实际类型的存储
 * */
class CoodinateDouble
{
public:

	double x;
	double y;

	/*
	 * 默认构造函数，不过可能没用
	 * */
	CoodinateDouble()
	{
		this->x = 0;
		this->y = 0;
	}

	void setX(double x)
	{
		this->x = x;
	}

	double getX()
	{
		return this->x;
	}

	void setY(double y)
	{
		this->y = y;
	}

	double getY()
	{
		return this->y;
	}

};




#endif /* COODINATEDOUBLE_CUH_ */
