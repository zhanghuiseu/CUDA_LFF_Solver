/*
 * CudaInstrument.cuh
 *
 *  Created on: Oct 15, 2017
 *      Author: zy
 */

#ifndef CUDAINSTRUMENT_CUH_
#define CUDAINSTRUMENT_CUH_

#include "ConstraintParameter.cuh"
#include "./../model/RuntimeValue.h"

#include "cuda_runtime.h"
#include "device_launch_parameters.h"

__device__ void getConstraint00(double x,double y,double z,RuntimeValue* res)
{
	res->value = 9 - x*x;
	res->isCovered = (9 > x*x) * true;
	return ;
}

__device__ void getConstraint01(double x,double y,double z,RuntimeValue* res)
{
	res->value = 0 - x*y;
	res->isCovered = (0 - x*y) * true;
	return ;
}


__device__ void getConstraint10(double x,double y,double z,RuntimeValue* res)
{
	res->value =  y - z;
	res->isCovered = ( y - z) * true;
	return ;
}






#endif /* CUDAINSTRUMENT_CUH_ */
