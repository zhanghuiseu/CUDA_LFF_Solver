///////////////////////
#include "cuda_runtime.h"
#include "device_launch_parameters.h"
#include <stdio.h>
#include <cstdlib>
#include <ctime>
#include <iostream>
using namespace std;


#if __DEVICE_EMULATION__
bool InitCUDA(void) { return true; }
#else
bool InitCUDA(void)
{
	int count = 0;
	int i = 0;
	cudaGetDeviceCount(&count);
	if (count == 0) {
		fprintf(stderr, "There is no device.\n");
		return false;
	}
	for (i = 0; i < count; i++) {
		cudaDeviceProp prop;
		if (cudaGetDeviceProperties(&prop, i) == cudaSuccess) {
			if (prop.major >= 1) {
				break;
			}
		}
	}
	if (i == count) {
		fprintf(stderr, "There is no device supporting CUDA.\n");
		return false;
	}
	cudaSetDevice(i);
	printf("CUDA initialized.\n");
	cudaDeviceProp prop;
	cudaGetDeviceProperties(&prop, i);
	printf("Device : \" %s \" \n\n", prop.name);
	return true;
}
#endif

#define aW 855+800
#define aH 5110
#define bW 1013+800
#define blocknum 128//32
#define threadnum 512//256

typedef struct
{
	int width;
	int height;
	int *element;
}Matrix;

Matrix InitMatrix(int w, int h)
{
	Matrix t;
	t.element = (int *)malloc(w * h * sizeof(int));
	for (int i = 0; i < w*h; i++)
		t.element[i] = rand() % 10;
	t.width = w;
	t.height = h;
	return t;
}
Matrix MM(Matrix a, Matrix b)
{
	Matrix t;
	t.element = (int *)malloc(a.height * b.width * sizeof(int));
	t.width = b.width;
	t.height = a.height;
	int x;
	int y;
	for (int i = 0; i < t.width * t.height; i++)
	{
		x = i / t.width * a.width;
		y = i - i / t.width * t.width;
		t.element[i] = 0;
		for (int k = 0; k < a.width; k++)
		{
			t.element[i] += a.element[x + k] * b.element[y + b.width * k];
		}
	}
	return t;
}




__global__ static void MatrixMul(int *ma, int *mb, int *mc, int *mp)
{
	int aw = mp[0];
	int bw = mp[2];
	int cw = mp[4];
	int ch = mp[5];
	const int bid = blockIdx.x;
	const int tid = threadIdx.x;
	int i, x, y;

	for (i = bid * threadnum + tid; i < cw * ch; i += threadnum * blocknum)
	{
		x = i / cw * aw;
		y = i - i / cw * cw;
		mc[i] = 0;
		for (int k = 0; k < aw; k++)
		{
			mc[i] += ma[x + k] * mb[y + k * bw];
		}
	}
}




int main(int argc, char* argv[])
{
	cout << "Matrix Mult Begin : " << endl;
	if (!InitCUDA()) 
	{
		return 0;
	}
	//�������
	//int matrixa[N][N] , matrixb[N][N] , matrixc[N][N] , gpuresult[N][N] , matrixd[N][N] ;
	Matrix matrixa = InitMatrix(aW, aH);
	Matrix matrixb = InitMatrix(bW, aW);
	Matrix matrixc;
	Matrix gpuresult = InitMatrix(bW, aH);

	int matrixprop[6];

	//CPU�������
	int start = clock();
	matrixc = MM(matrixa, matrixb);
	int finish = clock();
	double time = ((double)finish - (double)start) / CLOCKS_PER_SEC;
	cout << "CPU Time is " << time << endl;

	start = clock();
	matrixprop[0] = matrixa.width;
	matrixprop[1] = matrixa.height;
	matrixprop[2] = matrixb.width;
	matrixprop[3] = matrixb.height;
	matrixprop[4] = matrixc.width;
	matrixprop[5] = matrixc.height;

	//�����Դ�
	int *ma, *mb, *mc, *mp;
	cudaMalloc((void**)&ma, sizeof(int) * matrixa.width * matrixa.height);
	cudaMalloc((void**)&mb, sizeof(int) * matrixb.width * matrixb.height);
	cudaMalloc((void**)&mc, sizeof(int) * matrixc.width * matrixc.height);
	cudaMalloc((void**)&mp, sizeof(int) * 6);
	//����ݸ��Ƶ��Դ���
	cudaMemcpy(ma, matrixa.element, sizeof(int) * matrixa.width * matrixa.height, cudaMemcpyHostToDevice);
	cudaMemcpy(mb, matrixb.element, sizeof(int) * matrixb.width * matrixb.height, cudaMemcpyHostToDevice);
	cudaMemcpy(mp, matrixprop, sizeof(int) * 6, cudaMemcpyHostToDevice);

	//����CUDA����
	MatrixMul << < blocknum, threadnum>> >(ma, mb, mc, mp);
	cudaThreadSynchronize();
	//����ݴ��Դ��и��Ƴ���
	cudaMemcpy(gpuresult.element, mc, sizeof(int) * gpuresult.width * gpuresult.height, cudaMemcpyDeviceToHost);
	
	finish = clock();
	time = ((double)finish - (double)start) / CLOCKS_PER_SEC;
	cout << "GPU Time is " << time << endl;


	for (int i = 0; i < gpuresult.width * gpuresult.height; i++)
	{
		//printf("%d -- %d\n",matrixc.element[ i ],gpuresult.element[ i ]);
		if (matrixc.element[i] != gpuresult.element[i])
		{
			printf("ERROR");
		}
	}

	cudaFree(ma);
	cudaFree(mb);
	cudaFree(mc);
	cudaFree(mp);

	return 0;
}
