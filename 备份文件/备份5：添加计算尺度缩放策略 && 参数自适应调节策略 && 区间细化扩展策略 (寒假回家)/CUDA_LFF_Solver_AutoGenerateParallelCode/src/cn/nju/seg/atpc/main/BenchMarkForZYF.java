package cn.nju.seg.atpc.main;

import java.util.ArrayList;
import java.util.List;

public class BenchMarkForZYF 
{
	public static List<String> functionName=new ArrayList<String>();
	public static List<String> binaryExp=new ArrayList<String>();
	public static List<String> paraName=new ArrayList<String>();
	public static List<String> paraType=new ArrayList<String>();
	public static List<String> initNum=new ArrayList<String>();
	
	public static void easySolver()
	{
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetApollo.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.479 seconds.
		functionName.add(" JpfTargetApollo.main()_0");
		paraName.add("in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.014 seconds.
		functionName.add(" JpfTargetApollo.main()_1");
		paraName.add("in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" JpfTargetApollo.main()_2");
		paraName.add("in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)>0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.247 seconds.
		functionName.add(" JpfTargetApollo.main()_4");
		paraName.add("in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(0.18181818181818185*(((0.5*(((((((10.0*in2_0_4_SYMREAL)+-0.0)-0.0)/1.0)/0.055)/2.0)*((((((10.0*in2_0_4_SYMREAL)+-0.0)-0.0)/1.0)/0.055)/2.0)))+(0.0-(((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)))-0.04759988869075444)))) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" JpfTargetApollo.main()_5");
		paraName.add("in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((0.18181818181818185*(((0.5*(((((((10.0*in2_0_4_SYMREAL)+-0.0)-0.0)/1.0)/0.055)/2.0)*((((((10.0*in2_0_4_SYMREAL)+-0.0)-0.0)/1.0)/0.055)/2.0)))+(0.0-(((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)))-0.04759988869075444))>0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.041 seconds.
		functionName.add(" JpfTargetApollo.main()_6");
		paraName.add("in2_1_5_SYMREAL,in1_1_2_SYMREAL,in2_2_6_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)<0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.014 seconds.
		functionName.add(" JpfTargetApollo.main()_7");
		paraName.add("in2_1_5_SYMREAL,in1_1_2_SYMREAL,in2_2_6_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((0.0==(((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0))) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetApollo.main()_8");
		paraName.add("in2_1_5_SYMREAL,in1_1_2_SYMREAL,in2_2_6_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)>0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
	
		//Parse time: 0.0 seconds.     Solve time: 0.069 seconds.
		functionName.add(" JpfTargetApollo.main()_11");
		paraName.add("in2_1_5_SYMREAL,in2_2_6_SYMREAL,in1_1_2_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((0.18181818181818185*(((0.5*((((((-0.7071067811865476*((((10.0*in2_1_5_SYMREAL)+-0.0)-0.0)/1.0))+0.0)+(0.7071067811865476*((((10.0*in2_2_6_SYMREAL)+-0.0)-0.0)/1.0)))/7.855339059327378E-4)/2.0)*(((((-0.7071067811865476*((((10.0*in2_1_5_SYMREAL)+-0.0)-0.0)/1.0))+0.0)+(0.7071067811865476*((((10.0*in2_2_6_SYMREAL)+-0.0)-0.0)/1.0)))/7.855339059327378E-4)/2.0)))+(0.0-(((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)))-3.332757323673897))>0.0)) && (((((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)<0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		
		//Parse time: 0.001 seconds.     Solve time: 0.035 seconds.
		functionName.add(" JpfTargetApollo.main()_12");
		paraName.add("in2_1_5_SYMREAL,in1_1_2_SYMREAL,in2_2_6_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((((((0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/0.006285533905932738)/2.0)<0.0)) && (((((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)<0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.188 seconds.
		functionName.add(" JpfTargetApollo.main()_13");
		paraName.add("in2_1_5_SYMREAL,in1_1_2_SYMREAL,in2_2_6_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((0.0==(((((0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/0.006285533905932738)/2.0))) && (((((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)<0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetApollo.main()_14");
		paraName.add("in2_1_5_SYMREAL,in1_1_2_SYMREAL,in2_2_6_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((((((0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/0.006285533905932738)/2.0)>0.0)) && (((((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)<0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");

		
		
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetRosenbrock.main().txt      *********/
		//Parse time: 0.005 seconds.     Solve time: 0.916 seconds.
		functionName.add(" JpfTargetRosenbrock.main()_0");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((pow((1.0-x1_1_SYMREAL), 2.0)+(100.0*pow((x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)), 2.0)))<0.0))");
		
		//Parse time: 0.001 seconds.     Solve time: 0.249 seconds.
		functionName.add(" JpfTargetRosenbrock.main()_1");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(pow((1.0-x1_1_SYMREAL), 2.0)+(100.0*pow((x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)), 2.0)))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetRosenbrock.main()_2");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((pow((1.0-x1_1_SYMREAL), 2.0)+(100.0*pow((x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)), 2.0)))>0.0))");
		
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetTcas.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.566 seconds.
		functionName.add(" JpfTargetTcas.main()_0");
		paraName.add("high_confidence_2_SYMINT");
		paraType.add("int");
		binaryExp.add("((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.007 seconds.
		functionName.add(" JpfTargetTcas.main()_1");
		paraName.add("high_confidence_2_SYMINT");
		paraType.add("int");
		binaryExp.add("((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.175 seconds.
		functionName.add(" JpfTargetTcas.main()_2");
		paraName.add("own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((own_tracked_alt_rate_5_SYMINT>600)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.022 seconds.
		functionName.add(" JpfTargetTcas.main()_3");
		paraName.add("own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((own_tracked_alt_rate_5_SYMINT<=600)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.021 seconds.
		functionName.add(" JpfTargetTcas.main()_4");
		paraName.add("cur_vertical_sep_1_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((cur_vertical_sep_1_SYMINT<=600)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.119 seconds.
		functionName.add(" JpfTargetTcas.main()_5");
		paraName.add("cur_vertical_sep_1_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((cur_vertical_sep_1_SYMINT>600)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.019 seconds.
		functionName.add(" JpfTargetTcas.main()_6");
		paraName.add("other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.055 seconds.
		functionName.add(" JpfTargetTcas.main()_7");
		paraName.add("other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.038 seconds.
		functionName.add(" JpfTargetTcas.main()_8");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT!=1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.019 seconds.
		functionName.add(" JpfTargetTcas.main()_9");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.043 seconds.
		functionName.add(" JpfTargetTcas.main()_10");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT!=0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.03 seconds.
		functionName.add(" JpfTargetTcas.main()_11");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT==0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.038 seconds.
		functionName.add(" JpfTargetTcas.main()_12");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT==0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.046 seconds.
		functionName.add(" JpfTargetTcas.main()_13");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT!=0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.03 seconds.
		functionName.add(" JpfTargetTcas.main()_14");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT!=1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.001 seconds.
		functionName.add(" JpfTargetTcas.main()_15");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT!=1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.014 seconds.
		functionName.add(" JpfTargetTcas.main()_16");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT==1))");
	
				//Parse time: 0.0 seconds.     Solve time: 0.027 seconds.
		functionName.add(" JpfTargetTcas.main()_17");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT!=0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.033 seconds.
		functionName.add(" JpfTargetTcas.main()_18");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT==0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.015 seconds.
		functionName.add(" JpfTargetTcas.main()_19");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT==0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.036 seconds.
		functionName.add(" JpfTargetTcas.main()_20");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT!=0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.027 seconds.
		functionName.add(" JpfTargetTcas.main()_21");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT!=1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetTcas.main()_22");
		paraName.add("other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetTcas.main()_23");
		paraName.add("other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.01 seconds.
		functionName.add(" JpfTargetTcas.main()_24");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT!=1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.015 seconds.
		functionName.add(" JpfTargetTcas.main()_25");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.024 seconds.
		functionName.add(" JpfTargetTcas.main()_26");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT!=0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.02 seconds.
		functionName.add(" JpfTargetTcas.main()_27");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT==0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.005 seconds.
		functionName.add(" JpfTargetTcas.main()_28");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT==0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.019 seconds.
		functionName.add(" JpfTargetTcas.main()_29");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT!=0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.011 seconds.
		functionName.add(" JpfTargetTcas.main()_30");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT!=1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.001 seconds.
		functionName.add(" JpfTargetTcas.main()_31");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT!=1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetTcas.main()_32");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.001 seconds.
		functionName.add(" JpfTargetTcas.main()_33");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT!=0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" JpfTargetTcas.main()_34");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT==0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.005 seconds.
		functionName.add(" JpfTargetTcas.main()_35");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT==0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.016 seconds.
		functionName.add(" JpfTargetTcas.main()_36");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT!=0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.001 seconds.
		functionName.add(" JpfTargetTcas.main()_37");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT!=1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT!=1))");

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetPowTest.main().txt      *********/		
		//Parse time: 0.006 seconds.     Solve time: 0.566 seconds.
		functionName.add(" JpfTargetPowTest.main()_0");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("((x_1_SYMINT<=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetPowTest.main()_1");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" JpfTargetPowTest.main()_2");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT!=(x_1_SYMINT*x_1_SYMINT))) && ((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.089 seconds.
		functionName.add(" JpfTargetPowTest.main()_3");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT==(x_1_SYMINT*x_1_SYMINT))) && ((x_1_SYMINT>0))");

		//Parse time: 0.0 seconds.     Solve time: 0.124 seconds.
		functionName.add(" JpfTargetPowTest.main()_4");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT<=8)) && ((y_2_SYMINT==(x_1_SYMINT*x_1_SYMINT))) && ((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.104 seconds.
		functionName.add(" JpfTargetPowTest.main()_5");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT>8)) && ((y_2_SYMINT==(x_1_SYMINT*x_1_SYMINT))) && ((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.111 seconds.
		functionName.add(" JpfTargetPowTest.main()_6");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT>8)) && ((y_2_SYMINT==(x_1_SYMINT*x_1_SYMINT))) && ((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.129 seconds.
		functionName.add(" JpfTargetPowTest.main()_7");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT<=8)) && ((y_2_SYMINT==(x_1_SYMINT*x_1_SYMINT))) && ((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.019 seconds.
		functionName.add(" JpfTargetPowTest.main()_8");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT<=8)) && ((y_2_SYMINT!=(x_1_SYMINT*x_1_SYMINT))) && ((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.005 seconds.
		functionName.add(" JpfTargetPowTest.main()_9");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT>8)) && ((y_2_SYMINT!=(x_1_SYMINT*x_1_SYMINT))) && ((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.037 seconds.
		functionName.add(" JpfTargetPowTest.main()_10");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT>8)) && ((y_2_SYMINT!=(x_1_SYMINT*x_1_SYMINT))) && ((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetPowTest.main()_11");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT<=8)) && ((y_2_SYMINT!=(x_1_SYMINT*x_1_SYMINT))) && ((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.001 seconds.
		functionName.add(" JpfTargetPowTest.main()_12");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("((x_1_SYMINT<=0))");
		
  		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetVector3DNormalize.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.803 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_0");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.17 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_1");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((0.0==(((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_2");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))>0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.011 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_3");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.025 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_4");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((1.0==(((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_5");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))>1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.238 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_6");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL)))!=0.0)) && (((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.066 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_7");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL)))!=0.0)) && (((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))<1.0))");

		//Parse time: 0.0 seconds.     Solve time: 0.138 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_8");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL)))==0.0)) && (((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))<1.0))");
	
		//Parse time: 0.0 seconds.     Solve time: 0.021 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_9");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((1.0==(((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_10");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL)))!=0.0)) && (((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))>1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.001 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_11");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL)))!=0.0)) && (((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))>1.0))");

		//Parse time: 0.0 seconds.     Solve time: 0.115 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_12");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL)))==0.0)) && (((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))>1.0))");
		
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetEarly.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.562 seconds.
		functionName.add(" JpfTargetEarly.main()_0");
		paraName.add("b_2_SYMINT");
		paraType.add("int");
		binaryExp.add("((b_2_SYMINT<=2))");
		
		//Parse time: 0.001 seconds.     Solve time: 0.008 seconds.
		functionName.add(" JpfTargetEarly.main()_1");
		paraName.add("b_2_SYMINT");
		paraType.add("int");
		binaryExp.add("((b_2_SYMINT>2))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.008 seconds.
		functionName.add(" JpfTargetEarly.main()_2");
		paraName.add("b_2_SYMINT,a_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((b_2_SYMINT!=(b_2_SYMINT*a_1_SYMINT))) && ((b_2_SYMINT>2))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.101 seconds.
		functionName.add(" JpfTargetEarly.main()_3");
		paraName.add("b_2_SYMINT,a_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((b_2_SYMINT==(b_2_SYMINT*a_1_SYMINT))) && ((b_2_SYMINT>2))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.059 seconds.
		functionName.add(" JpfTargetEarly.main()_4");
		paraName.add("b_2_SYMINT,a_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((b_2_SYMINT==(b_2_SYMINT*a_1_SYMINT))) && ((b_2_SYMINT>2))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.008 seconds.
		functionName.add(" JpfTargetEarly.main()_5");
		paraName.add("b_2_SYMINT,a_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((b_2_SYMINT!=(b_2_SYMINT*a_1_SYMINT))) && ((b_2_SYMINT>2))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetEarly.main()_6");
		paraName.add("b_2_SYMINT");
		paraType.add("int");
		binaryExp.add("((b_2_SYMINT<=2))");
		
		
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetWood.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.565 seconds.
		functionName.add(" JpfTargetWood.main()_0");
		paraName.add("x2_2_SYMREAL,x1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.012 seconds.
		functionName.add(" JpfTargetWood.main()_1");
		paraName.add("x2_2_SYMREAL,x1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.005 seconds.
		functionName.add(" JpfTargetWood.main()_2");
		paraName.add("x2_2_SYMREAL,x1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))>0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.005 seconds.
		functionName.add(" JpfTargetWood.main()_3");
		paraName.add("x2_2_SYMREAL,x1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.116 seconds.
		functionName.add(" JpfTargetWood.main()_4");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.0-x1_1_SYMREAL)<0.0)) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.195 seconds.
		functionName.add(" JpfTargetWood.main()_5");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(1.0-x1_1_SYMREAL))) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.051 seconds.
		functionName.add(" JpfTargetWood.main()_6");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.0-x1_1_SYMREAL)>0.0)) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.056 seconds.
		functionName.add(" JpfTargetWood.main()_7");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.0-x1_1_SYMREAL)<0.0)) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.053 seconds.
		functionName.add(" JpfTargetWood.main()_8");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.0-x1_1_SYMREAL)>0.0)) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.001 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetWood.main()_9");
		paraName.add("x2_2_SYMREAL,x1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))>0.0))");
		
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetHelicalValley.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.565 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_0");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.029 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_1");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((0.0==x1_4_SYMREAL))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.004 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_2");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((x1_4_SYMREAL>0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.004 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_3");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.037 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_4");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((0.0==x1_4_SYMREAL)) && ((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.028 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_5");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((x1_4_SYMREAL>0.0)) && ((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.005 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_6");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_7");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.007 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_8");
		paraName.add("x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5))))<0.0)) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");

		//Parse time: 0.0 seconds.     Solve time: 0.009 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_9");
		paraName.add("x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((0.0==(10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5)))))) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.071 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_10");
		paraName.add("x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5))))>0.0)) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.078 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_11");
		paraName.add("x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5))))<0.0)) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");

		//Parse time: 0.0 seconds.     Solve time: 0.018 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_15");
		paraName.add("x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5))))>0.0)) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");

		//Parse time: 0.0 seconds.     Solve time: 0.502 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_14");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL,x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("(((10.0*(exp(((x1_1_SYMREAL*x1_1_SYMREAL)+(x2_2_SYMREAL*x2_2_SYMREAL)))-1.0))>0.0)) && ((0.0==(10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5)))))) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");

		
		 /* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetRayTrace.main().txt      *********/
 		//Parse time: 0.006 seconds.     Solve time: 0.735 seconds.
		functionName.add(" JpfTargetRayTrace.main()_0");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.251 seconds.
		functionName.add(" JpfTargetRayTrace.main()_1");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((0.0==(((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))))");
		
 		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetRayTrace.main()_2");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))>0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.085 seconds.
		functionName.add(" JpfTargetRayTrace.main()_3");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.02 seconds.
		functionName.add(" JpfTargetRayTrace.main()_4");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((1.0==(((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetRayTrace.main()_5");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))>1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.047 seconds.
		functionName.add(" JpfTargetRayTrace.main()_6");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.089 seconds.
		functionName.add(" JpfTargetRayTrace.main()_7");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-r_4_SYMREAL)<3.4028234663852886E38)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.075 seconds.
		functionName.add(" JpfTargetRayTrace.main()_10");
		paraName.add("r_4_SYMREAL,dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))<0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
	
		//Parse time: 0.0 seconds.     Solve time: 0.452 seconds.
		functionName.add(" JpfTargetRayTrace.main()_12");
		paraName.add("r_4_SYMREAL,dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
	
		//Parse time: 0.0 seconds.     Solve time: 0.077 seconds.
		functionName.add(" JpfTargetRayTrace.main()_13");
		paraName.add("r_4_SYMREAL,dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))<0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.157 seconds.
		functionName.add(" JpfTargetRayTrace.main()_14");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-exp((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))<3.4028234663852886E38)) && (((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
	
		//Parse time: 0.0 seconds.     Solve time: 0.488 seconds.
		functionName.add(" JpfTargetRayTrace.main()_17");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-exp((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))<0.0)) && (((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 1.673 seconds.
		functionName.add(" JpfTargetRayTrace.main()_19");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-exp((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))>0.0)) && (((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 1.298 seconds.
		functionName.add(" JpfTargetRayTrace.main()_20");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-exp((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))<0.0)) && (((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetBeale.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.566 seconds.
		functionName.add(" JpfTargetBeale.main()_0");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.5-(x1_1_SYMREAL*(1.0-x2_2_SYMREAL)))<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.05 seconds.
		functionName.add(" JpfTargetBeale.main()_1");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(1.5-(x1_1_SYMREAL*(1.0-x2_2_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" JpfTargetBeale.main()_2");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.5-(x1_1_SYMREAL*(1.0-x2_2_SYMREAL)))>0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.004 seconds.
		functionName.add(" JpfTargetBeale.main()_3");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.5-(x1_1_SYMREAL*(1.0-x2_2_SYMREAL)))<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.008 seconds.
		functionName.add(" JpfTargetBeale.main()_4");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(1.5-(x1_1_SYMREAL*(1.0-x2_2_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" JpfTargetBeale.main()_5");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.5-(x1_1_SYMREAL*(1.0-x2_2_SYMREAL)))>0.0))");
		
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetPowell.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.562 seconds.
		functionName.add(" JpfTargetPowell.main()_0");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.048 seconds.
		functionName.add(" JpfTargetPowell.main()_1");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.006 seconds.
		functionName.add(" JpfTargetPowell.main()_2");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)>0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetPowell.main()_3");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.494 seconds.
		functionName.add(" JpfTargetPowell.main()_4");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((((pow(2.718281828459045, (0.0-x1_1_SYMREAL))+pow(2.718281828459045, (0.0-x2_2_SYMREAL)))-1.0001)<0.0)) && ((0.0==(((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.272 seconds.
		functionName.add(" JpfTargetPowell.main()_5");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==((pow(2.718281828459045, (0.0-x1_1_SYMREAL))+pow(2.718281828459045, (0.0-x2_2_SYMREAL)))-1.0001))) && ((0.0==(((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.012 seconds.
		functionName.add(" JpfTargetPowell.main()_6");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((((pow(2.718281828459045, (0.0-x1_1_SYMREAL))+pow(2.718281828459045, (0.0-x2_2_SYMREAL)))-1.0001)>0.0)) && ((0.0==(((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.004 seconds.
		functionName.add(" JpfTargetPowell.main()_7");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.007 seconds.
		functionName.add(" JpfTargetPowell.main()_8");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)>0.0))");
		
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/tsafe.Conflict.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.573 seconds.
		functionName.add(" tsafe.Conflict.main()_0");
		paraName.add("psi1_1_SYMREAL");
		paraType.add("double");
		binaryExp.add("(((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.008 seconds.
		functionName.add(" tsafe.Conflict.main()_1");
		paraName.add("psi1_1_SYMREAL");
		paraType.add("double");
		binaryExp.add("((0.0==(0.017453292519943295*psi1_1_SYMREAL)))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.006 seconds.
		functionName.add(" tsafe.Conflict.main()_2");
		paraName.add("psi1_1_SYMREAL");
		paraType.add("double");
		binaryExp.add("(((0.017453292519943295*psi1_1_SYMREAL)>0.0))");
		
		//Parse time: 0.001 seconds.     Solve time: 0.006 seconds.
		functionName.add(" tsafe.Conflict.main()_3");
		paraName.add("bank_ang_7_SYMREAL,psi1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//Parse time: 0.001 seconds.     Solve time: 0.004 seconds.
		functionName.add(" tsafe.Conflict.main()_4");
		paraName.add("bank_ang_7_SYMREAL,psi1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.075 seconds.
		functionName.add(" tsafe.Conflict.main()_5");
		paraName.add("bank_ang_7_SYMREAL,psi1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.043 seconds.
		functionName.add(" tsafe.Conflict.main()_8");
		paraName.add("vA_2_SYMREAL,bank_ang_7_SYMREAL,psi1_1_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((vA_2_SYMREAL!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" tsafe.Conflict.main()_9");
		paraName.add("vC_3_SYMREAL,bank_ang_7_SYMREAL,vA_2_SYMREAL,psi1_1_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)!=0.0)) && ((vA_2_SYMREAL!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.01 seconds.
		functionName.add(" tsafe.Conflict.main()_10");
		paraName.add("xC0_4_SYMREAL,vC_3_SYMREAL,bank_ang_7_SYMREAL,psiC_6_SYMREAL,psi1_1_SYMREAL,vA_2_SYMREAL,yC0_5_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((exp((pow(((xC0_4_SYMREAL+((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(cos(psiC_6_SYMREAL)-cos((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(1.0-cos((0.017453292519943295*psi1_1_SYMREAL))))), 2.0)+pow(((yC0_5_SYMREAL-((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(sin(psiC_6_SYMREAL)-sin((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*sin((0.017453292519943295*psi1_1_SYMREAL)))), 2.0)))<999.0)) && ((((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)!=0.0)) && ((vA_2_SYMREAL!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");

				//Parse time: 0.0 seconds.     Solve time: 0.196 seconds.
		functionName.add(" tsafe.Conflict.main()_12");
		paraName.add("xC0_4_SYMREAL,vC_3_SYMREAL,bank_ang_7_SYMREAL,psiC_6_SYMREAL,psi1_1_SYMREAL,vA_2_SYMREAL,yC0_5_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((exp((pow(((xC0_4_SYMREAL+((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(cos(psiC_6_SYMREAL)-cos((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(1.0-cos((0.017453292519943295*psi1_1_SYMREAL))))), 2.0)+pow(((yC0_5_SYMREAL-((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(sin(psiC_6_SYMREAL)-sin((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*sin((0.017453292519943295*psi1_1_SYMREAL)))), 2.0)))>999.0)) && ((((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)!=0.0)) && ((vA_2_SYMREAL!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.265 seconds.
		functionName.add(" tsafe.Conflict.main()_13");
		paraName.add("xC0_4_SYMREAL,vC_3_SYMREAL,bank_ang_7_SYMREAL,psiC_6_SYMREAL,psi1_1_SYMREAL,vA_2_SYMREAL,yC0_5_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((exp((pow(((xC0_4_SYMREAL+((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(cos(psiC_6_SYMREAL)-cos((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(1.0-cos((0.017453292519943295*psi1_1_SYMREAL))))), 2.0)+pow(((yC0_5_SYMREAL-((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(sin(psiC_6_SYMREAL)-sin((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*sin((0.017453292519943295*psi1_1_SYMREAL)))), 2.0)))<2.0)) && ((exp((pow(((xC0_4_SYMREAL+((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(cos(psiC_6_SYMREAL)-cos((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(1.0-cos((0.017453292519943295*psi1_1_SYMREAL))))), 2.0)+pow(((yC0_5_SYMREAL-((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(sin(psiC_6_SYMREAL)-sin((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*sin((0.017453292519943295*psi1_1_SYMREAL)))), 2.0)))<999.0)) && ((((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)!=0.0)) && ((vA_2_SYMREAL!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 2.016 seconds.
		functionName.add(" tsafe.Conflict.main()_14");
		paraName.add("xC0_4_SYMREAL,vC_3_SYMREAL,bank_ang_7_SYMREAL,psiC_6_SYMREAL,psi1_1_SYMREAL,vA_2_SYMREAL,yC0_5_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((2.0==exp((pow(((xC0_4_SYMREAL+((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(cos(psiC_6_SYMREAL)-cos((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(1.0-cos((0.017453292519943295*psi1_1_SYMREAL))))), 2.0)+pow(((yC0_5_SYMREAL-((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(sin(psiC_6_SYMREAL)-sin((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*sin((0.017453292519943295*psi1_1_SYMREAL)))), 2.0))))) && ((exp((pow(((xC0_4_SYMREAL+((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(cos(psiC_6_SYMREAL)-cos((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(1.0-cos((0.017453292519943295*psi1_1_SYMREAL))))), 2.0)+pow(((yC0_5_SYMREAL-((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(sin(psiC_6_SYMREAL)-sin((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*sin((0.017453292519943295*psi1_1_SYMREAL)))), 2.0)))<999.0)) && ((((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)!=0.0)) && ((vA_2_SYMREAL!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.127 seconds.
		functionName.add(" tsafe.Conflict.main()_15");
		paraName.add("xC0_4_SYMREAL,vC_3_SYMREAL,bank_ang_7_SYMREAL,psiC_6_SYMREAL,psi1_1_SYMREAL,vA_2_SYMREAL,yC0_5_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((exp((pow(((xC0_4_SYMREAL+((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(cos(psiC_6_SYMREAL)-cos((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(1.0-cos((0.017453292519943295*psi1_1_SYMREAL))))), 2.0)+pow(((yC0_5_SYMREAL-((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(sin(psiC_6_SYMREAL)-sin((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*sin((0.017453292519943295*psi1_1_SYMREAL)))), 2.0)))>2.0)) && ((exp((pow(((xC0_4_SYMREAL+((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(cos(psiC_6_SYMREAL)-cos((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(1.0-cos((0.017453292519943295*psi1_1_SYMREAL))))), 2.0)+pow(((yC0_5_SYMREAL-((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(sin(psiC_6_SYMREAL)-sin((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*sin((0.017453292519943295*psi1_1_SYMREAL)))), 2.0)))<999.0)) && ((((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)!=0.0)) && ((vA_2_SYMREAL!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.125 seconds.
		functionName.add(" tsafe.Conflict.main()_16");
		paraName.add("xC0_4_SYMREAL,vC_3_SYMREAL,bank_ang_7_SYMREAL,psiC_6_SYMREAL,psi1_1_SYMREAL,vA_2_SYMREAL,yC0_5_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((exp((pow(((xC0_4_SYMREAL+((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(cos(psiC_6_SYMREAL)-cos((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(1.0-cos((0.017453292519943295*psi1_1_SYMREAL))))), 2.0)+pow(((yC0_5_SYMREAL-((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(sin(psiC_6_SYMREAL)-sin((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*sin((0.017453292519943295*psi1_1_SYMREAL)))), 2.0)))<2.0)) && ((exp((pow(((xC0_4_SYMREAL+((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(cos(psiC_6_SYMREAL)-cos((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(1.0-cos((0.017453292519943295*psi1_1_SYMREAL))))), 2.0)+pow(((yC0_5_SYMREAL-((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(sin(psiC_6_SYMREAL)-sin((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*sin((0.017453292519943295*psi1_1_SYMREAL)))), 2.0)))<999.0)) && ((((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)!=0.0)) && ((vA_2_SYMREAL!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");

		//Parse time: 0.001 seconds.     Solve time: 0.261 seconds.
		functionName.add(" tsafe.Conflict.main()_17");
		paraName.add("xC0_4_SYMREAL,vC_3_SYMREAL,bank_ang_7_SYMREAL,psiC_6_SYMREAL,psi1_1_SYMREAL,vA_2_SYMREAL,yC0_5_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((exp((pow(((xC0_4_SYMREAL+((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(cos(psiC_6_SYMREAL)-cos((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(1.0-cos((0.017453292519943295*psi1_1_SYMREAL))))), 2.0)+pow(((yC0_5_SYMREAL-((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(sin(psiC_6_SYMREAL)-sin((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*sin((0.017453292519943295*psi1_1_SYMREAL)))), 2.0)))>2.0)) && ((exp((pow(((xC0_4_SYMREAL+((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(cos(psiC_6_SYMREAL)-cos((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(1.0-cos((0.017453292519943295*psi1_1_SYMREAL))))), 2.0)+pow(((yC0_5_SYMREAL-((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(sin(psiC_6_SYMREAL)-sin((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*sin((0.017453292519943295*psi1_1_SYMREAL)))), 2.0)))<999.0)) && ((((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)!=0.0)) && ((vA_2_SYMREAL!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" tsafe.Conflict.main()_18");
		paraName.add("xC0_4_SYMREAL,vC_3_SYMREAL,bank_ang_7_SYMREAL,psiC_6_SYMREAL,psi1_1_SYMREAL,vA_2_SYMREAL,yC0_5_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((exp((pow(((xC0_4_SYMREAL+((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(cos(psiC_6_SYMREAL)-cos((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(1.0-cos((0.017453292519943295*psi1_1_SYMREAL))))), 2.0)+pow(((yC0_5_SYMREAL-((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(sin(psiC_6_SYMREAL)-sin((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*sin((0.017453292519943295*psi1_1_SYMREAL)))), 2.0)))>999.0)) && ((((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)!=0.0)) && ((vA_2_SYMREAL!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");

		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" tsafe.Conflict.main()_20");
		paraName.add("vA_2_SYMREAL,bank_ang_7_SYMREAL,psi1_1_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((vA_2_SYMREAL==0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.017 seconds.
		functionName.add(" tsafe.Conflict.main()_21");
		paraName.add("vA_2_SYMREAL,bank_ang_7_SYMREAL,psi1_1_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((vA_2_SYMREAL==0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.37 seconds.
		functionName.add(" tsafe.Conflict.main()_6");
		paraName.add("psi1_1_SYMREAL,bank_ang_7_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(0.017453292519943295*psi1_1_SYMREAL))) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.282 seconds.
		functionName.add(" tsafe.Conflict.main()_7");
		paraName.add("psi1_1_SYMREAL,bank_ang_7_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((0.017453292519943295*psi1_1_SYMREAL)>0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetSphereIntersect.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.824 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_0");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.142 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_1");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((0.0==(((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_2");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))>0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.04 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_3");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.055 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_4");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((1.0==(((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_5");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))>1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.052 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_6");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.523 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_7");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.259 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_9");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)>0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.952 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_10");
		paraName.add("rad_14_SYMREAL,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))<0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
	

		//Parse time: 0.0 seconds.     Solve time: 0.084 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_12");
		paraName.add("rad_14_SYMREAL,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.076 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_13");
		paraName.add("rad_14_SYMREAL,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))<0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.556 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_14");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-exp((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))<0.0)) && (((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");

		//Parse time: 0.0 seconds.     Solve time: 2.015 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_17");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-exp((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))<0.0)) && (((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetFreudensteinRoth.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.567 seconds.
		functionName.add(" JpfTargetFreudensteinRoth.main()_0");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((x1_1_SYMREAL+-13.0)+((((5.0-x2_2_SYMREAL)*x2_2_SYMREAL)-2.0)*x2_2_SYMREAL))+((x1_1_SYMREAL+-29.0)+((((x2_2_SYMREAL+1.0)*x2_2_SYMREAL)-14.0)*x2_2_SYMREAL)))<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.043 seconds.
		functionName.add(" JpfTargetFreudensteinRoth.main()_1");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(((x1_1_SYMREAL+-13.0)+((((5.0-x2_2_SYMREAL)*x2_2_SYMREAL)-2.0)*x2_2_SYMREAL))+((x1_1_SYMREAL+-29.0)+((((x2_2_SYMREAL+1.0)*x2_2_SYMREAL)-14.0)*x2_2_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.004 seconds.
		functionName.add(" JpfTargetFreudensteinRoth.main()_2");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((x1_1_SYMREAL+-13.0)+((((5.0-x2_2_SYMREAL)*x2_2_SYMREAL)-2.0)*x2_2_SYMREAL))+((x1_1_SYMREAL+-29.0)+((((x2_2_SYMREAL+1.0)*x2_2_SYMREAL)-14.0)*x2_2_SYMREAL)))>0.0))");
		
		//Parse time: 0.001 seconds.     Solve time: 0.006 seconds.
		functionName.add(" JpfTargetFreudensteinRoth.main()_3");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((x1_1_SYMREAL+-13.0)+((((5.0-x2_2_SYMREAL)*x2_2_SYMREAL)-2.0)*x2_2_SYMREAL))+((x1_1_SYMREAL+-29.0)+((((x2_2_SYMREAL+1.0)*x2_2_SYMREAL)-14.0)*x2_2_SYMREAL)))<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.01 seconds.
		functionName.add(" JpfTargetFreudensteinRoth.main()_4");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(((x1_1_SYMREAL+-13.0)+((((5.0-x2_2_SYMREAL)*x2_2_SYMREAL)-2.0)*x2_2_SYMREAL))+((x1_1_SYMREAL+-29.0)+((((x2_2_SYMREAL+1.0)*x2_2_SYMREAL)-14.0)*x2_2_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.009 seconds.
		functionName.add(" JpfTargetFreudensteinRoth.main()_5");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((x1_1_SYMREAL+-13.0)+((((5.0-x2_2_SYMREAL)*x2_2_SYMREAL)-2.0)*x2_2_SYMREAL))+((x1_1_SYMREAL+-29.0)+((((x2_2_SYMREAL+1.0)*x2_2_SYMREAL)-14.0)*x2_2_SYMREAL)))>0.0))");

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/concolic.DART.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.578 seconds.
		functionName.add(" concolic.DART.main()_0");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("(((x_1_SYMINT*(x_1_SYMINT*x_1_SYMINT))<=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.008 seconds.
		functionName.add(" concolic.DART.main()_1");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("(((x_1_SYMINT*(x_1_SYMINT*x_1_SYMINT))>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.051 seconds.
		functionName.add(" concolic.DART.main()_2");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("((x_1_SYMINT<=0)) && (((x_1_SYMINT*(x_1_SYMINT*x_1_SYMINT))>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.01 seconds.
		functionName.add(" concolic.DART.main()_3");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("((x_1_SYMINT>0)) && (((x_1_SYMINT*(x_1_SYMINT*x_1_SYMINT))>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" concolic.DART.main()_4");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("((x_1_SYMINT<=0)) && (((x_1_SYMINT*(x_1_SYMINT*x_1_SYMINT))<=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.029 seconds.
		functionName.add(" concolic.DART.main()_5");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("((x_1_SYMINT>0)) && (((x_1_SYMINT*(x_1_SYMINT*x_1_SYMINT))<=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" concolic.DART.main()_6");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("(((x_1_SYMINT*(x_1_SYMINT*x_1_SYMINT))<=0))");
		
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/concolic.TestStatCalc.main().txt      *********/
		//Parse time: 0.005 seconds.     Solve time: 0.487 seconds.
		functionName.add(" concolic.TestStatCalc.main()_0");
		paraName.add("REAL_1,val_1_SYMINT");
		paraType.add("double,int");
		binaryExp.add("((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" concolic.TestStatCalc.main()_1");
		paraName.add("val_1_SYMINT,REAL_1");
		paraType.add("int,double");
		binaryExp.add("((val_1_SYMINT>=val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.176 seconds.
		functionName.add(" concolic.TestStatCalc.main()_2");
		paraName.add("val_1_SYMINT,REAL_1");
		paraType.add("int,double");
		binaryExp.add("((val_1_SYMINT<val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.319 seconds.
		functionName.add(" concolic.TestStatCalc.main()_3");
		paraName.add("val_1_SYMINT,REAL_1");
		paraType.add("int,double");
		binaryExp.add("((val_1_SYMINT!=val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.007 seconds.
		functionName.add(" concolic.TestStatCalc.main()_4");
		paraName.add("val_1_SYMINT,REAL_1");
		paraType.add("int,double");
		binaryExp.add("((val_1_SYMINT==val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" concolic.TestStatCalc.main()_5");
		paraName.add("REAL_2,val_1_SYMINT,REAL_1");
		paraType.add("double,int,double");
		binaryExp.add("((REAL_2=val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" concolic.TestStatCalc.main()_6");
		paraName.add("val_1_SYMINT,REAL_2,REAL_1");
		paraType.add("int,double,double");
		binaryExp.add("((val_1_SYMINT>=val_1_SYMINT)) && ((REAL_2=val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.096 seconds.
		functionName.add(" concolic.TestStatCalc.main()_7");
		paraName.add("val_1_SYMINT,REAL_2,REAL_1");
		paraType.add("int,double,double");
		binaryExp.add("((val_1_SYMINT<val_1_SYMINT)) && ((REAL_2=val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.142 seconds.
		functionName.add(" concolic.TestStatCalc.main()_8");
		paraName.add("val_1_SYMINT,REAL_2,REAL_1");
		paraType.add("int,double,double");
		binaryExp.add("((val_1_SYMINT!=val_1_SYMINT)) && ((REAL_2=val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" concolic.TestStatCalc.main()_9");
		paraName.add("val_1_SYMINT,REAL_2,REAL_1");
		paraType.add("int,double,double");
		binaryExp.add("((val_1_SYMINT==val_1_SYMINT)) && ((REAL_2=val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.016 seconds.
		functionName.add(" concolic.TestStatCalc.main()_10");
		paraName.add("REAL_3,val_1_SYMINT,REAL_2,REAL_1");
		paraType.add("double,int,double,double");
		binaryExp.add("((REAL_3=val_1_SYMINT)) && ((REAL_2=val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" concolic.TestStatCalc.main()_11");
		paraName.add("val_1_SYMINT,REAL_3,REAL_2,REAL_1");
		paraType.add("int,double,double,double");
		binaryExp.add("((val_1_SYMINT>=val_1_SYMINT)) && ((REAL_3=val_1_SYMINT)) && ((REAL_2=val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.132 seconds.
		functionName.add(" concolic.TestStatCalc.main()_12");
		paraName.add("val_1_SYMINT,REAL_3,REAL_2,REAL_1");
		paraType.add("int,double,double,double");
		binaryExp.add("((val_1_SYMINT<val_1_SYMINT)) && ((REAL_3=val_1_SYMINT)) && ((REAL_2=val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetSurfaceShade.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.565 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_0");
		paraName.add("lType_20_SYMINT");
		paraType.add("int");
		binaryExp.add("((lType_20_SYMINT==0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_1");
		paraName.add("lType_20_SYMINT");
		paraType.add("int");
		binaryExp.add("((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_2");
		paraName.add("lType_20_SYMINT");
		paraType.add("int");
		binaryExp.add("((lType_20_SYMINT!=1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.008 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_3");
		paraName.add("lType_20_SYMINT");
		paraType.add("int");
		binaryExp.add("((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.328 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_4");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("(((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))<0.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.231 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_5");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("((0.0==(((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL)))) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.065 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_6");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("(((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))>0.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.021 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_7");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("(((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))<1.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.02 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_8");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("((1.0==(((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL)))) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.001 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_9");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("(((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))>1.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.076 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_10");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("((exp((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL)))!=0.0)) && (((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))<1.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.065 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_11");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("((exp((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL)))!=0.0)) && (((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))<1.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");

		//Parse time: 0.0 seconds.     Solve time: 0.381 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_12");
		paraName.add("lType_20_SYMINT,lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL");
		paraType.add("int,double,double,double");
		binaryExp.add("((lType_20_SYMINT==0)) && ((exp((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL)))!=0.0)) && (((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))<1.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.049 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_13");
		paraName.add("lType_20_SYMINT,lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL");
		paraType.add("int,double,double,double");
		binaryExp.add("((lType_20_SYMINT!=2)) && ((exp((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL)))!=0.0)) && (((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))<1.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.245 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_14");
		paraName.add("lType_20_SYMINT,lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL");
		paraType.add("int,double,double,double");
		binaryExp.add("((lType_20_SYMINT==2)) && ((exp((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL)))!=0.0)) && (((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))<1.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetSphereShade.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.808 seconds.
		functionName.add(" JpfTargetSphereShade.main()_0");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.193 seconds.
		functionName.add(" JpfTargetSphereShade.main()_1");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((0.0==(((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetSphereShade.main()_2");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))>0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.029 seconds.
		functionName.add(" JpfTargetSphereShade.main()_3");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.043 seconds.
		functionName.add(" JpfTargetSphereShade.main()_4");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((1.0==(((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetSphereShade.main()_5");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))>1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.046 seconds.
		functionName.add(" JpfTargetSphereShade.main()_6");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.05 seconds.
		functionName.add(" JpfTargetSphereShade.main()_7");
		paraName.add("lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("int,double,double,double");
		binaryExp.add("((lType_21_SYMINT==0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.235 seconds.
		functionName.add(" JpfTargetSphereShade.main()_8");
		paraName.add("lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("int,double,double,double");
		binaryExp.add("((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.054 seconds.
		functionName.add(" JpfTargetSphereShade.main()_9");
		paraName.add("lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("int,double,double,double");
		binaryExp.add("((lType_21_SYMINT!=1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.031 seconds.
		functionName.add(" JpfTargetSphereShade.main()_10");
		paraName.add("lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("int,double,double,double");
		binaryExp.add("((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.299 seconds.
		functionName.add(" JpfTargetSphereShade.main()_11");
		paraName.add("lX_22_SYMREAL,lY_23_SYMREAL,lZ_24_SYMREAL,lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double,int,double,double,double");
		binaryExp.add("(((((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL))<0.0)) && ((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.25 seconds.
		functionName.add(" JpfTargetSphereShade.main()_12");
		paraName.add("lX_22_SYMREAL,lY_23_SYMREAL,lZ_24_SYMREAL,lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double,int,double,double,double");
		binaryExp.add("((0.0==(((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL)))) && ((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.06 seconds.
		functionName.add(" JpfTargetSphereShade.main()_13");
		paraName.add("lX_22_SYMREAL,lY_23_SYMREAL,lZ_24_SYMREAL,lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double,int,double,double,double");
		binaryExp.add("(((((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL))>0.0)) && ((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.147 seconds.
		functionName.add(" JpfTargetSphereShade.main()_14");
		paraName.add("lX_22_SYMREAL,lY_23_SYMREAL,lZ_24_SYMREAL,lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double,int,double,double,double");
		binaryExp.add("(((((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL))<1.0)) && ((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.155 seconds.
		functionName.add(" JpfTargetSphereShade.main()_15");
		paraName.add("lX_22_SYMREAL,lY_23_SYMREAL,lZ_24_SYMREAL,lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double,int,double,double,double");
		binaryExp.add("((1.0==(((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL)))) && ((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/tsafe.TurnLogic.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.576 seconds.
		functionName.add(" tsafe.TurnLogic.main()_0");
		paraName.add("x0_1_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.008 seconds.
		functionName.add(" tsafe.TurnLogic.main()_1");
		paraName.add("x0_1_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(x0_1_SYMREAL-x1_4_SYMREAL)))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.004 seconds.
		functionName.add(" tsafe.TurnLogic.main()_2");
		paraName.add("x0_1_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((x0_1_SYMREAL-x1_4_SYMREAL)>0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.006 seconds.
		functionName.add(" tsafe.TurnLogic.main()_3");
		paraName.add("y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.011 seconds.
		functionName.add(" tsafe.TurnLogic.main()_5");
		paraName.add("y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))>0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.031 seconds.
		functionName.add(" tsafe.TurnLogic.main()_6");
		paraName.add("y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.034 seconds.
		functionName.add(" tsafe.TurnLogic.main()_7");
		paraName.add("y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((6.283185307179586==((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586))) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
	
		//Parse time: 0.0 seconds.     Solve time: 0.053 seconds.
		functionName.add(" tsafe.TurnLogic.main()_9");
		paraName.add("x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("(((x1_4_SYMREAL-x2_6_SYMREAL)<0.0)) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.05 seconds.
		functionName.add(" tsafe.TurnLogic.main()_10");
		paraName.add("x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((0.0==(x1_4_SYMREAL-x2_6_SYMREAL))) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.001 seconds.     Solve time: 0.006 seconds.
		functionName.add(" tsafe.TurnLogic.main()_11");
		paraName.add("x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("(((x1_4_SYMREAL-x2_6_SYMREAL)>0.0)) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.087 seconds.
		functionName.add(" tsafe.TurnLogic.main()_14");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))>0.0)) && (((x1_4_SYMREAL-x2_6_SYMREAL)<0.0)) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.076 seconds.
		functionName.add(" tsafe.TurnLogic.main()_21");
		paraName.add("y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL,x1_4_SYMREAL,y2_7_SYMREAL,x2_6_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)-((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))+6.283185307179586))<3.141592653589793)) && ((((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))<0.0)) && (((x1_4_SYMREAL-x2_6_SYMREAL)<0.0)) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.25 seconds.
		functionName.add(" tsafe.TurnLogic.main()_22");
		paraName.add("y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL,x1_4_SYMREAL,y2_7_SYMREAL,x2_6_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((3.141592653589793==(((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)-((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))+6.283185307179586)))) && ((((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))<0.0)) && (((x1_4_SYMREAL-x2_6_SYMREAL)<0.0)) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");

		//Parse time: 0.0 seconds.     Solve time: 0.08 seconds.
		functionName.add(" tsafe.TurnLogic.main()_12");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))<0.0)) && (((x1_4_SYMREAL-x2_6_SYMREAL)<0.0)) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");

		//Parse time: 0.0 seconds.     Solve time: 0.07 seconds.
		functionName.add(" tsafe.TurnLogic.main()_15");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))<0.0)) && (((x1_4_SYMREAL-x2_6_SYMREAL)<0.0)) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.032 seconds.
		functionName.add(" tsafe.TurnLogic.main()_16");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((6.283185307179586==((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))+6.283185307179586))) && (((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))<0.0)) && (((x1_4_SYMREAL-x2_6_SYMREAL)<0.0)) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.086 seconds.
		functionName.add(" tsafe.TurnLogic.main()_20");
		paraName.add("y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL,x1_4_SYMREAL,y2_7_SYMREAL,x2_6_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)-((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))+6.283185307179586))>-3.141592653589793)) && ((((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))<0.0)) && (((x1_4_SYMREAL-x2_6_SYMREAL)<0.0)) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.039 seconds.
		functionName.add(" tsafe.TurnLogic.main()_24");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))<0.0)) && (((x1_4_SYMREAL-x2_6_SYMREAL)<0.0)) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.48 seconds.
		functionName.add(" JpfTargetApollo.main()_3");
		paraName.add("in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((0.18181818181818185*(((0.5*(((((((10.0*in2_0_4_SYMREAL)+-0.0)-0.0)/1.0)/0.055)/2.0)*((((((10.0*in2_0_4_SYMREAL)+-0.0)-0.0)/1.0)/0.055)/2.0)))+(0.0-(((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)))-0.04759988869075444))<0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");

		// 可解 Parse time: 0.0 seconds.     Solve time: 0.59 seconds.
		functionName.add(" JpfTargetApollo.main()_9");
		paraName.add("in2_1_5_SYMREAL,in2_2_6_SYMREAL,in1_1_2_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((0.18181818181818185*(((0.5*((((((-0.7071067811865476*((((10.0*in2_1_5_SYMREAL)+-0.0)-0.0)/1.0))+0.0)+(0.7071067811865476*((((10.0*in2_2_6_SYMREAL)+-0.0)-0.0)/1.0)))/7.855339059327378E-4)/2.0)*(((((-0.7071067811865476*((((10.0*in2_1_5_SYMREAL)+-0.0)-0.0)/1.0))+0.0)+(0.7071067811865476*((((10.0*in2_2_6_SYMREAL)+-0.0)-0.0)/1.0)))/7.855339059327378E-4)/2.0)))+(0.0-(((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)))-3.332757323673897))<0.0)) && (((((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)<0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		
		
	}
	
	public static void initBenchmark()
	{

/*		//Parse time: 0.0 seconds.     Solve time: 0.455 seconds.
		functionName.add(" JpfTargetApollo.main()_10");
		paraName.add("in2_1_5_SYMREAL,in2_2_6_SYMREAL,in1_1_2_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((0.0==(0.18181818181818185*(((0.5*((((((-0.7071067811865476*((((10.0*in2_1_5_SYMREAL)+-0.0)-0.0)/1.0))+0.0)+(0.7071067811865476*((((10.0*in2_2_6_SYMREAL)+-0.0)-0.0)/1.0)))/7.855339059327378E-4)/2.0)*(((((-0.7071067811865476*((((10.0*in2_1_5_SYMREAL)+-0.0)-0.0)/1.0))+0.0)+(0.7071067811865476*((((10.0*in2_2_6_SYMREAL)+-0.0)-0.0)/1.0)))/7.855339059327378E-4)/2.0)))+(0.0-(((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)))-3.332757323673897)))) && (((((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)<0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");

		// 可解Parse time: 0.0 seconds.     Solve time: 0.454 seconds.
		functionName.add(" JpfTargetApollo.main()_15");
		paraName.add("in2_1_5_SYMREAL,in2_2_6_SYMREAL,in1_1_2_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((0.18181818181818185*(((0.5*((((((0.7071067811865476*((((10.0*in2_1_5_SYMREAL)+-0.0)-0.0)/1.0))+0.0)+(0.7071067811865476*((((10.0*in2_2_6_SYMREAL)+-0.0)-0.0)/1.0)))/0.006285533905932738)/2.0)*(((((0.7071067811865476*((((10.0*in2_1_5_SYMREAL)+-0.0)-0.0)/1.0))+0.0)+(0.7071067811865476*((((10.0*in2_2_6_SYMREAL)+-0.0)-0.0)/1.0)))/0.006285533905932738)/2.0)))+(0.0-(((((0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/0.006285533905932738)/2.0)))-0.4165109785694488))<0.0)) && (((((((0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/0.006285533905932738)/2.0)<0.0)) && (((((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)<0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		
		// 无解Parse time: 0.0 seconds.     Solve time: 0.484 seconds.
		functionName.add(" tsafe.TurnLogic.main()_4");
		paraName.add("y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((0.0==(1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL))))) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		*/
		
/*		// 应该无解 Parse time: 0.0 seconds.     Solve time: 2.411 seconds.
		functionName.add(" tsafe.TurnLogic.main()_8");
		paraName.add("y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)>6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		// 应该无解 Parse time: 0.0 seconds.     Solve time: 0.39 seconds.
		functionName.add(" tsafe.TurnLogic.main()_13");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((0.0==(1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL))))) && (((x1_4_SYMREAL-x2_6_SYMREAL)<0.0)) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");

		// 应该无解 Parse time: 0.0 seconds.     Solve time: 2.137 seconds.
		functionName.add(" tsafe.TurnLogic.main()_17");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))+6.283185307179586)>6.283185307179586)) && (((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))<0.0)) && (((x1_4_SYMREAL-x2_6_SYMREAL)<0.0)) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//  应该是无解 Parse time: 0.0 seconds.     Solve time: 8.771 seconds.
		functionName.add(" tsafe.TurnLogic.main()_18");
		paraName.add("y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL,x1_4_SYMREAL,y2_7_SYMREAL,x2_6_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)-((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))+6.283185307179586))<-3.141592653589793)) && ((((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))<0.0)) && (((x1_4_SYMREAL-x2_6_SYMREAL)<0.0)) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//    应该是无解 Parse time: 0.0 seconds.     Solve time: 20.273 seconds.
		functionName.add(" tsafe.TurnLogic.main()_19");
		paraName.add("y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL,x1_4_SYMREAL,y2_7_SYMREAL,x2_6_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((-3.141592653589793==(((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)-((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))+6.283185307179586)))) && ((((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))<0.0)) && (((x1_4_SYMREAL-x2_6_SYMREAL)<0.0)) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
				
		//   应该是无解  Parse time: 0.0 seconds.     Solve time: 1.041 seconds.
		functionName.add(" tsafe.TurnLogic.main()_23");
		paraName.add("y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL,x1_4_SYMREAL,y2_7_SYMREAL,x2_6_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)-((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))+6.283185307179586))>3.141592653589793)) && ((((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))<0.0)) && (((x1_4_SYMREAL-x2_6_SYMREAL)<0.0)) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");

		
		//   应该是无解    Parse time: 0.0 seconds.     Solve time: 0.51 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_12");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL,x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("(((10.0*(exp(((x1_1_SYMREAL*x1_1_SYMREAL)+(x2_2_SYMREAL*x2_2_SYMREAL)))-1.0))<0.0)) && ((0.0==(10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5)))))) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");
*/
		
		
/*		// 有解  Parse time: 0.0 seconds.     Solve time: 0.301 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_13");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL,x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((0.0==(10.0*(exp(((x1_1_SYMREAL*x1_1_SYMREAL)+(x2_2_SYMREAL*x2_2_SYMREAL)))-1.0)))) && ((0.0==(10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5)))))) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");
		initNum.add("0,0,0,0,0");*/
		
		//不知道  Parse time: 0.0 seconds.     Solve time: 2.239 seconds.
		functionName.add(" tsafe.Conflict.main()_11");
		paraName.add("xC0_4_SYMREAL,vC_3_SYMREAL,bank_ang_7_SYMREAL,psiC_6_SYMREAL,psi1_1_SYMREAL,vA_2_SYMREAL,yC0_5_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((999.0==exp((pow(((xC0_4_SYMREAL+((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(cos(psiC_6_SYMREAL)-cos((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(1.0-cos((0.017453292519943295*psi1_1_SYMREAL))))), 2.0)+pow(((yC0_5_SYMREAL-((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(sin(psiC_6_SYMREAL)-sin((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*sin((0.017453292519943295*psi1_1_SYMREAL)))), 2.0))))) && ((((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)!=0.0)) && ((vA_2_SYMREAL!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		initNum.add("0,0,0,0,0,0,0");
		
/*		// 带初始点0可以去求解 有解  Parse time: 0.0 seconds.     Solve time: 0.113 seconds.
		functionName.add(" tsafe.Conflict.main()_19");
		paraName.add("vC_3_SYMREAL,bank_ang_7_SYMREAL,vA_2_SYMREAL,psi1_1_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)==0.0)) && ((vA_2_SYMREAL!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		initNum.add("0,0,0,0");*/
		
		
/*		
 *      //下面两个不属于三个主要关注的测试集合
 		//Parse time: 0.001 seconds.     Solve time: 1.511 seconds.
		functionName.add(" JpfTargetRayTrace.main()_8");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((3.4028234663852886E38==(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-r_4_SYMREAL))) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");	
		
		//Parse time: 0.0 seconds.     Solve time: 1.158 seconds.
		functionName.add(" JpfTargetRayTrace.main()_9");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-r_4_SYMREAL)>3.4028234663852886E38)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
				
		//Parse time: 0.0 seconds.     Solve time: 2.097 seconds.
		functionName.add(" JpfTargetRayTrace.main()_11");
		paraName.add("r_4_SYMREAL,dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((0.0==(((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL))))) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");	
		
		//Parse time: 0.0 seconds.     Solve time: 3.242 seconds.
		functionName.add(" JpfTargetRayTrace.main()_15");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((3.4028234663852886E38==(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-exp((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL))))))) && (((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
				
		//Parse time: 0.0 seconds.     Solve time: 3.204 seconds.
		functionName.add(" JpfTargetRayTrace.main()_16");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-exp((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))>3.4028234663852886E38)) && (((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 4.652 seconds.
		functionName.add(" JpfTargetRayTrace.main()_18");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((0.0==(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-exp((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL))))))) && (((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 1.04 seconds.
		functionName.add(" JpfTargetRayTrace.main()_21");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-exp((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))>0.0)) && (((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");

 		//Parse time: 0.0 seconds.     Solve time: 1.646 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_8");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((0.0==(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL))) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
	
		//Parse time: 0.001 seconds.     Solve time: 2.284 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_11");
		paraName.add("rad_14_SYMREAL,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((0.0==(((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL))))) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 4.544 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_15");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((0.0==(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-exp((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL))))))) && (((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.001 seconds.     Solve time: 3.993 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_16");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-exp((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))>0.0)) && (((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 4.582 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_18");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((0.0==(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-exp((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL))))))) && (((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 3.843 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_19");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-exp((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))>0.0)) && (((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
*/
	}
	
	
	
	public static void sp1()
	{

		functionName.add(" HV node For HelicalValley");
		paraName.add("x1_1_SYMREAL, x1_4_SYMREAL, x2_2_SYMREAL, x2_5_SYMREAL, x3_3_SYMREAL");
		paraType.add("double,double,double,double,double");
		String one="x1_4_SYMREAL> CONST_0.0 && x1_4_SYMREAL!= CONST_0.0 &&CONST_0.0 == x3_3_SYMREAL&&CONST_0.0 == ((x3_3_SYMREAL - (( atan ((x2_5_SYMREAL / x1_4_SYMREAL)) / CONST_6.283185307179586) * CONST_10.0)) * CONST_10.0) &&CONST_0.0 == (( sqrt (((x1_1_SYMREAL * x1_1_SYMREAL) + (x2_2_SYMREAL* x2_2_SYMREAL))) - CONST_1.0) * CONST_10.0)";
		binaryExp.add(one.replace("CONST_", ""));
		
		
		
/*		
        //线性约束全部可解
  		functionName.add(" TCas node10@Non_Crossing_Biased_Climb ");
		paraName.add("climb_inhibit_12_SYMINT, cur_vertical_sep_1_SYMINT, down_separation_9_SYMINT, high_confidence_2_SYMINT, other_capability_11_SYMINT, other_tracked_alt_6_SYMINT, own_tracked_alt_4_SYMINT, own_tracked_alt_rate_5_SYMINT, two_of_three_reports_valid_3_SYMINT, up_separation_8_SYMINT");
		paraType.add("int,int,int,int,int,int,int,int,int,int");
		one="high_confidence_2_SYMINT == CONST_1 && own_tracked_alt_rate_5_SYMINT <= CONST_600 && cur_vertical_sep_1_SYMINT > CONST_600 && other_capability_11_SYMINT != CONST_1 && two_of_three_reports_valid_3_SYMINT != CONST_1 && climb_inhibit_12_SYMINT != CONST_1 && up_separation_8_SYMINT <= down_separation_9_SYMINT && other_tracked_alt_6_SYMINT < own_tracked_alt_4_SYMINT && up_separation_8_SYMINT >= CONST_400 && own_tracked_alt_4_SYMINT >= other_tracked_alt_6_SYMINT";
		binaryExp.add(one.replace("CONST_", ""));
			
		functionName.add(" Tcas node7@Non_Crossing_Biased_Descend ");
		paraName.add("climb_inhibit_12_SYMINT, cur_vertical_sep_1_SYMINT, down_separation_9_SYMINT, high_confidence_2_SYMINT, other_capability_11_SYMINT, other_tracked_alt_6_SYMINT, own_tracked_alt_4_SYMINT, own_tracked_alt_rate_5_SYMINT, two_of_three_reports_valid_3_SYMINT, up_separation_8_SYMINT");
		paraType.add("int,int,int,int,int,int,int,int,int,int");
		one="high_confidence_2_SYMINT == CONST_1 && own_tracked_alt_rate_5_SYMINT <= CONST_600 && cur_vertical_sep_1_SYMINT > CONST_600 && other_capability_11_SYMINT != CONST_1 && two_of_three_reports_valid_3_SYMINT != CONST_1 && climb_inhibit_12_SYMINT == CONST_1 && (up_separation_8_SYMINT + CONST_300) > down_separation_9_SYMINT && own_tracked_alt_4_SYMINT < other_tracked_alt_6_SYMINT && down_separation_9_SYMINT >= CONST_400 && cur_vertical_sep_1_SYMINT >= CONST_300";
		binaryExp.add(one.replace("CONST_", ""));
		
		
		functionName.add(" Tcas node17@alt_sep_test ");
		paraName.add("climb_inhibit_12_SYMINT, cur_vertical_sep_1_SYMINT, down_separation_9_SYMINT, high_confidence_2_SYMINT, other_capability_11_SYMINT, other_rac_10_SYMINT, other_tracked_alt_6_SYMINT, own_tracked_alt_4_SYMINT, own_tracked_alt_rate_5_SYMINT, two_of_three_reports_valid_3_SYMINT, up_separation_8_SYMINT");
		paraType.add("int,int,int,int,int,int,int,int,int,int,int");
		one="high_confidence_2_SYMINT == CONST_1 && own_tracked_alt_rate_5_SYMINT <= CONST_600 && cur_vertical_sep_1_SYMINT > CONST_600 && other_capability_11_SYMINT != CONST_1 && two_of_three_reports_valid_3_SYMINT == CONST_1 && other_rac_10_SYMINT == CONST_0 && climb_inhibit_12_SYMINT != CONST_1 && up_separation_8_SYMINT <= down_separation_9_SYMINT && other_tracked_alt_6_SYMINT < own_tracked_alt_4_SYMINT && up_separation_8_SYMINT >= CONST_400 && own_tracked_alt_4_SYMINT >= other_tracked_alt_6_SYMINT";
		binaryExp.add(one.replace("CONST_", ""));
		
		functionName.add(" Tcas node24@alt_sep_test ");
		paraName.add("climb_inhibit_12_SYMINT, cur_vertical_sep_1_SYMINT, down_separation_9_SYMINT, high_confidence_2_SYMINT, other_capability_11_SYMINT, other_tracked_alt_6_SYMINT, own_tracked_alt_4_SYMINT, own_tracked_alt_rate_5_SYMINT, two_of_three_reports_valid_3_SYMINT, up_separation_8_SYMINT");
		paraType.add("int,int,int,int,int,int,int,int,int,int");
		one="high_confidence_2_SYMINT == CONST_1 && own_tracked_alt_rate_5_SYMINT <= CONST_600 && cur_vertical_sep_1_SYMINT > CONST_600 && other_capability_11_SYMINT != CONST_1 && two_of_three_reports_valid_3_SYMINT != CONST_1 && climb_inhibit_12_SYMINT != CONST_1 && up_separation_8_SYMINT <= down_separation_9_SYMINT && other_tracked_alt_6_SYMINT < own_tracked_alt_4_SYMINT && up_separation_8_SYMINT >= CONST_400 && own_tracked_alt_4_SYMINT >= other_tracked_alt_6_SYMINT";
		binaryExp.add(one.replace("CONST_", ""));
		
		*/
		
	}
	

}
