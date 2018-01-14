package cn.nju.seg.atpc.simplification;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import org.eclipse.cdt.core.dom.ast.IASTExpression;

import cn.nju.seg.atpc.generate.ATPC;
import cn.nju.seg.atpc.main.ConstraintParameter;
import cn.nju.seg.atpc.model.BinaryExpression;
import cn.nju.seg.atpc.model.BinaryExpressionUtil;
import cn.nju.seg.atpc.model.IdExpression;
import cn.nju.seg.atpc.model.Operator;



/*
 *
 * 这个类主要的功能就是把Solver类求出来的变量的值做一个直接的替换，这个包括两大类
 * */
public class ReplaceConst 
{
	/*
	 * 保存在要处理的约束
	 * 合取子式
	 * */
	public List<BinaryExpression> target = null;
	
	
	/*
	 * 访问所有的等式信息
	 * */
	public Solve solve = null;
	
	
	/*
	 * 构造函数
	 * */
	public ReplaceConst(List<BinaryExpression> target,Solve solve) 
	{
		this.target = target;
		this.solve=solve;
	}
	
	
	/*
	 * 使用Solver之前计算好的等式的值，给所有的约束做替换处理，主要分为两类替换
	 * 1）x==1 这种变量替换
	 * 2）f(x)==2 做整体替换
	 * 
	 * 这里使用的是字符串替换，替换次序是先替换长度长的字符串，然后是替换长度较短的，否则替换会出错
	 * */
	public void replaceAllConst()
	{
		/*
		 * 注意：一定要先做整体代换，然后做单个变量的替换
		 * 这里的替换我是通过字符串替换实现的，所以变量的名字
		 * 不要设计成类似x,x1这种前者是后者的子串的形式，
		 * 否则的话会出现替换错误的情况
		 * */
		for(int i=0;i<this.target.size();i++)
		{
			//平方和子项整体替换
			dealWithCase1(this.target.get(i));
		}
		
		//平方和子项整体替换的部分还需要把整体代换的那部分添加进去
		Set<String> keySet = this.solve.NotLinearSubToValue.keySet();
		for(String key : keySet)
		{
			String value = this.solve.NotLinearSubToValue.get(key);
		
			BinaryExpression after = new BinaryExpression();
			IdExpression operand1 = new IdExpression(key.replace(" ",""));
			IdExpression operand2 = new IdExpression(value.replace(" ",""));
				
			after.setOp(Operator.EQ);			
			after.setOperand1(operand1);
			after.setOperand2(operand2);
			after.setIastExpression(null);
			operand1.setParent(after);
			operand2.setParent(after);
			this.target.add(after);
		}
		
		for(int i=0;i<this.target.size();i++)
		{
			//单变量赋值替换
			dealWithCase0(this.target.get(i));
		}
		
		//下面是把已经计算好的变量的值保存起来
		String[] varName = ConstraintParameter.parameterNames;
		for(int i=0;i<varName.length;i++)
		{
			//设置已经求解好的变量
			String key = varName[i];
			List<Double> list = new ArrayList<>(solve.allEqual.get(key));
			if(list.size()==1)
				ConstraintParameter.allVarEqualMap.put(key, list.get(0)+"");
		}
	}
	
	
	/*
	 * 这个是处理单变量的替换
	 * 比如 x==1
	 * */
	public void dealWithCase0(BinaryExpression one)
	{
		String left = one.getOperand1().toString().replace(" ", "");
		String right = one.getOperand2().toString().replace(" ", "");
		
		//这里的排序是按照字符串的长度递减来排序的
		String[] varName = ConstraintParameter.parameterNames;
		List<String> keyList = new ArrayList<>();
		for(int i=0;i<varName.length;i++)
			keyList.add(varName[i]);
		
		Collections.sort(keyList, new Comparator<String>(){
			@Override
			public int compare(String a, String b) 
			{
				if(a.length() >= b.length())
					return -1;
				else
					return 1;
			}
		});
		
		for(int i=0;i<keyList.size();i++)
		{
			String key = keyList.get(i);
			Set<Double> eq = this.solve.allEqual.get(key);
			List<Double> tmp = new ArrayList<>(eq);
			if(tmp.size()==1)
			{
				String value="";
				if(tmp.get(0)>=0)
					value = tmp.get(0)+"";
				else
					value = "("+tmp.get(0)+")";
				left  = replace(left,key,value);
				right = replace(right,key,value);
				
				//left = left.replace(key, tmp.get(0)+"");
				//right = right.replace(key, tmp.get(0)+"");
			}
		}
		one.setOperand1(new IdExpression(left));
		one.setOperand2(new IdExpression(right));
	}
	
	
	/*
	 * 这个是平方和子项的整体替换
	 * */
	public void dealWithCase1(BinaryExpression one)
	{
		String left = one.getOperand1().toString().replace(" ", "");
		String right = one.getOperand2().toString().replace(" ", "");
		
		Set<String> keySet = this.solve.NotLinearSubToValue.keySet();
		List<String> keyList = new ArrayList<>(keySet);
		
		Collections.sort(keyList, new Comparator<String>(){
			@Override
			public int compare(String a, String b) 
			{
				if(a.length() >= b.length())
					return -1;
				else
					return 1;
			}
		});
		
		for(String key : keyList)
		{
			String value = this.solve.NotLinearSubToValue.get(key).replace(" ", "");
			left = left.replace(key, value);
			right = right.replace(key, value);
		}
		
		one.setOperand1(new IdExpression(left));
		one.setOperand2(new IdExpression(right));
	}
	
	/*
	 * 这个是专门做变量的替换，为什么这么做的原因是考虑到这样的情况：
	 * eg exp(x-1) && x==1   ==========> 加入直接使用库函数去做x的替换会得到 e1p(1-1)
	 * 很明显这是不正确的，因为对于变量的替换是不可以这么做的，考虑到变量的前后应该是各种操作符号，
	 * 所以我就用这个简单的规则去做一个替换规则的判定
	 * */
	public String replace(String target,String key,String value)
	{
		String res = "";
		while(target.indexOf(key)!=-1)
		{
			int i=target.indexOf(key);
			boolean isValid=true;
			if(i-1>=0)
			{
				//前面的字符不是字母数字等等
				boolean pre = target.charAt(i-1)>='a' && target.charAt(i-1)<='z'
						   || target.charAt(i-1)>='A' && target.charAt(i-1)<='Z'
						   || target.charAt(i-1)>='0' && target.charAt(i-1)<='9'
						   || target.charAt(i-1)=='_';
				if(pre==true)
					isValid = false;
			}
			
			//后面的字符不是字母数字等等
			if(i+key.length()<target.length())
			{
				int j = i+key.length();
				boolean pre = target.charAt(j)>='a' && target.charAt(j)<='z'
						   || target.charAt(j)>='A' && target.charAt(j)<='Z'
						   || target.charAt(j)>='0' && target.charAt(i)<='9'
						   || target.charAt(j)=='_';
				if(pre==true)
					isValid = false;
			}
			
			//只要前面和后面的不是字母数字等等，就表示可以做替换，然后操作如下
			if(isValid==true)
			{
				res+=target.substring(0, i)+value;
				target=target.substring(i+key.length());
			}else
			{
				//前方或者后方发现字母数字，表示不可以做替换，那么直接截取下来，去做下一个字符的判断
				res+=target.substring(0, i+key.length());
				target=target.substring(i+key.length());
			}
		}
		res+=target;
		return res;
	}
	
	public List<BinaryExpression> getTarget() 
	{
		return target;
	}


	public void setTarget(List<BinaryExpression> target)
	{
		this.target = target;
	}


	public Solve getSolve() 
	{
		return solve;
	}


	public void setSolve(Solve solve)
	{
		this.solve = solve;
	}
	
	
}
