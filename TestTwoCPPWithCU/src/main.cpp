/*
 * ff.cu
 *
 *  Created on: Sep 11, 2017
 *      Author: zy
 */

#include <iostream>
using namespace std;

#include "hello.cuh"
#include <cmath>


//extern int xFile1;
//extern int file1();


int main()
{
	cout<<"Game Begin: "<<endl;

	//mainForTestC();
	//mainForVec();
	//mainForClass();
	//mainForFFFF();

	//testForDeviceVectorAdd();

	//mainFotPoint();

	///mainForSort();

	testCUDADouble();

	cout<<"Game Over!!!!"<<endl;
	return 1;
}



