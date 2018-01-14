package cn.nju.seg.atpc.simplification;

import java.util.ArrayList;
import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import cn.nju.seg.atpc.main.ConstraintParameter;
import cn.nju.seg.atpc.model.BinaryExpression;



/*
 * 这个类主要是去除部分常量的表达式
 * */
public class RemoveConst 
{

	/*
	 * 保存在要处理的约束
	 * 合取子式
	 * */
	public List<BinaryExpression> target = null;
	
	/*
	 * 表达式计算引擎
	 * */
	public static ScriptEngine myScriptEngine = null;
	
	/*
	 * 构造函数
	 * */
	public RemoveConst(List<BinaryExpression> target)
	{
		this.target = target;
		this.myScriptEngine= new ScriptEngineManager().getEngineByName("JavaScript");
	}
	
	/*
	 * 在昨晚变量和平方和子项的替换之后检查是否一些变量已经是不包含任何变量了，
	 * 假如存在的话，直接删除该约束，同时这也是一个检查是否存在不可解的情况之一
	 * */
	public void removeAllConst()
	{
		//这个数组保存需要删除的约束的信息
		List<Integer> index=new ArrayList<>();
		for(int i=0;i<this.target.size();i++)
		{
			String calaStr = this.target.get(i).toString();
			if(isValid(calaStr)==false)
			{
				boolean res = calaBoolByJS(calaStr);
				System.out.println(calaStr+"   <============>   "+res);
				if(res==true)
				{
					index.add(i);
					System.out.println("复合约束经过化简替换之后,找到这样一个常量约束(恒成立): "+calaStr+" ,所以可以直接忽略");
				}
			  /*else
				{
					ConstraintParameter.hasSolution = false;
					String info = "复合约束经过化简替换之后,找到这样一个不可解的约束(恒不成立): "+calaStr+" ,所以不可解\n";
					ConstraintParameter.noSolutionInfo += info;
				}*/
			}
		}
				
		//对target从后向前依次删除不想管的约束
		for(int i=index.size()-1;i>=0;i--)
		{
			int k = index.get(i);
			this.target.remove(k);
		}
		
		System.out.println();
	}

	/*
	 * 判断一个约束是否是常量表达式，
	 * 首先检查输入变量的相关性，加入全部都不相关，直接计算即可
	 * 为了简便，我这里直接使用字符串匹配来做的
	 * 是有点误差，但是对于我而言，够用了
	 * */
	public boolean isValid(String target) 
	{
		String[] varName = ConstraintParameter.parameterNames;
		for(int i=0;i<varName.length;i++)
		{
			if(target.contains(varName[i])==true)
			{
				return true;
			}
		}
		return false;
	}

	/*
	 * 使用表达式计算引擎，直接计算常量表达式的值
	 * */
	public synchronized boolean calaBoolByJS(String calaStr)
	{
		boolean finalRes = true;
		try 
		{
			String afterReplace = new MathFunctionReplace(calaStr).runReplace();
			finalRes = (boolean) myScriptEngine.eval(afterReplace);
		} catch (ScriptException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("***** JS.eval cala Wrong. Your Constraint: "+ calaStr
			 + " must contains some base math functions whose format are not supported. *****\n");
		}
		return finalRes;
	}
	
		
	
}
