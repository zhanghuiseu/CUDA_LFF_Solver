/*
 * IntervalDouble.cuh
 *
 *  Created on: Oct 14, 2017
 *      Author: zy
 */

#ifndef INTERVALDOUBLE_CUH_
#define INTERVALDOUBLE_CUH_


/*
 * 这个是处理计算区间，不过采用的是双精度double
 * 不过要记住的是这些数据结构署要在CUDA中使用的数据结构
 * 所以这里的数据结构不允许出现任何的指针等等数据，必须要使用实际类型的存储
 * */
class IntervalDouble
{
public:

	double left;
	double right;

	/*
	 * 默认构造函数，不过可能没用
	 * */
	IntervalDouble()
	{
		this->left = 0;
		this->right = 0;
	}

	void setIntervalDouble(double left,double right)
	{
		this->left = left;
		this->right = right;
	}

};

#endif /* INTERVALDOUBLE_CUH_ */
