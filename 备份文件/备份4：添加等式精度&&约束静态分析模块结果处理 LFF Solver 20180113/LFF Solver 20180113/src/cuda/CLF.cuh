	/*
	 * CLF.cuh
	 *
	 *  Created on: Nov 8, 2017
	 *      Author: zhanghui
	 */

	#ifndef CLF_CUH_
	#define CLF_CUH_

	#include "./../ConstraintParser/ConstraintParameter.cuh"
	#include "./../model/Coodinate.cuh"
	#include "./../model/Interval.cuh"
	#include "./../model/Priority.cuh"
	#include "./../model/FullCoveredInfo.cuh"
	#include "./../model/Classification.cuh"
    #include "./../solver/ATG.h"
	#include "./../solver/PCATG.h"
	#include "./../solver/ConstantValue.h"
	#include "./../ErrorHandle/ErrorHandle.cuh"

	#include "cuda_runtime.h"
	#include "device_launch_parameters.h"
	#include "ExcuteConstraint.cuh"
	#include "./../ConstraintParser/ConstraintParameter.cuh"


	#include <iostream>
	#include <climits>

	using namespace std;

	/*
	 *  1 : case：0
	 *  等号和不等号 全区间
	 *  判断是否是> 和 >=比较运算符号的处理
	 *  斜率为0： abs(y1-y2)<=Min && y1 >=0 && y2>=0 全区间
	 *  斜率存在： abs(y1-y2)>Min && y1>=0 && y2>=0 全区间
	 *  2 : case1: abs(y1-y2)<=Min && y1 <0 && y2<0        无解
	 *  4 ： case2: abs(y1-y2)>Min && z>x1 && z<x2 && y1>0 (x1,z)
	 *  8 ： case3: abs(y1-y2)>Min && z>x1 && z<x2 && y2>0 (z,x2)
	 *  16： case4: abs(y1-y2)>Min && z<x1 && y1 <0 && y2<0 无解(xbefore,d)
	 *  32： case5: abs(y1-y2)>Min && z>x2 && y1 <0 && y2<0 无解(d,xafter)
	 *  下面是所有的分类的变量的设置
	 * */
	//全区间case:等式、不等式、全在上方
	__device__ bool case0(Coodinate* a,Coodinate* b,const int cmpType);

	//斜率不存在，导致无解
	__device__ bool case1(Coodinate* a,Coodinate* b,const int cmpType);

	//零点落在中间，左边部分解
	__device__ bool case2(Coodinate* a,Coodinate* b,const int cmpType);

	//零点落在中间，右边部分解
	__device__ bool case3(Coodinate* a,Coodinate* b,const int cmpType);

	//无解，零点落在左边
	__device__ bool case4(Coodinate* a,Coodinate* b,const int cmpType);

	//无解，零点落在右边
	__device__ bool case5(Coodinate* a,Coodinate* b,const int cmpType);


	#endif /* CLF_CUH_ */
