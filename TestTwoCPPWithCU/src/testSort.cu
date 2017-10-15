#include <iostream>
#include <cstdlib>
#include <ctime>
#include <algorithm>
using namespace std;

#include "cuda_runtime.h"
#include "device_launch_parameters.h"

#include "hello.cuh"

#include <thrust/host_vector.h>
#include <thrust/device_vector.h>
#include <thrust/generate.h>
#include <thrust/sort.h>
#include <thrust/copy.h>

int mainForSort()
{
	const int SIZE=1000000;


	cout<<"Begin :   "<<endl;
	srand(time(0));
	double* a = new double[SIZE];
	double* b = new double[SIZE];
	for (long i = 0; i < SIZE; i++)
		b[i] = a[i] = rand()%100;

	double* dev_a=0;
	cudaSetDevice(0);
	cudaMalloc((void**)&dev_a, sizeof(double)*SIZE);
	cudaMemcpy(dev_a,a,SIZE * sizeof(double),cudaMemcpyHostToDevice);


	clock_t start, finish;
	start = clock();
    sort(a,a+SIZE);
	finish = clock();
	cout << "By CPU STL Sort: " << (double)(finish - start) / CLOCKS_PER_SEC << endl;


	start = clock();
	thrust::sort(b,b+SIZE);
	finish = clock();
	cout << "By CUDA Thrust Sort: " << (double)(finish - start)/CLOCKS_PER_SEC << endl;

	cudaFree(dev_a);
	return 1;
}




