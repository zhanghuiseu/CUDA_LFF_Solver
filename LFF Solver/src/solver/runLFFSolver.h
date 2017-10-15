/*
 * runLFFSolver.h
 *
 *  Created on: Oct 14, 2017
 *      Author: zy
 */

#ifndef RUNLFFSOLVER_H_
#define RUNLFFSOLVER_H_

#include <string>
#include <iostream>
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
	 * LFF Solver打印一次实验的结果
	 * */
	static void printOneResult(string resultOne , int index);

	/*
	 * LFF Solver 打印所有实验的结果，包括各种参数的均值、最大、最小值等等
	 * */
	static void printTotalResult(string resultInfo);

};
#endif /* RUNLFFSOLVER_H_ */
