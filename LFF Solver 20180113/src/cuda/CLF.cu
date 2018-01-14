	/*
	 * CLF.cu
	 *
	 *  Created on: Nov 8, 2017
	 *      Author: zhanghui
	 */


	#include "CLF.cuh"
	#include "./../ConstraintParser/ConstraintParameter.cuh"
	#include "./../model/Coodinate.cuh"
    #include "./../model/Interval.cuh"
	#include "./../model/Priority.cuh"
	#include "./../model/FullCoveredInfo.cuh"
	#include "./../model/Classification.cuh"
	#include "./../model/Limit.h"
    #include "./../solver/ATG.h"
	#include "./../solver/PCATG.h"
	#include "./../solver/ConstantValue.h"
	#include "./../ErrorHandle/ErrorHandle.cuh"
	#include "ExcuteConstraint.cuh"
	#include "HardwareStrategy.cuh"


	#include "cuda_runtime.h"
	#include "device_launch_parameters.h"
	#include "cuda_runtime.h"
	#include "device_launch_parameters.h"
	#include "device_functions.hpp"
	#include "math_functions.h"

	#include <stdio.h>
	#include <iostream>
	#include <climits>

	using namespace std;

	/*
	 *  case：0
	 *  等号和不等号 全区间
	 *  判断是否是> 和 >=比较运算符号的处理
	 *  斜率为0： abs(y1-y2)<=Min && y1 >=0 && y2>=0 全区间
	 *  斜率存在： abs(y1-y2)>Min && y1>=0 && y2>=0 全区间
	 *  case1: abs(y1-y2)<=Min && y1 <0 && y2<0        无解
	 *  case2: abs(y1-y2)>Min && z>x1 && z<x2 && y1>0 (x1,z)
	 *  case3: abs(y1-y2)>Min && z>x1 && z<x2 && y2>0 (z,x2)
	 *  case4: abs(y1-y2)>Min && z<x1 && y1 <0 && y2<0 无解(xbefore,d)
	 *  case5: abs(y1-y2)>Min && z>x2 && y1 <0 && y2<0 无解(d,xafter)
	 *  下面是所有的分类的变量的设置
	 * */

	//全区间case:等式、不等式、全在上方
	__device__ bool case0(Coodinate* a,Coodinate* b,const int cmpType)
	{
		bool a1 = (cmpType==ConstantValue::Equal);
		bool a2 = (cmpType==ConstantValue::NotEqual);
		bool a3 = (cmpType==ConstantValue::GreatOrGreatEqual) && (a->y >=0) && (b->y >=0);
		return a1 || a2 || a3;
	}

	//斜率不存在，导致无解
	__device__ bool case1(Coodinate* a,Coodinate* b,const int cmpType)
	{
		return (cmpType==ConstantValue::GreatOrGreatEqual) && (abs(a->y - b->y)<=Limit::FloatMin)
				&& ((a->y <=0) || (a->y <=-0.0)) && ((b->y <=0) || (b->y <=-0.0));
	}

	//零点落在中间，左边部分解
	__device__ bool case2(Coodinate* a,Coodinate* b,const int cmpType)
	{
		return (cmpType==ConstantValue::GreatOrGreatEqual) && (abs(a->y - b->y)>Limit::FloatMin)
				&& (a->y > 0) && (b->y < 0);
	}

	//零点落在中间，右边部分解
	__device__ bool case3(Coodinate* a,Coodinate* b,const int cmpType)
	{
		return (cmpType==ConstantValue::GreatOrGreatEqual) && (abs(a->y - b->y)>Limit::FloatMin)
				&& (a->y < 0) && (b->y > 0);
	}

	//无解，零点落在左边
	__device__ bool case4(Coodinate* a,Coodinate* b,const int cmpType)
	{
		return ( cmpType==ConstantValue::GreatOrGreatEqual || cmpType==ConstantValue::Equal )
				&& (abs(a->y - b->y)>Limit::FloatMin)
				&& (a->y <=0) && (b->y <=0) && (a->y > b->y);;

	}

	//无解，零点落在右边
	__device__ bool case5(Coodinate* a,Coodinate* b,const int cmpType)
	{
		return ( cmpType==ConstantValue::GreatOrGreatEqual || cmpType==ConstantValue::Equal )
				&& (abs(a->y - b->y)>Limit::FloatMin)
				&& (a->y <=0) && (b->y <=0) && (a->y < b->y);
	}







