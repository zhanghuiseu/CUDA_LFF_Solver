/*
 * Instrument.cuh
 *
 *  Created on: Sep 17, 2017
 *      Author: zy
 */

#ifndef INSTRUMENT_CUH_
#define INSTRUMENT_CUH_

#include "cuda_runtime.h"
const int NumOfParameter = 3;

__device__ double getConstraint1_1(double x1,double x2,double x3)
{
	return sin(x1 * log(x2)-100)/cos(x3) -tan(x2)-3.14;
}


__device__ double getConstraint1_2(double x1,double x2,double x3)
{
	return x1*x2-x3-5;
}


__global__ void kernel_Cala(Point* p,double* one,const int index,const int numOfConstraint,const int SIZE)
{
	int i = threadIdx.x + blockIdx.x*blockDim.x;
	if( numOfConstraint == 1)
	{
		while (i < SIZE)
		{
			one[index]=p[i].x;
			p[i].y=getConstraint1_1(one[0],one[1],one[2]);
			i += gridDim.x * blockDim.x;
		}

	}else if( numOfConstraint == 2)
	{
		while (i < SIZE)
		{
			one[index]=p[i].x;
			p[i].y=getConstraint1_2(one[0],one[1],one[2]);
			i += gridDim.x * blockDim.x;
		}
	}
}





#endif /* INSTRUMENT_CUH_ */
