/*
 * Point.h
 *
 *  Created on: Sep 16, 2017
 *      Author: zy
 */

#ifndef POINT_H_
#define POINT_H_

class Point
{
public:
	/*
	 * 默认的构造函数，用于申明固定size的构造
	 * */
	Point()
    {
		x=0.0;
		y=0.0;
    }
	Point(double a,double b)
    {
		x=a;
		y=b;
    }

	double x;
	double y;
};
#endif /* POINT_H_ */
