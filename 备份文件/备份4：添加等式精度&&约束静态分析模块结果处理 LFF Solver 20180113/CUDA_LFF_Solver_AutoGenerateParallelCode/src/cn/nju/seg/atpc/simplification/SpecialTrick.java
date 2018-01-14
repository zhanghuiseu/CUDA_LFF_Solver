package cn.nju.seg.atpc.simplification;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cn.nju.seg.atpc.generate.ATPC;
import cn.nju.seg.atpc.main.ConstraintParameter;
import cn.nju.seg.atpc.model.BinaryExpression;
import cn.nju.seg.atpc.model.IdExpression;



/*
 * 这个是做特殊的奇技淫巧的Tricks
 * 就是直接特殊替换的处理
 * */
public class SpecialTrick 
{
	/*
	 * 保存在要处理的约束
	 * 合取子式
	 * */
	public List<BinaryExpression> target = null;
	
	/*
	 * 映射关系的初始化
	 * */
	public Map<String, String> mmp = new HashMap<String, String>();
	
	/*
	 * 构造函数
	 * */
	public SpecialTrick(List<BinaryExpression> target) 
	{
		this.target = target;
		init();
	}
	
	
	/*
	 * 映射关系mmp的初始化
	 * */
	public void init()
	{
		//mmp.put("x1", "1");
	}


	/*
	 * 各种无法处理的直接替换
	 * */
	public void runTrick()
	{
		if(ConstraintParameter.hasSolution == true)
		{
			for(int i=0;i<this.target.size();i++)
			{
				trick(this.target.get(i));
			}
		}
	}


	public void trick(BinaryExpression one) 
	{
		String left = one.getOperand1().toString().replace(" ", "");
		String right = one.getOperand2().toString().replace(" ", "");
		
		Set<String> keySet = this.mmp.keySet();
		for(String key : keySet)
		{
			String value = this.mmp.get(key).replace(" ", "");
			left = left.replace(key, value);
			right = right.replace(key, value);
		}
		
		one.setOperand1(new IdExpression(left));
		one.setOperand2(new IdExpression(right));
	}
	
}
