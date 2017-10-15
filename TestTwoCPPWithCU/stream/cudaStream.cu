#include "cuda_runtime.h"
#include "device_launch_parameters.h"
#include <stdio.h>

void addWithCuda(int *c, const int *a, const int *b, size_t size);
__global__ void addKernel(int *c, const int *a, const int *b)
{
    int i = blockIdx.x;
    c[i] = a[i] + b[i];
}
int maindddd()
{
    const int arraySize = 5;
    const int a[arraySize] = { 1, 2, 3, 4, 5 };
    const int b[arraySize] = { 10, 20, 30, 40, 50 };
    int c[arraySize] = { 0 };

    addWithCuda(c, a, b, arraySize);
    printf("{1,2,3,4,5} + {10,20,30,40,50} = {%d,%d,%d,%d,%d}\n",c[0],c[1],c[2],c[3],c[4]);
    cudaThreadExit();

    return 0;
}


void addWithCuda(int *c, const int *a, const int *b, size_t size)
{
    int *dev_a = 0;
    int *dev_b = 0;
    int *dev_c = 0;

    cudaSetDevice(0);
    cudaMalloc((void**)&dev_c, size * sizeof(int));
    cudaMalloc((void**)&dev_a, size * sizeof(int));
    cudaMalloc((void**)&dev_b, size * sizeof(int));
    cudaMemcpy(dev_a, a, size * sizeof(int), cudaMemcpyHostToDevice);
    cudaMemcpy(dev_b, b, size * sizeof(int), cudaMemcpyHostToDevice);
    cudaStream_t stream[5];
    for(int i = 0;i<5;i++)
    {
        cudaStreamCreate(&stream[i]);
    }
    for(int i = 0;i<5;i++)
        addKernel<<<1,1,0,stream[i]>>>(dev_c+i, dev_a+i, dev_b+i);

    cudaDeviceSynchronize();

    cudaThreadSynchronize();
    cudaMemcpy(c, dev_c, size * sizeof(int), cudaMemcpyDeviceToHost);

    for(int i=0;i<5;i++)
    {
        cudaStreamDestroy(stream[i]);
    }
    cudaFree(dev_c);
    cudaFree(dev_a);
    cudaFree(dev_b);
}
