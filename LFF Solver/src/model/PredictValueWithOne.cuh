/*
 * PredictValue.cuh
 *
 *  Created on: Nov 11, 2017
 *      Author: zy
 */

#ifndef PREDICTVALUEWITHONE_CUH_
#define PREDICTVALUEWITHONE_CUH_

/*
 * 预测解以及解的有效性
 * */
class PredictValueWithOne
{
public:
	double value;
	bool isValid;

	PredictValueWithOne()
	{
		this->isValid = true;
		this->value = 0.0;
	}
};


#endif /* PREDICTVALUEWITHONE_CUH_ */