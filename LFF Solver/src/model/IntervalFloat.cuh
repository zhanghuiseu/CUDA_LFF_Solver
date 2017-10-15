/*
 * IntervalFloat.cuh
 *
 *  Created on: Oct 14, 2017
 *      Author: zy
 */

#ifndef INTERVALFLOAT_CUH_
#define INTERVALFLOAT_CUH_

/*
 * 这个是处理计算区间，不过采用的是单精度float
 * 不过要记住的是这些数据结构署要在CUDA中使用的数据结构
 * 所以这里的数据结构不允许出现任何的指针等等数据，必须要使用实际类型的存储
 * */
class IntervalFloat
{
public:

	float left;
	float right;

	/*
	 * 默认构造函数，不过可能没用
	 * */
	IntervalFloat()
	{
		this->left = 0.0f;
		this->right = 0.0f;
	}

	void setIntervalDouble(float left,float right)
	{
		this->left = left;
		this->right = right;
	}

};

#endif /* INTERVALFLOAT_CUH_ */
