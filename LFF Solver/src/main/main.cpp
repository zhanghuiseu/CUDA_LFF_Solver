	/*
	 * main.cpp
	 *
	 *  Created on: Oct 14, 2017
	 *      Author: zy
	 */



	#include <iostream>
	#include "./../solver/runLFFSolver.h"

	using namespace std;

	#include "./../cuda/CLF.cuh"


	int main()
	{
		cout<<"LFF Solver Begin:  "<<endl;

		runLFFSolver::run();

		cout<<"LFF Solver Game Over!!!"<<endl;

	}


