/*
 * PredictValue.cuh
 *
 *  Created on: Nov 11, 2017
 *      Author: zhanghui
 */

#ifndef PREDICTVALUEWITHONE_CUH_
#define PREDICTVALUEWITHONE_CUH_

#include "./../solver/type.h"

/*
 * 预测解以及解的有效性
 * */
class PredictValueWithOne
{
public:
	FloatType value;
	bool isValid;

	PredictValueWithOne()
	{
		this->isValid = true;
		this->value = 0.0;
	}

	void setValue(FloatType value)
	{
		this->value = value;
	}

	FloatType getValue()
	{
		return this->value;
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


#endif /* PREDICTVALUEWITHONE_CUH_ */
