/*
 * HardwareStrategy.cuh
 *
 *  Created on: Nov 4, 2017
 *      Author:zhanghui
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

		//默认参数设置
		int threadPreBlcok = 256;
		if(calaSize <= 32)
			threadPreBlcok = calaSize;
		else if(calaSize <= 256)
			threadPreBlcok = 32;
		else if(calaSize <= 1024)
			threadPreBlcok = 128;
		else
			threadPreBlcok = 256;

		threadPreBlcok = 128;
		res.ThreadPreBlock = threadPreBlcok;
		res.NumOfBlock = (calaSize + res.ThreadPreBlock -1) / res.ThreadPreBlock;
		return res;
	}
};
#endif /* HARDWARESTRATEGY_CUH_ */
