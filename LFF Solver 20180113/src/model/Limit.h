/*
 * Limit.h
 *
 *  Created on: Nov 9, 2017
 *      Author: zhanghui
 */

#ifndef LIMIT_H_
#define LIMIT_H_

#include "Limit.h"
#include "./../solver/type.h"

#include <iostream>
#include <limits>

using namespace std;

/*
 * 这个类主要是保存各种可能用到的极值
 * */
class Limit
{
public:
	static const FloatType  FloatMin  = 1.17549e-38;//2.22507e-308;
	static const FloatType  FloatMax  =3.40282e+38;// 1.79769e+308;
};

#endif /* LIMIT_H_ */
