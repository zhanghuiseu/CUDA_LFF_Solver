/*
 * testCUDADouble.cu
 *
 *  Created on: Nov 25, 2017
 *      Author: zy
 */



#include "cuda_runtime.h"
#include "device_launch_parameters.h"
#include "device_functions.hpp"
#include "math_functions.h"

#include <stdio.h>
#include <iostream>
#include <cmath>
using namespace std;


__global__ void test(double x,double y,double z,const int Size)
{
	int i = threadIdx.x + blockIdx.x*blockDim.x;
	if(i==0)
	{
		bool isCovered = (sin(x)+sin(y)+sin(z)==4*cos(x)*cos(y)*cos(z));
		double left = sin(x)+sin(y)+sin(z);
		double right = 4*cos(x)*cos(y)*cos(z);
		double instru = left -right;
		bool res = (instru == 0.0);
		printf("isCovered:%d , left:%f , right:%f , res:%d \n",isCovered,left,right,res);
	}
}

int testCUDADouble()
{
	cout<<"Begin Test CUDA DOuble "<<endl;
	const int Size=32;
	const int threadPreBlock=32;
    const int numOfBlocks=(Size+threadPreBlock-1)/threadPreBlock;

    double x = -1.83615;
    double y = -4.08707;
    double z = 3.56047;

    test<<<numOfBlocks,threadPreBlock>>>(x,y,z,Size);
    cudaDeviceSynchronize();


    cout<<endl<<endl<<"In CPU:"<<endl;
	bool isCovered = (sin(x)+sin(y)+sin(z)==4*cos(x)*cos(y)*cos(z));
	double left = sin(x)+sin(y)+sin(z);
	double right = 4*cos(x)*cos(y)*cos(z);
	bool res = ((left-right) == 0);
	printf("isCovered:%d , left:%f , right:%f , res:%d \n",isCovered,left,right,res);

	return 1;
}