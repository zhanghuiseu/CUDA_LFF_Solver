/*
 * PredictValue.cuh
 *
 *  Created on: Nov 11, 2017
 *      Author: zhanghui
 */

#ifndef PREDICTVALUE_CUH_
#define PREDICTVALUE_CUH_

#include "./../solver/type.h"

/*
 * 预测解以及解的有效性
 * */
class PredictValue
{
public:
	FloatType left;
	FloatType value;
	FloatType right;
	bool isValid;

	PredictValue()
	{
		this->isValid = true;
		this->left = 0.0;
		this->value = 0.0;
		this->right = 0.0;
	}

	void setLeft(FloatType left)
	{
		this->left = left;
	}

	FloatType getLeft()
	{
		return this->left;
	}

	void setValue(FloatType value)
	{
		this->value = value;
	}

	FloatType getValue()
	{
		return this->value;
	}

	void setRight(FloatType right)
	{
		this->right = right;
	}

	FloatType getRight()
	{
		return this->right;
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


#endif /* PREDICTVALUE_CUH_ */
