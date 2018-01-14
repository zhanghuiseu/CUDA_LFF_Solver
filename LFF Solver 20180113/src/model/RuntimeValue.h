/*
 * RuntimeValue.h
 *
 *  Created on: Oct 15, 2017
 *      Author: zhanghui
 */

#ifndef RUNTIMEVALUE_H_
#define RUNTIMEVALUE_H_

#include "./../solver/type.h"

/*
 * 这个类主要是使用CPU验证LFF Solver求解的结果的正确性
 * value 值得是运行时刻值
 * isCovered表示当前约束是否被满足
 * */
class RuntimeValue
{
public:
	FloatType value;
	bool isCovered;

public:
	RuntimeValue(FloatType value, bool isCovered)
	{
		this->value = value;
		this->isCovered = isCovered;
	}

	void setValue(FloatType value)
	{
		this->value = value;
	}

	FloatType getValue()
	{
		return this->value;
	}

	void setIsCovered(bool isCovered)
	{
		this->isCovered = isCovered;
	}

	bool getIsCovered()
	{
		return this->isCovered;
	}


};

#endif /* RUNTIMEVALUE_H_ */
