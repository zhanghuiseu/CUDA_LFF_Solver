/*
 * LFFData.cuh
 *
 *  Created on: Jan 27, 2018
 *      Author: zy
 */

#ifndef LFFDATA_CUH_
#define LFFDATA_CUH_


#include <iostream>
#include <set>
#include <map>
#include <string>
#include <algorithm>

#include "./../ConstraintParser/ConstraintParameter.cuh"
#include "./../model/Coodinate.cuh"
#include "./../solver/ATG.h"
#include "./../solver/PCATG.h"
#include "./../solver/type.h"
#include "./../solver/ConstantValue.h"
#include "./../solver/SolverParameter.h"



/*
 * 这个模块是用来输出线性拟合的数据
 * */
class LFFData
{
public:

	/*
	 * 这个函数用来生成，并输出线性拟合的数据
	 * */
	static void generateLFFData(Coodinate* dev_calaArray, const int row, const int col,
			const int currentIndex);

	/*
	 * 把线性拟合的数据输出到文件
	 * */
	static void writeToFile(string fileName, string fileContent);

};

#endif /* LFFDATA_CUH_ */
