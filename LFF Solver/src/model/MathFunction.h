/*
 * MathFunction.h
 *
 *  Created on: Oct 14, 2017
 *      Author: zy
 */

#ifndef MATHFUNCTION_H_
#define MATHFUNCTION_H_

#include <cmath>
#include <iostream>
#include <string>
#include <sstream>

using namespace std;

/*
 * 这个类就是一般的数学计算函数，比较简单
 * 所以封装成了一个专门的类
 * */
class MathFunction
{
public:
	/*
	 * double 数组的平均值
	 * */
	static double getAverage(double* nums,int SIZE)
	{
		double sum = 0.0;
		for(int i = 0; i < SIZE; i++)
		{
			sum += nums[i];
		}
		double res = sum / SIZE;
		return res;
	}

	/*
	 * float 数组的平均值
	 * */
	static float getAverage(float* nums,int SIZE)
	{
		float sum = 0.f;
		for(int i = 0; i < SIZE; i++)
		{
			sum += nums[i];
		}
		float res = sum / SIZE;
		return res;
	}

	/*
	 * int 数组的平均值
	 * */
	static double getAverage(int* nums,int SIZE)
	{
		double sum = 0.0;
		for(int i = 0; i < SIZE; i++)
		{
			sum += nums[i];
		}
		double res = sum / SIZE;
		return res;
	}

	/*
	 * double 数组的最大值
	 * */
	static double getMax(double* nums,int SIZE)
	{
		double max = nums[0];
		for(int i = 1; i < SIZE; i++)
		{
			if(nums[i] > max)
				max = nums[i];
		}
		return max;
	}
	/*
	 * double 数组的最小值
	 * */
	static double getMin(double* nums,int SIZE)
	{
		double min = nums[0];
		for(int i = 1; i < SIZE; i++)
		{
			if(nums[i] < min)
				min = nums[i];
		}
		return min;
	}

	/*
	 * float 数组的最大值
	 * */
	static float getMax(float* nums,int SIZE)
	{
		float max = nums[0];
		for(int i = 1; i < SIZE; i++)
		{
			if(nums[i] > max)
				max = nums[i];
		}
		return max;
	}
	/*
	 * double 数组的最小值
	 * */
	static float getMin(float* nums,int SIZE)
	{
		float min = nums[0];
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
	 * double 数组打印字符串
	 * */
	static string toString(double* nums,int SIZE)
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
	 * float 数组打印字符串
	 * */
	static string toString(float* nums,int SIZE)
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
	 * double 数组打印字符串
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
	 * double 打印字符串
	 * */
	static string toString(double num)
	{
		stringstream ss;
		string res = "";
		ss<<num;
		ss>>res;
		ss.clear();
		return res;
	}

	/*
	 * double 打印字符串
	 * */
	static string toString(float num)
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

};

#endif /* MATHFUNCTION_H_ */
