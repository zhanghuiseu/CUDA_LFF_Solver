package cn.nju.seg.atpc.main;

import java.util.ArrayList;
import java.util.List;

public class BenchMarkForZYFWithInit 
{
	public static List<String> functionName=new ArrayList<String>();
	public static List<String> binaryExp=new ArrayList<String>();
	public static List<String> paraName=new ArrayList<String>();
	public static List<String> paraType=new ArrayList<String>();
	public static List<String> initNum=new ArrayList<String>();
	
	
	public static void sp()
	{

/*		//可解
		functionName.add(" HelicalValley ");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL,x3_3_SYMREAL,x1_4_SYMREAL, x2_5_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("(0.0 == (10.0 * (sqrt((x1_1_SYMREAL * x1_1_SYMREAL) + (x2_2_SYMREAL * x2_2_SYMREAL)) - 1.0))&& 0.0 == (10.0 * (x3_3_SYMREAL - (10.0 * (atan(x2_5_SYMREAL / x1_4_SYMREAL) / 6.283185307179586))))&& x1_4_SYMREAL != 0.0 && x1_4_SYMREAL > 0.0)");
		initNum.add("");*/
		
		
		
/*        //很容易求解 
  		functionName.add(" Tcas ");
		paraName.add("up_separation_8_SYMINT,down_separation_9_SYMINT,climb_inhibit_12_SYMINT,other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,cur_vertical_sep_1_SYMINT,own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int,int,int,int,int,int");
		binaryExp.add("(((up_separation_8_SYMINT+300)>down_separation_9_SYMINT)) && ((climb_inhibit_12_SYMINT==1)) && ((other_rac_10_SYMINT==0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((cur_vertical_sep_1_SYMINT>600)) && ((own_tracked_alt_rate_5_SYMINT<=600)) && ((high_confidence_2_SYMINT==1))");
		initNum.add("");*/
		
/*		//无解
		functionName.add(" Tsafe ");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))>6.283185307179586)) && (((y1_5_SYMREAL-y2_7_SYMREAL)<0.0)) && ((0.0==(x1_4_SYMREAL-x2_6_SYMREAL))) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		initNum.add("");
		//initNum.add("48.0593596421, 72.7577812675, 48.1407506422, 48.1407506422, 0.0, -57.0906825371");
*/		
/*       //本身无解		
  		functionName.add(" tsafe.Conflict.main() ");
		paraName.add("bank_ang_7_SYMREAL,psi1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((tan((0.017453292519943295*bank_ang_7_SYMREAL))==0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		initNum.add("");*/
		
		
	}
	
	
	
	public static void initBenchmark()
	{
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample01.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.588 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample01.main()_0");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((sin(x_3_SYMREAL)+cos(y_4_SYMREAL))<1.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.004 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample01.main()_1");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((sin(x_3_SYMREAL)+cos(y_4_SYMREAL))>1.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.115 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample01.main()_2");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((1.0==(sin(x_3_SYMREAL)+cos(y_4_SYMREAL))))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetApollo.main().txt      *********/
		//Parse time: 0.005 seconds.Solve time: 0.89 seconds.Solved.     
		functionName.add(" JpfTargetApollo.main()_0");
		paraName.add("in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		initNum.add("24.7172274892,34.7864814006");
		
		//Parse time: 0.0 seconds.Solve time: 0.013 seconds.Solved.     
		functionName.add(" JpfTargetApollo.main()_1");
		paraName.add("in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)>0.0))");
		initNum.add("95.771862871,-80.597713162");
		
		//Parse time: 0.0 seconds.Solve time: 0.408 seconds.Unsolved.     
		functionName.add(" JpfTargetApollo.main()_2");
		paraName.add("in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(0.18181818181818185*(((0.5*(((((((10.0*in2_0_4_SYMREAL)+-0.0)-0.0)/1.0)/0.055)/2.0)*((((((10.0*in2_0_4_SYMREAL)+-0.0)-0.0)/1.0)/0.055)/2.0)))+(0.0-(((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)))-0.04759988869075444)))) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		initNum.add("24.7172274892,34.7864814006");
		
		//Parse time: 0.0 seconds.Solve time: 0.06 seconds.Solved.     
		functionName.add(" JpfTargetApollo.main()_3");
		paraName.add("in2_1_5_SYMREAL,in1_1_2_SYMREAL,in2_2_6_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)<0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		initNum.add("95.771862871,-80.597713162,96.1957988302,-4.0136821174,24.7172274892,34.7864814006");
		
		//Parse time: 0.0 seconds.Solve time: 0.011 seconds.Solved.     
		functionName.add(" JpfTargetApollo.main()_4");
		paraName.add("in2_1_5_SYMREAL,in1_1_2_SYMREAL,in2_2_6_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)>0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		initNum.add("-18.706738906,-32.0535100146,86.3854732518,-62.5209250696,-91.6775639517,-1.3052709712000001");
		
		//Parse time: 0.0 seconds.Solve time: 0.535 seconds.Unsolved.     
		functionName.add(" JpfTargetApollo.main()_5");
		paraName.add("in2_1_5_SYMREAL,in2_2_6_SYMREAL,in1_1_2_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((0.0==(0.18181818181818185*(((0.5*((((((-0.7071067811865476*((((10.0*in2_1_5_SYMREAL)+-0.0)-0.0)/1.0))+0.0)+(0.7071067811865476*((((10.0*in2_2_6_SYMREAL)+-0.0)-0.0)/1.0)))/7.855339059327378E-4)/2.0)*(((((-0.7071067811865476*((((10.0*in2_1_5_SYMREAL)+-0.0)-0.0)/1.0))+0.0)+(0.7071067811865476*((((10.0*in2_2_6_SYMREAL)+-0.0)-0.0)/1.0)))/7.855339059327378E-4)/2.0)))+(0.0-(((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)))-3.332757323673897)))) && (((((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)<0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		initNum.add("95.771862871,96.1957988302,-80.597713162,-4.0136821174,24.7172274892,34.7864814006");
		
		//Parse time: 0.0 seconds.Solve time: 0.029 seconds.Solved.     
		functionName.add(" JpfTargetApollo.main()_6");
		paraName.add("in2_1_5_SYMREAL,in1_1_2_SYMREAL,in2_2_6_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((((((0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/0.006285533905932738)/2.0)<0.0)) && (((((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)<0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		initNum.add("-49.7697037079,-44.9553564706,-77.6393664425,20.3223846317,58.2452877077,79.4769006073");
		
		//Parse time: 0.0 seconds.Solve time: 0.042 seconds.Solved.     
		functionName.add(" JpfTargetApollo.main()_7");
		paraName.add("in2_1_5_SYMREAL,in1_1_2_SYMREAL,in2_2_6_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((((((0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/0.006285533905932738)/2.0)>0.0)) && (((((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)<0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		initNum.add("95.771862871,-80.597713162,96.1957988302,-4.0136821174,24.7172274892,34.7864814006");
		
		//Parse time: 0.0 seconds.Solve time: 0.45 seconds.Unsolved.     
		functionName.add(" JpfTargetApollo.main()_8");
		paraName.add("in2_1_5_SYMREAL,in2_2_6_SYMREAL,in1_1_2_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((0.0==(0.18181818181818185*(((0.5*((((((0.7071067811865476*((((10.0*in2_1_5_SYMREAL)+-0.0)-0.0)/1.0))+0.0)+(0.7071067811865476*((((10.0*in2_2_6_SYMREAL)+-0.0)-0.0)/1.0)))/0.006285533905932738)/2.0)*(((((0.7071067811865476*((((10.0*in2_1_5_SYMREAL)+-0.0)-0.0)/1.0))+0.0)+(0.7071067811865476*((((10.0*in2_2_6_SYMREAL)+-0.0)-0.0)/1.0)))/0.006285533905932738)/2.0)))+(0.0-(((((0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/0.006285533905932738)/2.0)))-0.4165109785694488)))) && (((((((0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/0.006285533905932738)/2.0)<0.0)) && (((((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)<0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		initNum.add("-49.7697037079,-77.6393664425,-44.9553564706,20.3223846317,58.2452877077,79.4769006073");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetRosenbrock.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.945 seconds.Unsolved.     
		functionName.add(" JpfTargetRosenbrock.main()_0");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((pow((1.0-x1_1_SYMREAL), 2.0)+(100.0*pow((x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)), 2.0)))<0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     null
		functionName.add(" JpfTargetRosenbrock.main()_1");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((pow((1.0-x1_1_SYMREAL), 2.0)+(100.0*pow((x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)), 2.0)))>0.0))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetCollision1.main().txt      *********/
		//Parse time: 0.004 seconds.     null
/*		functionName.add(" JpfTargetCollision1.main()_0");
		paraName.add("z1_3_SYMINT,y1_2_SYMINT,x1_1_SYMINT,z2_6_SYMINT,y2_5_SYMINT,x2_4_SYMINT");
		paraType.add("int,int,int,int,int,int");
		binaryExp.add("(((z1_3_SYMINT+(31*(((32>>>y1_2_SYMINT)^y1_2_SYMINT)+(31*x1_1_SYMINT))))!=(z2_6_SYMINT+(31*(((32>>>y2_5_SYMINT)^y2_5_SYMINT)+(31*x2_4_SYMINT))))))");
		initNum.add("");
		*/
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample05.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.603 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample05.main()_0");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((((sin(x_4_SYMREAL)+sin(y_5_SYMREAL))+sin(z_6_SYMREAL))<(((4.0*cos(x_4_SYMREAL))*cos(y_5_SYMREAL))*cos(z_6_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.002 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample05.main()_1");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((((sin(x_4_SYMREAL)+sin(y_5_SYMREAL))+sin(z_6_SYMREAL))>(((4.0*cos(x_4_SYMREAL))*cos(y_5_SYMREAL))*cos(z_6_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     null
		functionName.add(" coral.tests.samples.Sample05.main()_2");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((((sin(x_4_SYMREAL)+sin(y_5_SYMREAL))+sin(z_6_SYMREAL))>(((4.0*cos(x_4_SYMREAL))*cos(y_5_SYMREAL))*cos(z_6_SYMREAL))))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample44.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.595 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample44.main()_0");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((pow(x_3_SYMREAL, y_4_SYMREAL)<pow(y_4_SYMREAL, x_3_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.005 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample44.main()_1");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((pow(x_3_SYMREAL, y_4_SYMREAL)>pow(y_4_SYMREAL, x_3_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.002 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample44.main()_2");
		paraName.add("y_4_SYMREAL,x_3_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((pow(y_4_SYMREAL, x_3_SYMREAL)==pow(x_3_SYMREAL, y_4_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.306 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample44.main()_3");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((exp(x_3_SYMREAL)==exp(y_4_SYMREAL))) && ((pow(x_3_SYMREAL, y_4_SYMREAL)>pow(y_4_SYMREAL, x_3_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.008 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample44.main()_4");
		paraName.add("y_4_SYMREAL,x_3_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((exp(y_4_SYMREAL)<exp(x_3_SYMREAL))) && ((pow(x_3_SYMREAL, y_4_SYMREAL)>pow(y_4_SYMREAL, x_3_SYMREAL)))");
		initNum.add("");
		
		
/*
		 ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetCollision4.main().txt      ********
		//Parse time: 0.004 seconds.     null
		functionName.add(" JpfTargetCollision4.main()_0");
		paraName.add("z1_3_SYMINT,y1_2_SYMINT,x1_1_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((-412516635!=(z1_3_SYMINT+(31*(((32>>>y1_2_SYMINT)^y1_2_SYMINT)+(31*x1_1_SYMINT))))))");
		initNum.add("");*/
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample02.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.59 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample02.main()_0");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((sin(x_3_SYMREAL)-cos(y_4_SYMREAL))<1.0E-10))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample02.main()_1");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((sin(x_3_SYMREAL)-cos(y_4_SYMREAL))>1.0E-10))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.002 seconds.Solved.     null
		functionName.add(" coral.tests.samples.Sample02.main()_2");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((sin(x_3_SYMREAL)-cos(y_4_SYMREAL))>1.0E-10))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetTcas.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.98 seconds.Solved.     
		functionName.add(" JpfTargetTcas.main()_0");
		paraName.add("high_confidence_2_SYMINT");
		paraType.add("int");
		binaryExp.add("((high_confidence_2_SYMINT!=1))");
		initNum.add("0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.078 seconds.Solved.     
		functionName.add(" JpfTargetTcas.main()_1");
		paraName.add("own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((own_tracked_alt_rate_5_SYMINT>600)) && ((high_confidence_2_SYMINT==1))");
		initNum.add("622.0,1.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.064 seconds.Solved.     
		functionName.add(" JpfTargetTcas.main()_2");
		paraName.add("cur_vertical_sep_1_SYMINT,own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((cur_vertical_sep_1_SYMINT<=600)) && ((own_tracked_alt_rate_5_SYMINT<=600)) && ((high_confidence_2_SYMINT==1))");
		initNum.add("0.0,0.0,1.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.069 seconds.Solved.     
		functionName.add(" JpfTargetTcas.main()_3");
		paraName.add("other_capability_11_SYMINT,cur_vertical_sep_1_SYMINT,own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_capability_11_SYMINT!=1)) && ((cur_vertical_sep_1_SYMINT>600)) && ((own_tracked_alt_rate_5_SYMINT<=600)) && ((high_confidence_2_SYMINT==1))");
		initNum.add("80.0,711.0,-20.0,1.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.106 seconds.Solved.     
		functionName.add(" JpfTargetTcas.main()_4");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,cur_vertical_sep_1_SYMINT,own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT!=1)) && ((other_capability_11_SYMINT==1)) && ((cur_vertical_sep_1_SYMINT>600)) && ((own_tracked_alt_rate_5_SYMINT<=600)) && ((high_confidence_2_SYMINT==1))");
		initNum.add("80.0,1.0,711.0,-20.0,1.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.128 seconds.Solved.     
		functionName.add(" JpfTargetTcas.main()_5");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,cur_vertical_sep_1_SYMINT,own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT!=0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((cur_vertical_sep_1_SYMINT>600)) && ((own_tracked_alt_rate_5_SYMINT<=600)) && ((high_confidence_2_SYMINT==1))");
		initNum.add("80.0,1.0,1.0,711.0,-20.0,1.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.096 seconds.Solved.     
		functionName.add(" JpfTargetTcas.main()_6");
		paraName.add("climb_inhibit_12_SYMINT,other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,cur_vertical_sep_1_SYMINT,own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int,int,int,int");
		binaryExp.add("((climb_inhibit_12_SYMINT!=1)) && ((other_rac_10_SYMINT==0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((cur_vertical_sep_1_SYMINT>600)) && ((own_tracked_alt_rate_5_SYMINT<=600)) && ((high_confidence_2_SYMINT==1))");
		initNum.add("80.0,0.0,1.0,1.0,711.0,-20.0,1.0");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetTcas.main()_7");
		paraName.add("up_separation_8_SYMINT,down_separation_9_SYMINT,climb_inhibit_12_SYMINT,other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,cur_vertical_sep_1_SYMINT,own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int,int,int,int,int,int");
		binaryExp.add("(((up_separation_8_SYMINT+300)<=down_separation_9_SYMINT)) && ((climb_inhibit_12_SYMINT==1)) && ((other_rac_10_SYMINT==0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((cur_vertical_sep_1_SYMINT>600)) && ((own_tracked_alt_rate_5_SYMINT<=600)) && ((high_confidence_2_SYMINT==1))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample74.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.585 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample74.main()_0");
		paraName.add("a_9_SYMREAL,b_10_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(a_9_SYMREAL)<sin(b_10_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.011 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample74.main()_1");
		paraName.add("a_9_SYMREAL,b_10_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(a_9_SYMREAL)>sin(b_10_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.123 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample74.main()_2");
		paraName.add("b_10_SYMREAL,a_9_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(b_10_SYMREAL)==sin(a_9_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.033 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample74.main()_3");
		paraName.add("c_11_SYMREAL,b_10_SYMREAL,a_9_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((sin(c_11_SYMREAL)==sin(b_10_SYMREAL))) && ((sin(a_9_SYMREAL)>sin(b_10_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample74.main()_4");
		paraName.add("b_10_SYMREAL,c_11_SYMREAL,a_9_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((sin(b_10_SYMREAL)<sin(c_11_SYMREAL))) && ((sin(a_9_SYMREAL)>sin(b_10_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.019 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample74.main()_5");
		paraName.add("c_11_SYMREAL,d_12_SYMREAL,b_10_SYMREAL,a_9_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((sin(c_11_SYMREAL)<sin(d_12_SYMREAL))) && ((sin(b_10_SYMREAL)>sin(c_11_SYMREAL))) && ((sin(a_9_SYMREAL)>sin(b_10_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.148 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample74.main()_6");
		paraName.add("c_11_SYMREAL,d_12_SYMREAL,b_10_SYMREAL,a_9_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((sin(c_11_SYMREAL)>sin(d_12_SYMREAL))) && ((sin(b_10_SYMREAL)>sin(c_11_SYMREAL))) && ((sin(a_9_SYMREAL)>sin(b_10_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.083 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample74.main()_7");
		paraName.add("d_12_SYMREAL,c_11_SYMREAL,b_10_SYMREAL,a_9_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((sin(d_12_SYMREAL)==sin(c_11_SYMREAL))) && ((sin(b_10_SYMREAL)>sin(c_11_SYMREAL))) && ((sin(a_9_SYMREAL)>sin(b_10_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.074 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample74.main()_8");
		paraName.add("e_13_SYMREAL,d_12_SYMREAL,c_11_SYMREAL,b_10_SYMREAL,a_9_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((sin(e_13_SYMREAL)==sin(d_12_SYMREAL))) && ((sin(c_11_SYMREAL)>sin(d_12_SYMREAL))) && ((sin(b_10_SYMREAL)>sin(c_11_SYMREAL))) && ((sin(a_9_SYMREAL)>sin(b_10_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.07 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample74.main()_9");
		paraName.add("d_12_SYMREAL,e_13_SYMREAL,c_11_SYMREAL,b_10_SYMREAL,a_9_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((sin(d_12_SYMREAL)<sin(e_13_SYMREAL))) && ((sin(c_11_SYMREAL)>sin(d_12_SYMREAL))) && ((sin(b_10_SYMREAL)>sin(c_11_SYMREAL))) && ((sin(a_9_SYMREAL)>sin(b_10_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.111 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample74.main()_10");
		paraName.add("e_13_SYMREAL,f_14_SYMREAL,d_12_SYMREAL,c_11_SYMREAL,b_10_SYMREAL,a_9_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((sin(e_13_SYMREAL)<sin(f_14_SYMREAL))) && ((sin(d_12_SYMREAL)>sin(e_13_SYMREAL))) && ((sin(c_11_SYMREAL)>sin(d_12_SYMREAL))) && ((sin(b_10_SYMREAL)>sin(c_11_SYMREAL))) && ((sin(a_9_SYMREAL)>sin(b_10_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.032 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample74.main()_11");
		paraName.add("e_13_SYMREAL,f_14_SYMREAL,d_12_SYMREAL,c_11_SYMREAL,b_10_SYMREAL,a_9_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((sin(e_13_SYMREAL)>sin(f_14_SYMREAL))) && ((sin(d_12_SYMREAL)>sin(e_13_SYMREAL))) && ((sin(c_11_SYMREAL)>sin(d_12_SYMREAL))) && ((sin(b_10_SYMREAL)>sin(c_11_SYMREAL))) && ((sin(a_9_SYMREAL)>sin(b_10_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.252 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample74.main()_12");
		paraName.add("f_14_SYMREAL,e_13_SYMREAL,d_12_SYMREAL,c_11_SYMREAL,b_10_SYMREAL,a_9_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((sin(f_14_SYMREAL)==sin(e_13_SYMREAL))) && ((sin(d_12_SYMREAL)>sin(e_13_SYMREAL))) && ((sin(c_11_SYMREAL)>sin(d_12_SYMREAL))) && ((sin(b_10_SYMREAL)>sin(c_11_SYMREAL))) && ((sin(a_9_SYMREAL)>sin(b_10_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.032 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample74.main()_13");
		paraName.add("g_15_SYMREAL,f_14_SYMREAL,e_13_SYMREAL,d_12_SYMREAL,c_11_SYMREAL,b_10_SYMREAL,a_9_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((sin(g_15_SYMREAL)==sin(f_14_SYMREAL))) && ((sin(e_13_SYMREAL)>sin(f_14_SYMREAL))) && ((sin(d_12_SYMREAL)>sin(e_13_SYMREAL))) && ((sin(c_11_SYMREAL)>sin(d_12_SYMREAL))) && ((sin(b_10_SYMREAL)>sin(c_11_SYMREAL))) && ((sin(a_9_SYMREAL)>sin(b_10_SYMREAL)))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetPowTest.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.986 seconds.Solved.     
		functionName.add(" JpfTargetPowTest.main()_0");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("((x_1_SYMINT<=0))");
		initNum.add("0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.013 seconds.Solved.     
		functionName.add(" JpfTargetPowTest.main()_1");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT!=(x_1_SYMINT*x_1_SYMINT))) && ((x_1_SYMINT>0))");
		initNum.add("0.0,53.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.034 seconds.Solved.     
		functionName.add(" JpfTargetPowTest.main()_2");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT<=8)) && ((x_1_SYMINT>0))");
		initNum.add("-62.0,53.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.016 seconds.Solved.     null
		functionName.add(" JpfTargetPowTest.main()_3");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT>8)) && ((x_1_SYMINT>0))");
		initNum.add("39.0,53.0");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample41.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.629 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample41.main()_0");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((pow(x_3_SYMREAL, 2.0)<(x_3_SYMREAL+y_4_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample41.main()_1");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((pow(x_3_SYMREAL, 2.0)>(x_3_SYMREAL+y_4_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.435 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample41.main()_2");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((x_3_SYMREAL<-1.0)) && (((x_3_SYMREAL+y_4_SYMREAL)==pow(x_3_SYMREAL, 2.0)))");
		initNum.add("-20.4054620958,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.054 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample41.main()_3");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((x_3_SYMREAL>-1.0)) && (((x_3_SYMREAL+y_4_SYMREAL)==pow(x_3_SYMREAL, 2.0)))");
		initNum.add("0.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.338 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample41.main()_4");
		paraName.add("y_4_SYMREAL,x_3_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((y_4_SYMREAL<2.0)) && ((-1.0==x_3_SYMREAL)) && (((x_3_SYMREAL+y_4_SYMREAL)==pow(x_3_SYMREAL, 2.0)))");
		initNum.add("0.0,-1.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.248 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample41.main()_5");
		paraName.add("y_4_SYMREAL,x_3_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((y_4_SYMREAL>2.0)) && ((-1.0==x_3_SYMREAL)) && (((x_3_SYMREAL+y_4_SYMREAL)==pow(x_3_SYMREAL, 2.0)))");
		initNum.add("80.7905526728,-1.0");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetVector3DNormalize.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.816 seconds.Unsolved.     
		functionName.add(" JpfTargetVector3DNormalize.main()_0");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))<0.0))");
		initNum.add("");
		
		//Parse time: 0.001 seconds.Solve time: 0.002 seconds.Solved.     
		functionName.add(" JpfTargetVector3DNormalize.main()_1");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))>0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.033 seconds.Solved.     
		functionName.add(" JpfTargetVector3DNormalize.main()_2");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((1.0==(((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.083 seconds.Solved.     
		functionName.add(" JpfTargetVector3DNormalize.main()_3");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL)))!=0.0)) && (((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))<1.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.162 seconds.Unsolved.     
		functionName.add(" JpfTargetVector3DNormalize.main()_4");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL)))==0.0)) && (((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))<1.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.002 seconds.Solved.     
		functionName.add(" JpfTargetVector3DNormalize.main()_5");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL)))!=0.0)) && (((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))>1.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.119 seconds.Unsolved.     null
		functionName.add(" JpfTargetVector3DNormalize.main()_6");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL)))==0.0)) && (((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))>1.0))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample81.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.588 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample81.main()_0");
		paraName.add("a_3_SYMREAL,b_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((a_3_SYMREAL+-13.0)+((((5.0-b_4_SYMREAL)*b_4_SYMREAL)-2.0)*b_4_SYMREAL))+((a_3_SYMREAL+-29.0)+((((b_4_SYMREAL+1.0)*b_4_SYMREAL)-14.0)*b_4_SYMREAL)))<0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.005 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample81.main()_1");
		paraName.add("a_3_SYMREAL,b_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((a_3_SYMREAL+-13.0)+((((5.0-b_4_SYMREAL)*b_4_SYMREAL)-2.0)*b_4_SYMREAL))+((a_3_SYMREAL+-29.0)+((((b_4_SYMREAL+1.0)*b_4_SYMREAL)-14.0)*b_4_SYMREAL)))>0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.086 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample81.main()_2");
		paraName.add("a_3_SYMREAL,b_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(((a_3_SYMREAL+-13.0)+((((5.0-b_4_SYMREAL)*b_4_SYMREAL)-2.0)*b_4_SYMREAL))+((a_3_SYMREAL+-29.0)+((((b_4_SYMREAL+1.0)*b_4_SYMREAL)-14.0)*b_4_SYMREAL)))))");
		initNum.add("");
		
		

/*		 ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetCollision2.main().txt      ********
		//Parse time: 0.005 seconds.     null
		functionName.add(" JpfTargetCollision2.main()_0");
		paraName.add("z1_2_SYMINT,y1_1_SYMINT,z2_4_SYMINT,y2_3_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("(((z1_2_SYMINT+(31*(((32>>>y1_1_SYMINT)^y1_1_SYMINT)+31)))!=(z2_4_SYMINT+(31*(((32>>>y2_3_SYMINT)^y2_3_SYMINT)+62)))))");
		initNum.add("");
		*/
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample61.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.976 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample61.main()_0");
		paraName.add("w_8_SYMREAL");
		paraType.add("double");
		binaryExp.add("((w_8_SYMREAL!=0.0))");
		initNum.add("60.797046271");
		
		//Parse time: 0.0 seconds.Solve time: 0.017 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample61.main()_1");
		paraName.add("z_7_SYMREAL,w_8_SYMREAL,x_5_SYMREAL,y_6_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((z_7_SYMREAL/w_8_SYMREAL)==(x_5_SYMREAL+y_6_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("0.0,60.797046271,0.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.011 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample61.main()_2");
		paraName.add("x_5_SYMREAL,y_6_SYMREAL,z_7_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((x_5_SYMREAL+y_6_SYMREAL)<(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("0.0,0.0,0.0,60.797046271");
		
		//Parse time: 0.0 seconds.Solve time: 0.012 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample61.main()_3");
		paraName.add("y_6_SYMREAL,x_5_SYMREAL,z_7_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((y_6_SYMREAL!=0.0)) && (((x_5_SYMREAL+y_6_SYMREAL)>(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("32.5110817233,0.0,0.0,60.797046271");
		
		//Parse time: 0.0 seconds.Solve time: 0.072 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample61.main()_4");
		paraName.add("z_7_SYMREAL,y_6_SYMREAL,x_5_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((z_7_SYMREAL/y_6_SYMREAL)==exp(x_5_SYMREAL))) && ((y_6_SYMREAL!=0.0)) && (((x_5_SYMREAL+y_6_SYMREAL)>(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("0.0,32.5110817233,0.0,60.797046271");
		
		//Parse time: 0.0 seconds.Solve time: 0.517 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample61.main()_5");
		paraName.add("x_5_SYMREAL,z_7_SYMREAL,y_6_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((exp(x_5_SYMREAL)<(z_7_SYMREAL/y_6_SYMREAL))) && ((y_6_SYMREAL!=0.0)) && (((x_5_SYMREAL+y_6_SYMREAL)>(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("0.0,0.0,32.5110817233,60.797046271");
		
		//Parse time: 0.0 seconds.Solve time: 0.011 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample61.main()_6");
		paraName.add("z_7_SYMREAL,w_8_SYMREAL,x_5_SYMREAL,y_6_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((((2.0*z_7_SYMREAL)+(3.0*w_8_SYMREAL))+(7.0*x_5_SYMREAL))<pow(y_6_SYMREAL, 6.0))) && ((exp(x_5_SYMREAL)>(z_7_SYMREAL/y_6_SYMREAL))) && ((y_6_SYMREAL!=0.0)) && (((x_5_SYMREAL+y_6_SYMREAL)>(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("0.0,60.797046271,0.0,32.5110817233");
		
		//Parse time: 0.0 seconds.Solve time: 0.04 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample61.main()_7");
		paraName.add("z_7_SYMREAL,w_8_SYMREAL,x_5_SYMREAL,y_6_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((((2.0*z_7_SYMREAL)+(3.0*w_8_SYMREAL))+(7.0*x_5_SYMREAL))>pow(y_6_SYMREAL, 6.0))) && ((exp(x_5_SYMREAL)>(z_7_SYMREAL/y_6_SYMREAL))) && ((y_6_SYMREAL!=0.0)) && (((x_5_SYMREAL+y_6_SYMREAL)>(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("0.0,60.797046271,0.0,32.5110817233");
		
		//Parse time: 0.0 seconds.Solve time: 0.14 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample61.main()_8");
		paraName.add("x_5_SYMREAL,y_6_SYMREAL,z_7_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((x_5_SYMREAL+y_6_SYMREAL)==(z_7_SYMREAL+w_8_SYMREAL))) && (((((2.0*z_7_SYMREAL)+(3.0*w_8_SYMREAL))+(7.0*x_5_SYMREAL))<pow(y_6_SYMREAL, 6.0))) && ((exp(x_5_SYMREAL)>(z_7_SYMREAL/y_6_SYMREAL))) && ((y_6_SYMREAL!=0.0)) && (((x_5_SYMREAL+y_6_SYMREAL)>(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("5.918109417199993,32.5110817233,-22.3678551305,60.797046271");
		
		//Parse time: 0.0 seconds.Solve time: 0.02 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample61.main()_9");
		paraName.add("z_7_SYMREAL,w_8_SYMREAL,x_5_SYMREAL,y_6_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((z_7_SYMREAL+w_8_SYMREAL)<(x_5_SYMREAL+y_6_SYMREAL))) && (((((2.0*z_7_SYMREAL)+(3.0*w_8_SYMREAL))+(7.0*x_5_SYMREAL))<pow(y_6_SYMREAL, 6.0))) && ((exp(x_5_SYMREAL)>(z_7_SYMREAL/y_6_SYMREAL))) && ((y_6_SYMREAL!=0.0)) && (((x_5_SYMREAL+y_6_SYMREAL)>(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("-93.4393991486,-57.4635159315,40.5388993356,-33.5031885235");
		
		//Parse time: 0.0 seconds.Solve time: 0.011 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample61.main()_10");
		paraName.add("w_8_SYMREAL,x_5_SYMREAL,y_6_SYMREAL,z_7_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((w_8_SYMREAL<(x_5_SYMREAL/y_6_SYMREAL))) && (((z_7_SYMREAL+w_8_SYMREAL)>(x_5_SYMREAL+y_6_SYMREAL))) && (((((2.0*z_7_SYMREAL)+(3.0*w_8_SYMREAL))+(7.0*x_5_SYMREAL))<pow(y_6_SYMREAL, 6.0))) && ((exp(x_5_SYMREAL)>(z_7_SYMREAL/y_6_SYMREAL))) && ((y_6_SYMREAL!=0.0)) && (((x_5_SYMREAL+y_6_SYMREAL)>(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("60.797046271,-5.3977866378,32.5110817233,-22.3678551305");
		
		//Parse time: 0.0 seconds.Solve time: 0.026 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample61.main()_11");
		paraName.add("w_8_SYMREAL,x_5_SYMREAL,y_6_SYMREAL,z_7_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((w_8_SYMREAL>(x_5_SYMREAL/y_6_SYMREAL))) && (((z_7_SYMREAL+w_8_SYMREAL)>(x_5_SYMREAL+y_6_SYMREAL))) && (((((2.0*z_7_SYMREAL)+(3.0*w_8_SYMREAL))+(7.0*x_5_SYMREAL))<pow(y_6_SYMREAL, 6.0))) && ((exp(x_5_SYMREAL)>(z_7_SYMREAL/y_6_SYMREAL))) && ((y_6_SYMREAL!=0.0)) && (((x_5_SYMREAL+y_6_SYMREAL)>(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("60.797046271,-5.3977866378,32.5110817233,-22.3678551305");
		
		//Parse time: 0.0 seconds.Solve time: 0.146 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample61.main()_12");
		paraName.add("x_5_SYMREAL,y_6_SYMREAL,w_8_SYMREAL,z_7_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((x_5_SYMREAL/y_6_SYMREAL)==w_8_SYMREAL)) && (((z_7_SYMREAL+w_8_SYMREAL)>(x_5_SYMREAL+y_6_SYMREAL))) && (((((2.0*z_7_SYMREAL)+(3.0*w_8_SYMREAL))+(7.0*x_5_SYMREAL))<pow(y_6_SYMREAL, 6.0))) && ((exp(x_5_SYMREAL)>(z_7_SYMREAL/y_6_SYMREAL))) && ((y_6_SYMREAL!=0.0)) && (((x_5_SYMREAL+y_6_SYMREAL)>(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("-5.3977866378,32.5110817233,60.797046271,-22.3678551305");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" coral.tests.samples.Sample61.main()_13");
		paraName.add("y_6_SYMREAL,z_7_SYMREAL,w_8_SYMREAL,x_5_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((y_6_SYMREAL==0.0)) && (((z_7_SYMREAL+w_8_SYMREAL)>(x_5_SYMREAL+y_6_SYMREAL))) && (((((2.0*z_7_SYMREAL)+(3.0*w_8_SYMREAL))+(7.0*x_5_SYMREAL))<pow(y_6_SYMREAL, 6.0))) && ((exp(x_5_SYMREAL)>(z_7_SYMREAL/y_6_SYMREAL))) && ((y_6_SYMREAL!=0.0)) && (((x_5_SYMREAL+y_6_SYMREAL)>(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.008 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample61.main()_14");
		paraName.add("y_6_SYMREAL,x_5_SYMREAL,z_7_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((y_6_SYMREAL==0.0)) && (((x_5_SYMREAL+y_6_SYMREAL)>(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("0.0,0.0,0.0,60.797046271");
		
		//Parse time: 0.0 seconds.Solve time: 0.001 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample61.main()_15");
		paraName.add("w_8_SYMREAL");
		paraType.add("double");
		binaryExp.add("((w_8_SYMREAL==0.0))");
		initNum.add("0.0");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample50.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.659 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample50.main()_0");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((pow(x_3_SYMREAL, 2.0)+(3.0*exp(y_4_SYMREAL)))<(x_3_SYMREAL*y_4_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample50.main()_1");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((pow(x_3_SYMREAL, 2.0)+(3.0*exp(y_4_SYMREAL)))>(x_3_SYMREAL*y_4_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.268 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample50.main()_2");
		paraName.add("y_4_SYMREAL,x_3_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((pow(y_4_SYMREAL, 2.0)==x_3_SYMREAL)) && (((pow(x_3_SYMREAL, 2.0)+(3.0*exp(y_4_SYMREAL)))<(x_3_SYMREAL*y_4_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.001 seconds.Solve time: 0.43 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample50.main()_3");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((x_3_SYMREAL+y_4_SYMREAL)<50.0)) && (((pow(x_3_SYMREAL, 2.0)+(3.0*exp(y_4_SYMREAL)))<(x_3_SYMREAL*y_4_SYMREAL)))");
		initNum.add("0.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.131 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample50.main()_4");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((x_3_SYMREAL+y_4_SYMREAL)>50.0)) && (((pow(x_3_SYMREAL, 2.0)+(3.0*exp(y_4_SYMREAL)))<(x_3_SYMREAL*y_4_SYMREAL)))");
		initNum.add("60.797046271,32.5110817233");
		
		//Parse time: 0.0 seconds.Solve time: 0.134 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample50.main()_5");
		paraName.add("y_4_SYMREAL,x_3_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((y_4_SYMREAL+-13.0)==x_3_SYMREAL)) && (((pow(x_3_SYMREAL, 2.0)+(3.0*exp(y_4_SYMREAL)))<(x_3_SYMREAL*y_4_SYMREAL)))");
		initNum.add("13.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.035 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample50.main()_6");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((pow(x_3_SYMREAL, 2.0)+(3.0*exp(y_4_SYMREAL)))<(x_3_SYMREAL*y_4_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.002 seconds.Solved.     null
		functionName.add(" coral.tests.samples.Sample50.main()_7");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((pow(x_3_SYMREAL, 2.0)+(3.0*exp(y_4_SYMREAL)))>(x_3_SYMREAL*y_4_SYMREAL)))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample10.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.585 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample10.main()_0");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((sin((x_4_SYMREAL*cos((y_5_SYMREAL*sin(z_6_SYMREAL)))))<cos((x_4_SYMREAL*sin((y_5_SYMREAL*cos(z_6_SYMREAL)))))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.005 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample10.main()_1");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((sin((x_4_SYMREAL*cos((y_5_SYMREAL*sin(z_6_SYMREAL)))))>cos((x_4_SYMREAL*sin((y_5_SYMREAL*cos(z_6_SYMREAL)))))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.044 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample10.main()_2");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((cos((x_4_SYMREAL*sin((y_5_SYMREAL*cos(z_6_SYMREAL)))))==sin((x_4_SYMREAL*cos((y_5_SYMREAL*sin(z_6_SYMREAL)))))))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetEarly.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.972 seconds.Solved.     
		functionName.add(" JpfTargetEarly.main()_0");
		paraName.add("b_2_SYMINT");
		paraType.add("int");
		binaryExp.add("((b_2_SYMINT<=2))");
		initNum.add("0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.013 seconds.Solved.     
		functionName.add(" JpfTargetEarly.main()_1");
		paraName.add("b_2_SYMINT,a_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((b_2_SYMINT!=(b_2_SYMINT*a_1_SYMINT))) && ((b_2_SYMINT>2))");
		initNum.add("46.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.16 seconds.Solved.     null
		functionName.add(" JpfTargetEarly.main()_2");
		paraName.add("b_2_SYMINT,a_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((b_2_SYMINT==(b_2_SYMINT*a_1_SYMINT))) && ((b_2_SYMINT>2))");
		initNum.add("46.0,0.0");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample48.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.979 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample48.main()_0");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((x_4_SYMREAL+y_5_SYMREAL)<z_6_SYMREAL))");
		initNum.add("-82.9957586961,-13.3289411448,30.2537847547");
		
		//Parse time: 0.0 seconds.Solve time: 0.013 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample48.main()_1");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((x_4_SYMREAL+y_5_SYMREAL)>z_6_SYMREAL))");
		initNum.add("60.797046271,32.5110817233,-22.3678551305");
		
		//Parse time: 0.0 seconds.Solve time: 0.013 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample48.main()_2");
		paraName.add("z_6_SYMREAL,x_4_SYMREAL,y_5_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((z_6_SYMREAL==(x_4_SYMREAL+y_5_SYMREAL)))");
		initNum.add("0.0,0.0,0.0");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/tsafe.TurnLogic.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.983 seconds.Solved.     
		functionName.add(" tsafe.TurnLogic.main()_0");
		paraName.add("x0_1_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		initNum.add("75.6681948301,84.7043959458");
		
		//Parse time: 0.0 seconds.Solve time: 0.012 seconds.Solved.     
		functionName.add(" tsafe.TurnLogic.main()_1");
		paraName.add("x0_1_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((x0_1_SYMREAL-x1_4_SYMREAL)>0.0))");
		initNum.add("47.8386982149,-6.8509106908");
		
		//Parse time: 0.001 seconds.Solve time: 0.472 seconds.Unsolved.     
		functionName.add(" tsafe.TurnLogic.main()_2");
		paraName.add("y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((0.0==(1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL))))) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		initNum.add("0.0,0.0,75.6681948301,84.7043959458");
		
		//Parse time: 0.0 seconds.Solve time: 0.013 seconds.Solved.     
		functionName.add(" tsafe.TurnLogic.main()_3");
		paraName.add("y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		initNum.add("0.0,0.0,75.6681948301,84.7043959458");
		
		//Parse time: 0.0 seconds.Solve time: 0.32 seconds.Unsolved.     
		functionName.add(" tsafe.TurnLogic.main()_4");
		paraName.add("y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)>6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		initNum.add("0.0,0.0,75.6681948301,84.7043959458");
		
		//Parse time: 0.0 seconds.Solve time: 0.067 seconds.Solved.     
		functionName.add(" tsafe.TurnLogic.main()_5");
		paraName.add("x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((0.0==(x1_4_SYMREAL-x2_6_SYMREAL))) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		initNum.add("84.7043959458,84.7043959458,0.0,0.0,75.6681948301");
		
		//Parse time: 0.0 seconds.Solve time: 7.542 seconds.Unsolved.     
		functionName.add(" tsafe.TurnLogic.main()_6");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))<0.0)) && (((x1_4_SYMREAL-x2_6_SYMREAL)<0.0)) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		initNum.add("0.0,0.0,-69.4462632631,-37.3719312012,0.0,-88.2511826472");
		
		//Parse time: 0.0 seconds.Solve time: 0.324 seconds.Unsolved.     
		functionName.add(" tsafe.TurnLogic.main()_7");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))>0.0)) && (((x1_4_SYMREAL-x2_6_SYMREAL)<0.0)) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		initNum.add("0.0,0.0,-69.4462632631,-37.3719312012,0.0,-88.2511826472");
		
		//Parse time: 0.001 seconds.Solve time: 0.015 seconds.Solved.     
		functionName.add(" tsafe.TurnLogic.main()_8");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((0.0==(y1_5_SYMREAL-y2_7_SYMREAL))) && ((0.0==(x1_4_SYMREAL-x2_6_SYMREAL))) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		initNum.add("47.8386982149,47.8386982149,84.7043959458,84.7043959458,0.0,75.6681948301");
		
		//Parse time: 0.0 seconds.Solve time: 0.201 seconds.Unsolved.     
		functionName.add(" tsafe.TurnLogic.main()_9");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))<0.0)) && (((y1_5_SYMREAL-y2_7_SYMREAL)<0.0)) && ((0.0==(x1_4_SYMREAL-x2_6_SYMREAL))) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		initNum.add("48.0593596421,72.7577812675,48.1407506422,48.1407506422,0.0,-57.0906825371");
		
		//Parse time: 0.0 seconds.Solve time: 0.073 seconds.Solved.     
		functionName.add(" tsafe.TurnLogic.main()_10");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))>0.0)) && (((y1_5_SYMREAL-y2_7_SYMREAL)<0.0)) && ((0.0==(x1_4_SYMREAL-x2_6_SYMREAL))) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		initNum.add("48.0593596421,72.7577812675,48.1407506422,48.1407506422,0.0,-57.0906825371");
		
		//Parse time: 0.0 seconds.Solve time: 17.609 seconds.Unsolved.     
		functionName.add(" tsafe.TurnLogic.main()_11");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((6.283185307179586==(1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL))))) && (((y1_5_SYMREAL-y2_7_SYMREAL)<0.0)) && ((0.0==(x1_4_SYMREAL-x2_6_SYMREAL))) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		initNum.add("48.0593596421,72.7577812675,48.1407506422,48.1407506422,0.0,-57.0906825371");
		
		

/*		 ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetCollision3.main().txt      ********
		//Parse time: 0.005 seconds.     null
		functionName.add(" JpfTargetCollision3.main()_0");
		paraName.add("y1_1_SYMINT,y2_2_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((((31*(((32>>>y1_1_SYMINT)^y1_1_SYMINT)+38254))+3141)!=((31*(((32>>>y2_2_SYMINT)^y2_2_SYMINT)+176018))+3141)))");
		initNum.add("");*/
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetWood.main().txt      *********/
		//Parse time: 0.005 seconds.Solve time: 0.582 seconds.Solved.     
		functionName.add(" JpfTargetWood.main()_0");
		paraName.add("x2_2_SYMREAL,x1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))<0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.004 seconds.Solved.     
		functionName.add(" JpfTargetWood.main()_1");
		paraName.add("x2_2_SYMREAL,x1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))>0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.502 seconds.Solved.     
		functionName.add(" JpfTargetWood.main()_2");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.0-x1_1_SYMREAL)<0.0)) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		initNum.add("16.7554430088,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.034 seconds.Solved.     
		functionName.add(" JpfTargetWood.main()_3");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.0-x1_1_SYMREAL)>0.0)) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		initNum.add("0.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.21 seconds.Solved.     
		functionName.add(" JpfTargetWood.main()_4");
		paraName.add("x4_4_SYMREAL,x3_3_SYMREAL,x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((9.486832980505138*(x4_4_SYMREAL-(x3_3_SYMREAL*x3_3_SYMREAL)))<0.0)) && ((0.0==(1.0-x1_1_SYMREAL))) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		initNum.add("0.0,0.0,1.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.113 seconds.Solved.     
		functionName.add(" JpfTargetWood.main()_5");
		paraName.add("x4_4_SYMREAL,x3_3_SYMREAL,x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((9.486832980505138*(x4_4_SYMREAL-(x3_3_SYMREAL*x3_3_SYMREAL)))>0.0)) && ((0.0==(1.0-x1_1_SYMREAL))) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		initNum.add("0.0,0.0,1.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.08 seconds.Solved.     
		functionName.add(" JpfTargetWood.main()_6");
		paraName.add("x3_3_SYMREAL,x4_4_SYMREAL,x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((1.0-x3_3_SYMREAL)<0.0)) && ((0.0==(9.486832980505138*(x4_4_SYMREAL-(x3_3_SYMREAL*x3_3_SYMREAL))))) && ((0.0==(1.0-x1_1_SYMREAL))) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		initNum.add("6.104766968321475,0.0,1.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.071 seconds.Solved.     
		functionName.add(" JpfTargetWood.main()_7");
		paraName.add("x3_3_SYMREAL,x4_4_SYMREAL,x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((1.0-x3_3_SYMREAL)>0.0)) && ((0.0==(9.486832980505138*(x4_4_SYMREAL-(x3_3_SYMREAL*x3_3_SYMREAL))))) && ((0.0==(1.0-x1_1_SYMREAL))) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		initNum.add("-1.0,0.0,-1.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.098 seconds.Solved.     
		functionName.add(" JpfTargetWood.main()_8");
		paraName.add("x3_3_SYMREAL,x4_4_SYMREAL,x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((1.0-x3_3_SYMREAL)>0.0)) && ((0.0==(9.486832980505138*(x4_4_SYMREAL-(x3_3_SYMREAL*x3_3_SYMREAL))))) && ((0.0==(1.0-x1_1_SYMREAL))) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		initNum.add("-2.587797214967705,0.0,1.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.019 seconds.Solved.     
		functionName.add(" JpfTargetWood.main()_9");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.0-x1_1_SYMREAL)>0.0)) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		initNum.add("0.0,0.0");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetHelicalValley.main().txt      *********/
		//Parse time: 0.005 seconds.Solve time: 0.999 seconds.Solved.     
		functionName.add(" JpfTargetHelicalValley.main()_0");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((x1_4_SYMREAL<0.0))");
		initNum.add("-41.6222784955");
		
		//Parse time: 0.0 seconds.Solve time: 0.015 seconds.Solved.     
		functionName.add(" JpfTargetHelicalValley.main()_1");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((x1_4_SYMREAL>0.0))");
		initNum.add("58.3777215044");
		
		//Parse time: 0.001 seconds.     
		functionName.add(" JpfTargetHelicalValley.main()_2");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((0.0==x1_4_SYMREAL)) && ((x1_4_SYMREAL<0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.014 seconds.Solved.     
		functionName.add(" JpfTargetHelicalValley.main()_3");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");
		initNum.add("-1.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.114 seconds.Solved.     
		functionName.add(" JpfTargetHelicalValley.main()_4");
		paraName.add("x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5))))<0.0)) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");
		initNum.add("0.0,0.0,-41.6222784955");
		
		//Parse time: 0.0 seconds.Solve time: 0.017 seconds.Solved.     
		functionName.add(" JpfTargetHelicalValley.main()_5");
		paraName.add("x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5))))>0.0)) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");
		initNum.add("0.0,0.0,-41.6222784955");
		
		//Parse time: 0.0 seconds.Solve time: 0.561 seconds.Unsolved.     
		functionName.add(" JpfTargetHelicalValley.main()_6");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL,x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("(((10.0*(exp(((x1_1_SYMREAL*x1_1_SYMREAL)+(x2_2_SYMREAL*x2_2_SYMREAL)))-1.0))<0.0)) && ((0.0==(10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5)))))) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");
		initNum.add("0.0,0.0,0.0,0.0,-41.6222784955");
		
		//Parse time: 0.0 seconds.Solve time: 0.506 seconds.Unsolved.     
		functionName.add(" JpfTargetHelicalValley.main()_7");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL,x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("(((10.0*(exp(((x1_1_SYMREAL*x1_1_SYMREAL)+(x2_2_SYMREAL*x2_2_SYMREAL)))-1.0))>0.0)) && ((0.0==(10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5)))))) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");
		initNum.add("0.0,0.0,0.0,0.0,-41.6222784955");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetHelicalValley.main()_8");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((x1_4_SYMREAL==0.0)) && ((x1_4_SYMREAL<0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.nullnull     null
		functionName.add(" JpfTargetHelicalValley.main()_9");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((0.0==x1_4_SYMREAL))");
		initNum.add("-1.0");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample39.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.587 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample39.main()_0");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((pow(x_3_SYMREAL, y_4_SYMREAL)<1.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.005 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample39.main()_1");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((pow(x_3_SYMREAL, y_4_SYMREAL)>1.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.065 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample39.main()_2");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((1.0==pow(x_3_SYMREAL, y_4_SYMREAL)))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetRayTrace.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.769 seconds.Unsolved.     
		functionName.add(" JpfTargetRayTrace.main()_0");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.002 seconds.Solved.     
		functionName.add(" JpfTargetRayTrace.main()_1");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))>0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.045 seconds.Solved.     
		functionName.add(" JpfTargetRayTrace.main()_2");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((1.0==(((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.062 seconds.Solved.     
		functionName.add(" JpfTargetRayTrace.main()_3");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 1.385 seconds.Unsolved.     
		functionName.add(" JpfTargetRayTrace.main()_4");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((3.4028234663852886E38==(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-r_4_SYMREAL))) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.065 seconds.Solved.     
		functionName.add(" JpfTargetRayTrace.main()_5");
		paraName.add("r_4_SYMREAL,dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))<0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.233 seconds.Solved.     
		functionName.add(" JpfTargetRayTrace.main()_6");
		paraName.add("r_4_SYMREAL,dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 1.403 seconds.Solved.     
		functionName.add(" JpfTargetRayTrace.main()_7");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-exp((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))<3.4028234663852886E38)) && (((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 3.217 seconds.Unsolved.     
		functionName.add(" JpfTargetRayTrace.main()_8");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-exp((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))>3.4028234663852886E38)) && (((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 4.649 seconds.Unsolved.     
		functionName.add(" JpfTargetRayTrace.main()_9");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((0.0==(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-exp((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL))))))) && (((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.048 seconds.Solved.     
		functionName.add(" JpfTargetRayTrace.main()_10");
		paraName.add("r_4_SYMREAL,dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample07.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.588 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample07.main()_0");
		paraName.add("y_6_SYMREAL");
		paraType.add("double");
		binaryExp.add("(((cos(((2.0*y_6_SYMREAL)+y_6_SYMREAL))+1.0)!=0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.007 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample07.main()_1");
		paraName.add("x_5_SYMREAL,y_6_SYMREAL,z_7_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((sin(((2.0*x_5_SYMREAL)-y_6_SYMREAL))/(cos(((2.0*y_6_SYMREAL)+y_6_SYMREAL))+1.0))<(cos(((2.0*z_7_SYMREAL)+x_5_SYMREAL))/(sin(((2.0*w_8_SYMREAL)+y_6_SYMREAL))-1.0)))) && (((sin(((2.0*w_8_SYMREAL)+y_6_SYMREAL))-1.0)!=0.0)) && (((cos(((2.0*y_6_SYMREAL)+y_6_SYMREAL))+1.0)!=0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.005 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample07.main()_2");
		paraName.add("x_5_SYMREAL,y_6_SYMREAL,z_7_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((sin(((2.0*x_5_SYMREAL)-y_6_SYMREAL))/(cos(((2.0*y_6_SYMREAL)+y_6_SYMREAL))+1.0))>(cos(((2.0*z_7_SYMREAL)+x_5_SYMREAL))/(sin(((2.0*w_8_SYMREAL)+y_6_SYMREAL))-1.0)))) && (((sin(((2.0*w_8_SYMREAL)+y_6_SYMREAL))-1.0)!=0.0)) && (((cos(((2.0*y_6_SYMREAL)+y_6_SYMREAL))+1.0)!=0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.108 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample07.main()_3");
		paraName.add("z_7_SYMREAL,x_5_SYMREAL,w_8_SYMREAL,y_6_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((cos(((2.0*z_7_SYMREAL)+x_5_SYMREAL))/(sin(((2.0*w_8_SYMREAL)+y_6_SYMREAL))-1.0))==(sin(((2.0*x_5_SYMREAL)-y_6_SYMREAL))/(cos(((2.0*y_6_SYMREAL)+y_6_SYMREAL))+1.0)))) && (((sin(((2.0*w_8_SYMREAL)+y_6_SYMREAL))-1.0)!=0.0)) && (((cos(((2.0*y_6_SYMREAL)+y_6_SYMREAL))+1.0)!=0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.304 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample07.main()_4");
		paraName.add("w_8_SYMREAL,y_6_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((sin(((2.0*w_8_SYMREAL)+y_6_SYMREAL))-1.0)==0.0)) && (((cos(((2.0*y_6_SYMREAL)+y_6_SYMREAL))+1.0)!=0.0))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample12.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 1.054 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample12.main()_0");
		paraName.add("x_5_SYMREAL,y_6_SYMREAL,z_7_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((((asin(x_5_SYMREAL)*asin(y_6_SYMREAL))-1.0)<(atan(z_7_SYMREAL)*atan(w_8_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.173 seconds.Unsolved.     null
		functionName.add(" coral.tests.samples.Sample12.main()_1");
		paraName.add("x_5_SYMREAL,y_6_SYMREAL,z_7_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((((asin(x_5_SYMREAL)*asin(y_6_SYMREAL))-1.0)>(atan(z_7_SYMREAL)*atan(w_8_SYMREAL))))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample78.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.592 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample78.main()_0");
		paraName.add("e_13_SYMREAL");
		paraType.add("double");
		binaryExp.add("((cos((0.017453292519943295*e_13_SYMREAL))!=0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.376 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample78.main()_1");
		paraName.add("d_12_SYMREAL,e_13_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((d_12_SYMREAL!=0.0)) && (((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0))");
		initNum.add("60.797046271,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.016 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample78.main()_2");
		paraName.add("e_13_SYMREAL,d_12_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0)) && ((d_12_SYMREAL!=0.0)) && (((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0))");
		initNum.add("0.0,60.797046271");
		
		//Parse time: 0.0 seconds.Solve time: 0.018 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample78.main()_3");
		paraName.add("e_13_SYMREAL,a_9_SYMREAL,d_12_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((cos((0.017453292519943295*e_13_SYMREAL))!=0.0)) && ((((pow(a_9_SYMREAL, 2.0)/(sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL))))/68443.0)!=0.0)) && (((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0)) && ((d_12_SYMREAL!=0.0)) && (((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0))");
		initNum.add("0.0,0.0,60.797046271");
		
		//Parse time: 0.0 seconds.Solve time: 0.017 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample78.main()_4");
		paraName.add("e_13_SYMREAL,a_9_SYMREAL,d_12_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0)) && ((((pow(a_9_SYMREAL, 2.0)/(sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL))))/68443.0)!=0.0)) && (((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0)) && ((d_12_SYMREAL!=0.0)) && (((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0))");
		initNum.add("0.0,0.0,60.797046271");
		
		//Parse time: 0.0 seconds.Solve time: 0.018 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample78.main()_5");
		paraName.add("e_13_SYMREAL,a_9_SYMREAL,d_12_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0)) && (((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0)) && ((((pow(a_9_SYMREAL, 2.0)/(sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL))))/68443.0)!=0.0)) && (((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0)) && ((d_12_SYMREAL!=0.0)) && (((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0))");
		initNum.add("0.0,0.0,60.797046271");
		
		//Parse time: 0.001 seconds.Solve time: 0.029 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample78.main()_6");
		paraName.add("a_9_SYMREAL,b_10_SYMREAL,c_11_SYMREAL,d_12_SYMREAL,e_13_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((0.0<(pow(((a_9_SYMREAL*sin((((0.017453292519943295*b_10_SYMREAL)-(0.017453292519943295*c_11_SYMREAL))+(((-1.0*((0.0*((pow(d_12_SYMREAL, 2.0)/(sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL))))/68443.0))/d_12_SYMREAL))*a_9_SYMREAL)/((pow(a_9_SYMREAL, 2.0)/(sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL))))/68443.0)))))-(0.0*d_12_SYMREAL)), 2.0)+pow(((a_9_SYMREAL*cos((((0.017453292519943295*b_10_SYMREAL)-(0.017453292519943295*c_11_SYMREAL))+(((-1.0*((0.0*((pow(d_12_SYMREAL, 2.0)/(sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL))))/68443.0))/d_12_SYMREAL))*a_9_SYMREAL)/((pow(a_9_SYMREAL, 2.0)/(sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL))))/68443.0)))))-(1.0*d_12_SYMREAL)), 2.0)))) && ((((pow(a_9_SYMREAL, 2.0)/(sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL))))/68443.0)!=0.0)) && (((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0)) && (((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0)) && ((((pow(a_9_SYMREAL, 2.0)/(sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL))))/68443.0)!=0.0)) && (((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0)) && ((d_12_SYMREAL!=0.0)) && (((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0))");
		initNum.add("0.0,0.0,0.0,60.797046271,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.921 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample78.main()_7");
		paraName.add("a_9_SYMREAL,b_10_SYMREAL,c_11_SYMREAL,d_12_SYMREAL,e_13_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((0.0>(pow(((a_9_SYMREAL*sin((((0.017453292519943295*b_10_SYMREAL)-(0.017453292519943295*c_11_SYMREAL))+(((-1.0*((0.0*((pow(d_12_SYMREAL, 2.0)/(sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL))))/68443.0))/d_12_SYMREAL))*a_9_SYMREAL)/((pow(a_9_SYMREAL, 2.0)/(sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL))))/68443.0)))))-(0.0*d_12_SYMREAL)), 2.0)+pow(((a_9_SYMREAL*cos((((0.017453292519943295*b_10_SYMREAL)-(0.017453292519943295*c_11_SYMREAL))+(((-1.0*((0.0*((pow(d_12_SYMREAL, 2.0)/(sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL))))/68443.0))/d_12_SYMREAL))*a_9_SYMREAL)/((pow(a_9_SYMREAL, 2.0)/(sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL))))/68443.0)))))-(1.0*d_12_SYMREAL)), 2.0)))) && ((((pow(a_9_SYMREAL, 2.0)/(sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL))))/68443.0)!=0.0)) && (((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0)) && (((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0)) && ((((pow(a_9_SYMREAL, 2.0)/(sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL))))/68443.0)!=0.0)) && (((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0)) && ((d_12_SYMREAL!=0.0)) && (((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0))");
		initNum.add("0.0,0.0,0.0,60.797046271,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.127 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample78.main()_8");
		paraName.add("a_9_SYMREAL,e_13_SYMREAL,d_12_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((((pow(a_9_SYMREAL, 2.0)/(sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL))))/68443.0)==0.0)) && (((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0)) && (((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0)) && ((((pow(a_9_SYMREAL, 2.0)/(sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL))))/68443.0)!=0.0)) && (((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0)) && ((d_12_SYMREAL!=0.0)) && (((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0))");
		initNum.add("0.0,0.0,60.797046271");
		
		//Parse time: 0.0 seconds.nullnull     null
		functionName.add(" coral.tests.samples.Sample78.main()_9");
		paraName.add("e_13_SYMREAL,a_9_SYMREAL,d_12_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((cos((0.017453292519943295*e_13_SYMREAL))==0.0)) && (((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0)) && ((((pow(a_9_SYMREAL, 2.0)/(sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL))))/68443.0)!=0.0)) && (((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0)) && ((d_12_SYMREAL!=0.0)) && (((sin((0.017453292519943295*e_13_SYMREAL))/cos((0.017453292519943295*e_13_SYMREAL)))!=0.0)) && ((cos((0.017453292519943295*e_13_SYMREAL))!=0.0))");
		initNum.add("0.0,0.0,60.797046271");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample34.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.589 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample34.main()_0");
		paraName.add("x_2_SYMREAL");
		paraType.add("double");
		binaryExp.add("((exp(sin(x_2_SYMREAL))<exp(cos(x_2_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample34.main()_1");
		paraName.add("x_2_SYMREAL");
		paraType.add("double");
		binaryExp.add("((exp(sin(x_2_SYMREAL))>exp(cos(x_2_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.005 seconds.Solved.     null
		functionName.add(" coral.tests.samples.Sample34.main()_2");
		paraName.add("x_2_SYMREAL");
		paraType.add("double");
		binaryExp.add("((exp(sin(x_2_SYMREAL))>exp(cos(x_2_SYMREAL))))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample52.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.666 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample52.main()_0");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((pow(x_4_SYMREAL, tan(y_5_SYMREAL))+z_6_SYMREAL)<(x_4_SYMREAL*atan(z_6_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample52.main()_1");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((pow(x_4_SYMREAL, tan(y_5_SYMREAL))+z_6_SYMREAL)>(x_4_SYMREAL*atan(z_6_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.3 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample52.main()_2");
		paraName.add("x_4_SYMREAL,z_6_SYMREAL,y_5_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((x_4_SYMREAL-z_6_SYMREAL)==((sin(y_5_SYMREAL)+cos(y_5_SYMREAL))+tan(y_5_SYMREAL)))) && (((pow(x_4_SYMREAL, tan(y_5_SYMREAL))+z_6_SYMREAL)<(x_4_SYMREAL*atan(z_6_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.047 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample52.main()_3");
		paraName.add("y_5_SYMREAL,x_4_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((((sin(y_5_SYMREAL)+cos(y_5_SYMREAL))+tan(y_5_SYMREAL))<(x_4_SYMREAL-z_6_SYMREAL))) && (((pow(x_4_SYMREAL, tan(y_5_SYMREAL))+z_6_SYMREAL)<(x_4_SYMREAL*atan(z_6_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.007 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample52.main()_4");
		paraName.add("x_4_SYMREAL,z_6_SYMREAL,y_5_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((x_4_SYMREAL*atan(z_6_SYMREAL))==(pow(x_4_SYMREAL, tan(y_5_SYMREAL))+z_6_SYMREAL)))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample29.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.587 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample29.main()_0");
		paraName.add("x_2_SYMREAL");
		paraType.add("double");
		binaryExp.add("((exp(x_2_SYMREAL)<5.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample29.main()_1");
		paraName.add("x_2_SYMREAL");
		paraType.add("double");
		binaryExp.add("((exp(x_2_SYMREAL)>5.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.002 seconds.Solved.     null
		functionName.add(" coral.tests.samples.Sample29.main()_2");
		paraName.add("x_2_SYMREAL");
		paraType.add("double");
		binaryExp.add("((exp(x_2_SYMREAL)>5.0))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample45.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.579 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample45.main()_0");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp(exp((x_4_SYMREAL+y_5_SYMREAL)))<pow(z_6_SYMREAL, x_4_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample45.main()_1");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp(exp((x_4_SYMREAL+y_5_SYMREAL)))>pow(z_6_SYMREAL, x_4_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.27 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample45.main()_2");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((0.0==x_4_SYMREAL)) && ((exp(exp((x_4_SYMREAL+y_5_SYMREAL)))<pow(z_6_SYMREAL, x_4_SYMREAL)))");
		initNum.add("0.0,0.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.282 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample45.main()_3");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((x_4_SYMREAL<0.0)) && ((exp(exp((x_4_SYMREAL+y_5_SYMREAL)))<pow(z_6_SYMREAL, x_4_SYMREAL)))");
		initNum.add("-19.6014768644,0.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.077 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample45.main()_4");
		paraName.add("y_5_SYMREAL,x_4_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((1.0==y_5_SYMREAL)) && ((x_4_SYMREAL>0.0)) && ((exp(exp((x_4_SYMREAL+y_5_SYMREAL)))<pow(z_6_SYMREAL, x_4_SYMREAL)))");
		initNum.add("1.0,80.3985231355,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.032 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample45.main()_5");
		paraName.add("y_5_SYMREAL,x_4_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((y_5_SYMREAL<1.0)) && ((x_4_SYMREAL>0.0)) && ((exp(exp((x_4_SYMREAL+y_5_SYMREAL)))<pow(z_6_SYMREAL, x_4_SYMREAL)))");
		initNum.add("-33.0819037297,80.3985231355,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.316 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample45.main()_6");
		paraName.add("z_6_SYMREAL,y_5_SYMREAL,x_4_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((z_6_SYMREAL<1.0)) && ((y_5_SYMREAL>1.0)) && ((x_4_SYMREAL>0.0)) && ((exp(exp((x_4_SYMREAL+y_5_SYMREAL)))<pow(z_6_SYMREAL, x_4_SYMREAL)))");
		initNum.add("-60.7957668409,66.592985453,80.3985231355");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample70.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.589 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample70.main()_0");
		paraName.add("a_25_SYMREAL,b_26_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(a_25_SYMREAL)<sin(b_26_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample70.main()_1");
		paraName.add("a_25_SYMREAL,b_26_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(a_25_SYMREAL)>sin(b_26_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.067 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample70.main()_2");
		paraName.add("b_26_SYMREAL,a_25_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(b_26_SYMREAL)==sin(a_25_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.037 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample70.main()_3");
		paraName.add("c_27_SYMREAL,b_26_SYMREAL,a_25_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((sin(c_27_SYMREAL)==sin(b_26_SYMREAL))) && ((sin(a_25_SYMREAL)>sin(b_26_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.002 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample70.main()_4");
		paraName.add("b_26_SYMREAL,c_27_SYMREAL,a_25_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((sin(b_26_SYMREAL)<sin(c_27_SYMREAL))) && ((sin(a_25_SYMREAL)>sin(b_26_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample70.main()_5");
		paraName.add("c_27_SYMREAL,d_28_SYMREAL,b_26_SYMREAL,a_25_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((sin(c_27_SYMREAL)<sin(d_28_SYMREAL))) && ((sin(b_26_SYMREAL)>sin(c_27_SYMREAL))) && ((sin(a_25_SYMREAL)>sin(b_26_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.002 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample70.main()_6");
		paraName.add("c_27_SYMREAL,d_28_SYMREAL,b_26_SYMREAL,a_25_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((sin(c_27_SYMREAL)>sin(d_28_SYMREAL))) && ((sin(b_26_SYMREAL)>sin(c_27_SYMREAL))) && ((sin(a_25_SYMREAL)>sin(b_26_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.042 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample70.main()_7");
		paraName.add("d_28_SYMREAL,e_29_SYMREAL,c_27_SYMREAL,b_26_SYMREAL,a_25_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((sin(d_28_SYMREAL)<sin(e_29_SYMREAL))) && ((sin(c_27_SYMREAL)>sin(d_28_SYMREAL))) && ((sin(b_26_SYMREAL)>sin(c_27_SYMREAL))) && ((sin(a_25_SYMREAL)>sin(b_26_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.056 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample70.main()_8");
		paraName.add("d_28_SYMREAL,e_29_SYMREAL,c_27_SYMREAL,b_26_SYMREAL,a_25_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((sin(d_28_SYMREAL)>sin(e_29_SYMREAL))) && ((sin(c_27_SYMREAL)>sin(d_28_SYMREAL))) && ((sin(b_26_SYMREAL)>sin(c_27_SYMREAL))) && ((sin(a_25_SYMREAL)>sin(b_26_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.066 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample70.main()_9");
		paraName.add("e_29_SYMREAL,d_28_SYMREAL,c_27_SYMREAL,b_26_SYMREAL,a_25_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((sin(e_29_SYMREAL)==sin(d_28_SYMREAL))) && ((sin(c_27_SYMREAL)>sin(d_28_SYMREAL))) && ((sin(b_26_SYMREAL)>sin(c_27_SYMREAL))) && ((sin(a_25_SYMREAL)>sin(b_26_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.063 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample70.main()_10");
		paraName.add("f_30_SYMREAL,e_29_SYMREAL,d_28_SYMREAL,c_27_SYMREAL,b_26_SYMREAL,a_25_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((sin(f_30_SYMREAL)==sin(e_29_SYMREAL))) && ((sin(d_28_SYMREAL)>sin(e_29_SYMREAL))) && ((sin(c_27_SYMREAL)>sin(d_28_SYMREAL))) && ((sin(b_26_SYMREAL)>sin(c_27_SYMREAL))) && ((sin(a_25_SYMREAL)>sin(b_26_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.035 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample70.main()_11");
		paraName.add("e_29_SYMREAL,f_30_SYMREAL,d_28_SYMREAL,c_27_SYMREAL,b_26_SYMREAL,a_25_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((sin(e_29_SYMREAL)<sin(f_30_SYMREAL))) && ((sin(d_28_SYMREAL)>sin(e_29_SYMREAL))) && ((sin(c_27_SYMREAL)>sin(d_28_SYMREAL))) && ((sin(b_26_SYMREAL)>sin(c_27_SYMREAL))) && ((sin(a_25_SYMREAL)>sin(b_26_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.099 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample70.main()_12");
		paraName.add("f_30_SYMREAL,g_31_SYMREAL,e_29_SYMREAL,d_28_SYMREAL,c_27_SYMREAL,b_26_SYMREAL,a_25_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((sin(f_30_SYMREAL)<sin(g_31_SYMREAL))) && ((sin(e_29_SYMREAL)>sin(f_30_SYMREAL))) && ((sin(d_28_SYMREAL)>sin(e_29_SYMREAL))) && ((sin(c_27_SYMREAL)>sin(d_28_SYMREAL))) && ((sin(b_26_SYMREAL)>sin(c_27_SYMREAL))) && ((sin(a_25_SYMREAL)>sin(b_26_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.029 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample70.main()_13");
		paraName.add("f_30_SYMREAL,g_31_SYMREAL,e_29_SYMREAL,d_28_SYMREAL,c_27_SYMREAL,b_26_SYMREAL,a_25_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((sin(f_30_SYMREAL)>sin(g_31_SYMREAL))) && ((sin(e_29_SYMREAL)>sin(f_30_SYMREAL))) && ((sin(d_28_SYMREAL)>sin(e_29_SYMREAL))) && ((sin(c_27_SYMREAL)>sin(d_28_SYMREAL))) && ((sin(b_26_SYMREAL)>sin(c_27_SYMREAL))) && ((sin(a_25_SYMREAL)>sin(b_26_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.05 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample70.main()_14");
		paraName.add("g_31_SYMREAL,f_30_SYMREAL,e_29_SYMREAL,d_28_SYMREAL,c_27_SYMREAL,b_26_SYMREAL,a_25_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((sin(g_31_SYMREAL)==sin(f_30_SYMREAL))) && ((sin(e_29_SYMREAL)>sin(f_30_SYMREAL))) && ((sin(d_28_SYMREAL)>sin(e_29_SYMREAL))) && ((sin(c_27_SYMREAL)>sin(d_28_SYMREAL))) && ((sin(b_26_SYMREAL)>sin(c_27_SYMREAL))) && ((sin(a_25_SYMREAL)>sin(b_26_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.     null
		functionName.add(" coral.tests.samples.Sample70.main()_15");
		paraName.add("h_32_SYMREAL,g_31_SYMREAL,f_30_SYMREAL,e_29_SYMREAL,d_28_SYMREAL,c_27_SYMREAL,b_26_SYMREAL,a_25_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double");
		binaryExp.add("((sin(h_32_SYMREAL)==sin(g_31_SYMREAL))) && ((sin(f_30_SYMREAL)>sin(g_31_SYMREAL))) && ((sin(e_29_SYMREAL)>sin(f_30_SYMREAL))) && ((sin(d_28_SYMREAL)>sin(e_29_SYMREAL))) && ((sin(c_27_SYMREAL)>sin(d_28_SYMREAL))) && ((sin(b_26_SYMREAL)>sin(c_27_SYMREAL))) && ((sin(a_25_SYMREAL)>sin(b_26_SYMREAL)))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetBeale.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.588 seconds.Solved.     
		functionName.add(" JpfTargetBeale.main()_0");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.5-(x1_1_SYMREAL*(1.0-x2_2_SYMREAL)))<0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.009 seconds.Solved.     
		functionName.add(" JpfTargetBeale.main()_1");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.5-(x1_1_SYMREAL*(1.0-x2_2_SYMREAL)))>0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.007 seconds.Solved.     
		functionName.add(" JpfTargetBeale.main()_2");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(1.5-(x1_1_SYMREAL*(1.0-x2_2_SYMREAL)))))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample04.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.623 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample04.main()_0");
		paraName.add("x_2_SYMREAL");
		paraType.add("double");
		binaryExp.add("((exp(x_2_SYMREAL)<0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.002 seconds.Solved.     null
		functionName.add(" coral.tests.samples.Sample04.main()_1");
		paraName.add("x_2_SYMREAL");
		paraType.add("double");
		binaryExp.add("((exp(x_2_SYMREAL)>0.0))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample26.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.589 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample26.main()_0");
		paraName.add("x_6_SYMREAL,y_7_SYMREAL,z_8_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((sin(cos((x_6_SYMREAL*y_7_SYMREAL)))<cos(sin((x_6_SYMREAL*z_8_SYMREAL)))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample26.main()_1");
		paraName.add("x_6_SYMREAL,y_7_SYMREAL,z_8_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((sin(cos((x_6_SYMREAL*y_7_SYMREAL)))>cos(sin((x_6_SYMREAL*z_8_SYMREAL)))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.119 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample26.main()_2");
		paraName.add("w_9_SYMREAL,v_10_SYMREAL,y_7_SYMREAL,x_6_SYMREAL,z_8_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("(((sin(((2.0*w_9_SYMREAL)+v_10_SYMREAL))-1.0)!=0.0)) && (((cos(((2.0*y_7_SYMREAL)+v_10_SYMREAL))+1.0)!=0.0)) && ((sin(cos((x_6_SYMREAL*y_7_SYMREAL)))<cos(sin((x_6_SYMREAL*z_8_SYMREAL)))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.107 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample26.main()_3");
		paraName.add("z_8_SYMREAL,x_6_SYMREAL,w_9_SYMREAL,v_10_SYMREAL,y_7_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("(((cos(((2.0*z_8_SYMREAL)+x_6_SYMREAL))/(sin(((2.0*w_9_SYMREAL)+v_10_SYMREAL))-1.0))==(sin(((2.0*w_9_SYMREAL)-y_7_SYMREAL))/(cos(((2.0*y_7_SYMREAL)+v_10_SYMREAL))+1.0)))) && (((sin(((2.0*w_9_SYMREAL)+v_10_SYMREAL))-1.0)!=0.0)) && (((cos(((2.0*y_7_SYMREAL)+v_10_SYMREAL))+1.0)!=0.0)) && ((sin(cos((x_6_SYMREAL*y_7_SYMREAL)))<cos(sin((x_6_SYMREAL*z_8_SYMREAL)))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.004 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample26.main()_4");
		paraName.add("w_9_SYMREAL,y_7_SYMREAL,v_10_SYMREAL,z_8_SYMREAL,x_6_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("(((sin(((2.0*w_9_SYMREAL)-y_7_SYMREAL))/(cos(((2.0*y_7_SYMREAL)+v_10_SYMREAL))+1.0))<(cos(((2.0*z_8_SYMREAL)+x_6_SYMREAL))/(sin(((2.0*w_9_SYMREAL)+v_10_SYMREAL))-1.0)))) && (((sin(((2.0*w_9_SYMREAL)+v_10_SYMREAL))-1.0)!=0.0)) && (((cos(((2.0*y_7_SYMREAL)+v_10_SYMREAL))+1.0)!=0.0)) && ((sin(cos((x_6_SYMREAL*y_7_SYMREAL)))<cos(sin((x_6_SYMREAL*z_8_SYMREAL)))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.195 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample26.main()_5");
		paraName.add("x_6_SYMREAL,y_7_SYMREAL,z_8_SYMREAL,w_9_SYMREAL,v_10_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((0.0==sin((((x_6_SYMREAL*y_7_SYMREAL)*z_8_SYMREAL)*w_9_SYMREAL)))) && (((cos(((2.0*z_8_SYMREAL)+x_6_SYMREAL))/(sin(((2.0*w_9_SYMREAL)+v_10_SYMREAL))-1.0))==(sin(((2.0*w_9_SYMREAL)-y_7_SYMREAL))/(cos(((2.0*y_7_SYMREAL)+v_10_SYMREAL))+1.0)))) && (((sin(((2.0*w_9_SYMREAL)+v_10_SYMREAL))-1.0)!=0.0)) && (((cos(((2.0*y_7_SYMREAL)+v_10_SYMREAL))+1.0)!=0.0)) && ((sin(cos((x_6_SYMREAL*y_7_SYMREAL)))<cos(sin((x_6_SYMREAL*z_8_SYMREAL)))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.536 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample26.main()_6");
		paraName.add("x_6_SYMREAL,y_7_SYMREAL,z_8_SYMREAL,w_9_SYMREAL,v_10_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((sin((((x_6_SYMREAL*y_7_SYMREAL)*z_8_SYMREAL)*w_9_SYMREAL))<0.0)) && (((cos(((2.0*z_8_SYMREAL)+x_6_SYMREAL))/(sin(((2.0*w_9_SYMREAL)+v_10_SYMREAL))-1.0))==(sin(((2.0*w_9_SYMREAL)-y_7_SYMREAL))/(cos(((2.0*y_7_SYMREAL)+v_10_SYMREAL))+1.0)))) && (((sin(((2.0*w_9_SYMREAL)+v_10_SYMREAL))-1.0)!=0.0)) && (((cos(((2.0*y_7_SYMREAL)+v_10_SYMREAL))+1.0)!=0.0)) && ((sin(cos((x_6_SYMREAL*y_7_SYMREAL)))<cos(sin((x_6_SYMREAL*z_8_SYMREAL)))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.     null
		functionName.add(" coral.tests.samples.Sample26.main()_7");
		paraName.add("x_6_SYMREAL,y_7_SYMREAL,z_8_SYMREAL,w_9_SYMREAL,v_10_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((cos((((x_6_SYMREAL*y_7_SYMREAL)*z_8_SYMREAL)*w_9_SYMREAL))<0.0)) && ((sin((((x_6_SYMREAL*y_7_SYMREAL)*z_8_SYMREAL)*w_9_SYMREAL))>0.0)) && (((cos(((2.0*z_8_SYMREAL)+x_6_SYMREAL))/(sin(((2.0*w_9_SYMREAL)+v_10_SYMREAL))-1.0))==(sin(((2.0*w_9_SYMREAL)-y_7_SYMREAL))/(cos(((2.0*y_7_SYMREAL)+v_10_SYMREAL))+1.0)))) && (((sin(((2.0*w_9_SYMREAL)+v_10_SYMREAL))-1.0)!=0.0)) && (((cos(((2.0*y_7_SYMREAL)+v_10_SYMREAL))+1.0)!=0.0)) && ((sin(cos((x_6_SYMREAL*y_7_SYMREAL)))<cos(sin((x_6_SYMREAL*z_8_SYMREAL)))))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample76.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.98 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample76.main()_0");
		paraName.add("a_10_SYMREAL,b_11_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((a_10_SYMREAL<b_11_SYMREAL))");
		initNum.add("-22.3678551305,-5.3977866378");
		
		//Parse time: 0.0 seconds.Solve time: 0.011 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample76.main()_1");
		paraName.add("a_10_SYMREAL,b_11_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((a_10_SYMREAL>b_11_SYMREAL))");
		initNum.add("60.797046271,32.5110817233");
		
		//Parse time: 0.0 seconds.Solve time: 0.013 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample76.main()_2");
		paraName.add("b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((b_11_SYMREAL==a_10_SYMREAL))");
		initNum.add("0.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.045 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample76.main()_3");
		paraName.add("c_12_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((c_12_SYMREAL==b_11_SYMREAL)) && ((a_10_SYMREAL>b_11_SYMREAL))");
		initNum.add("32.5110817233,32.5110817233,60.797046271");
		
		//Parse time: 0.0 seconds.Solve time: 0.011 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample76.main()_4");
		paraName.add("b_11_SYMREAL,c_12_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((b_11_SYMREAL<c_12_SYMREAL)) && ((a_10_SYMREAL>b_11_SYMREAL))");
		initNum.add("-83.3501108465,78.7790148365,-45.6065149386");
		
		//Parse time: 0.0 seconds.Solve time: 0.054 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample76.main()_5");
		paraName.add("c_12_SYMREAL,d_13_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((c_12_SYMREAL<d_13_SYMREAL)) && ((b_11_SYMREAL>c_12_SYMREAL)) && ((a_10_SYMREAL>b_11_SYMREAL))");
		initNum.add("-22.3678551305,-5.3977866378,32.5110817233,60.797046271");
		
		//Parse time: 0.0 seconds.Solve time: 0.056 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample76.main()_6");
		paraName.add("c_12_SYMREAL,d_13_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((c_12_SYMREAL>d_13_SYMREAL)) && ((b_11_SYMREAL>c_12_SYMREAL)) && ((a_10_SYMREAL>b_11_SYMREAL))");
		initNum.add("-49.7382526301,-81.5823827242,62.6121159236,78.7790148365");
		
		//Parse time: 0.0 seconds.Solve time: 0.05 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample76.main()_7");
		paraName.add("d_13_SYMREAL,c_12_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((d_13_SYMREAL==c_12_SYMREAL)) && ((b_11_SYMREAL>c_12_SYMREAL)) && ((a_10_SYMREAL>b_11_SYMREAL))");
		initNum.add("-22.3678551305,-22.3678551305,32.5110817233,60.797046271");
		
		//Parse time: 0.0 seconds.Solve time: 0.078 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample76.main()_8");
		paraName.add("e_14_SYMREAL,d_13_SYMREAL,c_12_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((e_14_SYMREAL==d_13_SYMREAL)) && ((c_12_SYMREAL>d_13_SYMREAL)) && ((b_11_SYMREAL>c_12_SYMREAL)) && ((a_10_SYMREAL>b_11_SYMREAL))");
		initNum.add("-81.5823827242,-81.5823827242,-49.7382526301,62.6121159236,78.7790148365");
		
		//Parse time: 0.0 seconds.Solve time: 0.035 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample76.main()_9");
		paraName.add("d_13_SYMREAL,e_14_SYMREAL,c_12_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((d_13_SYMREAL<e_14_SYMREAL)) && ((c_12_SYMREAL>d_13_SYMREAL)) && ((b_11_SYMREAL>c_12_SYMREAL)) && ((a_10_SYMREAL>b_11_SYMREAL))");
		initNum.add("-81.5823827242,55.7923795524,-49.7382526301,62.6121159236,78.7790148365");
		
		//Parse time: 0.0 seconds.Solve time: 0.068 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample76.main()_10");
		paraName.add("e_14_SYMREAL,f_15_SYMREAL,d_13_SYMREAL,c_12_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((e_14_SYMREAL<f_15_SYMREAL)) && ((d_13_SYMREAL>e_14_SYMREAL)) && ((c_12_SYMREAL>d_13_SYMREAL)) && ((b_11_SYMREAL>c_12_SYMREAL)) && ((a_10_SYMREAL>b_11_SYMREAL))");
		initNum.add("-56.67692087034865,-44.296093219181245,-25.60771206509763,-20.85088210666936,9.18629462959287,57.20060461715015");
		
		//Parse time: 0.0 seconds.Solve time: 0.074 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample76.main()_11");
		paraName.add("e_14_SYMREAL,f_15_SYMREAL,d_13_SYMREAL,c_12_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((e_14_SYMREAL>f_15_SYMREAL)) && ((d_13_SYMREAL>e_14_SYMREAL)) && ((c_12_SYMREAL>d_13_SYMREAL)) && ((b_11_SYMREAL>c_12_SYMREAL)) && ((a_10_SYMREAL>b_11_SYMREAL))");
		initNum.add("-13.589511681451896,-65.26657993185981,-8.001712433725938,-2.3400653425689164,3.954173848871329,78.2518619327827");
		
		//Parse time: 0.0 seconds.Solve time: 0.021 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample76.main()_12");
		paraName.add("f_15_SYMREAL,e_14_SYMREAL,d_13_SYMREAL,c_12_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((f_15_SYMREAL==e_14_SYMREAL)) && ((d_13_SYMREAL>e_14_SYMREAL)) && ((c_12_SYMREAL>d_13_SYMREAL)) && ((b_11_SYMREAL>c_12_SYMREAL)) && ((a_10_SYMREAL>b_11_SYMREAL))");
		initNum.add("-0.4308923719,-0.4308923719,14.13081677,32.7182919365,34.8564015791,70.6433093214");
		
		//Parse time: 0.0 seconds.Solve time: 0.075 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample76.main()_13");
		paraName.add("g_16_SYMREAL,f_15_SYMREAL,e_14_SYMREAL,d_13_SYMREAL,c_12_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((g_16_SYMREAL==f_15_SYMREAL)) && ((e_14_SYMREAL>f_15_SYMREAL)) && ((d_13_SYMREAL>e_14_SYMREAL)) && ((c_12_SYMREAL>d_13_SYMREAL)) && ((b_11_SYMREAL>c_12_SYMREAL)) && ((a_10_SYMREAL>b_11_SYMREAL))");
		initNum.add("-65.26657993185981,-65.26657993185981,-13.589511681451896,-8.001712433725938,-2.3400653425689164,3.954173848871329,78.2518619327827");
		
		//Parse time: 0.0 seconds.Solve time: 0.061 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample76.main()_14");
		paraName.add("f_15_SYMREAL,g_16_SYMREAL,e_14_SYMREAL,d_13_SYMREAL,c_12_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((f_15_SYMREAL<g_16_SYMREAL)) && ((e_14_SYMREAL>f_15_SYMREAL)) && ((d_13_SYMREAL>e_14_SYMREAL)) && ((c_12_SYMREAL>d_13_SYMREAL)) && ((b_11_SYMREAL>c_12_SYMREAL)) && ((a_10_SYMREAL>b_11_SYMREAL))");
		initNum.add("-68.1524842254,3.3660603717,-49.857468102,-38.2312931574,55.5862786465,61.5937578815,96.5254284007");
		
		//Parse time: 0.0 seconds.Solve time: 0.07 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample76.main()_15");
		paraName.add("g_16_SYMREAL,h_17_SYMREAL,f_15_SYMREAL,e_14_SYMREAL,d_13_SYMREAL,c_12_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double");
		binaryExp.add("((g_16_SYMREAL<h_17_SYMREAL)) && ((f_15_SYMREAL>g_16_SYMREAL)) && ((e_14_SYMREAL>f_15_SYMREAL)) && ((d_13_SYMREAL>e_14_SYMREAL)) && ((c_12_SYMREAL>d_13_SYMREAL)) && ((b_11_SYMREAL>c_12_SYMREAL)) && ((a_10_SYMREAL>b_11_SYMREAL))");
		initNum.add("-15.759742921119155,6.574946999589897,-6.37984290180872,-0.17148351398788697,0.048524366420101384,0.4674744747959605,1.1505437867346986,1.2073647637848515");
		
		//Parse time: 0.0 seconds.Solve time: 0.057 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample76.main()_16");
		paraName.add("g_16_SYMREAL,h_17_SYMREAL,f_15_SYMREAL,e_14_SYMREAL,d_13_SYMREAL,c_12_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double");
		binaryExp.add("((g_16_SYMREAL>h_17_SYMREAL)) && ((f_15_SYMREAL>g_16_SYMREAL)) && ((e_14_SYMREAL>f_15_SYMREAL)) && ((d_13_SYMREAL>e_14_SYMREAL)) && ((c_12_SYMREAL>d_13_SYMREAL)) && ((b_11_SYMREAL>c_12_SYMREAL)) && ((a_10_SYMREAL>b_11_SYMREAL))");
		initNum.add("-10.471124975162871,-15.313476851627994,-10.385255697772743,-10.037276840299679,-9.979907874446889,-7.049291567597308,-4.414317650327692,-4.411488526214382");
		
		//Parse time: 0.0 seconds.Solve time: 0.043 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample76.main()_17");
		paraName.add("h_17_SYMREAL,g_16_SYMREAL,f_15_SYMREAL,e_14_SYMREAL,d_13_SYMREAL,c_12_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double");
		binaryExp.add("((h_17_SYMREAL==g_16_SYMREAL)) && ((f_15_SYMREAL>g_16_SYMREAL)) && ((e_14_SYMREAL>f_15_SYMREAL)) && ((d_13_SYMREAL>e_14_SYMREAL)) && ((c_12_SYMREAL>d_13_SYMREAL)) && ((b_11_SYMREAL>c_12_SYMREAL)) && ((a_10_SYMREAL>b_11_SYMREAL))");
		initNum.add("-100.0,-100.0,-23.144812192391655,-8.816628350873124,4.270952175031247,7.489224002440391,12.6256666566311,29.736639834860945");
		
		//Parse time: 0.0 seconds.Solve time: 0.053 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample76.main()_18");
		paraName.add("i_18_SYMREAL,h_17_SYMREAL,g_16_SYMREAL,f_15_SYMREAL,e_14_SYMREAL,d_13_SYMREAL,c_12_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double");
		binaryExp.add("((i_18_SYMREAL==h_17_SYMREAL)) && ((g_16_SYMREAL>h_17_SYMREAL)) && ((f_15_SYMREAL>g_16_SYMREAL)) && ((e_14_SYMREAL>f_15_SYMREAL)) && ((d_13_SYMREAL>e_14_SYMREAL)) && ((c_12_SYMREAL>d_13_SYMREAL)) && ((b_11_SYMREAL>c_12_SYMREAL)) && ((a_10_SYMREAL>b_11_SYMREAL))");
		initNum.add("-15.313476851627994,-15.313476851627994,-10.471124975162871,-10.385255697772743,-10.037276840299679,-9.979907874446889,-7.049291567597308,-4.414317650327692,-4.411488526214382");
		
		//Parse time: 0.0 seconds.Solve time: 0.034 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample76.main()_19");
		paraName.add("h_17_SYMREAL,i_18_SYMREAL,g_16_SYMREAL,f_15_SYMREAL,e_14_SYMREAL,d_13_SYMREAL,c_12_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double");
		binaryExp.add("((h_17_SYMREAL<i_18_SYMREAL)) && ((g_16_SYMREAL>h_17_SYMREAL)) && ((f_15_SYMREAL>g_16_SYMREAL)) && ((e_14_SYMREAL>f_15_SYMREAL)) && ((d_13_SYMREAL>e_14_SYMREAL)) && ((c_12_SYMREAL>d_13_SYMREAL)) && ((b_11_SYMREAL>c_12_SYMREAL)) && ((a_10_SYMREAL>b_11_SYMREAL))");
		initNum.add("-1.4410982676268973,-1.3351096146377064,-0.948797477109954,-0.7767429600244602,-0.7319295860189446,-0.6534216911341879,-0.6467039083094157,-0.6190614800642856,1.6829997528749432");
		
		//Parse time: 0.0 seconds.Solve time: 0.037 seconds.Solved.     null
		functionName.add(" coral.tests.samples.Sample76.main()_20");
		paraName.add("h_17_SYMREAL,i_18_SYMREAL,g_16_SYMREAL,f_15_SYMREAL,e_14_SYMREAL,d_13_SYMREAL,c_12_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double");
		binaryExp.add("((h_17_SYMREAL>i_18_SYMREAL)) && ((g_16_SYMREAL>h_17_SYMREAL)) && ((f_15_SYMREAL>g_16_SYMREAL)) && ((e_14_SYMREAL>f_15_SYMREAL)) && ((d_13_SYMREAL>e_14_SYMREAL)) && ((c_12_SYMREAL>d_13_SYMREAL)) && ((b_11_SYMREAL>c_12_SYMREAL)) && ((a_10_SYMREAL>b_11_SYMREAL))");
		initNum.add("-1.6945515109193467,-2.116539024460188,-1.0372264138492238,-0.9222641942890746,-0.9016459462426478,-0.49158385111909797,-0.3678115387200363,-0.3482425540083869,2.0091415700149855");
		
		

/*		 ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetCollision5.main().txt      ********
		//Parse time: 0.004 seconds.     null
		functionName.add(" JpfTargetCollision5.main()_0");
		paraName.add("z1_2_SYMINT,y1_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((-412516635!=(z1_2_SYMINT+(31*(((32>>>y1_1_SYMINT)^y1_1_SYMINT)+176018)))))");
		initNum.add("");*/
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample38.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.588 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample38.main()_0");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((atan2(x_3_SYMREAL, y_4_SYMREAL)<1.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.004 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample38.main()_1");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((atan2(x_3_SYMREAL, y_4_SYMREAL)>1.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.062 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample38.main()_2");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((1.0==atan2(x_3_SYMREAL, y_4_SYMREAL)))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample09.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.581 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample09.main()_0");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(cos((x_3_SYMREAL*y_4_SYMREAL)))<cos(sin((x_3_SYMREAL*y_4_SYMREAL)))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.252 seconds.Unsolved.     null
		functionName.add(" coral.tests.samples.Sample09.main()_1");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(cos((x_3_SYMREAL*y_4_SYMREAL)))>cos(sin((x_3_SYMREAL*y_4_SYMREAL)))))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample21.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.592 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample21.main()_0");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((cos((x_3_SYMREAL*y_4_SYMREAL))<0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.033 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample21.main()_1");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((cos((x_3_SYMREAL*y_4_SYMREAL))>0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.348 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample21.main()_2");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.25==sin((2.0*x_3_SYMREAL)))) && ((cos((x_3_SYMREAL*y_4_SYMREAL))<0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample21.main()_3");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin((2.0*x_3_SYMREAL))<0.25)) && ((cos((x_3_SYMREAL*y_4_SYMREAL))<0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     null
		functionName.add(" coral.tests.samples.Sample21.main()_4");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((cos((x_3_SYMREAL*y_4_SYMREAL))>0.0))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample56.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.975 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample56.main()_0");
		paraName.add("y_7_SYMREAL");
		paraType.add("double");
		binaryExp.add("((y_7_SYMREAL!=0.0))");
		initNum.add("60.797046271");
		
		//Parse time: 0.0 seconds.Solve time: 0.025 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample56.main()_1");
		paraName.add("x_6_SYMREAL,y_7_SYMREAL,z_8_SYMREAL,w_9_SYMREAL,t_10_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("(((((x_6_SYMREAL/y_7_SYMREAL)+z_8_SYMREAL)+tan((w_9_SYMREAL+t_10_SYMREAL)))==((x_6_SYMREAL*y_7_SYMREAL)+(atan(z_8_SYMREAL)*sin((w_9_SYMREAL*t_10_SYMREAL)))))) && ((y_7_SYMREAL!=0.0))");
		initNum.add("0.0,60.797046271,0.0,0.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.012 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample56.main()_2");
		paraName.add("x_6_SYMREAL,y_7_SYMREAL,z_8_SYMREAL,w_9_SYMREAL,t_10_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((((x_6_SYMREAL*y_7_SYMREAL)+(atan(z_8_SYMREAL)*sin((w_9_SYMREAL*t_10_SYMREAL))))<(((x_6_SYMREAL/y_7_SYMREAL)+z_8_SYMREAL)+tan((w_9_SYMREAL+t_10_SYMREAL))))) && ((y_7_SYMREAL!=0.0))");
		initNum.add("0.0,60.797046271,0.0,0.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.012 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample56.main()_3");
		paraName.add("x_6_SYMREAL,y_7_SYMREAL,z_8_SYMREAL,w_9_SYMREAL,t_10_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((((x_6_SYMREAL*y_7_SYMREAL)+(atan(z_8_SYMREAL)*sin((w_9_SYMREAL*t_10_SYMREAL))))>(((x_6_SYMREAL/y_7_SYMREAL)+z_8_SYMREAL)+tan((w_9_SYMREAL+t_10_SYMREAL))))) && ((y_7_SYMREAL!=0.0))");
		initNum.add("0.0,60.797046271,0.0,0.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     null
		functionName.add(" coral.tests.samples.Sample56.main()_4");
		paraName.add("y_7_SYMREAL");
		paraType.add("double");
		binaryExp.add("((y_7_SYMREAL==0.0))");
		initNum.add("0.0");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetPowell.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.579 seconds.Solved.     
		functionName.add(" JpfTargetPowell.main()_0");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)<0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.008 seconds.Solved.     
		functionName.add(" JpfTargetPowell.main()_1");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)>0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.573 seconds.Unsolved.     
		functionName.add(" JpfTargetPowell.main()_2");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((((pow(2.718281828459045, (0.0-x1_1_SYMREAL))+pow(2.718281828459045, (0.0-x2_2_SYMREAL)))-1.0001)<0.0)) && ((0.0==(((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)))");
		initNum.add("");
		
		//Parse time: 0.001 seconds.Solve time: 0.013 seconds.Solved.     
		functionName.add(" JpfTargetPowell.main()_3");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((((pow(2.718281828459045, (0.0-x1_1_SYMREAL))+pow(2.718281828459045, (0.0-x2_2_SYMREAL)))-1.0001)>0.0)) && ((0.0==(((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.002 seconds.Solved.     null
		functionName.add(" JpfTargetPowell.main()_4");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)>0.0))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample77.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.974 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample77.main()_0");
		paraName.add("a_11_SYMREAL,b_12_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((a_11_SYMREAL<b_12_SYMREAL))");
		initNum.add("-22.3678551305,-5.3977866378");
		
		//Parse time: 0.0 seconds.Solve time: 0.013 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample77.main()_1");
		paraName.add("a_11_SYMREAL,b_12_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((a_11_SYMREAL>b_12_SYMREAL))");
		initNum.add("60.797046271,32.5110817233");
		
		//Parse time: 0.0 seconds.Solve time: 0.016 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample77.main()_2");
		paraName.add("b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((b_12_SYMREAL==a_11_SYMREAL))");
		initNum.add("0.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.014 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample77.main()_3");
		paraName.add("c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((c_13_SYMREAL==b_12_SYMREAL)) && ((a_11_SYMREAL>b_12_SYMREAL))");
		initNum.add("32.5110817233,32.5110817233,60.797046271");
		
		//Parse time: 0.0 seconds.Solve time: 0.013 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample77.main()_4");
		paraName.add("b_12_SYMREAL,c_13_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((b_12_SYMREAL<c_13_SYMREAL)) && ((a_11_SYMREAL>b_12_SYMREAL))");
		initNum.add("-83.3501108465,78.7790148365,-45.6065149386");
		
		//Parse time: 0.0 seconds.Solve time: 0.068 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample77.main()_5");
		paraName.add("c_13_SYMREAL,d_14_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((c_13_SYMREAL<d_14_SYMREAL)) && ((b_12_SYMREAL>c_13_SYMREAL)) && ((a_11_SYMREAL>b_12_SYMREAL))");
		initNum.add("-22.3678551305,-5.3977866378,32.5110817233,60.797046271");
		
		//Parse time: 0.0 seconds.Solve time: 0.07 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample77.main()_6");
		paraName.add("c_13_SYMREAL,d_14_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((c_13_SYMREAL>d_14_SYMREAL)) && ((b_12_SYMREAL>c_13_SYMREAL)) && ((a_11_SYMREAL>b_12_SYMREAL))");
		initNum.add("-49.7382526301,-81.5823827242,62.6121159236,78.7790148365");
		
		//Parse time: 0.0 seconds.Solve time: 0.043 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample77.main()_7");
		paraName.add("d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((d_14_SYMREAL==c_13_SYMREAL)) && ((b_12_SYMREAL>c_13_SYMREAL)) && ((a_11_SYMREAL>b_12_SYMREAL))");
		initNum.add("-22.3678551305,-22.3678551305,32.5110817233,60.797046271");
		
		//Parse time: 0.0 seconds.Solve time: 0.063 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample77.main()_8");
		paraName.add("e_15_SYMREAL,d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((e_15_SYMREAL==d_14_SYMREAL)) && ((c_13_SYMREAL>d_14_SYMREAL)) && ((b_12_SYMREAL>c_13_SYMREAL)) && ((a_11_SYMREAL>b_12_SYMREAL))");
		initNum.add("-81.5823827242,-81.5823827242,-49.7382526301,62.6121159236,78.7790148365");
		
		//Parse time: 0.0 seconds.Solve time: 0.053 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample77.main()_9");
		paraName.add("d_14_SYMREAL,e_15_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((d_14_SYMREAL<e_15_SYMREAL)) && ((c_13_SYMREAL>d_14_SYMREAL)) && ((b_12_SYMREAL>c_13_SYMREAL)) && ((a_11_SYMREAL>b_12_SYMREAL))");
		initNum.add("-81.5823827242,55.7923795524,-49.7382526301,62.6121159236,78.7790148365");
		
		//Parse time: 0.0 seconds.Solve time: 0.071 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample77.main()_10");
		paraName.add("e_15_SYMREAL,f_16_SYMREAL,d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((e_15_SYMREAL<f_16_SYMREAL)) && ((d_14_SYMREAL>e_15_SYMREAL)) && ((c_13_SYMREAL>d_14_SYMREAL)) && ((b_12_SYMREAL>c_13_SYMREAL)) && ((a_11_SYMREAL>b_12_SYMREAL))");
		initNum.add("-56.67692087034865,-44.296093219181245,-25.60771206509763,-20.85088210666936,9.18629462959287,57.20060461715015");
		
		//Parse time: 0.0 seconds.Solve time: 0.091 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample77.main()_11");
		paraName.add("e_15_SYMREAL,f_16_SYMREAL,d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((e_15_SYMREAL>f_16_SYMREAL)) && ((d_14_SYMREAL>e_15_SYMREAL)) && ((c_13_SYMREAL>d_14_SYMREAL)) && ((b_12_SYMREAL>c_13_SYMREAL)) && ((a_11_SYMREAL>b_12_SYMREAL))");
		initNum.add("-13.589511681451896,-65.26657993185981,-8.001712433725938,-2.3400653425689164,3.954173848871329,78.2518619327827");
		
		//Parse time: 0.0 seconds.Solve time: 0.058 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample77.main()_12");
		paraName.add("f_16_SYMREAL,e_15_SYMREAL,d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((f_16_SYMREAL==e_15_SYMREAL)) && ((d_14_SYMREAL>e_15_SYMREAL)) && ((c_13_SYMREAL>d_14_SYMREAL)) && ((b_12_SYMREAL>c_13_SYMREAL)) && ((a_11_SYMREAL>b_12_SYMREAL))");
		initNum.add("-0.4308923719,-0.4308923719,14.13081677,32.7182919365,34.8564015791,70.6433093214");
		
		//Parse time: 0.0 seconds.Solve time: 0.058 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample77.main()_13");
		paraName.add("g_17_SYMREAL,f_16_SYMREAL,e_15_SYMREAL,d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((g_17_SYMREAL==f_16_SYMREAL)) && ((e_15_SYMREAL>f_16_SYMREAL)) && ((d_14_SYMREAL>e_15_SYMREAL)) && ((c_13_SYMREAL>d_14_SYMREAL)) && ((b_12_SYMREAL>c_13_SYMREAL)) && ((a_11_SYMREAL>b_12_SYMREAL))");
		initNum.add("-65.26657993185981,-65.26657993185981,-13.589511681451896,-8.001712433725938,-2.3400653425689164,3.954173848871329,78.2518619327827");
		
		//Parse time: 0.0 seconds.Solve time: 0.053 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample77.main()_14");
		paraName.add("f_16_SYMREAL,g_17_SYMREAL,e_15_SYMREAL,d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((f_16_SYMREAL<g_17_SYMREAL)) && ((e_15_SYMREAL>f_16_SYMREAL)) && ((d_14_SYMREAL>e_15_SYMREAL)) && ((c_13_SYMREAL>d_14_SYMREAL)) && ((b_12_SYMREAL>c_13_SYMREAL)) && ((a_11_SYMREAL>b_12_SYMREAL))");
		initNum.add("-68.1524842254,3.3660603717,-49.857468102,-38.2312931574,55.5862786465,61.5937578815,96.5254284007");
		
		//Parse time: 0.0 seconds.Solve time: 0.052 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample77.main()_15");
		paraName.add("g_17_SYMREAL,h_18_SYMREAL,f_16_SYMREAL,e_15_SYMREAL,d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double");
		binaryExp.add("((g_17_SYMREAL<h_18_SYMREAL)) && ((f_16_SYMREAL>g_17_SYMREAL)) && ((e_15_SYMREAL>f_16_SYMREAL)) && ((d_14_SYMREAL>e_15_SYMREAL)) && ((c_13_SYMREAL>d_14_SYMREAL)) && ((b_12_SYMREAL>c_13_SYMREAL)) && ((a_11_SYMREAL>b_12_SYMREAL))");
		initNum.add("-15.759742921119155,6.574946999589897,-6.37984290180872,-0.17148351398788697,0.048524366420101384,0.4674744747959605,1.1505437867346986,1.2073647637848515");
		
		//Parse time: 0.0 seconds.Solve time: 0.059 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample77.main()_16");
		paraName.add("g_17_SYMREAL,h_18_SYMREAL,f_16_SYMREAL,e_15_SYMREAL,d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double");
		binaryExp.add("((g_17_SYMREAL>h_18_SYMREAL)) && ((f_16_SYMREAL>g_17_SYMREAL)) && ((e_15_SYMREAL>f_16_SYMREAL)) && ((d_14_SYMREAL>e_15_SYMREAL)) && ((c_13_SYMREAL>d_14_SYMREAL)) && ((b_12_SYMREAL>c_13_SYMREAL)) && ((a_11_SYMREAL>b_12_SYMREAL))");
		initNum.add("-10.471124975162871,-15.313476851627994,-10.385255697772743,-10.037276840299679,-9.979907874446889,-7.049291567597308,-4.414317650327692,-4.411488526214382");
		
		//Parse time: 0.0 seconds.Solve time: 0.043 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample77.main()_17");
		paraName.add("h_18_SYMREAL,g_17_SYMREAL,f_16_SYMREAL,e_15_SYMREAL,d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double");
		binaryExp.add("((h_18_SYMREAL==g_17_SYMREAL)) && ((f_16_SYMREAL>g_17_SYMREAL)) && ((e_15_SYMREAL>f_16_SYMREAL)) && ((d_14_SYMREAL>e_15_SYMREAL)) && ((c_13_SYMREAL>d_14_SYMREAL)) && ((b_12_SYMREAL>c_13_SYMREAL)) && ((a_11_SYMREAL>b_12_SYMREAL))");
		initNum.add("-100.0,-100.0,-23.144812192391655,-8.816628350873124,4.270952175031247,7.489224002440391,12.6256666566311,29.736639834860945");
		
		//Parse time: 0.0 seconds.Solve time: 0.045 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample77.main()_18");
		paraName.add("i_19_SYMREAL,h_18_SYMREAL,g_17_SYMREAL,f_16_SYMREAL,e_15_SYMREAL,d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double");
		binaryExp.add("((i_19_SYMREAL==h_18_SYMREAL)) && ((g_17_SYMREAL>h_18_SYMREAL)) && ((f_16_SYMREAL>g_17_SYMREAL)) && ((e_15_SYMREAL>f_16_SYMREAL)) && ((d_14_SYMREAL>e_15_SYMREAL)) && ((c_13_SYMREAL>d_14_SYMREAL)) && ((b_12_SYMREAL>c_13_SYMREAL)) && ((a_11_SYMREAL>b_12_SYMREAL))");
		initNum.add("-15.313476851627994,-15.313476851627994,-10.471124975162871,-10.385255697772743,-10.037276840299679,-9.979907874446889,-7.049291567597308,-4.414317650327692,-4.411488526214382");
		
		//Parse time: 0.0 seconds.Solve time: 0.041 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample77.main()_19");
		paraName.add("h_18_SYMREAL,i_19_SYMREAL,g_17_SYMREAL,f_16_SYMREAL,e_15_SYMREAL,d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double");
		binaryExp.add("((h_18_SYMREAL<i_19_SYMREAL)) && ((g_17_SYMREAL>h_18_SYMREAL)) && ((f_16_SYMREAL>g_17_SYMREAL)) && ((e_15_SYMREAL>f_16_SYMREAL)) && ((d_14_SYMREAL>e_15_SYMREAL)) && ((c_13_SYMREAL>d_14_SYMREAL)) && ((b_12_SYMREAL>c_13_SYMREAL)) && ((a_11_SYMREAL>b_12_SYMREAL))");
		initNum.add("-1.4410982676268973,-1.3351096146377064,-0.948797477109954,-0.7767429600244602,-0.7319295860189446,-0.6534216911341879,-0.6467039083094157,-0.6190614800642856,1.6829997528749432");
		
		//Parse time: 0.0 seconds.Solve time: 0.059 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample77.main()_20");
		paraName.add("i_19_SYMREAL,j_20_SYMREAL,h_18_SYMREAL,g_17_SYMREAL,f_16_SYMREAL,e_15_SYMREAL,d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((i_19_SYMREAL<j_20_SYMREAL)) && ((h_18_SYMREAL>i_19_SYMREAL)) && ((g_17_SYMREAL>h_18_SYMREAL)) && ((f_16_SYMREAL>g_17_SYMREAL)) && ((e_15_SYMREAL>f_16_SYMREAL)) && ((d_14_SYMREAL>e_15_SYMREAL)) && ((c_13_SYMREAL>d_14_SYMREAL)) && ((b_12_SYMREAL>c_13_SYMREAL)) && ((a_11_SYMREAL>b_12_SYMREAL))");
		initNum.add("-2.6673625147951587,-1.8165564832334895,-2.264943164856024,-0.5174082451926905,-0.4623492817892841,-0.45911036200705513,-0.4419034677401281,-0.44063452456286895,0.44168113199243403,0.44180850429232754");
		
		//Parse time: 0.0 seconds.Solve time: 0.238 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample77.main()_21");
		paraName.add("i_19_SYMREAL,j_20_SYMREAL,h_18_SYMREAL,g_17_SYMREAL,f_16_SYMREAL,e_15_SYMREAL,d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((i_19_SYMREAL>j_20_SYMREAL)) && ((h_18_SYMREAL>i_19_SYMREAL)) && ((g_17_SYMREAL>h_18_SYMREAL)) && ((f_16_SYMREAL>g_17_SYMREAL)) && ((e_15_SYMREAL>f_16_SYMREAL)) && ((d_14_SYMREAL>e_15_SYMREAL)) && ((c_13_SYMREAL>d_14_SYMREAL)) && ((b_12_SYMREAL>c_13_SYMREAL)) && ((a_11_SYMREAL>b_12_SYMREAL))");
		initNum.add("-11.188563212632133,-12.878039726284634,-8.224374762759567,-3.0650861906201694,0.38816340690331413,0.9650510930678724,1.0837134364384582,6.577270976960769,10.55426971644659,17.052577674435895");
		
		//Parse time: 0.0 seconds.Solve time: 0.05 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample77.main()_22");
		paraName.add("j_20_SYMREAL,i_19_SYMREAL,h_18_SYMREAL,g_17_SYMREAL,f_16_SYMREAL,e_15_SYMREAL,d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((j_20_SYMREAL==i_19_SYMREAL)) && ((h_18_SYMREAL>i_19_SYMREAL)) && ((g_17_SYMREAL>h_18_SYMREAL)) && ((f_16_SYMREAL>g_17_SYMREAL)) && ((e_15_SYMREAL>f_16_SYMREAL)) && ((d_14_SYMREAL>e_15_SYMREAL)) && ((c_13_SYMREAL>d_14_SYMREAL)) && ((b_12_SYMREAL>c_13_SYMREAL)) && ((a_11_SYMREAL>b_12_SYMREAL))");
		initNum.add("-2.116539024460188,-2.116539024460188,-1.6945515109193467,-1.0372264138492238,-0.9222641942890746,-0.9016459462426478,-0.49158385111909797,-0.3678115387200363,-0.3482425540083869,2.0091415700149855");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample17.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.648 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample17.main()_0");
		paraName.add("x_2_SYMREAL");
		paraType.add("double");
		binaryExp.add("(((asin(x_2_SYMREAL)*acos(x_2_SYMREAL))<atan(x_2_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.031 seconds.Unsolved.     null
		functionName.add(" coral.tests.samples.Sample17.main()_1");
		paraName.add("x_2_SYMREAL");
		paraType.add("double");
		binaryExp.add("(((asin(x_2_SYMREAL)*acos(x_2_SYMREAL))>atan(x_2_SYMREAL)))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample40.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.645 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample40.main()_0");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((pow(x_3_SYMREAL, 2.0)<(x_3_SYMREAL+y_4_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample40.main()_1");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((pow(x_3_SYMREAL, 2.0)>(x_3_SYMREAL+y_4_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.037 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample40.main()_2");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((x_3_SYMREAL+y_4_SYMREAL)==pow(x_3_SYMREAL, 2.0)))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample35.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.594 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample35.main()_0");
		paraName.add("x_3_SYMREAL");
		paraType.add("double");
		binaryExp.add("((exp(sin(x_3_SYMREAL))!=0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.655 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample35.main()_1");
		paraName.add("y_4_SYMREAL,x_3_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((exp(cos(exp(y_4_SYMREAL)))==(1.0/exp(sin(x_3_SYMREAL))))) && ((exp(sin(x_3_SYMREAL))!=0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample35.main()_2");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.0/exp(sin(x_3_SYMREAL)))<exp(cos(exp(y_4_SYMREAL))))) && ((exp(sin(x_3_SYMREAL))!=0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.021 seconds.Unsolved.     null
		functionName.add(" coral.tests.samples.Sample35.main()_3");
		paraName.add("x_3_SYMREAL");
		paraType.add("double");
		binaryExp.add("((exp(sin(x_3_SYMREAL))==0.0))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample46.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.676 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample46.main()_0");
		paraName.add("x_5_SYMREAL,z_7_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((exp(pow(2.718281828459045, (x_5_SYMREAL+z_7_SYMREAL)))<pow(z_7_SYMREAL, x_5_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample46.main()_1");
		paraName.add("x_5_SYMREAL,z_7_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((exp(pow(2.718281828459045, (x_5_SYMREAL+z_7_SYMREAL)))>pow(z_7_SYMREAL, x_5_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.349 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample46.main()_2");
		paraName.add("x_5_SYMREAL,z_7_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==x_5_SYMREAL)) && ((exp(pow(2.718281828459045, (x_5_SYMREAL+z_7_SYMREAL)))<pow(z_7_SYMREAL, x_5_SYMREAL)))");
		initNum.add("0.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.03 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample46.main()_3");
		paraName.add("x_5_SYMREAL,z_7_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((exp(pow(2.718281828459045, (x_5_SYMREAL+z_7_SYMREAL)))<pow(z_7_SYMREAL, x_5_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.01 seconds.Solved.     null
		functionName.add(" coral.tests.samples.Sample46.main()_4");
		paraName.add("x_5_SYMREAL,z_7_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((exp(pow(2.718281828459045, (x_5_SYMREAL+z_7_SYMREAL)))>pow(z_7_SYMREAL, x_5_SYMREAL)))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample14.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.644 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample14.main()_0");
		paraName.add("y_6_SYMREAL,x_5_SYMREAL,z_7_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((((sin(y_6_SYMREAL)*asin(x_5_SYMREAL))-300.0)<((cos(y_6_SYMREAL)*cos(z_7_SYMREAL))-atan(w_8_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.316 seconds.Unsolved.     null
		functionName.add(" coral.tests.samples.Sample14.main()_1");
		paraName.add("y_6_SYMREAL,x_5_SYMREAL,z_7_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((((sin(y_6_SYMREAL)*asin(x_5_SYMREAL))-300.0)>((cos(y_6_SYMREAL)*cos(z_7_SYMREAL))-atan(w_8_SYMREAL))))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample83.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.946 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample83.main()_0");
		paraName.add("a_3_SYMREAL,b_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((pow((1.0-a_3_SYMREAL), 2.0)+(100.0*pow((b_4_SYMREAL-(a_3_SYMREAL*a_3_SYMREAL)), 2.0)))<0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.002 seconds.Solved.     null
		functionName.add(" coral.tests.samples.Sample83.main()_1");
		paraName.add("a_3_SYMREAL,b_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((pow((1.0-a_3_SYMREAL), 2.0)+(100.0*pow((b_4_SYMREAL-(a_3_SYMREAL*a_3_SYMREAL)), 2.0)))>0.0))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/tsafe.Conflict.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.992 seconds.Solved.     
		functionName.add(" tsafe.Conflict.main()_0");
		paraName.add("psi1_1_SYMREAL");
		paraType.add("double");
		binaryExp.add("(((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		initNum.add("-6.8509106908");
		
		//Parse time: 0.0 seconds.Solve time: 0.011 seconds.Solved.     
		functionName.add(" tsafe.Conflict.main()_1");
		paraName.add("psi1_1_SYMREAL");
		paraType.add("double");
		binaryExp.add("(((0.017453292519943295*psi1_1_SYMREAL)>0.0))");
		initNum.add("75.6681948301");
		
		//Parse time: 0.0 seconds.Solve time: 0.074 seconds.Solved.     
		functionName.add(" tsafe.Conflict.main()_2");
		paraName.add("bank_ang_7_SYMREAL,psi1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		initNum.add("0.0,-6.8509106908");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.Conflict.main()_3");
		paraName.add("psi1_1_SYMREAL,bank_ang_7_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(0.017453292519943295*psi1_1_SYMREAL))) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		initNum.add("");
		
		//Parse time: 0.001 seconds.Solve time: 0.01 seconds.Solved.     
		functionName.add(" tsafe.Conflict.main()_4");
		paraName.add("vA_2_SYMREAL,bank_ang_7_SYMREAL,psi1_1_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((vA_2_SYMREAL!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		initNum.add("-1.0,0.0,-1.0");
		
		//Parse time: 0.0 seconds.Solve time: 2.83 seconds.Unsolved.     
		functionName.add(" tsafe.Conflict.main()_5");
		paraName.add("xC0_4_SYMREAL,vC_3_SYMREAL,bank_ang_7_SYMREAL,psiC_6_SYMREAL,psi1_1_SYMREAL,vA_2_SYMREAL,yC0_5_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((exp((pow(((xC0_4_SYMREAL+((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(cos(psiC_6_SYMREAL)-cos((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(1.0-cos((0.017453292519943295*psi1_1_SYMREAL))))), 2.0)+pow(((yC0_5_SYMREAL-((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(sin(psiC_6_SYMREAL)-sin((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*sin((0.017453292519943295*psi1_1_SYMREAL)))), 2.0)))<999.0)) && ((((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)!=0.0)) && ((vA_2_SYMREAL!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		initNum.add("0.0,0.0,0.0,0.0,-88.2511826472,-69.4462632631,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.165 seconds.Solved.     
		functionName.add(" tsafe.Conflict.main()_6");
		paraName.add("xC0_4_SYMREAL,vC_3_SYMREAL,bank_ang_7_SYMREAL,psiC_6_SYMREAL,psi1_1_SYMREAL,vA_2_SYMREAL,yC0_5_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((exp((pow(((xC0_4_SYMREAL+((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(cos(psiC_6_SYMREAL)-cos((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(1.0-cos((0.017453292519943295*psi1_1_SYMREAL))))), 2.0)+pow(((yC0_5_SYMREAL-((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(sin(psiC_6_SYMREAL)-sin((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*sin((0.017453292519943295*psi1_1_SYMREAL)))), 2.0)))>999.0)) && ((((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)!=0.0)) && ((vA_2_SYMREAL!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		initNum.add("0.0,0.0,0.0,0.0,-88.2511826472,-69.4462632631,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.125 seconds.Unsolved.     
		functionName.add(" tsafe.Conflict.main()_7");
		paraName.add("vC_3_SYMREAL,bank_ang_7_SYMREAL,vA_2_SYMREAL,psi1_1_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)==0.0)) && ((vA_2_SYMREAL!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		initNum.add("0.0,0.0,-69.4462632631,-88.2511826472");
		
		//Parse time: 0.0 seconds.Solve time: 0.018 seconds.Solved.     
		functionName.add(" tsafe.Conflict.main()_8");
		paraName.add("vA_2_SYMREAL,bank_ang_7_SYMREAL,psi1_1_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((vA_2_SYMREAL==0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		initNum.add("0.0,0.0,-6.8509106908");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample08.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.594 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample08.main()_0");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((cos((((3.0*x_4_SYMREAL)+(2.0*y_5_SYMREAL))-z_6_SYMREAL))*sin(((z_6_SYMREAL+x_4_SYMREAL)+y_5_SYMREAL)))<cos(((z_6_SYMREAL*x_4_SYMREAL)*y_5_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.002 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample08.main()_1");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((cos((((3.0*x_4_SYMREAL)+(2.0*y_5_SYMREAL))-z_6_SYMREAL))*sin(((z_6_SYMREAL+x_4_SYMREAL)+y_5_SYMREAL)))>cos(((z_6_SYMREAL*x_4_SYMREAL)*y_5_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     null
		functionName.add(" coral.tests.samples.Sample08.main()_2");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((cos((((3.0*x_4_SYMREAL)+(2.0*y_5_SYMREAL))-z_6_SYMREAL))*sin(((z_6_SYMREAL+x_4_SYMREAL)+y_5_SYMREAL)))>cos(((z_6_SYMREAL*x_4_SYMREAL)*y_5_SYMREAL))))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetSphereIntersect.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.826 seconds.Unsolved.     
		functionName.add(" JpfTargetSphereIntersect.main()_0");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.002 seconds.Solved.     
		functionName.add(" JpfTargetSphereIntersect.main()_1");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))>0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.044 seconds.Solved.     
		functionName.add(" JpfTargetSphereIntersect.main()_2");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((1.0==(((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.012 seconds.Solved.     
		functionName.add(" JpfTargetSphereIntersect.main()_3");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.246 seconds.Solved.     
		functionName.add(" JpfTargetSphereIntersect.main()_4");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((0.0==(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL))) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.675 seconds.Solved.     
		functionName.add(" JpfTargetSphereIntersect.main()_5");
		paraName.add("rad_14_SYMREAL,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))<0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.342 seconds.Solved.     
		functionName.add(" JpfTargetSphereIntersect.main()_6");
		paraName.add("rad_14_SYMREAL,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 1.418 seconds.Solved.     
		functionName.add(" JpfTargetSphereIntersect.main()_7");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-exp((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))<0.0)) && (((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 3.896 seconds.Unsolved.     
		functionName.add(" JpfTargetSphereIntersect.main()_8");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-exp((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))>0.0)) && (((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 4.654 seconds.Unsolved.     
		functionName.add(" JpfTargetSphereIntersect.main()_9");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((0.0==(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-exp((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL))))))) && (((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.     null
		functionName.add(" JpfTargetSphereIntersect.main()_10");
		paraName.add("rad_14_SYMREAL,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample91.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.589 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample91.main()_0");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(x_3_SYMREAL)<(0.0-sin(y_4_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.015 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample91.main()_1");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(x_3_SYMREAL)>(0.0-sin(y_4_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.219 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample91.main()_2");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(x_3_SYMREAL)<0.0)) && (((0.0-sin(y_4_SYMREAL))==sin(x_3_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.193 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample91.main()_3");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(x_3_SYMREAL)>0.0)) && (((0.0-sin(y_4_SYMREAL))==sin(x_3_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.     null
		functionName.add(" coral.tests.samples.Sample91.main()_4");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(x_3_SYMREAL)>0.0)) && (((0.0-sin(y_4_SYMREAL))==sin(x_3_SYMREAL)))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample25.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.578 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample25.main()_0");
		paraName.add("x_6_SYMREAL,y_7_SYMREAL,z_8_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((sin(cos((x_6_SYMREAL*y_7_SYMREAL)))<cos(sin((x_6_SYMREAL*z_8_SYMREAL)))))");
		initNum.add("");
		
		//Parse time: 0.001 seconds.Solve time: 0.005 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample25.main()_1");
		paraName.add("x_6_SYMREAL,y_7_SYMREAL,z_8_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((sin(cos((x_6_SYMREAL*y_7_SYMREAL)))>cos(sin((x_6_SYMREAL*z_8_SYMREAL)))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.007 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample25.main()_2");
		paraName.add("w_9_SYMREAL,v_10_SYMREAL,y_7_SYMREAL,x_6_SYMREAL,z_8_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("(((sin(((2.0*w_9_SYMREAL)+v_10_SYMREAL))-1.0)!=0.0)) && (((cos(((2.0*y_7_SYMREAL)+v_10_SYMREAL))+1.0)!=0.0)) && ((sin(cos((x_6_SYMREAL*y_7_SYMREAL)))<cos(sin((x_6_SYMREAL*z_8_SYMREAL)))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.816 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample25.main()_3");
		paraName.add("z_8_SYMREAL,x_6_SYMREAL,w_9_SYMREAL,v_10_SYMREAL,y_7_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("(((cos(((2.0*z_8_SYMREAL)+x_6_SYMREAL))/(sin(((2.0*w_9_SYMREAL)+v_10_SYMREAL))-1.0))==(sin(((2.0*w_9_SYMREAL)-y_7_SYMREAL))/(cos(((2.0*y_7_SYMREAL)+v_10_SYMREAL))+1.0)))) && (((sin(((2.0*w_9_SYMREAL)+v_10_SYMREAL))-1.0)!=0.0)) && (((cos(((2.0*y_7_SYMREAL)+v_10_SYMREAL))+1.0)!=0.0)) && ((sin(cos((x_6_SYMREAL*y_7_SYMREAL)))<cos(sin((x_6_SYMREAL*z_8_SYMREAL)))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.005 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample25.main()_4");
		paraName.add("w_9_SYMREAL,y_7_SYMREAL,v_10_SYMREAL,z_8_SYMREAL,x_6_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("(((sin(((2.0*w_9_SYMREAL)-y_7_SYMREAL))/(cos(((2.0*y_7_SYMREAL)+v_10_SYMREAL))+1.0))<(cos(((2.0*z_8_SYMREAL)+x_6_SYMREAL))/(sin(((2.0*w_9_SYMREAL)+v_10_SYMREAL))-1.0)))) && (((sin(((2.0*w_9_SYMREAL)+v_10_SYMREAL))-1.0)!=0.0)) && (((cos(((2.0*y_7_SYMREAL)+v_10_SYMREAL))+1.0)!=0.0)) && ((sin(cos((x_6_SYMREAL*y_7_SYMREAL)))<cos(sin((x_6_SYMREAL*z_8_SYMREAL)))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.279 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample25.main()_5");
		paraName.add("w_9_SYMREAL,v_10_SYMREAL,y_7_SYMREAL,x_6_SYMREAL,z_8_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("(((sin(((2.0*w_9_SYMREAL)+v_10_SYMREAL))-1.0)==0.0)) && (((cos(((2.0*y_7_SYMREAL)+v_10_SYMREAL))+1.0)!=0.0)) && ((sin(cos((x_6_SYMREAL*y_7_SYMREAL)))<cos(sin((x_6_SYMREAL*z_8_SYMREAL)))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.02 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample25.main()_6");
		paraName.add("x_6_SYMREAL,z_8_SYMREAL,y_7_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((cos(sin((x_6_SYMREAL*z_8_SYMREAL)))==sin(cos((x_6_SYMREAL*y_7_SYMREAL)))))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample42.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.597 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample42.main()_0");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((pow(x_3_SYMREAL, y_4_SYMREAL)<pow(y_4_SYMREAL, x_3_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.04 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample42.main()_1");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((pow(x_3_SYMREAL, y_4_SYMREAL)>pow(y_4_SYMREAL, x_3_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.005 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample42.main()_2");
		paraName.add("y_4_SYMREAL,x_3_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((pow(y_4_SYMREAL, x_3_SYMREAL)==pow(x_3_SYMREAL, y_4_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.096 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample42.main()_3");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((1.0==x_3_SYMREAL)) && ((pow(x_3_SYMREAL, y_4_SYMREAL)>pow(y_4_SYMREAL, x_3_SYMREAL)))");
		initNum.add("1.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.037 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample42.main()_4");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((x_3_SYMREAL<1.0)) && ((pow(x_3_SYMREAL, y_4_SYMREAL)>pow(y_4_SYMREAL, x_3_SYMREAL)))");
		initNum.add("0.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.066 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample42.main()_5");
		paraName.add("y_4_SYMREAL,x_3_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((y_4_SYMREAL<10.0)) && ((x_3_SYMREAL>1.0)) && ((pow(x_3_SYMREAL, y_4_SYMREAL)>pow(y_4_SYMREAL, x_3_SYMREAL)))");
		initNum.add("-27.1189050521,80.5945379041");
		
		//Parse time: 0.0 seconds.Solve time: 0.027 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample42.main()_6");
		paraName.add("y_4_SYMREAL,x_3_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((y_4_SYMREAL>10.0)) && ((x_3_SYMREAL>1.0)) && ((pow(x_3_SYMREAL, y_4_SYMREAL)>pow(y_4_SYMREAL, x_3_SYMREAL)))");
		initNum.add("69.6299867755,80.5945379041");
		
		//Parse time: 0.0 seconds.Solve time: 0.122 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample42.main()_7");
		paraName.add("y_4_SYMREAL,x_3_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((10.0==y_4_SYMREAL)) && ((x_3_SYMREAL>1.0)) && ((pow(x_3_SYMREAL, y_4_SYMREAL)>pow(y_4_SYMREAL, x_3_SYMREAL)))");
		initNum.add("10.0,80.5945379041");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample82.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.584 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample82.main()_0");
		paraName.add("a_3_SYMREAL,b_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((10000.0*a_3_SYMREAL)*b_4_SYMREAL)-1.0)<0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.004 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample82.main()_1");
		paraName.add("a_3_SYMREAL,b_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((10000.0*a_3_SYMREAL)*b_4_SYMREAL)-1.0)>0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.518 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample82.main()_2");
		paraName.add("a_3_SYMREAL,b_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((((pow(2.718281828459045, (0.0-a_3_SYMREAL))+pow(2.718281828459045, (0.0-b_4_SYMREAL)))-1.0001)<0.0)) && ((0.0==(((10000.0*a_3_SYMREAL)*b_4_SYMREAL)-1.0)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.049 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample82.main()_3");
		paraName.add("a_3_SYMREAL,b_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((((pow(2.718281828459045, (0.0-a_3_SYMREAL))+pow(2.718281828459045, (0.0-b_4_SYMREAL)))-1.0001)>0.0)) && ((0.0==(((10000.0*a_3_SYMREAL)*b_4_SYMREAL)-1.0)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     null
		functionName.add(" coral.tests.samples.Sample82.main()_4");
		paraName.add("a_3_SYMREAL,b_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((10000.0*a_3_SYMREAL)*b_4_SYMREAL)-1.0)>0.0))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample80.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.591 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample80.main()_0");
		paraName.add("a_3_SYMREAL,b_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.5-(a_3_SYMREAL*(1.0-b_4_SYMREAL)))<0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample80.main()_1");
		paraName.add("a_3_SYMREAL,b_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.5-(a_3_SYMREAL*(1.0-b_4_SYMREAL)))>0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.009 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample80.main()_2");
		paraName.add("a_3_SYMREAL,b_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(1.5-(a_3_SYMREAL*(1.0-b_4_SYMREAL)))))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample13.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.763 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample13.main()_0");
		paraName.add("y_6_SYMREAL,x_5_SYMREAL,z_7_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((sin(y_6_SYMREAL)*asin(x_5_SYMREAL))<((cos(y_6_SYMREAL)*cos(z_7_SYMREAL))-atan(w_8_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.06 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample13.main()_1");
		paraName.add("y_6_SYMREAL,x_5_SYMREAL,z_7_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((sin(y_6_SYMREAL)*asin(x_5_SYMREAL))>((cos(y_6_SYMREAL)*cos(z_7_SYMREAL))-atan(w_8_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.133 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample13.main()_2");
		paraName.add("y_6_SYMREAL,z_7_SYMREAL,w_8_SYMREAL,x_5_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((((cos(y_6_SYMREAL)*cos(z_7_SYMREAL))-atan(w_8_SYMREAL))==(sin(y_6_SYMREAL)*asin(x_5_SYMREAL))))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample62.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.973 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample62.main()_0");
		paraName.add("w_8_SYMREAL");
		paraType.add("double");
		binaryExp.add("((w_8_SYMREAL!=0.0))");
		initNum.add("60.797046271");
		
		//Parse time: 0.0 seconds.Solve time: 0.016 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample62.main()_1");
		paraName.add("z_7_SYMREAL,w_8_SYMREAL,x_5_SYMREAL,y_6_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((z_7_SYMREAL/w_8_SYMREAL)==(x_5_SYMREAL+y_6_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("0.0,60.797046271,0.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.012 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample62.main()_2");
		paraName.add("x_5_SYMREAL,y_6_SYMREAL,z_7_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((x_5_SYMREAL+y_6_SYMREAL)<(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("0.0,0.0,0.0,60.797046271");
		
		//Parse time: 0.0 seconds.Solve time: 0.013 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample62.main()_3");
		paraName.add("y_6_SYMREAL,x_5_SYMREAL,z_7_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((y_6_SYMREAL!=0.0)) && (((x_5_SYMREAL+y_6_SYMREAL)>(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("32.5110817233,0.0,0.0,60.797046271");
		
		//Parse time: 0.0 seconds.Solve time: 0.412 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample62.main()_4");
		paraName.add("z_7_SYMREAL,y_6_SYMREAL,x_5_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((z_7_SYMREAL/y_6_SYMREAL)==exp(x_5_SYMREAL))) && ((y_6_SYMREAL!=0.0)) && (((x_5_SYMREAL+y_6_SYMREAL)>(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("0.0,32.5110817233,0.0,60.797046271");
		
		//Parse time: 0.0 seconds.Solve time: 0.045 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample62.main()_5");
		paraName.add("x_5_SYMREAL,z_7_SYMREAL,y_6_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((exp(x_5_SYMREAL)<(z_7_SYMREAL/y_6_SYMREAL))) && ((y_6_SYMREAL!=0.0)) && (((x_5_SYMREAL+y_6_SYMREAL)>(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("0.0,0.0,32.5110817233,60.797046271");
		
		//Parse time: 0.0 seconds.Solve time: 0.05 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample62.main()_6");
		paraName.add("y_6_SYMREAL,z_7_SYMREAL,w_8_SYMREAL,x_5_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((pow(y_6_SYMREAL, 6.0)==(((2.0*z_7_SYMREAL)+(3.0*w_8_SYMREAL))+(7.0*x_5_SYMREAL)))) && ((exp(x_5_SYMREAL)>(z_7_SYMREAL/y_6_SYMREAL))) && ((y_6_SYMREAL!=0.0)) && (((x_5_SYMREAL+y_6_SYMREAL)>(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("32.5110817233,0.0,60.797046271,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.016 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample62.main()_7");
		paraName.add("z_7_SYMREAL,w_8_SYMREAL,x_5_SYMREAL,y_6_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((z_7_SYMREAL+w_8_SYMREAL)<(x_5_SYMREAL+y_6_SYMREAL))) && (((((2.0*z_7_SYMREAL)+(3.0*w_8_SYMREAL))+(7.0*x_5_SYMREAL))<pow(y_6_SYMREAL, 6.0))) && ((exp(x_5_SYMREAL)>(z_7_SYMREAL/y_6_SYMREAL))) && ((y_6_SYMREAL!=0.0)) && (((x_5_SYMREAL+y_6_SYMREAL)>(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("-93.4393991486,-57.4635159315,40.5388993356,-33.5031885235");
		
		//Parse time: 0.0 seconds.Solve time: 0.028 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample62.main()_8");
		paraName.add("z_7_SYMREAL,w_8_SYMREAL,x_5_SYMREAL,y_6_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((z_7_SYMREAL+w_8_SYMREAL)>(x_5_SYMREAL+y_6_SYMREAL))) && (((((2.0*z_7_SYMREAL)+(3.0*w_8_SYMREAL))+(7.0*x_5_SYMREAL))<pow(y_6_SYMREAL, 6.0))) && ((exp(x_5_SYMREAL)>(z_7_SYMREAL/y_6_SYMREAL))) && ((y_6_SYMREAL!=0.0)) && (((x_5_SYMREAL+y_6_SYMREAL)>(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("-22.3678551305,60.797046271,-5.3977866378,32.5110817233");
		
		//Parse time: 0.0 seconds.Solve time: 0.011 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample62.main()_9");
		paraName.add("z_7_SYMREAL,w_8_SYMREAL,x_5_SYMREAL,y_6_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((z_7_SYMREAL+w_8_SYMREAL)>(x_5_SYMREAL+y_6_SYMREAL))) && (((((2.0*z_7_SYMREAL)+(3.0*w_8_SYMREAL))+(7.0*x_5_SYMREAL))<pow(y_6_SYMREAL, 6.0))) && ((exp(x_5_SYMREAL)>(z_7_SYMREAL/y_6_SYMREAL))) && ((y_6_SYMREAL!=0.0)) && (((x_5_SYMREAL+y_6_SYMREAL)>(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("-22.3678551305,60.797046271,-5.3977866378,32.5110817233");
		
		//Parse time: 0.0 seconds.Solve time: 0.207 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample62.main()_10");
		paraName.add("x_5_SYMREAL,y_6_SYMREAL,w_8_SYMREAL,z_7_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((x_5_SYMREAL/y_6_SYMREAL)==w_8_SYMREAL)) && (((z_7_SYMREAL+w_8_SYMREAL)>(x_5_SYMREAL+y_6_SYMREAL))) && (((((2.0*z_7_SYMREAL)+(3.0*w_8_SYMREAL))+(7.0*x_5_SYMREAL))<pow(y_6_SYMREAL, 6.0))) && ((exp(x_5_SYMREAL)>(z_7_SYMREAL/y_6_SYMREAL))) && ((y_6_SYMREAL!=0.0)) && (((x_5_SYMREAL+y_6_SYMREAL)>(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("-5.3977866378,32.5110817233,60.797046271,-22.3678551305");
		
		//Parse time: 0.0 seconds.Solve time: 0.15 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample62.main()_11");
		paraName.add("x_5_SYMREAL,w_8_SYMREAL,y_6_SYMREAL,z_7_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((x_5_SYMREAL<((w_8_SYMREAL+y_6_SYMREAL)-z_7_SYMREAL))) && ((w_8_SYMREAL<(x_5_SYMREAL/y_6_SYMREAL))) && (((z_7_SYMREAL+w_8_SYMREAL)>(x_5_SYMREAL+y_6_SYMREAL))) && (((((2.0*z_7_SYMREAL)+(3.0*w_8_SYMREAL))+(7.0*x_5_SYMREAL))<pow(y_6_SYMREAL, 6.0))) && ((exp(x_5_SYMREAL)>(z_7_SYMREAL/y_6_SYMREAL))) && ((y_6_SYMREAL!=0.0)) && (((x_5_SYMREAL+y_6_SYMREAL)>(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("-5.3977866378,60.797046271,32.5110817233,-22.3678551305");
		
		//Parse time: 0.0 seconds.Solve time: 0.028 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample62.main()_12");
		paraName.add("x_5_SYMREAL,w_8_SYMREAL,y_6_SYMREAL,z_7_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((x_5_SYMREAL>((w_8_SYMREAL+y_6_SYMREAL)-z_7_SYMREAL))) && ((w_8_SYMREAL<(x_5_SYMREAL/y_6_SYMREAL))) && (((z_7_SYMREAL+w_8_SYMREAL)>(x_5_SYMREAL+y_6_SYMREAL))) && (((((2.0*z_7_SYMREAL)+(3.0*w_8_SYMREAL))+(7.0*x_5_SYMREAL))<pow(y_6_SYMREAL, 6.0))) && ((exp(x_5_SYMREAL)>(z_7_SYMREAL/y_6_SYMREAL))) && ((y_6_SYMREAL!=0.0)) && (((x_5_SYMREAL+y_6_SYMREAL)>(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("64.2718357368,30.2537847547,37.1557522082,82.2359148068");
		
		//Parse time: 0.0 seconds.Solve time: 0.01 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample62.main()_13");
		paraName.add("w_8_SYMREAL,x_5_SYMREAL,y_6_SYMREAL,z_7_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((w_8_SYMREAL>(x_5_SYMREAL/y_6_SYMREAL))) && (((z_7_SYMREAL+w_8_SYMREAL)>(x_5_SYMREAL+y_6_SYMREAL))) && (((((2.0*z_7_SYMREAL)+(3.0*w_8_SYMREAL))+(7.0*x_5_SYMREAL))<pow(y_6_SYMREAL, 6.0))) && ((exp(x_5_SYMREAL)>(z_7_SYMREAL/y_6_SYMREAL))) && ((y_6_SYMREAL!=0.0)) && (((x_5_SYMREAL+y_6_SYMREAL)>(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("60.797046271,-5.3977866378,32.5110817233,-22.3678551305");
		
		//Parse time: 0.0 seconds.Solve time: 0.147 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample62.main()_14");
		paraName.add("y_6_SYMREAL,z_7_SYMREAL,w_8_SYMREAL,x_5_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((pow(y_6_SYMREAL, 6.0)==(((2.0*z_7_SYMREAL)+(3.0*w_8_SYMREAL))+(7.0*x_5_SYMREAL)))) && ((exp(x_5_SYMREAL)>(z_7_SYMREAL/y_6_SYMREAL))) && ((y_6_SYMREAL!=0.0)) && (((x_5_SYMREAL+y_6_SYMREAL)>(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("-1.0,0.0,-1.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.012 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample62.main()_15");
		paraName.add("y_6_SYMREAL,x_5_SYMREAL,z_7_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((y_6_SYMREAL==0.0)) && (((x_5_SYMREAL+y_6_SYMREAL)>(z_7_SYMREAL/w_8_SYMREAL))) && ((w_8_SYMREAL!=0.0))");
		initNum.add("0.0,0.0,0.0,60.797046271");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample62.main()_16");
		paraName.add("w_8_SYMREAL");
		paraType.add("double");
		binaryExp.add("((w_8_SYMREAL==0.0))");
		initNum.add("0.0");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetFreudensteinRoth.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.592 seconds.Solved.     
		functionName.add(" JpfTargetFreudensteinRoth.main()_0");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((x1_1_SYMREAL+-13.0)+((((5.0-x2_2_SYMREAL)*x2_2_SYMREAL)-2.0)*x2_2_SYMREAL))+((x1_1_SYMREAL+-29.0)+((((x2_2_SYMREAL+1.0)*x2_2_SYMREAL)-14.0)*x2_2_SYMREAL)))<0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.013 seconds.Solved.     
		functionName.add(" JpfTargetFreudensteinRoth.main()_1");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((x1_1_SYMREAL+-13.0)+((((5.0-x2_2_SYMREAL)*x2_2_SYMREAL)-2.0)*x2_2_SYMREAL))+((x1_1_SYMREAL+-29.0)+((((x2_2_SYMREAL+1.0)*x2_2_SYMREAL)-14.0)*x2_2_SYMREAL)))>0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.015 seconds.Solved.     
		functionName.add(" JpfTargetFreudensteinRoth.main()_2");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(((x1_1_SYMREAL+-13.0)+((((5.0-x2_2_SYMREAL)*x2_2_SYMREAL)-2.0)*x2_2_SYMREAL))+((x1_1_SYMREAL+-29.0)+((((x2_2_SYMREAL+1.0)*x2_2_SYMREAL)-14.0)*x2_2_SYMREAL)))))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample23.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.579 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample23.main()_0");
		paraName.add("y_6_SYMREAL,x_5_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((cos(((2.0*y_6_SYMREAL)+x_5_SYMREAL))+1.0)!=0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.007 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample23.main()_1");
		paraName.add("x_5_SYMREAL,y_6_SYMREAL,z_7_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((sin(((2.0*x_5_SYMREAL)-y_6_SYMREAL))/(cos(((2.0*y_6_SYMREAL)+x_5_SYMREAL))+1.0))<(cos(((2.0*z_7_SYMREAL)+x_5_SYMREAL))/(sin(((2.0*w_8_SYMREAL)+y_6_SYMREAL))-1.0)))) && (((sin(((2.0*w_8_SYMREAL)+y_6_SYMREAL))-1.0)!=0.0)) && (((cos(((2.0*y_6_SYMREAL)+x_5_SYMREAL))+1.0)!=0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.01 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample23.main()_2");
		paraName.add("x_5_SYMREAL,y_6_SYMREAL,z_7_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((sin(((2.0*x_5_SYMREAL)-y_6_SYMREAL))/(cos(((2.0*y_6_SYMREAL)+x_5_SYMREAL))+1.0))>(cos(((2.0*z_7_SYMREAL)+x_5_SYMREAL))/(sin(((2.0*w_8_SYMREAL)+y_6_SYMREAL))-1.0)))) && (((sin(((2.0*w_8_SYMREAL)+y_6_SYMREAL))-1.0)!=0.0)) && (((cos(((2.0*y_6_SYMREAL)+x_5_SYMREAL))+1.0)!=0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.138 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample23.main()_3");
		paraName.add("x_5_SYMREAL,y_6_SYMREAL,z_7_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((sin((((x_5_SYMREAL*y_6_SYMREAL)*z_7_SYMREAL)*w_8_SYMREAL))<0.0)) && (((cos(((2.0*z_7_SYMREAL)+x_5_SYMREAL))/(sin(((2.0*w_8_SYMREAL)+y_6_SYMREAL))-1.0))==(sin(((2.0*x_5_SYMREAL)-y_6_SYMREAL))/(cos(((2.0*y_6_SYMREAL)+x_5_SYMREAL))+1.0)))) && (((sin(((2.0*w_8_SYMREAL)+y_6_SYMREAL))-1.0)!=0.0)) && (((cos(((2.0*y_6_SYMREAL)+x_5_SYMREAL))+1.0)!=0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.56 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample23.main()_4");
		paraName.add("x_5_SYMREAL,y_6_SYMREAL,z_7_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((sin((((x_5_SYMREAL*y_6_SYMREAL)*z_7_SYMREAL)*w_8_SYMREAL))>0.0)) && (((cos(((2.0*z_7_SYMREAL)+x_5_SYMREAL))/(sin(((2.0*w_8_SYMREAL)+y_6_SYMREAL))-1.0))==(sin(((2.0*x_5_SYMREAL)-y_6_SYMREAL))/(cos(((2.0*y_6_SYMREAL)+x_5_SYMREAL))+1.0)))) && (((sin(((2.0*w_8_SYMREAL)+y_6_SYMREAL))-1.0)!=0.0)) && (((cos(((2.0*y_6_SYMREAL)+x_5_SYMREAL))+1.0)!=0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.177 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample23.main()_5");
		paraName.add("x_5_SYMREAL,y_6_SYMREAL,z_7_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((0.0==sin((((x_5_SYMREAL*y_6_SYMREAL)*z_7_SYMREAL)*w_8_SYMREAL)))) && (((cos(((2.0*z_7_SYMREAL)+x_5_SYMREAL))/(sin(((2.0*w_8_SYMREAL)+y_6_SYMREAL))-1.0))==(sin(((2.0*x_5_SYMREAL)-y_6_SYMREAL))/(cos(((2.0*y_6_SYMREAL)+x_5_SYMREAL))+1.0)))) && (((sin(((2.0*w_8_SYMREAL)+y_6_SYMREAL))-1.0)!=0.0)) && (((cos(((2.0*y_6_SYMREAL)+x_5_SYMREAL))+1.0)!=0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.101 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample23.main()_6");
		paraName.add("w_8_SYMREAL,y_6_SYMREAL,x_5_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((sin(((2.0*w_8_SYMREAL)+y_6_SYMREAL))-1.0)==0.0)) && (((cos(((2.0*y_6_SYMREAL)+x_5_SYMREAL))+1.0)!=0.0))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample32.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.581 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample32.main()_0");
		paraName.add("x_2_SYMREAL");
		paraType.add("double");
		binaryExp.add("((exp(x_2_SYMREAL)<5.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.006 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample32.main()_1");
		paraName.add("x_2_SYMREAL");
		paraType.add("double");
		binaryExp.add("((exp(x_2_SYMREAL)>5.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.004 seconds.Solved.     null
		functionName.add(" coral.tests.samples.Sample32.main()_2");
		paraName.add("x_2_SYMREAL");
		paraType.add("double");
		binaryExp.add("((exp(x_2_SYMREAL)>5.0))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample20.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.593 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample20.main()_0");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(sin((x_3_SYMREAL*y_4_SYMREAL)))<0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.005 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample20.main()_1");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(sin((x_3_SYMREAL*y_4_SYMREAL)))>0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.405 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample20.main()_2");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.25==cos((2.0*x_3_SYMREAL)))) && ((sin(sin((x_3_SYMREAL*y_4_SYMREAL)))<0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample20.main()_3");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((cos((2.0*x_3_SYMREAL))<0.25)) && ((sin(sin((x_3_SYMREAL*y_4_SYMREAL)))<0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.043 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample20.main()_4");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==sin(sin((x_3_SYMREAL*y_4_SYMREAL)))))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample27.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.586 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample27.main()_0");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((sin((x_4_SYMREAL*cos((y_5_SYMREAL*sin(z_6_SYMREAL)))))<cos((x_4_SYMREAL*sin((y_5_SYMREAL*cos(z_6_SYMREAL)))))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.01 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample27.main()_1");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((sin((x_4_SYMREAL*cos((y_5_SYMREAL*sin(z_6_SYMREAL)))))>cos((x_4_SYMREAL*sin((y_5_SYMREAL*cos(z_6_SYMREAL)))))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.122 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample27.main()_2");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((cos((x_4_SYMREAL*sin((y_5_SYMREAL*cos(z_6_SYMREAL)))))==sin((x_4_SYMREAL*cos((y_5_SYMREAL*sin(z_6_SYMREAL)))))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.277 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample27.main()_3");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((cos(sin((x_4_SYMREAL*y_5_SYMREAL)))==sin(cos((x_4_SYMREAL*y_5_SYMREAL))))) && ((sin((x_4_SYMREAL*cos((y_5_SYMREAL*sin(z_6_SYMREAL)))))>cos((x_4_SYMREAL*sin((y_5_SYMREAL*cos(z_6_SYMREAL)))))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.013 seconds.Solved.     null
		functionName.add(" coral.tests.samples.Sample27.main()_4");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((sin((x_4_SYMREAL*cos((y_5_SYMREAL*sin(z_6_SYMREAL)))))>cos((x_4_SYMREAL*sin((y_5_SYMREAL*cos(z_6_SYMREAL)))))))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample03.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.588 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample03.main()_0");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((sin(x_3_SYMREAL)-cos(y_4_SYMREAL))<0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample03.main()_1");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((sin(x_3_SYMREAL)-cos(y_4_SYMREAL))>0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.093 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample03.main()_2");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(sin(x_3_SYMREAL)-cos(y_4_SYMREAL))))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample75.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.589 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample75.main()_0");
		paraName.add("a_10_SYMREAL,b_11_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(a_10_SYMREAL)<sin(b_11_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.024 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample75.main()_1");
		paraName.add("a_10_SYMREAL,b_11_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(a_10_SYMREAL)>sin(b_11_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.098 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample75.main()_2");
		paraName.add("b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(b_11_SYMREAL)==sin(a_10_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.041 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample75.main()_3");
		paraName.add("c_12_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((sin(c_12_SYMREAL)==sin(b_11_SYMREAL))) && ((sin(a_10_SYMREAL)>sin(b_11_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample75.main()_4");
		paraName.add("b_11_SYMREAL,c_12_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((sin(b_11_SYMREAL)<sin(c_12_SYMREAL))) && ((sin(a_10_SYMREAL)>sin(b_11_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample75.main()_5");
		paraName.add("c_12_SYMREAL,d_13_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((sin(c_12_SYMREAL)<sin(d_13_SYMREAL))) && ((sin(b_11_SYMREAL)>sin(c_12_SYMREAL))) && ((sin(a_10_SYMREAL)>sin(b_11_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.09 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample75.main()_6");
		paraName.add("c_12_SYMREAL,d_13_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((sin(c_12_SYMREAL)>sin(d_13_SYMREAL))) && ((sin(b_11_SYMREAL)>sin(c_12_SYMREAL))) && ((sin(a_10_SYMREAL)>sin(b_11_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.094 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample75.main()_7");
		paraName.add("d_13_SYMREAL,c_12_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((sin(d_13_SYMREAL)==sin(c_12_SYMREAL))) && ((sin(b_11_SYMREAL)>sin(c_12_SYMREAL))) && ((sin(a_10_SYMREAL)>sin(b_11_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.101 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample75.main()_8");
		paraName.add("e_14_SYMREAL,d_13_SYMREAL,c_12_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((sin(e_14_SYMREAL)==sin(d_13_SYMREAL))) && ((sin(c_12_SYMREAL)>sin(d_13_SYMREAL))) && ((sin(b_11_SYMREAL)>sin(c_12_SYMREAL))) && ((sin(a_10_SYMREAL)>sin(b_11_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.065 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample75.main()_9");
		paraName.add("d_13_SYMREAL,e_14_SYMREAL,c_12_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((sin(d_13_SYMREAL)<sin(e_14_SYMREAL))) && ((sin(c_12_SYMREAL)>sin(d_13_SYMREAL))) && ((sin(b_11_SYMREAL)>sin(c_12_SYMREAL))) && ((sin(a_10_SYMREAL)>sin(b_11_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.079 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample75.main()_10");
		paraName.add("e_14_SYMREAL,f_15_SYMREAL,d_13_SYMREAL,c_12_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((sin(e_14_SYMREAL)<sin(f_15_SYMREAL))) && ((sin(d_13_SYMREAL)>sin(e_14_SYMREAL))) && ((sin(c_12_SYMREAL)>sin(d_13_SYMREAL))) && ((sin(b_11_SYMREAL)>sin(c_12_SYMREAL))) && ((sin(a_10_SYMREAL)>sin(b_11_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.067 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample75.main()_11");
		paraName.add("e_14_SYMREAL,f_15_SYMREAL,d_13_SYMREAL,c_12_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((sin(e_14_SYMREAL)>sin(f_15_SYMREAL))) && ((sin(d_13_SYMREAL)>sin(e_14_SYMREAL))) && ((sin(c_12_SYMREAL)>sin(d_13_SYMREAL))) && ((sin(b_11_SYMREAL)>sin(c_12_SYMREAL))) && ((sin(a_10_SYMREAL)>sin(b_11_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.     null
		functionName.add(" coral.tests.samples.Sample75.main()_12");
		paraName.add("f_15_SYMREAL,e_14_SYMREAL,d_13_SYMREAL,c_12_SYMREAL,b_11_SYMREAL,a_10_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((sin(f_15_SYMREAL)==sin(e_14_SYMREAL))) && ((sin(d_13_SYMREAL)>sin(e_14_SYMREAL))) && ((sin(c_12_SYMREAL)>sin(d_13_SYMREAL))) && ((sin(b_11_SYMREAL)>sin(c_12_SYMREAL))) && ((sin(a_10_SYMREAL)>sin(b_11_SYMREAL)))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/concolic.DART.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.595 seconds.Solved.     
		functionName.add(" concolic.DART.main()_0");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("(((x_1_SYMINT*(x_1_SYMINT*x_1_SYMINT))<=0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.369 seconds.Solved.     
		functionName.add(" concolic.DART.main()_1");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("((x_1_SYMINT<=0))");
		initNum.add("0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.012 seconds.Solved.     
		functionName.add(" concolic.DART.main()_2");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT!=20)) && ((x_1_SYMINT>0))");
		initNum.add("23.0,1.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.028 seconds.Solved.     null
		functionName.add(" concolic.DART.main()_3");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT==20)) && ((x_1_SYMINT>0))");
		initNum.add("20.0,1.0");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample73.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.588 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample73.main()_0");
		paraName.add("a_11_SYMREAL,b_12_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(a_11_SYMREAL)<sin(b_12_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.004 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample73.main()_1");
		paraName.add("a_11_SYMREAL,b_12_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(a_11_SYMREAL)>sin(b_12_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.061 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample73.main()_2");
		paraName.add("b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(b_12_SYMREAL)==sin(a_11_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.075 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample73.main()_3");
		paraName.add("c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((sin(c_13_SYMREAL)==sin(b_12_SYMREAL))) && ((sin(a_11_SYMREAL)>sin(b_12_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.002 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample73.main()_4");
		paraName.add("b_12_SYMREAL,c_13_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((sin(b_12_SYMREAL)<sin(c_13_SYMREAL))) && ((sin(a_11_SYMREAL)>sin(b_12_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.008 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample73.main()_5");
		paraName.add("c_13_SYMREAL,d_14_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((sin(c_13_SYMREAL)<sin(d_14_SYMREAL))) && ((sin(b_12_SYMREAL)>sin(c_13_SYMREAL))) && ((sin(a_11_SYMREAL)>sin(b_12_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.083 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample73.main()_6");
		paraName.add("c_13_SYMREAL,d_14_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((sin(c_13_SYMREAL)>sin(d_14_SYMREAL))) && ((sin(b_12_SYMREAL)>sin(c_13_SYMREAL))) && ((sin(a_11_SYMREAL)>sin(b_12_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.09 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample73.main()_7");
		paraName.add("d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((sin(d_14_SYMREAL)==sin(c_13_SYMREAL))) && ((sin(b_12_SYMREAL)>sin(c_13_SYMREAL))) && ((sin(a_11_SYMREAL)>sin(b_12_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.092 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample73.main()_8");
		paraName.add("e_15_SYMREAL,d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((sin(e_15_SYMREAL)==sin(d_14_SYMREAL))) && ((sin(c_13_SYMREAL)>sin(d_14_SYMREAL))) && ((sin(b_12_SYMREAL)>sin(c_13_SYMREAL))) && ((sin(a_11_SYMREAL)>sin(b_12_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.124 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample73.main()_9");
		paraName.add("d_14_SYMREAL,e_15_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((sin(d_14_SYMREAL)<sin(e_15_SYMREAL))) && ((sin(c_13_SYMREAL)>sin(d_14_SYMREAL))) && ((sin(b_12_SYMREAL)>sin(c_13_SYMREAL))) && ((sin(a_11_SYMREAL)>sin(b_12_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.063 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample73.main()_10");
		paraName.add("e_15_SYMREAL,f_16_SYMREAL,d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((sin(e_15_SYMREAL)<sin(f_16_SYMREAL))) && ((sin(d_14_SYMREAL)>sin(e_15_SYMREAL))) && ((sin(c_13_SYMREAL)>sin(d_14_SYMREAL))) && ((sin(b_12_SYMREAL)>sin(c_13_SYMREAL))) && ((sin(a_11_SYMREAL)>sin(b_12_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.157 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample73.main()_11");
		paraName.add("e_15_SYMREAL,f_16_SYMREAL,d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((sin(e_15_SYMREAL)>sin(f_16_SYMREAL))) && ((sin(d_14_SYMREAL)>sin(e_15_SYMREAL))) && ((sin(c_13_SYMREAL)>sin(d_14_SYMREAL))) && ((sin(b_12_SYMREAL)>sin(c_13_SYMREAL))) && ((sin(a_11_SYMREAL)>sin(b_12_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.103 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample73.main()_12");
		paraName.add("f_16_SYMREAL,e_15_SYMREAL,d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((sin(f_16_SYMREAL)==sin(e_15_SYMREAL))) && ((sin(d_14_SYMREAL)>sin(e_15_SYMREAL))) && ((sin(c_13_SYMREAL)>sin(d_14_SYMREAL))) && ((sin(b_12_SYMREAL)>sin(c_13_SYMREAL))) && ((sin(a_11_SYMREAL)>sin(b_12_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.07 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample73.main()_13");
		paraName.add("g_17_SYMREAL,f_16_SYMREAL,e_15_SYMREAL,d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((sin(g_17_SYMREAL)==sin(f_16_SYMREAL))) && ((sin(e_15_SYMREAL)>sin(f_16_SYMREAL))) && ((sin(d_14_SYMREAL)>sin(e_15_SYMREAL))) && ((sin(c_13_SYMREAL)>sin(d_14_SYMREAL))) && ((sin(b_12_SYMREAL)>sin(c_13_SYMREAL))) && ((sin(a_11_SYMREAL)>sin(b_12_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.059 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample73.main()_14");
		paraName.add("f_16_SYMREAL,g_17_SYMREAL,e_15_SYMREAL,d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((sin(f_16_SYMREAL)<sin(g_17_SYMREAL))) && ((sin(e_15_SYMREAL)>sin(f_16_SYMREAL))) && ((sin(d_14_SYMREAL)>sin(e_15_SYMREAL))) && ((sin(c_13_SYMREAL)>sin(d_14_SYMREAL))) && ((sin(b_12_SYMREAL)>sin(c_13_SYMREAL))) && ((sin(a_11_SYMREAL)>sin(b_12_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.085 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample73.main()_15");
		paraName.add("g_17_SYMREAL,h_18_SYMREAL,f_16_SYMREAL,e_15_SYMREAL,d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double");
		binaryExp.add("((sin(g_17_SYMREAL)<sin(h_18_SYMREAL))) && ((sin(f_16_SYMREAL)>sin(g_17_SYMREAL))) && ((sin(e_15_SYMREAL)>sin(f_16_SYMREAL))) && ((sin(d_14_SYMREAL)>sin(e_15_SYMREAL))) && ((sin(c_13_SYMREAL)>sin(d_14_SYMREAL))) && ((sin(b_12_SYMREAL)>sin(c_13_SYMREAL))) && ((sin(a_11_SYMREAL)>sin(b_12_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.048 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample73.main()_16");
		paraName.add("g_17_SYMREAL,h_18_SYMREAL,f_16_SYMREAL,e_15_SYMREAL,d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double");
		binaryExp.add("((sin(g_17_SYMREAL)>sin(h_18_SYMREAL))) && ((sin(f_16_SYMREAL)>sin(g_17_SYMREAL))) && ((sin(e_15_SYMREAL)>sin(f_16_SYMREAL))) && ((sin(d_14_SYMREAL)>sin(e_15_SYMREAL))) && ((sin(c_13_SYMREAL)>sin(d_14_SYMREAL))) && ((sin(b_12_SYMREAL)>sin(c_13_SYMREAL))) && ((sin(a_11_SYMREAL)>sin(b_12_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.057 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample73.main()_17");
		paraName.add("h_18_SYMREAL,g_17_SYMREAL,f_16_SYMREAL,e_15_SYMREAL,d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double");
		binaryExp.add("((sin(h_18_SYMREAL)==sin(g_17_SYMREAL))) && ((sin(f_16_SYMREAL)>sin(g_17_SYMREAL))) && ((sin(e_15_SYMREAL)>sin(f_16_SYMREAL))) && ((sin(d_14_SYMREAL)>sin(e_15_SYMREAL))) && ((sin(c_13_SYMREAL)>sin(d_14_SYMREAL))) && ((sin(b_12_SYMREAL)>sin(c_13_SYMREAL))) && ((sin(a_11_SYMREAL)>sin(b_12_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.099 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample73.main()_18");
		paraName.add("i_19_SYMREAL,h_18_SYMREAL,g_17_SYMREAL,f_16_SYMREAL,e_15_SYMREAL,d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double");
		binaryExp.add("((sin(i_19_SYMREAL)==sin(h_18_SYMREAL))) && ((sin(g_17_SYMREAL)>sin(h_18_SYMREAL))) && ((sin(f_16_SYMREAL)>sin(g_17_SYMREAL))) && ((sin(e_15_SYMREAL)>sin(f_16_SYMREAL))) && ((sin(d_14_SYMREAL)>sin(e_15_SYMREAL))) && ((sin(c_13_SYMREAL)>sin(d_14_SYMREAL))) && ((sin(b_12_SYMREAL)>sin(c_13_SYMREAL))) && ((sin(a_11_SYMREAL)>sin(b_12_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.065 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample73.main()_19");
		paraName.add("h_18_SYMREAL,i_19_SYMREAL,g_17_SYMREAL,f_16_SYMREAL,e_15_SYMREAL,d_14_SYMREAL,c_13_SYMREAL,b_12_SYMREAL,a_11_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double");
		binaryExp.add("((sin(h_18_SYMREAL)<sin(i_19_SYMREAL))) && ((sin(g_17_SYMREAL)>sin(h_18_SYMREAL))) && ((sin(f_16_SYMREAL)>sin(g_17_SYMREAL))) && ((sin(e_15_SYMREAL)>sin(f_16_SYMREAL))) && ((sin(d_14_SYMREAL)>sin(e_15_SYMREAL))) && ((sin(c_13_SYMREAL)>sin(d_14_SYMREAL))) && ((sin(b_12_SYMREAL)>sin(c_13_SYMREAL))) && ((sin(a_11_SYMREAL)>sin(b_12_SYMREAL)))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample49.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.59 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample49.main()_0");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((pow(x_3_SYMREAL, 2.0)+(3.0*exp(y_4_SYMREAL)))<(x_3_SYMREAL*y_4_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.002 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample49.main()_1");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((pow(x_3_SYMREAL, 2.0)+(3.0*exp(y_4_SYMREAL)))>(x_3_SYMREAL*y_4_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.322 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample49.main()_2");
		paraName.add("y_4_SYMREAL,x_3_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((pow(y_4_SYMREAL, 2.0)==x_3_SYMREAL)) && (((pow(x_3_SYMREAL, 2.0)+(3.0*exp(y_4_SYMREAL)))<(x_3_SYMREAL*y_4_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.375 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample49.main()_3");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((x_3_SYMREAL+y_4_SYMREAL)<50.0)) && (((pow(x_3_SYMREAL, 2.0)+(3.0*exp(y_4_SYMREAL)))<(x_3_SYMREAL*y_4_SYMREAL)))");
		initNum.add("0.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.204 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample49.main()_4");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((x_3_SYMREAL+y_4_SYMREAL)>50.0)) && (((pow(x_3_SYMREAL, 2.0)+(3.0*exp(y_4_SYMREAL)))<(x_3_SYMREAL*y_4_SYMREAL)))");
		initNum.add("60.797046271,32.5110817233");
		
		//Parse time: 0.0 seconds.Solve time: 0.029 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample49.main()_5");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((x_3_SYMREAL*y_4_SYMREAL)==(pow(x_3_SYMREAL, 2.0)+(3.0*exp(y_4_SYMREAL)))))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample18.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.642 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample18.main()_0");
		paraName.add("x_2_SYMREAL");
		paraType.add("double");
		binaryExp.add("(((acos(x_2_SYMREAL)+1.0)<asin(x_2_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.006 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample18.main()_1");
		paraName.add("x_2_SYMREAL");
		paraType.add("double");
		binaryExp.add("(((acos(x_2_SYMREAL)+1.0)>asin(x_2_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.006 seconds.Solved.     null
		functionName.add(" coral.tests.samples.Sample18.main()_2");
		paraName.add("x_2_SYMREAL");
		paraType.add("double");
		binaryExp.add("(((acos(x_2_SYMREAL)+1.0)>asin(x_2_SYMREAL)))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/concolic.TestStatCalc.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.939 seconds.Solved.     
		functionName.add(" concolic.TestStatCalc.main()_0");
		paraName.add("REAL_1,val_1_SYMINT");
		paraType.add("double,int");
		binaryExp.add("((REAL_1=val_1_SYMINT))");
		initNum.add("0.0,0.0");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" concolic.TestStatCalc.main()_1");
		paraName.add("val_1_SYMINT,REAL_1");
		paraType.add("int,double");
		binaryExp.add("((val_1_SYMINT<val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.     null
		functionName.add(" concolic.TestStatCalc.main()_2");
		paraName.add("val_1_SYMINT,REAL_1");
		paraType.add("int,double");
		binaryExp.add("((val_1_SYMINT==val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample22.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.588 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample22.main()_0");
		paraName.add("x_8_SYMREAL,y_9_SYMREAL,z_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((sin(cos((x_8_SYMREAL*y_9_SYMREAL)))<cos(sin((y_9_SYMREAL*z_10_SYMREAL)))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.03 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample22.main()_1");
		paraName.add("x_8_SYMREAL,y_9_SYMREAL,z_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((sin(cos((x_8_SYMREAL*y_9_SYMREAL)))>cos(sin((y_9_SYMREAL*z_10_SYMREAL)))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample22.main()_2");
		paraName.add("w_11_SYMREAL,v_12_SYMREAL,t_13_SYMREAL,q_14_SYMREAL,x_8_SYMREAL,y_9_SYMREAL,z_10_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("(((sin(((2.0*w_11_SYMREAL)+v_12_SYMREAL))+1.0)!=0.0)) && (((cos(((2.0*t_13_SYMREAL)+q_14_SYMREAL))+1.0)!=0.0)) && ((sin(cos((x_8_SYMREAL*y_9_SYMREAL)))<cos(sin((y_9_SYMREAL*z_10_SYMREAL)))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.197 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample22.main()_3");
		paraName.add("z_10_SYMREAL,x_8_SYMREAL,w_11_SYMREAL,v_12_SYMREAL,y_9_SYMREAL,t_13_SYMREAL,q_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("(((cos(((2.0*z_10_SYMREAL)+x_8_SYMREAL))/(sin(((2.0*w_11_SYMREAL)+v_12_SYMREAL))+1.0))==(sin(((2.0*w_11_SYMREAL)-y_9_SYMREAL))/(cos(((2.0*t_13_SYMREAL)+q_14_SYMREAL))+1.0)))) && (((sin(((2.0*w_11_SYMREAL)+v_12_SYMREAL))+1.0)!=0.0)) && (((cos(((2.0*t_13_SYMREAL)+q_14_SYMREAL))+1.0)!=0.0)) && ((sin(cos((x_8_SYMREAL*y_9_SYMREAL)))<cos(sin((y_9_SYMREAL*z_10_SYMREAL)))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.068 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample22.main()_4");
		paraName.add("w_11_SYMREAL,y_9_SYMREAL,t_13_SYMREAL,q_14_SYMREAL,z_10_SYMREAL,x_8_SYMREAL,v_12_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("(((sin(((2.0*w_11_SYMREAL)-y_9_SYMREAL))/(cos(((2.0*t_13_SYMREAL)+q_14_SYMREAL))+1.0))<(cos(((2.0*z_10_SYMREAL)+x_8_SYMREAL))/(sin(((2.0*w_11_SYMREAL)+v_12_SYMREAL))+1.0)))) && (((sin(((2.0*w_11_SYMREAL)+v_12_SYMREAL))+1.0)!=0.0)) && (((cos(((2.0*t_13_SYMREAL)+q_14_SYMREAL))+1.0)!=0.0)) && ((sin(cos((x_8_SYMREAL*y_9_SYMREAL)))<cos(sin((y_9_SYMREAL*z_10_SYMREAL)))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.006 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample22.main()_5");
		paraName.add("w_11_SYMREAL,y_9_SYMREAL,t_13_SYMREAL,q_14_SYMREAL,z_10_SYMREAL,x_8_SYMREAL,v_12_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("(((sin(((2.0*w_11_SYMREAL)-y_9_SYMREAL))/(cos(((2.0*t_13_SYMREAL)+q_14_SYMREAL))+1.0))>(cos(((2.0*z_10_SYMREAL)+x_8_SYMREAL))/(sin(((2.0*w_11_SYMREAL)+v_12_SYMREAL))+1.0)))) && (((sin(((2.0*w_11_SYMREAL)+v_12_SYMREAL))+1.0)!=0.0)) && (((cos(((2.0*t_13_SYMREAL)+q_14_SYMREAL))+1.0)!=0.0)) && ((sin(cos((x_8_SYMREAL*y_9_SYMREAL)))<cos(sin((y_9_SYMREAL*z_10_SYMREAL)))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.194 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample22.main()_6");
		paraName.add("t_13_SYMREAL,q_14_SYMREAL,x_8_SYMREAL,y_9_SYMREAL,z_10_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("(((cos(((2.0*t_13_SYMREAL)+q_14_SYMREAL))+1.0)==0.0)) && ((sin(cos((x_8_SYMREAL*y_9_SYMREAL)))<cos(sin((y_9_SYMREAL*z_10_SYMREAL)))))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample43.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.595 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample43.main()_0");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((pow(x_3_SYMREAL, y_4_SYMREAL)<pow(y_4_SYMREAL, x_3_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.004 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample43.main()_1");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((pow(x_3_SYMREAL, y_4_SYMREAL)>pow(y_4_SYMREAL, x_3_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.036 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample43.main()_2");
		paraName.add("y_4_SYMREAL,x_3_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((pow(y_4_SYMREAL, x_3_SYMREAL)==pow(x_3_SYMREAL, y_4_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.387 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample43.main()_3");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((exp(x_3_SYMREAL)==exp(y_4_SYMREAL))) && ((pow(x_3_SYMREAL, y_4_SYMREAL)>pow(y_4_SYMREAL, x_3_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.007 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample43.main()_4");
		paraName.add("y_4_SYMREAL,x_3_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((exp(y_4_SYMREAL)<exp(x_3_SYMREAL))) && ((pow(x_3_SYMREAL, y_4_SYMREAL)>pow(y_4_SYMREAL, x_3_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.483 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample43.main()_5");
		paraName.add("x_3_SYMREAL,y_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((pow(x_3_SYMREAL, 2.0)==y_4_SYMREAL)) && ((exp(y_4_SYMREAL)>exp(x_3_SYMREAL))) && ((pow(x_3_SYMREAL, y_4_SYMREAL)>pow(y_4_SYMREAL, x_3_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.     null
		functionName.add(" coral.tests.samples.Sample43.main()_6");
		paraName.add("y_4_SYMREAL,x_3_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((y_4_SYMREAL<pow(x_3_SYMREAL, 2.0))) && ((exp(y_4_SYMREAL)>exp(x_3_SYMREAL))) && ((pow(x_3_SYMREAL, y_4_SYMREAL)>pow(y_4_SYMREAL, x_3_SYMREAL)))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample72.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.585 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample72.main()_0");
		paraName.add("a_8_SYMREAL,b_9_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(a_8_SYMREAL)<sin(b_9_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample72.main()_1");
		paraName.add("a_8_SYMREAL,b_9_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(a_8_SYMREAL)>sin(b_9_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.084 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample72.main()_2");
		paraName.add("b_9_SYMREAL,a_8_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(b_9_SYMREAL)==sin(a_8_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.027 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample72.main()_3");
		paraName.add("c_10_SYMREAL,b_9_SYMREAL,a_8_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((sin(c_10_SYMREAL)==sin(b_9_SYMREAL))) && ((sin(a_8_SYMREAL)>sin(b_9_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample72.main()_4");
		paraName.add("b_9_SYMREAL,c_10_SYMREAL,a_8_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((sin(b_9_SYMREAL)<sin(c_10_SYMREAL))) && ((sin(a_8_SYMREAL)>sin(b_9_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.064 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample72.main()_5");
		paraName.add("c_10_SYMREAL,d_11_SYMREAL,b_9_SYMREAL,a_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((sin(c_10_SYMREAL)<sin(d_11_SYMREAL))) && ((sin(b_9_SYMREAL)>sin(c_10_SYMREAL))) && ((sin(a_8_SYMREAL)>sin(b_9_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.05 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample72.main()_6");
		paraName.add("c_10_SYMREAL,d_11_SYMREAL,b_9_SYMREAL,a_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((sin(c_10_SYMREAL)>sin(d_11_SYMREAL))) && ((sin(b_9_SYMREAL)>sin(c_10_SYMREAL))) && ((sin(a_8_SYMREAL)>sin(b_9_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.435 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample72.main()_7");
		paraName.add("d_11_SYMREAL,c_10_SYMREAL,b_9_SYMREAL,a_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((sin(d_11_SYMREAL)==sin(c_10_SYMREAL))) && ((sin(b_9_SYMREAL)>sin(c_10_SYMREAL))) && ((sin(a_8_SYMREAL)>sin(b_9_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.055 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample72.main()_8");
		paraName.add("e_12_SYMREAL,d_11_SYMREAL,c_10_SYMREAL,b_9_SYMREAL,a_8_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((sin(e_12_SYMREAL)==sin(d_11_SYMREAL))) && ((sin(c_10_SYMREAL)>sin(d_11_SYMREAL))) && ((sin(b_9_SYMREAL)>sin(c_10_SYMREAL))) && ((sin(a_8_SYMREAL)>sin(b_9_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.057 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample72.main()_9");
		paraName.add("d_11_SYMREAL,e_12_SYMREAL,c_10_SYMREAL,b_9_SYMREAL,a_8_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((sin(d_11_SYMREAL)<sin(e_12_SYMREAL))) && ((sin(c_10_SYMREAL)>sin(d_11_SYMREAL))) && ((sin(b_9_SYMREAL)>sin(c_10_SYMREAL))) && ((sin(a_8_SYMREAL)>sin(b_9_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.091 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample72.main()_10");
		paraName.add("e_12_SYMREAL,f_13_SYMREAL,d_11_SYMREAL,c_10_SYMREAL,b_9_SYMREAL,a_8_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((sin(e_12_SYMREAL)<sin(f_13_SYMREAL))) && ((sin(d_11_SYMREAL)>sin(e_12_SYMREAL))) && ((sin(c_10_SYMREAL)>sin(d_11_SYMREAL))) && ((sin(b_9_SYMREAL)>sin(c_10_SYMREAL))) && ((sin(a_8_SYMREAL)>sin(b_9_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.047 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample72.main()_11");
		paraName.add("e_12_SYMREAL,f_13_SYMREAL,d_11_SYMREAL,c_10_SYMREAL,b_9_SYMREAL,a_8_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((sin(e_12_SYMREAL)>sin(f_13_SYMREAL))) && ((sin(d_11_SYMREAL)>sin(e_12_SYMREAL))) && ((sin(c_10_SYMREAL)>sin(d_11_SYMREAL))) && ((sin(b_9_SYMREAL)>sin(c_10_SYMREAL))) && ((sin(a_8_SYMREAL)>sin(b_9_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.04 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample72.main()_12");
		paraName.add("f_13_SYMREAL,e_12_SYMREAL,d_11_SYMREAL,c_10_SYMREAL,b_9_SYMREAL,a_8_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((sin(f_13_SYMREAL)==sin(e_12_SYMREAL))) && ((sin(d_11_SYMREAL)>sin(e_12_SYMREAL))) && ((sin(c_10_SYMREAL)>sin(d_11_SYMREAL))) && ((sin(b_9_SYMREAL)>sin(c_10_SYMREAL))) && ((sin(a_8_SYMREAL)>sin(b_9_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.08 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample72.main()_13");
		paraName.add("g_14_SYMREAL,f_13_SYMREAL,e_12_SYMREAL,d_11_SYMREAL,c_10_SYMREAL,b_9_SYMREAL,a_8_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((sin(g_14_SYMREAL)==sin(f_13_SYMREAL))) && ((sin(e_12_SYMREAL)>sin(f_13_SYMREAL))) && ((sin(d_11_SYMREAL)>sin(e_12_SYMREAL))) && ((sin(c_10_SYMREAL)>sin(d_11_SYMREAL))) && ((sin(b_9_SYMREAL)>sin(c_10_SYMREAL))) && ((sin(a_8_SYMREAL)>sin(b_9_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.038 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample72.main()_14");
		paraName.add("f_13_SYMREAL,g_14_SYMREAL,e_12_SYMREAL,d_11_SYMREAL,c_10_SYMREAL,b_9_SYMREAL,a_8_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((sin(f_13_SYMREAL)<sin(g_14_SYMREAL))) && ((sin(e_12_SYMREAL)>sin(f_13_SYMREAL))) && ((sin(d_11_SYMREAL)>sin(e_12_SYMREAL))) && ((sin(c_10_SYMREAL)>sin(d_11_SYMREAL))) && ((sin(b_9_SYMREAL)>sin(c_10_SYMREAL))) && ((sin(a_8_SYMREAL)>sin(b_9_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.     null
		functionName.add(" coral.tests.samples.Sample72.main()_15");
		paraName.add("f_13_SYMREAL,g_14_SYMREAL,e_12_SYMREAL,d_11_SYMREAL,c_10_SYMREAL,b_9_SYMREAL,a_8_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((sin(f_13_SYMREAL)>sin(g_14_SYMREAL))) && ((sin(e_12_SYMREAL)>sin(f_13_SYMREAL))) && ((sin(d_11_SYMREAL)>sin(e_12_SYMREAL))) && ((sin(c_10_SYMREAL)>sin(d_11_SYMREAL))) && ((sin(b_9_SYMREAL)>sin(c_10_SYMREAL))) && ((sin(a_8_SYMREAL)>sin(b_9_SYMREAL)))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample53.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.582 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample53.main()_0");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((pow(x_4_SYMREAL, tan(y_5_SYMREAL))+z_6_SYMREAL)<(x_4_SYMREAL*atan(z_6_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.004 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample53.main()_1");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((pow(x_4_SYMREAL, tan(y_5_SYMREAL))+z_6_SYMREAL)>(x_4_SYMREAL*atan(z_6_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.296 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample53.main()_2");
		paraName.add("x_4_SYMREAL,z_6_SYMREAL,y_5_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((x_4_SYMREAL-z_6_SYMREAL)==((sin(y_5_SYMREAL)+cos(y_5_SYMREAL))+tan(y_5_SYMREAL)))) && (((pow(x_4_SYMREAL, tan(y_5_SYMREAL))+z_6_SYMREAL)<(x_4_SYMREAL*atan(z_6_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.07 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample53.main()_3");
		paraName.add("y_5_SYMREAL,x_4_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((((sin(y_5_SYMREAL)+cos(y_5_SYMREAL))+tan(y_5_SYMREAL))<(x_4_SYMREAL-z_6_SYMREAL))) && (((pow(x_4_SYMREAL, tan(y_5_SYMREAL))+z_6_SYMREAL)<(x_4_SYMREAL*atan(z_6_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.025 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample53.main()_4");
		paraName.add("y_5_SYMREAL,x_4_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((y_5_SYMREAL==(atan(x_4_SYMREAL)+atan(y_5_SYMREAL)))) && ((((sin(y_5_SYMREAL)+cos(y_5_SYMREAL))+tan(y_5_SYMREAL))>(x_4_SYMREAL-z_6_SYMREAL))) && (((pow(x_4_SYMREAL, tan(y_5_SYMREAL))+z_6_SYMREAL)<(x_4_SYMREAL*atan(z_6_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.302 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample53.main()_5");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((atan(x_4_SYMREAL)+atan(y_5_SYMREAL))<y_5_SYMREAL)) && ((((sin(y_5_SYMREAL)+cos(y_5_SYMREAL))+tan(y_5_SYMREAL))>(x_4_SYMREAL-z_6_SYMREAL))) && (((pow(x_4_SYMREAL, tan(y_5_SYMREAL))+z_6_SYMREAL)<(x_4_SYMREAL*atan(z_6_SYMREAL))))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample19.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.867 seconds.Unsolved.     
		functionName.add(" coral.tests.samples.Sample19.main()_0");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((3.0*acos(x_4_SYMREAL))<(atan(y_5_SYMREAL)+asin(z_6_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.191 seconds.Unsolved.     null
		functionName.add(" coral.tests.samples.Sample19.main()_1");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((3.0*acos(x_4_SYMREAL))>(atan(y_5_SYMREAL)+asin(z_6_SYMREAL))))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample11.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.589 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample11.main()_0");
		paraName.add("x_5_SYMREAL,y_6_SYMREAL,z_7_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((asin(x_5_SYMREAL)<((cos(y_6_SYMREAL)*cos(z_7_SYMREAL))-atan(w_8_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.001 seconds.Solve time: 0.035 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample11.main()_1");
		paraName.add("x_5_SYMREAL,y_6_SYMREAL,z_7_SYMREAL,w_8_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((asin(x_5_SYMREAL)>((cos(y_6_SYMREAL)*cos(z_7_SYMREAL))-atan(w_8_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.203 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample11.main()_2");
		paraName.add("y_6_SYMREAL,z_7_SYMREAL,w_8_SYMREAL,x_5_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((((cos(y_6_SYMREAL)*cos(z_7_SYMREAL))-atan(w_8_SYMREAL))==asin(x_5_SYMREAL)))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetSurfaceShade.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.549 seconds.Solved.     
		functionName.add(" JpfTargetSurfaceShade.main()_0");
		paraName.add("lType_20_SYMINT");
		paraType.add("int");
		binaryExp.add("((lType_20_SYMINT==0))");
		initNum.add("0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.013 seconds.Solved.     
		functionName.add(" JpfTargetSurfaceShade.main()_1");
		paraName.add("lType_20_SYMINT");
		paraType.add("int");
		binaryExp.add("((lType_20_SYMINT!=1)) && ((lType_20_SYMINT!=0))");
		initNum.add("59.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.354 seconds.Unsolved.     
		functionName.add(" JpfTargetSurfaceShade.main()_2");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("(((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))<0.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		initNum.add("0.0,0.0,0.0,1.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.056 seconds.Solved.     
		functionName.add(" JpfTargetSurfaceShade.main()_3");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("(((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))>0.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		initNum.add("0.0,0.0,0.0,1.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.028 seconds.Solved.     
		functionName.add(" JpfTargetSurfaceShade.main()_4");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("((1.0==(((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL)))) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		initNum.add("0.0,0.0,0.0,1.0");
		
		//Parse time: 0.001 seconds.Solve time: 0.137 seconds.Solved.     
		functionName.add(" JpfTargetSurfaceShade.main()_5");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("((exp((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL)))!=0.0)) && (((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))<1.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		initNum.add("0.0,0.0,0.0,1.0");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSurfaceShade.main()_6");
		paraName.add("lType_20_SYMINT,lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL");
		paraType.add("int,double,double,double");
		binaryExp.add("((lType_20_SYMINT==0)) && ((exp((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL)))!=0.0)) && (((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))<1.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample84.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.586 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample84.main()_0");
		paraName.add("b_6_SYMREAL,a_5_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((10.0*(b_6_SYMREAL-(a_5_SYMREAL*a_5_SYMREAL)))<0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.006 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample84.main()_1");
		paraName.add("b_6_SYMREAL,a_5_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((10.0*(b_6_SYMREAL-(a_5_SYMREAL*a_5_SYMREAL)))>0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.45 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample84.main()_2");
		paraName.add("a_5_SYMREAL,b_6_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.0-a_5_SYMREAL)<0.0)) && ((0.0==(10.0*(b_6_SYMREAL-(a_5_SYMREAL*a_5_SYMREAL)))))");
		initNum.add("60.797046271,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.032 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample84.main()_3");
		paraName.add("a_5_SYMREAL,b_6_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.0-a_5_SYMREAL)>0.0)) && ((0.0==(10.0*(b_6_SYMREAL-(a_5_SYMREAL*a_5_SYMREAL)))))");
		initNum.add("0.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.188 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample84.main()_4");
		paraName.add("d_8_SYMREAL,c_7_SYMREAL,a_5_SYMREAL,b_6_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((9.486832980505138*(d_8_SYMREAL-(c_7_SYMREAL*c_7_SYMREAL)))<0.0)) && ((0.0==(1.0-a_5_SYMREAL))) && ((0.0==(10.0*(b_6_SYMREAL-(a_5_SYMREAL*a_5_SYMREAL)))))");
		initNum.add("0.0,0.0,1.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.1 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample84.main()_5");
		paraName.add("d_8_SYMREAL,c_7_SYMREAL,a_5_SYMREAL,b_6_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((9.486832980505138*(d_8_SYMREAL-(c_7_SYMREAL*c_7_SYMREAL)))>0.0)) && ((0.0==(1.0-a_5_SYMREAL))) && ((0.0==(10.0*(b_6_SYMREAL-(a_5_SYMREAL*a_5_SYMREAL)))))");
		initNum.add("0.0,0.0,1.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.097 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample84.main()_6");
		paraName.add("c_7_SYMREAL,d_8_SYMREAL,a_5_SYMREAL,b_6_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((1.0-c_7_SYMREAL)<0.0)) && ((0.0==(9.486832980505138*(d_8_SYMREAL-(c_7_SYMREAL*c_7_SYMREAL))))) && ((0.0==(1.0-a_5_SYMREAL))) && ((0.0==(10.0*(b_6_SYMREAL-(a_5_SYMREAL*a_5_SYMREAL)))))");
		initNum.add("30.03672923925944,0.0,1.0,0.0");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" coral.tests.samples.Sample84.main()_7");
		paraName.add("c_7_SYMREAL,d_8_SYMREAL,a_5_SYMREAL,b_6_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((1.0-c_7_SYMREAL)>0.0)) && ((0.0==(9.486832980505138*(d_8_SYMREAL-(c_7_SYMREAL*c_7_SYMREAL))))) && ((0.0==(1.0-a_5_SYMREAL))) && ((0.0==(10.0*(b_6_SYMREAL-(a_5_SYMREAL*a_5_SYMREAL)))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.066 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample84.main()_8");
		paraName.add("d_8_SYMREAL,c_7_SYMREAL,a_5_SYMREAL,b_6_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((9.486832980505138*(d_8_SYMREAL-(c_7_SYMREAL*c_7_SYMREAL)))>0.0)) && ((0.0==(1.0-a_5_SYMREAL))) && ((0.0==(10.0*(b_6_SYMREAL-(a_5_SYMREAL*a_5_SYMREAL)))))");
		initNum.add("0.0,0.0,1.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     null
		functionName.add(" coral.tests.samples.Sample84.main()_9");
		paraName.add("b_6_SYMREAL,a_5_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((10.0*(b_6_SYMREAL-(a_5_SYMREAL*a_5_SYMREAL)))>0.0))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample33.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.589 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample33.main()_0");
		paraName.add("x_2_SYMREAL");
		paraType.add("double");
		binaryExp.add("((exp(sin(x_2_SYMREAL))<exp(cos(x_2_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample33.main()_1");
		paraName.add("x_2_SYMREAL");
		paraType.add("double");
		binaryExp.add("((exp(sin(x_2_SYMREAL))>exp(cos(x_2_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     null
		functionName.add(" coral.tests.samples.Sample33.main()_2");
		paraName.add("x_2_SYMREAL");
		paraType.add("double");
		binaryExp.add("((exp(sin(x_2_SYMREAL))>exp(cos(x_2_SYMREAL))))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample06.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.596 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample06.main()_0");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((((cos(x_4_SYMREAL)+cos(y_5_SYMREAL))+cos(z_6_SYMREAL))<(((4.0*sin((x_4_SYMREAL/2.0)))*sin((y_5_SYMREAL/2.0)))*sin((z_6_SYMREAL/2.0)))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample06.main()_1");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((((cos(x_4_SYMREAL)+cos(y_5_SYMREAL))+cos(z_6_SYMREAL))>(((4.0*sin((x_4_SYMREAL/2.0)))*sin((y_5_SYMREAL/2.0)))*sin((z_6_SYMREAL/2.0)))))");
		initNum.add("");
		
		//Parse time: 0.001 seconds.Solve time: 0.004 seconds.Solved.     null
		functionName.add(" coral.tests.samples.Sample06.main()_2");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((((cos(x_4_SYMREAL)+cos(y_5_SYMREAL))+cos(z_6_SYMREAL))>(((4.0*sin((x_4_SYMREAL/2.0)))*sin((y_5_SYMREAL/2.0)))*sin((z_6_SYMREAL/2.0)))))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample79.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.584 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample79.main()_0");
		paraName.add("a_6_SYMREAL,b_7_SYMREAL,c_8_SYMREAL,d_9_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((0.0<(pow(((a_6_SYMREAL*sin(((0.017453292519943295*b_7_SYMREAL)-(0.017453292519943295*c_8_SYMREAL))))-(0.0*d_9_SYMREAL)), 2.0)+pow((a_6_SYMREAL*cos((((0.017453292519943295*b_7_SYMREAL)-(0.017453292519943295*c_8_SYMREAL))+0.0))), 2.0))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.333 seconds.Unsolved.     null
		functionName.add(" coral.tests.samples.Sample79.main()_1");
		paraName.add("a_6_SYMREAL,b_7_SYMREAL,c_8_SYMREAL,d_9_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((0.0>(pow(((a_6_SYMREAL*sin(((0.017453292519943295*b_7_SYMREAL)-(0.017453292519943295*c_8_SYMREAL))))-(0.0*d_9_SYMREAL)), 2.0)+pow((a_6_SYMREAL*cos((((0.017453292519943295*b_7_SYMREAL)-(0.017453292519943295*c_8_SYMREAL))+0.0))), 2.0))))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample71.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.59 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample71.main()_0");
		paraName.add("a_13_SYMREAL,b_14_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(a_13_SYMREAL)<sin(b_14_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.003 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample71.main()_1");
		paraName.add("a_13_SYMREAL,b_14_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(a_13_SYMREAL)>sin(b_14_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.247 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample71.main()_2");
		paraName.add("b_14_SYMREAL,a_13_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((sin(b_14_SYMREAL)==sin(a_13_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.132 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample71.main()_3");
		paraName.add("c_15_SYMREAL,b_14_SYMREAL,a_13_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((sin(c_15_SYMREAL)==sin(b_14_SYMREAL))) && ((sin(a_13_SYMREAL)>sin(b_14_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.004 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample71.main()_4");
		paraName.add("b_14_SYMREAL,c_15_SYMREAL,a_13_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((sin(b_14_SYMREAL)<sin(c_15_SYMREAL))) && ((sin(a_13_SYMREAL)>sin(b_14_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.075 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample71.main()_5");
		paraName.add("c_15_SYMREAL,d_16_SYMREAL,b_14_SYMREAL,a_13_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((sin(c_15_SYMREAL)<sin(d_16_SYMREAL))) && ((sin(b_14_SYMREAL)>sin(c_15_SYMREAL))) && ((sin(a_13_SYMREAL)>sin(b_14_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.055 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample71.main()_6");
		paraName.add("c_15_SYMREAL,d_16_SYMREAL,b_14_SYMREAL,a_13_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((sin(c_15_SYMREAL)>sin(d_16_SYMREAL))) && ((sin(b_14_SYMREAL)>sin(c_15_SYMREAL))) && ((sin(a_13_SYMREAL)>sin(b_14_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.011 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample71.main()_7");
		paraName.add("d_16_SYMREAL,c_15_SYMREAL,b_14_SYMREAL,a_13_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((sin(d_16_SYMREAL)==sin(c_15_SYMREAL))) && ((sin(b_14_SYMREAL)>sin(c_15_SYMREAL))) && ((sin(a_13_SYMREAL)>sin(b_14_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.12 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample71.main()_8");
		paraName.add("e_17_SYMREAL,d_16_SYMREAL,c_15_SYMREAL,b_14_SYMREAL,a_13_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((sin(e_17_SYMREAL)==sin(d_16_SYMREAL))) && ((sin(c_15_SYMREAL)>sin(d_16_SYMREAL))) && ((sin(b_14_SYMREAL)>sin(c_15_SYMREAL))) && ((sin(a_13_SYMREAL)>sin(b_14_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.033 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample71.main()_9");
		paraName.add("d_16_SYMREAL,e_17_SYMREAL,c_15_SYMREAL,b_14_SYMREAL,a_13_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((sin(d_16_SYMREAL)<sin(e_17_SYMREAL))) && ((sin(c_15_SYMREAL)>sin(d_16_SYMREAL))) && ((sin(b_14_SYMREAL)>sin(c_15_SYMREAL))) && ((sin(a_13_SYMREAL)>sin(b_14_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.067 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample71.main()_10");
		paraName.add("e_17_SYMREAL,f_18_SYMREAL,d_16_SYMREAL,c_15_SYMREAL,b_14_SYMREAL,a_13_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((sin(e_17_SYMREAL)<sin(f_18_SYMREAL))) && ((sin(d_16_SYMREAL)>sin(e_17_SYMREAL))) && ((sin(c_15_SYMREAL)>sin(d_16_SYMREAL))) && ((sin(b_14_SYMREAL)>sin(c_15_SYMREAL))) && ((sin(a_13_SYMREAL)>sin(b_14_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.057 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample71.main()_11");
		paraName.add("e_17_SYMREAL,f_18_SYMREAL,d_16_SYMREAL,c_15_SYMREAL,b_14_SYMREAL,a_13_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((sin(e_17_SYMREAL)>sin(f_18_SYMREAL))) && ((sin(d_16_SYMREAL)>sin(e_17_SYMREAL))) && ((sin(c_15_SYMREAL)>sin(d_16_SYMREAL))) && ((sin(b_14_SYMREAL)>sin(c_15_SYMREAL))) && ((sin(a_13_SYMREAL)>sin(b_14_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.063 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample71.main()_12");
		paraName.add("f_18_SYMREAL,e_17_SYMREAL,d_16_SYMREAL,c_15_SYMREAL,b_14_SYMREAL,a_13_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((sin(f_18_SYMREAL)==sin(e_17_SYMREAL))) && ((sin(d_16_SYMREAL)>sin(e_17_SYMREAL))) && ((sin(c_15_SYMREAL)>sin(d_16_SYMREAL))) && ((sin(b_14_SYMREAL)>sin(c_15_SYMREAL))) && ((sin(a_13_SYMREAL)>sin(b_14_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.06 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample71.main()_13");
		paraName.add("g_19_SYMREAL,f_18_SYMREAL,e_17_SYMREAL,d_16_SYMREAL,c_15_SYMREAL,b_14_SYMREAL,a_13_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((sin(g_19_SYMREAL)==sin(f_18_SYMREAL))) && ((sin(e_17_SYMREAL)>sin(f_18_SYMREAL))) && ((sin(d_16_SYMREAL)>sin(e_17_SYMREAL))) && ((sin(c_15_SYMREAL)>sin(d_16_SYMREAL))) && ((sin(b_14_SYMREAL)>sin(c_15_SYMREAL))) && ((sin(a_13_SYMREAL)>sin(b_14_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.046 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample71.main()_14");
		paraName.add("f_18_SYMREAL,g_19_SYMREAL,e_17_SYMREAL,d_16_SYMREAL,c_15_SYMREAL,b_14_SYMREAL,a_13_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((sin(f_18_SYMREAL)<sin(g_19_SYMREAL))) && ((sin(e_17_SYMREAL)>sin(f_18_SYMREAL))) && ((sin(d_16_SYMREAL)>sin(e_17_SYMREAL))) && ((sin(c_15_SYMREAL)>sin(d_16_SYMREAL))) && ((sin(b_14_SYMREAL)>sin(c_15_SYMREAL))) && ((sin(a_13_SYMREAL)>sin(b_14_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.06 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample71.main()_15");
		paraName.add("g_19_SYMREAL,h_20_SYMREAL,f_18_SYMREAL,e_17_SYMREAL,d_16_SYMREAL,c_15_SYMREAL,b_14_SYMREAL,a_13_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double");
		binaryExp.add("((sin(g_19_SYMREAL)<sin(h_20_SYMREAL))) && ((sin(f_18_SYMREAL)>sin(g_19_SYMREAL))) && ((sin(e_17_SYMREAL)>sin(f_18_SYMREAL))) && ((sin(d_16_SYMREAL)>sin(e_17_SYMREAL))) && ((sin(c_15_SYMREAL)>sin(d_16_SYMREAL))) && ((sin(b_14_SYMREAL)>sin(c_15_SYMREAL))) && ((sin(a_13_SYMREAL)>sin(b_14_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.064 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample71.main()_16");
		paraName.add("g_19_SYMREAL,h_20_SYMREAL,f_18_SYMREAL,e_17_SYMREAL,d_16_SYMREAL,c_15_SYMREAL,b_14_SYMREAL,a_13_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double");
		binaryExp.add("((sin(g_19_SYMREAL)>sin(h_20_SYMREAL))) && ((sin(f_18_SYMREAL)>sin(g_19_SYMREAL))) && ((sin(e_17_SYMREAL)>sin(f_18_SYMREAL))) && ((sin(d_16_SYMREAL)>sin(e_17_SYMREAL))) && ((sin(c_15_SYMREAL)>sin(d_16_SYMREAL))) && ((sin(b_14_SYMREAL)>sin(c_15_SYMREAL))) && ((sin(a_13_SYMREAL)>sin(b_14_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.101 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample71.main()_17");
		paraName.add("h_20_SYMREAL,g_19_SYMREAL,f_18_SYMREAL,e_17_SYMREAL,d_16_SYMREAL,c_15_SYMREAL,b_14_SYMREAL,a_13_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double");
		binaryExp.add("((sin(h_20_SYMREAL)==sin(g_19_SYMREAL))) && ((sin(f_18_SYMREAL)>sin(g_19_SYMREAL))) && ((sin(e_17_SYMREAL)>sin(f_18_SYMREAL))) && ((sin(d_16_SYMREAL)>sin(e_17_SYMREAL))) && ((sin(c_15_SYMREAL)>sin(d_16_SYMREAL))) && ((sin(b_14_SYMREAL)>sin(c_15_SYMREAL))) && ((sin(a_13_SYMREAL)>sin(b_14_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.     null
		functionName.add(" coral.tests.samples.Sample71.main()_18");
		paraName.add("i_21_SYMREAL,h_20_SYMREAL,g_19_SYMREAL,f_18_SYMREAL,e_17_SYMREAL,d_16_SYMREAL,c_15_SYMREAL,b_14_SYMREAL,a_13_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double");
		binaryExp.add("((sin(i_21_SYMREAL)==sin(h_20_SYMREAL))) && ((sin(g_19_SYMREAL)>sin(h_20_SYMREAL))) && ((sin(f_18_SYMREAL)>sin(g_19_SYMREAL))) && ((sin(e_17_SYMREAL)>sin(f_18_SYMREAL))) && ((sin(d_16_SYMREAL)>sin(e_17_SYMREAL))) && ((sin(c_15_SYMREAL)>sin(d_16_SYMREAL))) && ((sin(b_14_SYMREAL)>sin(c_15_SYMREAL))) && ((sin(a_13_SYMREAL)>sin(b_14_SYMREAL)))");
		initNum.add("");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetSphereShade.main().txt      *********/
		//Parse time: 0.004 seconds.Solve time: 0.827 seconds.Unsolved.     
		functionName.add(" JpfTargetSphereShade.main()_0");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.002 seconds.Solved.     
		functionName.add(" JpfTargetSphereShade.main()_1");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))>0.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.028 seconds.Solved.     
		functionName.add(" JpfTargetSphereShade.main()_2");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((1.0==(((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.094 seconds.Solved.     
		functionName.add(" JpfTargetSphereShade.main()_3");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.388 seconds.Solved.     
		functionName.add(" JpfTargetSphereShade.main()_4");
		paraName.add("lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("int,double,double,double");
		binaryExp.add("((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		initNum.add("59.0,0.0,0.0,0.0");
		
		//Parse time: 0.001 seconds.Solve time: 0.073 seconds.Solved.     
		functionName.add(" JpfTargetSphereShade.main()_5");
		paraName.add("lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("int,double,double,double");
		binaryExp.add("((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		initNum.add("1.0,0.0,0.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.261 seconds.Unsolved.     
		functionName.add(" JpfTargetSphereShade.main()_6");
		paraName.add("lX_22_SYMREAL,lY_23_SYMREAL,lZ_24_SYMREAL,lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double,int,double,double,double");
		binaryExp.add("((0.0==(((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL)))) && ((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		initNum.add("0.0,0.0,0.0,1.0,0.0,0.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.211 seconds.Solved.     
		functionName.add(" JpfTargetSphereShade.main()_7");
		paraName.add("lX_22_SYMREAL,lY_23_SYMREAL,lZ_24_SYMREAL,lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double,int,double,double,double");
		binaryExp.add("(((((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL))<1.0)) && ((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		initNum.add("0.0,0.0,0.0,1.0,0.0,0.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.053 seconds.Solved.     
		functionName.add(" JpfTargetSphereShade.main()_8");
		paraName.add("lX_22_SYMREAL,lY_23_SYMREAL,lZ_24_SYMREAL,lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double,int,double,double,double");
		binaryExp.add("(((((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL))>1.0)) && ((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		initNum.add("0.0,0.0,0.0,1.0,0.0,0.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 3.136 seconds.Unsolved.     
		functionName.add(" JpfTargetSphereShade.main()_9");
		paraName.add("eyeX_15_SYMREAL,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeY_16_SYMREAL,y_12_SYMREAL,eyeZ_17_SYMREAL,z_13_SYMREAL,lX_22_SYMREAL,lY_23_SYMREAL,lZ_24_SYMREAL,lType_21_SYMINT");
		paraType.add("double,double,double,double,double,double,double,double,double,double,double,double,int");
		binaryExp.add("(((((((eyeX_15_SYMREAL+(0.0*(dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-x_11_SYMREAL)*((eyeX_15_SYMREAL+(0.0*(dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-x_11_SYMREAL))+(((eyeY_16_SYMREAL+(0.0*(dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-y_12_SYMREAL)*((eyeY_16_SYMREAL+(0.0*(dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-y_12_SYMREAL)))+(((eyeZ_17_SYMREAL+(0.0*(dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-z_13_SYMREAL)*((eyeZ_17_SYMREAL+(0.0*(dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-z_13_SYMREAL)))<0.0)) && ((exp((((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL)))!=0.0)) && (((((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL))<1.0)) && ((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		initNum.add("0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,1.0");
		
		//Parse time: 0.0 seconds.nullnull     null
		functionName.add(" JpfTargetSphereShade.main()_10");
		paraName.add("eyeX_15_SYMREAL,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeY_16_SYMREAL,y_12_SYMREAL,eyeZ_17_SYMREAL,z_13_SYMREAL,lX_22_SYMREAL,lY_23_SYMREAL,lZ_24_SYMREAL,lType_21_SYMINT");
		paraType.add("double,double,double,double,double,double,double,double,double,double,double,double,int");
		binaryExp.add("(((((((eyeX_15_SYMREAL+(0.0*(dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-x_11_SYMREAL)*((eyeX_15_SYMREAL+(0.0*(dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-x_11_SYMREAL))+(((eyeY_16_SYMREAL+(0.0*(dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-y_12_SYMREAL)*((eyeY_16_SYMREAL+(0.0*(dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-y_12_SYMREAL)))+(((eyeZ_17_SYMREAL+(0.0*(dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-z_13_SYMREAL)*((eyeZ_17_SYMREAL+(0.0*(dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-z_13_SYMREAL)))>0.0)) && ((exp((((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL)))!=0.0)) && (((((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL))<1.0)) && ((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		initNum.add("0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,1.0");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample16.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.979 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample16.main()_0");
		paraName.add("v_10_SYMREAL");
		paraType.add("double");
		binaryExp.add("((v_10_SYMREAL!=0.0))");
		initNum.add("60.797046271");
		
		//Parse time: 0.0 seconds.Solve time: 0.2 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample16.main()_1");
		paraName.add("w_9_SYMREAL,x_6_SYMREAL,v_10_SYMREAL,y_7_SYMREAL,z_8_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("(((((sin((w_9_SYMREAL*w_9_SYMREAL))*cos(((x_6_SYMREAL*w_9_SYMREAL)*v_10_SYMREAL)))-tan(cos(((x_6_SYMREAL*w_9_SYMREAL)*x_6_SYMREAL))))+sin(w_9_SYMREAL))==(((tan((w_9_SYMREAL-x_6_SYMREAL))*cos(sin((w_9_SYMREAL/v_10_SYMREAL))))-atan(((y_7_SYMREAL+20.0)+z_8_SYMREAL)))+asin((y_7_SYMREAL-15.0))))) && ((v_10_SYMREAL!=0.0))");
		initNum.add("0.0,0.0,60.797046271,0.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.117 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample16.main()_2");
		paraName.add("w_9_SYMREAL,x_6_SYMREAL,v_10_SYMREAL,y_7_SYMREAL,z_8_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("(((((tan((w_9_SYMREAL-x_6_SYMREAL))*cos(sin((w_9_SYMREAL/v_10_SYMREAL))))-atan(((y_7_SYMREAL+20.0)+z_8_SYMREAL)))+asin((y_7_SYMREAL-15.0)))<(((sin((w_9_SYMREAL*w_9_SYMREAL))*cos(((x_6_SYMREAL*w_9_SYMREAL)*v_10_SYMREAL)))-tan(cos(((x_6_SYMREAL*w_9_SYMREAL)*x_6_SYMREAL))))+sin(w_9_SYMREAL)))) && ((v_10_SYMREAL!=0.0))");
		initNum.add("0.0,0.0,60.797046271,0.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.08 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample16.main()_3");
		paraName.add("w_9_SYMREAL,x_6_SYMREAL,v_10_SYMREAL,y_7_SYMREAL,z_8_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("(((((tan((w_9_SYMREAL-x_6_SYMREAL))*cos(sin((w_9_SYMREAL/v_10_SYMREAL))))-atan(((y_7_SYMREAL+20.0)+z_8_SYMREAL)))+asin((y_7_SYMREAL-15.0)))>(((sin((w_9_SYMREAL*w_9_SYMREAL))*cos(((x_6_SYMREAL*w_9_SYMREAL)*v_10_SYMREAL)))-tan(cos(((x_6_SYMREAL*w_9_SYMREAL)*x_6_SYMREAL))))+sin(w_9_SYMREAL)))) && ((v_10_SYMREAL!=0.0))");
		initNum.add("0.0,0.0,60.797046271,0.0,0.0");
		
		//Parse time: 0.0 seconds.Solve time: 0.007 seconds.Solved.     null
		functionName.add(" coral.tests.samples.Sample16.main()_4");
		paraName.add("v_10_SYMREAL");
		paraType.add("double");
		binaryExp.add("((v_10_SYMREAL==0.0))");
		initNum.add("0.0");
		
		

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/coral.tests.samples.Sample47.main().txt      *********/
		//Parse time: 0.003 seconds.Solve time: 0.612 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample47.main()_0");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((x_4_SYMREAL+y_5_SYMREAL))<exp(z_6_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.002 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample47.main()_1");
		paraName.add("x_4_SYMREAL,y_5_SYMREAL,z_6_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((x_4_SYMREAL+y_5_SYMREAL))>exp(z_6_SYMREAL)))");
		initNum.add("");
		
		//Parse time: 0.0 seconds.Solve time: 0.071 seconds.Solved.     
		functionName.add(" coral.tests.samples.Sample47.main()_2");
		paraName.add("z_6_SYMREAL,x_4_SYMREAL,y_5_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp(z_6_SYMREAL)==exp((x_4_SYMREAL+y_5_SYMREAL))))");
		initNum.add("");
		
		

	}

}
