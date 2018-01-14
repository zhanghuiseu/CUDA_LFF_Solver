/*
 * runLFFSolver.h
 *
 *  Created on: Oct 14, 2017
 *      Author: zhanghui
 */

#ifndef RUNLFFSOLVER_H_
#define RUNLFFSOLVER_H_

#include <string>
#include <vector>
#include <iostream>

#include "type.h"
#include "./../model/RuntimeValue.h"
#include "SolverParameter.h"


using namespace std;
/*
 * LFF Solver的开始程序入口
 * */
class runLFFSolver
{
public:
	/*
	 * LFF Solver 的总的开始部分
	 * */
	static void run();

	/*
	 * LFF Solver 函数时间和频率的重置
	 * */
	static void reset();

	/*
	 * 这个函数是把约束化简过程中求解出来的变量的值赋值到finalParams
	 * 因为这些变量是与花间后的约束没有依赖关系，这是因为已经做过替换了
	 * 所以最后赋值到finalParams即可
	 * */
	static void copyConstValueToFinalParams();

	/*
	 * LFF Solver打印一次实验的结果
	 * */
	static void printOneResult(string resultOne , int index);

	/*
	 * LFF Solver 打印所有实验的结果，包括各种参数的均值、最大、最小值等等
	 * */
	static void printTotalResult(string resultInfo);

	/*
	 * 获取runtime value的运行时刻值的信息
	 * */
	static string getRuntimeValueInfo(vector< vector<RuntimeValue*> > verificationVec);


	/*
	 * 部分使用图动态申请内存的析构出处理
	 * 把之前获取的运行时刻值的信息处理掉
	 * */
	static bool makeClean(vector< vector<RuntimeValue*> > verificationVec);

};
#endif /* RUNLFFSOLVER_H_ */
