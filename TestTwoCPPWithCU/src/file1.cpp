/*
 * ff.cu
 *
 *  Created on: Sep 11, 2017
 *      Author: zy
 */

#include <iostream>
#include <vector>
#include <cmath>
using namespace std;

int xFile1=1;

int file1()
{
	cout<<"In File1 "<<xFile1<<"  "<<(xFile1+1)<<endl;
	return xFile1+1;
}

void testNanAndInf()
{
    //nan
    cout<<"nan: "<<sqrt(-1)<<"  "<<isnan(sqrt(-1))<<endl;
    cout<<"nan: "<<log(-1.0)<<"  "<<isnan(log(-1.0))<<endl;
    cout<<"nan: "<<0.0/0.0<<"  "<<isnan(0.0/0.0)<<endl;
    cout<<"nan: "<<0.0*sqrt(-1)<<"  "<<isnan(0.0*sqrt(-1))<<endl;
    cout<<"nan: "<<sqrt(-1)/sqrt(-1)<<"  "<<isnan(sqrt(-1)/sqrt(-1))<<endl;
    cout<<"nan: "<<sqrt(-1)-sqrt(-1)<<"  "<<isnan(sqrt(-1)-sqrt(-1))<<endl;
    //inf
    cout<<"inf: "<<1/0.0<<endl;
    cout<<"-inf: "<<-1/0.0<<endl;
    cout<<"inf: "<<0.0+1/0.0<<endl;
    cout<<"-inf: "<<log(0)<<endl;

    cout<<"isfinite: 0"<<isfinite(0.0/0.0)<<endl;
    cout<<"isfinite: 0"<<isfinite(1/0.0)<<endl;
    cout<<"isfinite: 1"<<isfinite(1.1)<<endl;

    cout<<"isnormal: 0"<<isnormal(0.0/0.0)<<endl;
    cout<<"isnormal: 0"<<isnormal(1/0.0)<<endl;
    cout<<"isnormal: 1"<<isnormal(1.1)<<endl;

    cout<<"isnan: 1"<<isnan(0.0/0.0)<<endl;
    cout<<"isnan: 0"<<isnan(1/0.0)<<endl;
    cout<<"isnan: 0"<<isnan(1.1)<<endl;

    cout<<"isinf: 0"<<isinf(0.0/0.0)<<endl;
    cout<<"isinf: 1"<<isinf(1/0.0)<<endl;
    cout<<"isinf: 0"<<isinf(1.1)<<endl;
}




