package cn.nju.seg.atpc.gui;

/*
 * 坐标类(x, y)
 * @author zhanghui
 */
public class Coodinate 
{
	private double x;
	private double y;
	
	/*
	 * 无参构造函数
	 */
	public Coodinate() 
	{
		this.x = 0.0;
		this.y = 0.0;
	}
	
	/*
	 * 带参数构造函数
	 * */
	public Coodinate(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString()
	{
		return "("+this.x+","+this.y+")";
	}
	
	public double getX() 
	{
		return x;
	}
	
	public void setX(double x) 
	{
		this.x = x;
	}
	
	public double getY() 
	{
		return y;
	}
	
	public void setY(double y) 
	{
		this.y = y;
	}
}
