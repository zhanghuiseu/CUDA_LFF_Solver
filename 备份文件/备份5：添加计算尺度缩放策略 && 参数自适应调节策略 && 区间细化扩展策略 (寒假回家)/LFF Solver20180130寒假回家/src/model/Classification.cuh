/*
 * Classification.cuh
 *
 *  Created on: Nov 9, 2017
 *      Author: zhanghui
 */

#ifndef CLASSIFICATION_CUH_
#define CLASSIFICATION_CUH_

#include "./../solver/type.h"

/*
 * 这个是为了做计算的分类处理
 * */
class Classification
{
public:
	FloatType zero;
	bool case0;
	bool case1;
	bool case2;
	bool case3;
	bool case4;
	bool case5;
	bool hasIntervel;

	Classification()
	{
		this->zero = 0.0;
		this->hasIntervel = true;
		this->case0 = false;
		this->case1 = false;
		this->case2 = false;
		this->case3 = false;
		this->case4 = false;
		this->case5 = false;
	}

	void setZero(FloatType sero)
	{
		this->zero = zero;
	}

	FloatType getZero()
	{
		return this->zero;
	}


	void setCase0(bool case0)
	{
		this->case0 = case0;
	}


	bool getCase0()
	{
		return this->case0;
	}


	void setCase1(bool case1)
	{
	   this->case1 = case1;
	}


	bool getCase1()
	{
	   return this->case1;
	}

	void setCase2(bool case2)
	{
	  this->case2 = case2;
	}

	bool getCase2()
	{
	  return this->case2;
	}

	void setCase3(bool case3)
	{
	  this->case3 = case3;
	}

	bool getCase3()
	{
	  return this->case3;
	}

	void setCase4(bool case4)
	{
	  this->case4 = case4;
	}

	bool getCase4()
	{
	  return this->case4;
	}

	void setCase5(bool case5)
	{
	  this->case5 = case5;
	}

	bool getCase5()
	{
	  return this->case5;
	}

	void setHasIntervel(bool hasIntervel)
	{
		this->hasIntervel = hasIntervel;
	}

	bool getHasIntervel()
	{
		return this->hasIntervel;
	}
};


#endif /* CLASSIFICATION_CUH_ */
