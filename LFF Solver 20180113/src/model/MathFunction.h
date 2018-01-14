/*
 * MathFunction.h
 *
 *  Created on: Oct 14, 2017
 *      Author: zhanghui
 */

#ifndef MATHFUNCTION_H_
#define MATHFUNCTION_H_

#include <cmath>
#include <iostream>
#include <string>
#include <sstream>
#include <vector>

#include "./../solver/type.h"

using namespace std;

/*
 * 这个类就是一般的数学计算函数，比较简单
 * 所以封装成了一个专门的类
 * */
class MathFunction
{
public:
	/*
	 * FloatType 数组的平均值
	 * */
	static FloatType getAverage(FloatType* nums,int SIZE)
	{
		FloatType sum = 0.0;
		for(int i = 0; i < SIZE; i++)
		{
			sum += nums[i];
		}
		FloatType res = sum / SIZE;
		return res;
	}

	/*
	 * int 数组的平均值
	 * */
	static FloatType getAverage(int* nums,int SIZE)
	{
		FloatType sum = 0.0;
		for(int i = 0; i < SIZE; i++)
		{
			sum += nums[i];
		}
		FloatType res = sum / SIZE;
		return res;
	}

	/*
	 * FloatType 数组的最大值
	 * */
	static FloatType getMax(FloatType* nums,int SIZE)
	{
		FloatType max = nums[0];
		for(int i = 1; i < SIZE; i++)
		{
			if(nums[i] > max)
				max = nums[i];
		}
		return max;
	}
	/*
	 * FloatType 数组的最小值
	 * */
	static FloatType getMin(FloatType* nums,int SIZE)
	{
		FloatType min = nums[0];
		for(int i = 1; i < SIZE; i++)
		{
			if(nums[i] < min)
				min = nums[i];
		}
		return min;
	}


	/*
	 * int 数组的最大值
	 * */
	static int getMax(int* nums,int SIZE)
	{
		int max = nums[0];
		for(int i = 1; i < SIZE; i++)
		{
			if(nums[i] > max)
				max = nums[i];
		}
		return max;
	}
	/*
	 * int 数组的最小值
	 * */
	static int getMin(int* nums,int SIZE)
	{
		int min = nums[0];
		for(int i = 1; i < SIZE; i++)
		{
			if(nums[i] < min)
				min = nums[i];
		}
		return min;
	}

	/*
	 * FloatType 数组打印字符串
	 * */
	static string toString(FloatType* nums,int SIZE)
	{
		string res = "[ " + toString(nums[0]);
		for(int i = 1; i < SIZE; i++)
		{
			res += ", "+toString(nums[i]);;
		}
		res = res + " ] ";
		return res;
	}

	/*
	 * int 数组打印字符串
	 * */
	static string toString(int* nums,int SIZE)
	{
		string res = "[ " + toString(nums[0]);
		for(int i = 1; i < SIZE; i++)
		{
			res += ", "+toString(nums[i]);;
		}
		res = res + " ] ";
		return res;
	}

	/*
	 * FloatType 数组打印字符串
	 * */
	static string toString(bool* nums,int SIZE)
	{
		string res = "[ " + toString(nums[0]);
		for(int i = 1; i < SIZE; i++)
		{
			res += ", "+toString(nums[i]);;
		}
		res = res + " ] ";
		return res;
	}

	/*
	 * FloatType 打印字符串
	 * */
	static string toString(FloatType num)
	{
		stringstream ss;
		string res = "";
		ss<<num;
		ss>>res;
		ss.clear();
		return res;
	}

	/*
	 * int打印字符串
	 * */
	static string toString(int num)
	{
		stringstream ss;
		string res = "";
		ss<<num;
		ss>>res;
		ss.clear();
		return res;
	}

	/*
	 * bool打印字符串
	 * */
	static string toString(bool num)
	{
		string res = "";
		if(num == true)
			res = "true";
		else
			res = "false";
		return res;
	}

	static string toString(vector<string> constraints)
	{
		string res  = "( " + constraints[0] + " )";
		for(int i=1;i<constraints.size();i++)
		{
			res += " && ( " + constraints[i] + " )";
		}
		return res;
	}

	static string toString(vector< vector<string> > constraints)
	{
		string res = "";
		string one = toString(constraints[0]);

		res += "( " + one + " )";
		for(int i=1;i<constraints.size();i++)
		{
			string tmp = toString(constraints[i]);
			res += " || ( " + tmp + " )";
		}

		return res;
	}

};

#endif /* MATHFUNCTION_H_ */
