/*
 * runLFFSolver.cpp
 *
 *  Created on: Oct 14, 2017
 *      Author: zy
 */

#include <iostream>
#include <fstream>
#include <string>
#include <ctime>
#include <time.h>

#include "runLFFSolver.h"
#include "SolverParameter.h"
#include "ATG.h"
#include "./../ConstraintParser/ConstraintParameter.cuh"
#include "./../model/MathFunction.h"

using namespace std;

/*
 * LFF Solver 的总的开始部分
 * */
void runLFFSolver::run()
{
	SolverParameter::finalParams = new double[ConstraintParameter::NUM_OF_PARAM];
	ATG atg = ATG();
	clock_t start,finish;
	string resultInfo = "";
	for(int indexOfRun = 1 ; indexOfRun <= SolverParameter::countOfRepeation; indexOfRun++)
	{
		string resultOne = "";
		//参数重置
		SolverParameter::reset();

		//开始计算求解模块
		int res = -1;

		//获取当前的时间
		start = clock();
		res = atg.generateTestDataForSolver();
		finish = clock();

		/*
		 * 下面是一次计算结束之后结果输出
		 * 并打印测试记录
		 * */
		double totalTime = (double)(finish - start) / CLOCKS_PER_SEC;
		double algorTime = (double)(finish - start - SolverParameter::function_time) / CLOCKS_PER_SEC;
		bool isCovered = res > -1 ? true : false;

		/*
		 * 下面是记录相关参数
		 * */
		SolverParameter::totalTime[indexOfRun-1] = totalTime ;
		SolverParameter::algorithmTime[indexOfRun-1] =  algorTime;
		SolverParameter::totalFrequency[indexOfRun-1] = SolverParameter::function_frequency;
		SolverParameter::findResult[indexOfRun-1] = isCovered;

		string indexStr = MathFunction::toString(indexOfRun);
		resultOne += "----------------------------run" + indexStr + "----------------------------\n";
		resultOne += "Coverage Result Is As Following:\n";

		if(isCovered)
		{
			resultOne += "Yes!!!!!   Find Covered Input: " + MathFunction::toString(SolverParameter::finalParams,ConstraintParameter::NUM_OF_PARAM) + "\n";
			resultOne += "Best Covered is: " + MathFunction::toString(SolverParameter::finalCovered * 100) + "%\n";
		}else
		{
			resultOne += "Sorry,No!!!!! Cannot Find Covered Input ！\n";
			resultOne += "The Best Input Is: " + MathFunction::toString(SolverParameter::finalParams,ConstraintParameter::NUM_OF_PARAM) + "\n";
			resultOne += "Best Covered is: " + MathFunction::toString(SolverParameter::finalCovered * 100) + "%\n";
		}

		resultOne += "SolverParameter::totalTime[" + indexStr + "] = " + MathFunction::toString(totalTime) + "\n";
		resultOne += "SolverParameter::algorithmTime[" + indexStr + "] = " + MathFunction::toString(algorTime) + "\n";
		resultOne += "SolverParameter::FunctionTime[" + indexStr + "] = " + MathFunction::toString(totalTime-algorTime) + "\n";
		resultOne += "SolverParameter::totalFrequency[" + indexStr + "] = " + MathFunction::toString(SolverParameter::function_frequency) + "\n";

		//打印一次实验的结果
		runLFFSolver::printOneResult(resultOne,indexOfRun);
		resultInfo += resultOne + "\n";

		cout<<resultOne<<endl<<endl;

	}

	//打印所有的结果
	runLFFSolver::printTotalResult(resultInfo);

	/*
	 * 最后的析构部分，这个千万不要忘记了
	 * */
	delete SolverParameter::finalParams;
}

/*
 * LFF Solver打印一次实验的结果
 * */
void runLFFSolver::printOneResult(string resultOne , int index)
{
	ofstream out;
	string filePath = "./TempResult/" + ConstraintParameter::constraintName
			       + MathFunction::toString(index)+ ".result";
	out.open(filePath.c_str());
	out<<resultOne<<endl;
	out.close();
}


/*
 * LFF Solver 打印所有实验的结果，包括各种参数的均值、最大、最小值等等
 * */
void runLFFSolver::printTotalResult(string resultInfo)
{
	resultInfo += "----------------------------statistical result----------------------------\n";
	double averageTime = MathFunction::getAverage(SolverParameter::totalTime,SolverParameter::countOfRepeation);
	resultInfo += "Average Time:\t" + MathFunction::toString(averageTime) + "\n";
	double bestTime = MathFunction::getMin(SolverParameter::totalTime,SolverParameter::countOfRepeation);
	resultInfo += "Best Time:\t" + MathFunction::toString(bestTime) + "\n";
	double worstTime = MathFunction::getMax(SolverParameter::totalTime,SolverParameter::countOfRepeation);
	resultInfo += "Worst Time:\t" + MathFunction::toString(worstTime) + "\n";

	double frequency = MathFunction::getAverage(SolverParameter::totalFrequency,SolverParameter::countOfRepeation);
	resultInfo += "Average Frequency:\t" + MathFunction::toString(frequency) + "\n";
	resultInfo += "Coverage Result:\t" + MathFunction::toString(SolverParameter::findResult,SolverParameter::countOfRepeation) + "\n";

	resultInfo += "Parameter Setting: \n";
	resultInfo += "MAX_NUM_OF_PREDICT_PARAM = "+ MathFunction::toString(SolverParameter::MAX_NUM_OF_PREDICT_PARAM) + "\n";
	resultInfo += "MAX_NUM_OF_GENERATE_CYCLE = "+ MathFunction::toString(SolverParameter::MAX_NUM_OF_GENERATE_CYCLE ) + "\n";;
	resultInfo += "PREDICT_BOUNDARY = "+ MathFunction::toString(SolverParameter::PREDICT_BOUNDARY) + "\n";;

	string strategy = SolverParameter::SEARCH_STRATEGY == 0 ? "SEARCH_STRATEGY_ALL" : "SEARCH_STRATEGY_ONE_BY_ONE \n";;
	resultInfo += "Search Strategy: " + strategy + "\n";

	ofstream out;
	string filePath = "./FinalResult/" + ConstraintParameter::constraintName + ".result";
	out.open(filePath.c_str());
	out<<resultInfo<<endl;
	out.close();
}



