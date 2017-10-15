#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

#include "hello.cuh"
#include "Point.h"
#include "cuda_runtime.h"
#include "device_launch_parameters.h"

#include <thrust/host_vector.h>
#include <thrust/device_vector.h>
#include <thrust/generate.h>
#include <thrust/sort.h>
#include <thrust/copy.h>

const int SIZE = 1024;

cudaError_t calaAddArray(const double* a, const double* b, double* res, const long SIZE);


void print(double* a,int size)
{
	for(int i=0;i<size;i++)
	{
		cout<<a[i]<<" ";
	}
	cout<<endl;
}

__global__ void addArray(const double* a,const double *b, double* c)
{
	int i = threadIdx.x + blockIdx.x*blockDim.x;
	while (i < SIZE)
	{
		c[i] = a[i]*b[i];//(a[i] * b[i]-b[i]*3.1415926)/a[i] * b[i]*b[i]-a[i]*b[i];
		i += gridDim.x*blockDim.x;;
	}
}

int mainForTestC()
{
	cout<<"Begin :   "<<endl;
	srand(time(0));
	double* a = new double[SIZE];
	double* b = new double[SIZE];
	for (long i = 0; i < SIZE; i++)
	{
		a[i] = (double)(SIZE-i);
		b[i] = (double)1;
	}
	double* res = new double[SIZE];


	int count=1;
	clock_t start, finish;
	start = clock();
	for(int i=0;i<count;i++)
	{
		for (long long i = 0; i < SIZE; i++)
			res[i] = (a[i] * b[i]-b[i]*3.1415926)/a[i] * b[i]*b[i]-a[i]*b[i];
	}
	finish = clock();
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
	cout << "By CUDA Array Mult: " << (double)(finish - start)/CLOCKS_PER_SEC << endl;

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

	addArray <<<1024,512>>>(dev_a, dev_b, dev_c);

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

	//print(c,SIZE);
	thrust::sort(c,c+SIZE);
	//print(c,SIZE);

Error:
	cudaFree(dev_a);
	cudaFree(dev_b);
	cudaFree(dev_c);
	return cudaStatus;
}


int mainForVec()
{
	cout<<endl<<"In Main For Vec : "<<endl;

    thrust::host_vector<double> host_array(SIZE);
    //thrust::generate(host_array.begin(), host_array.end(), rand);
    for(int i=0;i<host_array.size();i++)
    	host_array[i] = (SIZE-i)*0.99;

    thrust::device_vector<double> device_array=host_array;
    for(int i=0;i<device_array.size();i++)
    	device_array[i] = (SIZE-i)*0.99;

    clock_t start,finish;
	start=clock();
    thrust::sort(host_array.begin(), host_array.end());
	finish = clock();
	cout << "Host Sort: " << (double)(finish - start) / CLOCKS_PER_SEC << endl;

    start=clock();
    thrust::sort(device_array.begin(), device_array.end());
	finish = clock();
	cout << "Device Sort: " << (double)(finish - start) / CLOCKS_PER_SEC << endl;

	 for(int i=0;i<20;i++)
		 cout<<host_array[i]<<"    ";
	 cout<<endl;

	 for(int i=0;i<20;i++)
		 cout<<device_array[i]<<"    ";
	 cout<<endl;

	 return 1;
}

/*
 * 可以通过device的对象克隆来实现空间的申请，不过这个必须要借助CUDA的vector容器
 * */
void testForDeviceVectorAdd()
{
	cout<<endl<<"FFFFFFFFFF    testForDeviceVectorAdd()   "<<endl;

	const int SIZE=5;
	vector<Point> stlVec;
	for(int i=0;i<SIZE;i++)
	{
		Point one=Point(i,rand()%10);
		stlVec.push_back(one);
	}
	thrust::device_vector<Point> array_device(stlVec.begin(),stlVec.end());

	thrust::host_vector<Point> one = array_device;
	for(int i=0;i<one.size();i++)
		cout<<"（ "<<one[i].x<<" , "<<one[i].y<<" ), ";
	cout<<endl;

	for(int i=0;i<SIZE;i++)
		array_device.push_back(array_device[0]);

	one = array_device;
	for(int i=0;i<one.size();i++)
		cout<<"（ "<<one[i].x<<" , "<<one[i].y<<" ), ";
	cout<<endl;

	cout<<"EEEEEEEEEEEEND       Game Over  "<<endl;
}







