#include <iostream>
#include <cstdlib>
#include <cmath>
#include <ctime>
using namespace std;

#include "cuda_runtime.h"
#include "device_launch_parameters.h"

static const long long SIZE = 4096*4096*4;

cudaError_t calaAddArray(const double* a, const double* b, double* res, const long SIZE);

__global__ void addArray(const double* a,const double *b, double* c)
{
	int i = threadIdx.x + blockIdx.x*blockDim.x;
	while (i < SIZE)
	{
		c[i] = (a[i] * b[i]-b[i]*3.1415926)/a[i] * b[i]*b[i]-a[i]*b[i];
		i += gridDim.x*blockDim.x;;
	}
}

int main4444()
{
	cout<<"Begin :   "<<endl;
	srand(time(0));
	double* a = new double[SIZE];
	double* b = new double[SIZE];
	for (long i = 0; i < SIZE; i++)
	{
		a[i] = (double)rand() * (double)rand();
		b[i] = (double)rand() * (double)rand();
	}
	double* res = new double[SIZE];
	

	int count=2;
	clock_t start, finish;
	start = clock();
	for(int i=0;i<count;i++)
	{
		for (long long i = 0; i < SIZE; i++)
			res[i] = (a[i] * b[i]-b[i]*3.1415926)/a[i] * b[i]*b[i]-a[i]*b[i];
	}

	finish = clock();
	/*
	for (int i = 0; i < SIZE; i++)
		cout << a[i] << ", ";
	cout << endl;
	for (int i = 0; i < SIZE; i++)
		cout << b[i] << ", ";
	cout << endl;
	for (int i = 0; i < SIZE; i++)
		cout << res[i] << ", ";
	cout << endl << endl << endl;
	*/
	for (long long i = 0; i < SIZE; i++)
	{
		if (res[i] != (a[i] * b[i]-b[i]*3.1415926)/a[i] * b[i]*b[i]-a[i]*b[i] )
		{
			cout << "***********  Failed CPU" << endl;
			break;
		}
	}
	cout << start << "   " << finish << endl;
	cout << "By CPU Array Mult: " << (double)(finish - start) / CLOCKS_PER_SEC << endl;
	
	start = clock();
	for(int i=0;i<count;i++)
	{
		cudaError_t cudaErrorRes = calaAddArray(a, b, res, SIZE);
		if (cudaErrorRes != cudaSuccess)
		{
			cout << "*************   CUDA Return Result Failed " << endl;
		}
	}
	finish = clock();

/*
	for (int i = 0; i < SIZE; i++)
		cout << a[i] << ", ";
	cout << endl;
	for (int i = 0; i < SIZE; i++)
		cout << b[i] << ", ";
	cout << endl;
	*/
	for (long long i = 0; i < SIZE; i++)
	{
		if (res[i] != (a[i] * b[i]-b[i]*3.1415926)/a[i] * b[i]*b[i]-a[i]*b[i])
		{
			cout << "*************   Failed GPU" << endl;
			break;
		}
	}

	cout << endl;
	cout << start << "   " << finish << endl;
	cout << "By CUDA Array Mult: " << (double)(finish - start)/CLOCKS_PER_SEC << endl;

	cout<<"Game Over!!!!"<<endl;
	return 1;
}

cudaError_t calaAddArray(const double* a, const double* b, double* c, const long SIZE)
{
	double* dev_a=0;
	double* dev_b=0;
	double* dev_c=0;
	cudaError_t cudaStatus=cudaSetDevice(0);
	if (cudaStatus != cudaSuccess)
	{
		cout << "CUDA ADD Failed In Function cudaError_t calaAddArray " << endl;
		goto Error;
	}

	cudaStatus = cudaMalloc((void**)&dev_a, sizeof(double)*SIZE);
	if (cudaStatus != cudaSuccess)
	{
		cout << "cudaMalloc decvA failed!" << endl;
		goto Error;
	}

	cudaStatus = cudaMalloc((void**)&dev_b, sizeof(double)*SIZE);
	if (cudaStatus != cudaSuccess)
	{
		cout << "cudaMalloc decvB failed!" << endl;
		goto Error;
	}

	cudaStatus = cudaMalloc((void**)&dev_c, sizeof(double)*SIZE);
	if (cudaStatus != cudaSuccess)
	{
		cout << "cudaMalloc decvC failed!" << endl;
		goto Error;
	}

	cudaStatus = cudaMemcpy(dev_a,a,SIZE * sizeof(double),cudaMemcpyHostToDevice);
	if (cudaStatus != cudaSuccess)
	{
		cout << "cudaMemcpy decvA failed!" << endl;
		goto Error;
	}

	cudaStatus = cudaMemcpy(dev_b, b, SIZE * sizeof(double), cudaMemcpyHostToDevice);
	if (cudaStatus != cudaSuccess)
	{
		cout << "cudaMemcpy decvB failed!" << endl;
		goto Error;
	}

	addArray <<<4096,1024>>>(dev_a, dev_b, dev_c);
	
	cudaStatus = cudaGetLastError();
	if (cudaStatus != cudaSuccess) 
	{
		cout << "addKernel launch failed: " <<cudaGetErrorString(cudaStatus)<<endl;
		goto Error;
	}

	cudaStatus = cudaDeviceSynchronize();
	if (cudaStatus != cudaSuccess) 
	{
		cout<<cudaStatus<<" cudaDeviceSynchronize returned error code %d after launching addKernel!"<<endl;
		goto Error;
	}

	cudaStatus = cudaMemcpy(c, dev_c, SIZE * sizeof(double), cudaMemcpyDeviceToHost);
	if (cudaStatus != cudaSuccess)
	{
		cout << "cudaMemcpy decvC failed!" << endl;
		goto Error;
	}
Error:
	cudaFree(dev_a);
	cudaFree(dev_b);
	cudaFree(dev_c);
	return cudaStatus;
}
