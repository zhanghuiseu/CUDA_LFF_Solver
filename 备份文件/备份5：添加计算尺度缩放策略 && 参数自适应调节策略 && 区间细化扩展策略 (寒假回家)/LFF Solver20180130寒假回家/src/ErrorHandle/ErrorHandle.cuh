/*
 * ErrorHandle.cuh
 *
 *  Created on: Oct 14, 2017
 *      Author: zhanghui
 */

#ifndef ERRORHANDLE_CUH_
#define ERRORHANDLE_CUH_
#include <string>
#include <iostream>

#include "cuda_runtime.h"
#include "device_launch_parameters.h"

using namespace std;

/*
 * 这个是一个专门处理CUDA的Error的类，这里是为了统一处理
 * 所以写一个专门的类
 * */
class ErrorHandle
{
public:
	static void dealError(cudaError_t cudaStatus,string info)
	{
		if (cudaStatus != cudaSuccess)
		{
			cout << "*************  CUDA ERROR  *************" << endl;
			cout<<"ErrorInfo          : "<<cudaGetErrorString(cudaStatus) << endl;
			//cout<<"LastErrorInfo      : "<<cudaGetLastError()<<endl;
			cout<<"In The Position Of : "<<info<<endl;
			cout<<endl<<endl;
			//cudaDeviceReset();
			exit(-1);
		}
	}

};

#endif /* ERRORHANDLE_CUH_ */
