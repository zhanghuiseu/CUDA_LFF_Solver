
	#include <iostream>
	#include <fstream>
	#include <set>
	#include <map>
	#include <string>
	#include <algorithm>

	#include "./../ConstraintParser/ConstraintParameter.cuh"
	#include "./../model/Coodinate.cuh"
	#include "./../model/MathFunction.h"
    #include "./../solver/ATG.h"
	#include "./../solver/PCATG.h"
 	#include "./../solver/type.h"
	#include "./../solver/ConstantValue.h"
	#include "./../solver/SolverParameter.h"
	#include "./../ErrorHandle/ErrorHandle.cuh"

	#include "LFFData.cuh"

	using namespace std;

	static int FileID = 0;

	/*
	 * 这个函数用来生成，并输出线性拟合的数据
	 * */
	void LFFData::generateLFFData(Coodinate* dev_calaArray,const int row,const int col,
			const int currentIndex)
	{
		//申请存储额空间
		Coodinate* calaArray = new Coodinate[row*col];

		//把拟合点的信息复制到CPU
		cudaError_t cudaStatus = cudaMemcpy(calaArray,dev_calaArray,row*col * sizeof(Coodinate),cudaMemcpyDeviceToHost);
		ErrorHandle::dealError(cudaStatus,"LFFData: cudaMemcpy(calaArray,dev_calaArray,row*col * sizeof(Coodinate),cudaMemcpyDeviceToHost);");

		Coodinate (*calaMat)[col] = (Coodinate(*)[col])calaArray;
		vector< vector<string> > constraints = ConstraintParameter::getConstraintInfo();

		for(int i = 0; i < row; i++)
		{
			string one = "";
			one = one + constraints[0][i] + "\n";
			one = one + ConstraintParameter::constraintVarName[currentIndex] + "\n";
			one = one + "begin data\n";

			for(int j = 0; j < col; j++)
			{
				one = one + MathFunction::toString(calaMat[i][j].x)
				     + ","+ MathFunction::toString(calaMat[i][j].y) + "\n";
			}
			string fileName="file"+MathFunction::toString(FileID);
			LFFData::writeToFile(fileName,one);

			FileID += 1;
		}

		delete [] calaArray;
	}


	/*
	 * 把线性拟合的数据输出到文件
	 * */
	void LFFData::writeToFile(string fileName, string fileContent)
	{
		ofstream out;
		string filePath = "./LFFGUIData/" + fileName + ".data";

		out.open(filePath.c_str());
		out<<fileContent<<endl;
		out.close();
	}





