package cn.nju.seg.atpc.gui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/*
 * 这个类主要是处理线性拟合曲线的图形化显示
 * @author zhanghui
 */
public class LFFGUI 
{
	/*
	 * 这个函数就是启动图形化展示线性拟合函数的入口
	 * */
	public static void begintGUI(String fileName)
	{
		String filePath = new File("").getAbsolutePath().toString()+"/LFFData/";
		filePath += fileName;
		
		//参数部分
		String title = "PLFF Solver GUI: ";
		double effectiveValue = 0;
		List<Coodinate> coodinateList=new ArrayList<>();
		List<Double> markerList=new ArrayList<>();
		
		BufferedReader reader = null;
		try 
		{
			File file=new File(filePath);
			reader = new BufferedReader(new FileReader(file));
			
			String name = reader.readLine();
			String var = reader.readLine();
			title = title + name + "  SearchIndex: "+var;
			
			//读取数据
			String data = reader.readLine();
			if(data!=null && data.equals("begin data"))
			{
				while((data=reader.readLine()) != null && data.length() > 0)
				{
					if(data.contains("nan") == false && data.contains("inf") == false)
					{
						String[] res = data.split(",");
						double x = Double.parseDouble(res[0]);
						double y = Double.parseDouble(res[1]);
						
						if(containPoint(coodinateList,x,y) == false)
							coodinateList.add(new Coodinate(x,y));
						
						if(containMark(markerList,x) == false)
							markerList.add(x);
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//启动图形化的线性拟合函数的显示
		new LineChart().showLineChart(title, coodinateList, markerList, effectiveValue);
	}

	/*
	 * 判断是否有重复元素的存在
	 * */
	private static boolean containPoint(List<Coodinate> coodinateList,
			double x, double y) 
	{
		for(Coodinate c : coodinateList)
		{
			if(c.getX()==x && c.getY()==y)
				return true;
		}
		return false;
	}
	
	/*
	 * 判断是否有重复元素的存在
	 * */
	private static boolean containMark(List<Double> markerList, double x) 
	{
		for(Double d:markerList)
		{
			if(d == x)
				return true;
		}
		return false;
	}


}
