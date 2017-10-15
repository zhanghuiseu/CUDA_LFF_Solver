/*
 * main.cpp
 *
 *  Created on: Oct 14, 2017
 *      Author: zy
 */

#ifndef SOLVERPARAMETER_H_
#define SOLVERPARAMETER_H_

#include <iostream>
#include <string>
#include "./../solver/runLFFSolver.h"


using namespace std;

int main()
{
	cout<<"LFF Solver Begin:  "<<endl;

	runLFFSolver::run();

	cout<<"LFF Solver Game Over!!!"<<endl;
}

#endif



