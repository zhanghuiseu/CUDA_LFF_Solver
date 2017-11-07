/*
 * HardwareStrategy.cuh
 *
 *  Created on: Nov 4, 2017
 *      Author: zy
 */

#ifndef HARDWARESTRATEGY_CUH_
#define HARDWARESTRATEGY_CUH_

/*
 * 硬件参数信息的数据结构
 * 这里我把硬件参数设计成了一个一维的结果，这样便于计算
 * */
class Block
{
public:
	int ThreadPreBlock;
	int NumOfBlock;
	Block()
	{
		this->NumOfBlock = 0;
		this->ThreadPreBlock = 0;
	}
};

class HardwareStrategy
{
public:
	static const int MinBlockSize = 128;
	static const int MaxBlockSize = 256;
	static Block getHardwareStrategy(const int calaSize)
	{
		Block res=Block();
		res.ThreadPreBlock = 256;
		res.NumOfBlock = (calaSize + res.ThreadPreBlock -1) / res.ThreadPreBlock;
		return res;
	}
};
#endif /* HARDWARESTRATEGY_CUH_ */