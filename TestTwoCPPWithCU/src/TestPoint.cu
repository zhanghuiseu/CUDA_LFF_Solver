#include <thrust/device_vector.h>
#include <thrust/copy.h>
#include <vector>
#include <list>
#include <stdio.h>
#include <cstdlib>
#include <ctime>

#include "hello.cuh"
#include "Point.h"
#include "Instrument.cuh"

#include <thrust/host_vector.h>
#include <thrust/copy.h>
#include <thrust/fill.h>
#include <thrust/sequence.h>
using namespace std;

/*
 * device 函数值得学习和处理
 * */

__global__ void kernel_PointMult(Point* p, Point* res,const int SIZE)
{
	int i = threadIdx.x + blockIdx.x*blockDim.x;
	while (i < SIZE)
	{
		if(i>=1)
		{
			double x1=p[i-1].x;
			double y1=p[i-1].y;

			double x2=p[i].x;
			double y2=p[i].y;

			res[i-1].x = (y2-y1)/(x2-x1);
			res[i-1].y = (y1 - res[i-1].x * x1);
			//res[i-1].y=kernel_Constraint(res[i-1].x,res[i-1].y);
		}
		i += gridDim.x * blockDim.x;
	}
}

bool isRight(thrust::host_vector<Point> res_host,thrust::host_vector<Point> two)
{
	for(int i=0;i<two.size();i++)
	{
		if(isnormal(two[i].x) && isnormal(two[i].y) && isnormal(res_host[i].x) && isnormal(res_host[i].y))
		{
			if(two[i].x != res_host[i].x || two[i].y != res_host[i].y)
			{
				cout<<"index:  "<<i<<"  "<<"("<<two[i].x<<" , "<<two[i].y<<" ) ( "<<res_host[i].x<<" , "<<res_host[i].y<<" )"<<endl;
				return false;
			}
		}
	}
	return true;
}



int mainFotPoint()
{
	cout<<endl<<"FFFFFFFFFFF  PPPPOINT    "<<endl;

	const int SIZE=10000000;
	const int numOfStream=5;
	const int threadPreBlock=1000;
    const int numOfBlocks=(SIZE+threadPreBlock-1)/threadPreBlock;

	srand(time(0));

	vector<Point> stlVec;
	for(int i=0;i<SIZE;i++)
	{
		Point one=Point(rand()%100,rand()%100);
		stlVec.push_back(one);
	}

    clock_t start,finish;
    start=clock();
	thrust::device_vector<Point> array_device(stlVec.begin(),stlVec.end());
	thrust::device_vector<Point> res_device(array_device.begin(),array_device.end()-1);
    Point* raw_pointer = thrust::raw_pointer_cast(&array_device[0]);
    Point* res_pointer = thrust::raw_pointer_cast(&res_device[0]);

    thrust::device_vector<double> one1_device;
    for(int i=0;i<3;i++)
    	one1_device.push_back(1.1);
    double* one1=thrust::raw_pointer_cast(&one1_device[0]);
    const int index=1;
    const int numOfConstraint=1;
    kernel_Cala<<<numOfBlocks,threadPreBlock>>>(raw_pointer,one1,index,numOfConstraint,array_device.size());
    finish=clock();
    cout << "By GPU LFF Cala: " << (double)(finish - start) / CLOCKS_PER_SEC << endl;
    cudaDeviceSynchronize();

    start=clock();
    kernel_PointMult<<<numOfBlocks,threadPreBlock>>>(raw_pointer,res_pointer,array_device.size());
    cudaDeviceSynchronize();
    finish=clock();
    cout << "By GPU Mult: " << (double)(finish - start) / CLOCKS_PER_SEC << endl;


    start=clock();
    cudaStream_t stream[numOfStream];
    for(int i=0;i<numOfStream;i++)
        cudaStreamCreate(&stream[i]);
    for(int i=0;i<numOfStream;i++)
    	 kernel_PointMult<<<numOfBlocks,threadPreBlock,0,stream[i]>>>(raw_pointer + i,res_pointer + i,array_device.size());
    cudaDeviceSynchronize();
    finish=clock();
    //cout << "By GPU LFF With Streams: " << (double)(finish - start) / CLOCKS_PER_SEC << endl;

    for(int i=0;i<numOfStream;i++)
    	cudaStreamDestroy(stream[i]);

    thrust::host_vector<Point> one = array_device;
    thrust::host_vector<Point> two(array_device.begin(),array_device.end()-1);
    start=clock();
    for(int i=0;i<one.size();i++)
    {
    	if(i>=1)
    	{
			double x1=one[i-1].x , y1=one[i-1].y , x2=one[i].x , y2=one[i].y;
			two[i-1].x = (y2-y1)/(x2-x1);
			two[i-1].y = (y1 - two[i-1].x * x1);
    	}
    }
    finish=clock();
    cout << "By CPU LFF: " << (double)(finish - start) / CLOCKS_PER_SEC << endl;

 	thrust::host_vector<Point> array_host = array_device;
 	thrust::host_vector<Point> res_host = res_device;
 	if(isRight(res_host,two))
 		cout<<"GPU IS Right "<<endl;
 	else
 		cout<<"GPU Has Something WRONG"<<endl;



/*    for(int i=0;i<array_host.size();i++)
    	cout<<" ( "<<array_host[i].x<<" , "<<array_host[i].y<<") , ";
    cout<<endl;
    for(int i=0;i<res_host.size();i++)
    	cout<<" ( "<<res_host[i].x<<" , "<<res_host[i].y<<") , ";
    cout<<endl;*/

	return 1;
}
