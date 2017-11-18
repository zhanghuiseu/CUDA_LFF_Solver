/*
 * PredictValue.cuh
 *
 *  Created on: Nov 11, 2017
 *      Author: zy
 */

#ifndef PREDICTVALUE_CUH_
#define PREDICTVALUE_CUH_

/*
 * 预测解以及解的有效性
 * */
class PredictValue
{
public:
	double value;
	bool isValid;
	PredictValue()
	{
		this->isValid = true;
		this->value = 0.0;
	}
};


#endif /* PREDICTVALUE_CUH_ */