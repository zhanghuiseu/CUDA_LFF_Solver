package cn.nju.seg.atpc.simplification;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

import org.eclipse.cdt.core.dom.ast.IASTBinaryExpression;
import org.eclipse.cdt.core.dom.ast.IASTExpression;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTFunctionCallExpression;

import cn.nju.seg.atpc.generate.ATPC;
import cn.nju.seg.atpc.model.BinaryExpression;
import cn.nju.seg.atpc.model.BinaryExpressionUtil;
import cn.nju.seg.atpc.model.IdExpression;
import cn.nju.seg.atpc.model.Operator;


/*
 * 这个类主要是对符合约束做一个初步的化简，
 * 主要化简的是函数调用，分为两大类
 * 1）== 和 ！=  : f(x)==f(y) <=======>  x==y && x 满足定义域 && y 满足定义域
 * 2）>,>=,<和<= : f(x)>f(y) <=======>  通过单调性来做x > y && x 满足定义域 && y 满足定义域
 * */
public class Simplification 
{
	/*
	 * 保存在要处理的约束
	 * 合取子式
	 * */
	public List<BinaryExpression> target = null;
	
	/*
	 * 这个是把约束替换之后的形成的约束
	 * */
	public List<BinaryExpression> afterSimplification = null;
	
	/*
	 * 这个是使用Solve去判定不可行类中的计算结果，
	 * */
	public Solve solve = null;
	
	/*
	 * 构造函数
	 * */
	public Simplification(List<BinaryExpression> target, Solve solve) 
	{
		this.afterSimplification = new ArrayList<>();
		this.target = target;
		this.solve = solve;
	}
	
	/*
	 * 化简所有的约束
	 * */
	public List<BinaryExpression> simplifyAll()
	{
		for(BinaryExpression one : this.target)
		{
			List<BinaryExpression> case0Res = dealWithCase0((IASTExpression)one.getIastExpression());
			this.afterSimplification.addAll(case0Res);
			
			List<BinaryExpression> case1Res = dealWithCase1((IASTExpression)one.getIastExpression());
			this.afterSimplification.addAll(case1Res);
		}
		
		return this.afterSimplification;
	}
	
	
	
	/*
	 * 处理等式的函数调用，
	 * 这个直接利用f(x)==f(y) <====> x==y && x满足定义域 && y满足定义域
	 * */
	@SuppressWarnings("restriction")
	public List<BinaryExpression> dealWithCase0(IASTExpression iast)
	{
		List<BinaryExpression> res = new ArrayList<>();
		IASTBinaryExpression tmp = (IASTBinaryExpression)iast;
		IASTExpression op1 = Domain.removeBracket(tmp.getOperand1());
		IASTExpression op2 = Domain.removeBracket(tmp.getOperand2());
		
		//只考虑等式约束
		if((tmp.getOperator()==IASTBinaryExpression.op_equals || tmp.getOperator()==IASTBinaryExpression.op_notequals))
		{
			if(isSameFunctionForEQ(op1, op2)==true)
			{
				CPPASTFunctionCallExpression a = (CPPASTFunctionCallExpression)op1;
				CPPASTFunctionCallExpression b = (CPPASTFunctionCallExpression)op2;
				
				BinaryExpression left = getOne(a);
				BinaryExpression right = getOne(b);
				if(left!=null)
					res.add(left);
				if(right!=null)
					res.add(right);
				
				BinaryExpression after = new BinaryExpression();
				IdExpression operand1 = new IdExpression(a.getParameterExpression().getRawSignature().replace(" ",""));
				IdExpression operand2 = new IdExpression(b.getParameterExpression().getRawSignature().replace(" ",""));
		
				after.setOp(BinaryExpressionUtil.translateOp(tmp.getOperator()));			
				after.setOperand1(operand1);
				after.setOperand2(operand2);
				after.setIastExpression((IASTExpression)tmp);
				operand1.setParent(after);
				operand2.setParent(after);
				
				res.add(after);
			}else
			{
				BinaryExpression copy = new BinaryExpression();
				IdExpression operand1 = new IdExpression(op1.getRawSignature().replace(" ",""));
				IdExpression operand2 = new IdExpression(op2.getRawSignature().replace(" ",""));
		
				copy.setOp(BinaryExpressionUtil.translateOp(tmp.getOperator()));			
				copy.setOperand1(operand1);
				copy.setOperand2(operand2);
				copy.setIastExpression((IASTExpression)tmp);
				operand1.setParent(copy);
				operand2.setParent(copy);
				
				res.add(copy);
			}
			return res;
		}else
		{
			return res;
		}
	}
	
	/*
	 * 这个是处理不等式的化简，主要就是通过函数的单调性来处理
	 * 这个时候主要就有exp，log，sqrt这三个函数
	 * 对于其余的三角函数，ceil,floor,round,pow等等都没法处理了
	 * */
	@SuppressWarnings("restriction")
	public List<BinaryExpression> dealWithCase1(IASTExpression iast)
	{
		List<BinaryExpression> res = new ArrayList<>();
		IASTBinaryExpression tmp = (IASTBinaryExpression)iast;
		IASTExpression op1 = Domain.removeBracket(tmp.getOperand1());
		IASTExpression op2 = Domain.removeBracket(tmp.getOperand2());
		
		boolean condition1 = tmp.getOperator()==IASTBinaryExpression.op_greaterEqual 
				          || tmp.getOperator()==IASTBinaryExpression.op_greaterThan
				          || tmp.getOperator()==IASTBinaryExpression.op_lessEqual 
				          || tmp.getOperator()==IASTBinaryExpression.op_lessThan;
		
		if(condition1==true)
		{
			if(isSameFunctionForOther(op1,op2)==true)
			{
				//由于只考虑exp，log，sqrt这三个函数，这三个函数都是单调递增的，所以接下来需要考虑定义域了
				CPPASTFunctionCallExpression a = (CPPASTFunctionCallExpression)op1;
				CPPASTFunctionCallExpression b = (CPPASTFunctionCallExpression)op2;
				
				BinaryExpression left = getOne(a);
				BinaryExpression right = getOne(b);
				if(left!=null)
					res.add(left);
				if(right!=null)
					res.add(right);
				
				BinaryExpression after = new BinaryExpression();
				IdExpression operand1 = new IdExpression(a.getParameterExpression().getRawSignature().replace(" ",""));
				IdExpression operand2 = new IdExpression(b.getParameterExpression().getRawSignature().replace(" ",""));
		
				after.setOp(BinaryExpressionUtil.translateOp(tmp.getOperator()));			
				after.setOperand1(operand1);
				after.setOperand2(operand2);
				after.setIastExpression((IASTExpression)tmp);
				operand1.setParent(after);
				operand2.setParent(after);
				
				res.add(after);
			}else
			{
				BinaryExpression copy = new BinaryExpression();
				IdExpression operand1 = new IdExpression(op1.getRawSignature().replace(" ",""));
				IdExpression operand2 = new IdExpression(op2.getRawSignature().replace(" ",""));
		
				copy.setOp(BinaryExpressionUtil.translateOp(tmp.getOperator()));			
				copy.setOperand1(operand1);
				copy.setOperand2(operand2);
				copy.setIastExpression((IASTExpression)tmp);
				operand1.setParent(copy);
				operand2.setParent(copy);
				
				res.add(copy);
			}
			return res;
		}else
		{
			return res;
		}
	}
	
	/*
	 * 这个函数主要的作用就是直接化简一个孩子节点
	 * */
	@SuppressWarnings({ "deprecation", "restriction" })
	public BinaryExpression getOne(CPPASTFunctionCallExpression iast)
	{
		String func = iast.getFunctionNameExpression().getRawSignature();
		if(func.equals("sqrt")==true || func.contains("log")==true)
		{
			BinaryExpression res = new BinaryExpression();
			IdExpression operand1 = new IdExpression(iast.getParameterExpression().getRawSignature().replace(" ",""));
			IdExpression operand2 = new IdExpression("0");
			
			if(func.equals("sqrt")==true)
				res.setOp(Operator.GE);
			else
				res.setOp(Operator.GT);
			
			res.setOperand1(operand1);
			res.setOperand2(operand2);
			res.setIastExpression((IASTExpression)iast.getParameterExpression());
			operand1.setParent(res);
			operand2.setParent(res);
			
			return res;
		}else
		{
			return null;
		}
			
	}
	
	/*
	 * 本函数是判断left和right是否是同一个函数调用，
	 * 对象是基本初等函数，但是除了pow和atan2
	 * */
	@SuppressWarnings("restriction")
	public static boolean isSameFunctionForEQ(IASTExpression left,IASTExpression right)
	{
		left = Domain.removeBracket(left);
		right = Domain.removeBracket(right);
		if(left instanceof CPPASTFunctionCallExpression && right instanceof CPPASTFunctionCallExpression)
		{
			CPPASTFunctionCallExpression a = (CPPASTFunctionCallExpression)left;
			CPPASTFunctionCallExpression b = (CPPASTFunctionCallExpression)right;
			String funca = a.getFunctionNameExpression().getRawSignature();
			String funcb = b.getFunctionNameExpression().getRawSignature();
			if(funca.equals(funcb)==true && isTargetFunc(funca)==true)
				return true;
			else
				return false;
		}else
		{
			return false;
		}	
	}
	
	/*
	 * 这个函数是确认是否利用单调性来做化简,注意pow幂函数和atan2函数有两个参数，所以无法直接利用单调性
	 * */
	public static boolean isTargetFunc(String func)
	{
		if(func.contains("sin") || func.contains("cos") || func.equals("tan") || func.equals("atan"))
			return true;
		else if(func.equals("ceil") || func.equals("floor") || func.equals("round"))
			return true;
		else if(func.contains("exp") || func.contains("log") || func.equals("sqrt"))
			return true;
		else if(func.equals("pow"))
			return false;
		else 
			return false;
	}
		
	/*
	 * 本函数是判断left和right是否是同一个函数调用，
	 * 对象是基本初等函数，但是除了pow和atan2
	 * */
	@SuppressWarnings("restriction")
	public static boolean isSameFunctionForOther(IASTExpression left,IASTExpression right)
	{
		left = Domain.removeBracket(left);
		right = Domain.removeBracket(right);
		if(left instanceof CPPASTFunctionCallExpression && right instanceof CPPASTFunctionCallExpression)
		{
			CPPASTFunctionCallExpression a = (CPPASTFunctionCallExpression)left;
			CPPASTFunctionCallExpression b = (CPPASTFunctionCallExpression)right;
			String funca = a.getFunctionNameExpression().getRawSignature();
			String funcb = b.getFunctionNameExpression().getRawSignature();
			
			//基本初等函数中只有下面三个需要考虑单调性
			boolean condition1 = funca.contains("exp") || funca.contains("log") || funca.equals("sqrt");
			
			if(funca.equals(funcb)==true && condition1==true)
				return true;
			else
				return false;
		}else
		{
			return false;
		}	
	}

	
	
	
	public List<BinaryExpression> getTarget()
	{
		return target;
	}

	public void setTarget(List<BinaryExpression> target) 
	{
		this.target = target;
	}

	public List<BinaryExpression> getAfterSimplification() 
	{
		return afterSimplification;
	}

	public void setAfterSimplification(List<BinaryExpression> afterSimplification)
	{
		this.afterSimplification = afterSimplification;
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
