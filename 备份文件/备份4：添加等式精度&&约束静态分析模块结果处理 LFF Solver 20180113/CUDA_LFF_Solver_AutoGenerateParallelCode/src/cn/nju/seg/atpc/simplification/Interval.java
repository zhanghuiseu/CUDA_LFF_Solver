package cn.nju.seg.atpc.simplification;



/**
 * 用于在对复杂约束做静态分析的时候生成对应的搜索空间
 * @author zhanghui
 */
public class Interval 
{
	public double left;
	public double right;
	
	public Interval()
	{
		this.left = 1e10;
		this.right = 1e10;
	}
	
	public Interval(double left,double right)
	{
		this.left = left;
		this.right = right;
	}
	
	public void setLeft(double left) {
		this.left = left;
	}

	public void setRight(double right) {
		this.right = right;
	}

	public void setLeft(int left) {
		this.left = left;
	}


	public void setRight(int right) {
		this.right = right;
	}
	
}

