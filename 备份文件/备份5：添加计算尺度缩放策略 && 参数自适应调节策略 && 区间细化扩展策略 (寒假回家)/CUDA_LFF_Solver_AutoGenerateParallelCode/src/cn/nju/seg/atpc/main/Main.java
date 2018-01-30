package cn.nju.seg.atpc.main;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cn.nju.seg.atpc.generate.ATPC;
import cn.nju.seg.atpc.gui.Coodinate;
import cn.nju.seg.atpc.gui.LFFGUI;
import cn.nju.seg.atpc.gui.LineChart;
import cn.nju.seg.atpc.parser.BinaryExpressionParse;

/*
 * @author zhanghui
 * */

public class Main
{

	
	public static void main(String[] args)
	{
/*		BenchMarkForZYFWithInit.sp();
		List<String> functionName = BenchMarkForZYFWithInit.functionName;
		List<String> binaryExp = BenchMarkForZYFWithInit.binaryExp;
		List<String> paraName = BenchMarkForZYFWithInit.paraName;
		List<String> paraType = BenchMarkForZYFWithInit.paraType;
		List<String> initNum = BenchMarkForZYFWithInit.initNum;
		
		BenchMarkForZYF.sp1();
		List<String> functionName = BenchMarkForZYF.functionName;
		List<String> binaryExp = BenchMarkForZYF.binaryExp;
		List<String> paraName = BenchMarkForZYF.paraName;
		List<String> paraType = BenchMarkForZYF.paraType;
		List<String> initNum = BenchMarkForZYF.initNum;
		 
		
		for(int i=0;i<functionName.size();i++)
		{
			if(initNum.size()<=0 || initNum.size()!=binaryExp.size())
				BinaryExpressionParse.initAll(binaryExp.get(i),functionName.get(i),paraType.get(i),paraName.get(i));
			else 
				BinaryExpressionParse.initAll(binaryExp.get(i),functionName.get(i),paraType.get(i),paraName.get(i),initNum.get(i));
			BinaryExpressionParse.beginSolver();
			System.gc();
		}
		*/
		
		String fileName = "file1.data";
		if(ATPC.showLFFGUI == true)
			LFFGUI.begintGUI(fileName);
		
		//一共104个benchmark
		BenchMark.initBenchmark();
		List<String> functionName = BenchMark.functionName;
		List<String> binaryExp = BenchMark.binaryExp;
		List<String> paraName = BenchMark.paraName;
		List<String> paraType = BenchMark.paraType;
		
		int i = 0;
		//for(int i=0;i<functionName.size();i++)
		{
			BinaryExpressionParse.initAll(binaryExp.get(i),functionName.get(i),paraType.get(i),paraName.get(i));
			String filepath1 = "/home/zy/Cuda_Workspace/LFF Solver/src/ConstraintParser";
			String filepath2 = "/home/zy/Cuda_Workspace/LFF Solver/src/cuda";
			
			//BinaryExpressionParse.beginAutoGenerateParallelCode(filepath1,filepath2);
		    
			//String [] cmd={"/bin/sh","-c","cd /home/zy/Cuda_Workspace/LFF\\ \\Solver/Debug && make && ./LFF\\ \\Solver"};
			//Process process = Runtime.getRuntime().exec (cmd);
			//process.waitFor();
		}
		System.out.println("***** Game Over *****");

	}

}
