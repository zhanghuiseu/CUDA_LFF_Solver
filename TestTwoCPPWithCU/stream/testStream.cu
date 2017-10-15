/*
 * testStream.cu
 *
 *  Created on: Sep 17, 2017
 *      Author: zy
 */

#include <iostream>
using namespace std;

#include "cuda_runtime.h"
#include "device_launch_parameters.h"

void testDeviceGPU()
{
	cudaDeviceProp prop;
	int whichdevice;
	cudaGetDevice(&whichdevice);
	cudaGetDeviceProperties(&prop,whichdevice);
	cout<<prop.deviceOverlap<<endl;
	if(prop.deviceOverlap)
		cout<<"This GPU Support Device Overlap"<<endl;
}

int main234()
{
	cout<<"Begin：    "<<endl;

	cout<<"Game Over"<<endl;
	return 1;
}



