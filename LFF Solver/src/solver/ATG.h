/*
 * ATG.h
 *
 *  Created on: Oct 14, 2017
 *      Author: zy
 */

#ifndef ATG_H_
#define ATG_H_
#include "PCATG.h"

class ATG
{
public:
	ATG()
	{
		this->pcatg = PCATG();
	}
	~ATG()
	{

	}

	int generateTestDataForSolver();

private:
	PCATG pcatg;
};



#endif /* ATG_H_ */
