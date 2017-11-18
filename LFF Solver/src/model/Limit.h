/*
 * Limit.h
 *
 *  Created on: Nov 9, 2017
 *      Author: zy
 */

#ifndef LIMIT_H_
#define LIMIT_H_

#include "Limit.h"

#include <iostream>
#include <limits>

using namespace std;

/*
 * 这个类主要是保存各种可能用到的极值
 * */
class Limit
{
public:
	static const double DoubleMin  = 2.22507e-308;
	static const double DoubleMax  = 1.79769e+308;
	static const float  FloatMin  = 1.17549e-38;
	static const float  FloatMax  =3.40282e+38;
};

#endif /* LIMIT_H_ */