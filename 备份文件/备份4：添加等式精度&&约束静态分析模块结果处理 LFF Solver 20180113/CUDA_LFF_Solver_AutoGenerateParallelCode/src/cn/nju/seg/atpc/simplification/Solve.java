package cn.nju.seg.atpc.simplification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.cdt.core.dom.ast.IASTBinaryExpression;
import org.eclipse.cdt.core.dom.ast.IASTExpression;
import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTFunctionCallExpression;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTIdExpression;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTUnaryExpression;

import cn.nju.seg.atpc.generate.ATPC;
import cn.nju.seg.atpc.main.ConstraintParameter;
import cn.nju.seg.atpc.model.BinaryExpression;


/**
 * 这个类主要是做不可行判定的，
 * 不可行的判定是通过规则来做的，所以所有不可行判定的规则都在这个类中做扩展
 * 在做搜索变量定义域初步确定的类Domain中使用定义域做了一个初步的判定
 * 不过在Domain类中主要处理的是不等式，在本类中主要处理等式，以及x>a && < a等等情况
 * @author zhanghui
 */
public class Solve 
{
	/*
	 * 保存在要处理的约束
	 * 合取子式
	 * */
	public List<BinaryExpression> target = null;
	
	/*
	 * 使用已经计算好的区间的信息去做进一步的判断
	 * */
	public Domain domain = null;
	
	/*
	 * 这个是记录等式约束和不等式约束处理
	 * 就是保存所有的等式和不等式的值
	 * */
	public Map<String, Set<Double>> allEqual = new HashMap<>();
	public Map<String, Set<Double>> allNotEqual = new HashMap<>();
	
	/*
	 * 这个映射是处理其余的无法处理的平方和子项目，直接整体替换即可
	 * */
	public Map<String, String> NotLinearSubToValue = new HashMap<>();
	
	
	/*
	 * 下面的是用来保存平方和为0的每一个平方的子项，比如 (x-1)*(x1-1)+y*y==0,
	 * */
	public List<IASTExpression> allSubExpZero =  new ArrayList<>();
	
	/*
	 * 下面的是用来保存单个自相平方等于一个常数的情况
	 * */
	public List<IASTExpression> allSubExpNotZero = new ArrayList<>();
	public List<Double> allSubExpNotZeroValue = new ArrayList<>();
	
	/*
	 * 构造函数
	 * */
	public Solve(List<BinaryExpression> target,Domain domain)
	{
		this.target = target;
		this.domain = domain;
		
		String[] varName = ConstraintParameter.parameterNames;
		for(int i=0;i<varName.length;i++)
		{
			Set<Double> set0 = new HashSet<Double>();
			allEqual.put(varName[i], set0);
			
			Set<Double> set1 = new HashSet<Double>();
			allNotEqual.put(varName[i], set1);
		}
	}
	
	
	/*
	 * 计算是否存在最小不可解集合以判断不可行性
	 * */
	public void calaMiniUnsolveSet()
	{
		//处理  x>1 && x<1 ，使用Domain类中的定义域去做
		dealWithCase0();
	
		//处理x==a && x!=a的
		dealWithCase1();
		
		//处理处理a*x+b 
		dealWithCase2();
		
		//处理 a == b 和 a != a
		dealWithCase3();
		
		//处理平方之和的问题
		dealWithCase4();
		
		//最后的评估计算
		calaEqualAndNotEqual();
		
	}

	/*
	 * 这个函数主要是针对 x>1 && x<1这种不可行的判断，也即针对不等式的不可行的判断
	 * 和Domain类的部分函数重复
	 * */
	public void dealWithCase0()
	{
		String[] varName = ConstraintParameter.parameterNames;
		for(int i=0;i<varName.length;i++)
		{
			Interval res = ConstraintParameter.allVarDomain.get(i);
			//出现一个点的区间就要根据区间的开闭来判断是否无解
			if(res.left == res.right)
			{
				Set<String> set = this.domain.allOp.get(varName[i]);
				String info = "";
				if(set.contains(">=") && set.contains("<"))
				{
					info = "复合约束中存在最小不可解集,找到这样一个: "+varName[i]+">="+res.left+" && "+
						varName[i]+"<"+res.left+" ,所以不可解\n";
					ConstraintParameter.hasSolution = false;
				}else if(set.contains(">") && set.contains("<="))
				{
					info = "复合约束中存在最小不可解集,找到这样一个: "+varName[i]+">"+res.left+" && "+
							varName[i]+"<="+res.left+" ,所以不可解\n";
					ConstraintParameter.hasSolution = false;
				}else if(set.contains("<=") && set.contains(">"))
				{
					info = "复合约束中存在最小不可解集,找到这样一个: "+varName[i]+"<="+res.left+" && "+
							varName[i]+">"+res.left+" ,所以不可解\n";
					ConstraintParameter.hasSolution = false;
				}else if(set.contains("<") && set.contains(">="))
				{
					info = "复合约束中存在最小不可解集,找到这样一个: "+varName[i]+"<"+res.left+" && "+
							varName[i]+">="+res.left+" ,所以不可解\n";
					ConstraintParameter.hasSolution = false;
				}else if(set.contains("<") && set.contains(">"))
				{
					info = "复合约束中存在最小不可解集,找到这样一个: "+varName[i]+"<"+res.left+" && "+
							varName[i]+">"+res.left+" ,所以不可解\n";
					ConstraintParameter.hasSolution = false;
				}
				ConstraintParameter.noSolutionInfo += info;
			}
		}
	}
	
	
	/*
	 * 这个是最后根据化简的结果去做处理，确定不可解信息
	 * */
	public void calaEqualAndNotEqual() 
	{
		String[] varName = ConstraintParameter.parameterNames;
		for(int i=0;i<varName.length;i++)
		{
			Set<Double> eq = allEqual.get(varName[i]);
			Set<Double> noteq = allNotEqual.get(varName[i]);
			List<Double> tmp = new ArrayList<>(eq);
			if(eq.size()==1)
			{
				if(noteq.contains(tmp.get(0))==true)
				{
					ConstraintParameter.hasSolution = false;
					String info = "复合约束中存在最小不可解集,找到这样一个: "+varName[i]+" == "+tmp.get(0)+" && "+varName[i]+
							" != "+tmp.get(0)+" ,所以不可解\n";
					ConstraintParameter.noSolutionInfo += info;
				}
			}else if(eq.size()>=2)
			{
				ConstraintParameter.hasSolution = false;
				String info = "复合约束中存在最小不可解集,找到这样一个: "+varName[i]+" == "+tmp.get(0)+" && "+varName[i]+
						" == "+tmp.get(1)+" ,所以不可解\n";
				ConstraintParameter.noSolutionInfo += info;
			}
		}
	}
	

	/*
	 * 这个是专门针对等式和不等式的处理
	 * 这个是为了处理x==a && x!=a的不可解
	 * */
	public void dealWithCase1() 
	{
		//按照等式和不等式直接处理
		for(BinaryExpression one : this.target)
		{
			useEqualRule((IASTBinaryExpression)one.getIastExpression());
		}	
	}


	/*
	 * 处理所有的等式和不等式的约束
	 * x == a , x != a
	 * 注意这里只处理等式和不等式
	 * */
	public void useEqualRule(IASTBinaryExpression iast) 
	{
		IASTExpression op1 = Domain.removeBracket(iast.getOperand1());
		IASTExpression op2 = Domain.removeBracket(iast.getOperand2());
		
		if(Domain.isID(op1) == true && Domain.isNum(op2) == true)
		{
			String var = op1.getRawSignature();
			double a = Double.parseDouble(op2.getRawSignature());
			if(iast.getOperator() == IASTBinaryExpression.op_equals)
			{
				allEqual.get(var).add(a);
			}else if(iast.getOperator() == IASTBinaryExpression.op_notequals)
			{
				allNotEqual.get(var).add(a);
			}
		}else if(Domain.isNum(op1) == true && Domain.isID(op2) == true)
		{
			String var = op2.getRawSignature();
			double a = Double.parseDouble(op1.getRawSignature());
			if(iast.getOperator() == IASTBinaryExpression.op_equals)
			{
				allEqual.get(var).add(a);
			}else if(iast.getOperator() == IASTBinaryExpression.op_notequals)
			{
				allNotEqual.get(var).add(a);
			}
		}
	}
	
	/*
	 * 这个是专门针对等式和不等式的处理
	 * 这个是为了处理a*x+b 这样的线性的形式，所以
	 * */
	public void dealWithCase2()
	{
		for(BinaryExpression one : this.target)
		{
			IASTBinaryExpression tmp = (IASTBinaryExpression)one.getIastExpression();
			IASTExpression op1 = Domain.removeBracket(tmp.getOperand1());
			IASTExpression op2 = Domain.removeBracket(tmp.getOperand2());
			if(tmp.getOperator()==IASTBinaryExpression.op_equals)
			{
				List<String> para1 = new ArrayList<>();
				boolean oop1 = isLinear(op1, para1);
				List<String> para2 = new ArrayList<>();
				boolean oop2 = isLinear(op2, para2);
				if(oop1==true && Domain.isNum(op2))
				{
					//ax+b == c 系列
					String var=para1.get(0);
					double a = Double.parseDouble(para1.get(1));
					double b = Double.parseDouble(para1.get(2));
					double c = Double.parseDouble(op2.getRawSignature());
					double res = (c-b)/a;
					allEqual.get(var).add(res);
				}else if(oop2==true && Domain.isNum(op1))
				{
					//c == ax+b 系列
					String var=para2.get(0);
					double a = Double.parseDouble(para2.get(1));
					double b = Double.parseDouble(para2.get(2));
					double c = Double.parseDouble(op1.getRawSignature());
					double res = (c-b)/a;
					allEqual.get(var).add(res);
				}else if(oop1==true && oop2==true)
				{
					//a1 * x1 + b1 == a2 * x2 + b2
					System.out.println(para1);
					System.out.println(para2);
					String var1=para1.get(0) , var2=para2.get(0);
					double a1 = Double.parseDouble(para1.get(1));
					double b1 = Double.parseDouble(para1.get(2));
					
					double a2 = Double.parseDouble(para2.get(1));
					double b2 = Double.parseDouble(para2.get(2));
					if(var1.equals(var2))
					{
						double aa = a1-a2;
						double bb = b2-b1;
						if(aa==0)
						{
							if(bb!=0)
							{
								ConstraintParameter.hasSolution = false;
								String info = "复合约束中存在最小不可解集,找到这样一个: "+tmp.getRawSignature()+" ,所以不可解\n";
								ConstraintParameter.noSolutionInfo += info;
							}
						}else
						{
							double res = bb/aa;
							allEqual.get(var1).add(res);
						}
					}
				}
			}else if(tmp.getOperator()==IASTBinaryExpression.op_notequals)
			{
				List<String> para1 = new ArrayList<>();
				boolean oop1 = isLinear(op1, para1);
				List<String> para2 = new ArrayList<>();
				boolean oop2 = isLinear(op2, para2);
				if(oop1==true && Domain.isNum(op2)==true)
				{
					//ax+b != c 系列
					String var=para1.get(0);
					double a = Double.parseDouble(para1.get(1));
					double b = Double.parseDouble(para1.get(2));
					double c = Double.parseDouble(op2.getRawSignature());
					double res = (c-b)/a;
					allNotEqual.get(var).add(res);
				}else if(oop2==true && Domain.isNum(op1)==true)
				{
					//c != ax+b 系列
					String var=para2.get(0);
					double a = Double.parseDouble(para2.get(1));
					double b = Double.parseDouble(para2.get(2));
					double c = Double.parseDouble(op1.getRawSignature());
					double res = (c-b)/a;
					allNotEqual.get(var).add(res);
				}else if(oop1==true && oop2==true)
				{
					//a1 * x1 + b1 == a2 * x2 + b2
					String var1=para1.get(0) , var2=para2.get(0);
					double a1 = Double.parseDouble(para1.get(1));
					double b1 = Double.parseDouble(para1.get(2));
					
					double a2 = Double.parseDouble(para2.get(1));
					double b2 = Double.parseDouble(para2.get(2));
					if(var1.equals(var2))
					{
						double aa = a1-a2;
						double bb = b2-b1;
						if(aa==0)
						{
							if(bb==0)
							{
								ConstraintParameter.hasSolution = false;
								String info = "复合约束中存在最小不可解集,找到这样一个: "+tmp.getRawSignature()+"  ,所以不可解\n";
								ConstraintParameter.noSolutionInfo += info;
							}
						}else
						{
							double res = bb/aa;
							allNotEqual.get(var1).add(res);
						}
					}
				}
				
			}
		}	
	}
	
	
	/*
	 * 确定是不是a*x+b这种类型
	 * para保存的第一个元素是变量x，第二个是系数a，第三个是常数b
	 * */
	@SuppressWarnings("restriction")
	public static boolean isLinear(IASTExpression iast,List<String> para)
	{
		iast = Domain.removeBracket(iast);
		//处理是不是数字num的类型
		if(Domain.isNum(iast)==true)
			return false;
		else if(iast instanceof CPPASTUnaryExpression)
		{
			IASTExpression i = iast;
			while(i instanceof CPPASTUnaryExpression)
				i = (IASTExpression) i.getChildren()[0];
			
			// -x 类型处理
			if(iast.getRawSignature().contains("-") && i instanceof CPPASTIdExpression)
			{
				para.add(i.getRawSignature());
				para.add("-1");
				para.add("0");
				return true;
			}else
			{
				System.out.println("出现错误的了类型1   "+iast.getRawSignature());
				return false;
			}
		}else if(iast instanceof IASTBinaryExpression)
		{
			List<String> ax = new ArrayList<>();
			IASTBinaryExpression tmp = (IASTBinaryExpression)iast;
			IASTExpression op1 = Domain.removeBracket(tmp.getOperand1());
			IASTExpression op2 = Domain.removeBracket(tmp.getOperand2());
			if(tmp.getOperator()==IASTBinaryExpression.op_plus || tmp.getOperator()==IASTBinaryExpression.op_minus)
			{
				int flag = tmp.getOperator()==IASTBinaryExpression.op_minus?-1:1;
				if(Domain.isID(op1)==true && Domain.isNum(op2)==true)
				{
					//x + a 或者 x - a
					para.add(op1.getRawSignature());
					para.add("1");
					
					double b = Double.parseDouble(op2.getRawSignature())*flag;
					para.add(b+"");
					return true;
				}else if(Domain.isID(op2)==true && Domain.isNum(op1)==true)
				{
					// a + x  或者 a - x
					para.add(op2.getRawSignature());
					para.add((1*flag)+"");
					para.add(op1.getRawSignature());
					
					return true;
				}else if(isAx(op1,ax)==true && Domain.isNum(op2)==true)
				{
					//a*x+b 或者 a*x-b
					para.add(ax.get(0));
					para.add(ax.get(1));
					
					double b = Double.parseDouble(op2.getRawSignature())*flag;
					para.add(b+"");
					
					return true;
				}else if(isAx(op2,ax)==true && Domain.isNum(op1)==true)
				{
					//b+a*x
					para.add(ax.get(0));
					double b = Double.parseDouble(ax.get(1))*flag;
					para.add(b+"");
					
					para.add(op1.getRawSignature());
					return true;
				}else 
				{
					//System.out.println("出现无法处理的线性表达式   "+iast.getRawSignature());
					return false;
				}
			}else if(isAx(iast,ax)==true)
			{
				// a*x 和  x*a的处理
				para.add(ax.get(0));
				para.add(ax.get(1));
				para.add("0");
				return true;
			}else
			{
				return false;
			}
		}
		
		return false;
	}
	
	
	/*
	 * 确定是不是a*x这种形式的单项
	 * 数组ax保存的第一个元素是变量，第二个是系数
	 * */
	public static boolean isAx(IASTExpression iast,List<String> ax)
	{
		iast=Domain.removeBracket(iast);
		if(iast instanceof IASTBinaryExpression)
		{
			IASTBinaryExpression tmp = (IASTBinaryExpression)iast;
			IASTExpression op1 = Domain.removeBracket(tmp.getOperand1());
			IASTExpression op2 = Domain.removeBracket(tmp.getOperand2());
			if(tmp.getOperator()==IASTBinaryExpression.op_multiply)
			{
				if(Domain.isID(op1)==true && Domain.isNum(op2)==true)
				{
					//x * a
					ax.add(op1.getRawSignature());
					ax.add(op2.getRawSignature());
					return true;
				}else if(Domain.isID(op2)==true && Domain.isNum(op1)==true)
				{
					//a * x
					ax.add(op2.getRawSignature());
					ax.add(op1.getRawSignature());
					return true;
				}else
					return false;
			}else
				return false;
		}else if(iast instanceof CPPASTUnaryExpression)
		{
			IASTExpression i = iast;
			while(i instanceof CPPASTUnaryExpression)
				i = (IASTExpression) i.getChildren()[0];
			
			// -x 类型处理
			if(iast.getRawSignature().contains("-") && i instanceof CPPASTIdExpression)
			{
				ax.add(i.getRawSignature());
				ax.add("-1");
				return true;
			}else
			{
				System.out.println("出现错误的了类型2   "+iast.getRawSignature());
				return false;
			}
		}else
			return false;
	}
	
	
	/*
	 * 这个是为了处理 a == b 和 a != a的不可解情况，比如  1 == 2 和 1 != 1
	 * */
	public void dealWithCase3()
	{
		for(BinaryExpression one : this.target)
		{
			IASTBinaryExpression tmp = (IASTBinaryExpression)one.getIastExpression();
			IASTExpression op1 = Domain.removeBracket(tmp.getOperand1());
			IASTExpression op2 = Domain.removeBracket(tmp.getOperand2());
			if(tmp.getOperator()==IASTBinaryExpression.op_equals)
			{
				if(Domain.isNum(op1)==true && Domain.isNum(op2)==true)
				{
					String a = op1.getRawSignature();
					String b = op2.getRawSignature();
					if(a.equals(b)==false)
					{
						ConstraintParameter.hasSolution = false;
						String info = "复合约束中存在最小不可解集,找到这样一个: "+a+" == "+b+" ,所以不可解\n";
						ConstraintParameter.noSolutionInfo += info;
					}
				}
			}else if(tmp.getOperator()==IASTBinaryExpression.op_notequals)
			{
				if(Domain.isNum(op1)==true && Domain.isNum(op2)==true)
				{
					String a = op1.getRawSignature();
					String b = op2.getRawSignature();
					if(a.equals(b) == true)
					{
						ConstraintParameter.hasSolution = false;
						String info = "复合约束中存在最小不可解集,找到这样一个: "+a+" != "+b+" ,所以不可解\n";
						ConstraintParameter.noSolutionInfo += info;
					}
				}
			}
		}	
	}

	
	/*
	 * 这个函数是用来直接判断平方之和这种多项式
	 * 注意这里我们只考虑平方项相加为0的等式约束，其余的不考虑
	 * */
	public void dealWithCase4()
	{
		//按照等式和不等式直接处
		for(BinaryExpression one : this.target)
		{
			IASTBinaryExpression tmp = (IASTBinaryExpression)one.getIastExpression();
			if(tmp.getOperator() == IASTBinaryExpression.op_equals)
			{
				//处理单个自相平方和为0的情况
				calaPow2One(tmp);
				
				//处理平方和子项带系数的特殊情况
				calaPow2AddConstOne(tmp);
				
				//下面两个函数有重复处理的情况
				//处理平方和子项带系数的特殊情况
				boolean res = calaPow2AddConstMore(tmp);
				
				if(res == false)
				{
					//处理多个平方和相加为0的情况
					calaPow2Add(tmp);
				}
			}
		}
		
		
/*		System.out.println("!!!!!!!!!!!!!!!!!!      单个子项平方和");
		for(int i=0;i<allSubExpNotZero.size();i++)
			System.out.println(allSubExpNotZero.get(i).getRawSignature()+" == " + allSubExpNotZeroValue.get(i));
		
		
		System.out.println("!!!!!!!!!!!!!!!!!!      多个子项平方和");
		for(IASTExpression ii : allSubExpZero)
			System.out.println(ii.getRawSignature()+" == 0");*/
		
		calaLinearSub();

	}

	/*
	 * 这个函数是拿到已经得到的平方和的子项，来做进一步的求解
	 * 注意这里我们只处理 线性ax+b这种形式的子项目，其余的都不处理
	 * */
	public void calaLinearSub() 
	{
		for(IASTExpression one : allSubExpZero)
		{
			IASTExpression iast = Domain.removeBracket(one);
			List<String> para = new ArrayList<>();
			boolean isAxb = isLinear(iast, para);
			if(iast instanceof CPPASTIdExpression)
			{
				String var = iast.getRawSignature();
				if(allEqual.containsKey(var)==true)
					allEqual.get(var).add((double)0);
				else
					System.out.println("public void calaLinearSub(): "+iast.getRawSignature()+" , 中遇到了无法识别的变量: "+var);
				
			}else if(isAxb == true)
			{
				String var=para.get(0);
				double a = Double.parseDouble(para.get(1));
				double b = Double.parseDouble(para.get(2));
				double res = -b/a;
				
				if(allEqual.containsKey(var)==true)
					allEqual.get(var).add(res);
				else
					System.out.println("public void calaLinearSub(): "+iast.getRawSignature()+" , 中遇到了无法识别的变量: "+var);
				
			}else
			{
				//System.out.println("遇到了不是ax+b这种形式的平方和子项目，需要整体代换: "+iast.getRawSignature());	
				NotLinearSubToValue.put(iast.getRawSignature().replace(" ", ""), "0");
			}
		}
		
		for(int i=0;i<allSubExpNotZero.size();i++)
		{
			IASTExpression iast = Domain.removeBracket(allSubExpNotZero.get(i));
			List<String> para = new ArrayList<>();
			boolean isAxb = isLinear(iast, para);
			
			if(iast instanceof CPPASTIdExpression)
			{
				String var = iast.getRawSignature();
				if(allEqual.containsKey(var)==true)
					allEqual.get(var).add(allSubExpNotZeroValue.get(i));
				else
					System.out.println("public void calaLinearSub(): "+iast.getRawSignature()+" , 中遇到了无法识别的变量: "+var);
				
			}else if(isAxb == true)
			{
				String var=para.get(0);
				double a = Double.parseDouble(para.get(1));
				double b = Double.parseDouble(para.get(2));
				double c = allSubExpNotZeroValue.get(i);
				double res = (c-b)/a;
				
				if(allEqual.containsKey(var)==true)
					allEqual.get(var).add(res);
				else
					System.out.println("public void calaLinearSub(): "+iast.getRawSignature()+" , 中遇到了无法识别的变量: "+var);
			}else
			{	
				//System.out.println("遇到了不是ax+b这种形式的平方和子项目，需要整体代换: "+iast.getRawSignature());	
				String key = iast.getRawSignature().replace(" ", "");
				if(NotLinearSubToValue.containsKey(key)==true)
				{
					ConstraintParameter.hasSolution = false;
					String info = "复合约束中存在最小不可解集,找到这样一个: "
							+iast.getRawSignature()+"=="+NotLinearSubToValue.get(key)+" && "
							+iast.getRawSignature()+"=="+allSubExpNotZeroValue.get(i)+" ,所以不可解\n";
					ConstraintParameter.noSolutionInfo += info;
				}else
				{
					NotLinearSubToValue.put(key, allSubExpNotZeroValue.get(i)+"");
				}
			}
		}
		return ;
	}


	public void calaPow2One(IASTBinaryExpression iast)
	{
		IASTExpression op1 = Domain.removeBracket(iast.getOperand1());
		IASTExpression op2 = Domain.removeBracket(iast.getOperand2());
		
		List<IASTExpression> para1 = new ArrayList<>();
		boolean left = isPow2(op1, para1);
		
		List<IASTExpression> para2 = new ArrayList<>();
		boolean right = isPow2(op2, para2);
		
		if(left==true && right==false && Domain.isNum(op2)==true)
		{
			if(para1.size()==1)
			{
				double c = Double.parseDouble(op2.getRawSignature());
				if(c>=0)
				{
					allSubExpNotZero.add(para1.get(0));
					allSubExpNotZeroValue.add(Math.sqrt(c));
				}else
				{
					ConstraintParameter.hasSolution = false;
					String info = "复合约束中存在最小不可解集,找到这样一个: "+iast.getRawSignature()+" ,所以不可解\n";
					ConstraintParameter.noSolutionInfo += info;
				}
			}else 
			{
				System.out.println(iast.getRawSignature()+"   出现了错误匹配情况");
			}
		}else if(left==false && right==true && Domain.isNum(op1)==true)
		{
			if(para2.size()==1)
			{
				double c = Double.parseDouble(op1.getRawSignature());
				if(c>=0)
				{
					allSubExpNotZero.add(para2.get(0));
					allSubExpNotZeroValue.add(Math.sqrt(c));
				}else
				{
					ConstraintParameter.hasSolution = false;
					String info = "复合约束中存在最小不可解集,找到这样一个: "+iast.getRawSignature()+" ,所以不可解\n";
					ConstraintParameter.noSolutionInfo += info;
				}
			}else 
			{
				System.out.println(iast.getRawSignature()+"   出现了错误匹配情况");
			}
		}
	}


	/*
	 * 直接处理某一个含有平方和的形式的处理
	 * */
	public void calaPow2Add(IASTBinaryExpression iast)
	{
		IASTExpression op1 = Domain.removeBracket(iast.getOperand1());
		IASTExpression op2 = Domain.removeBracket(iast.getOperand2());
		
		List<IASTExpression> para1 = new ArrayList<>();
		boolean left = isPow2Add(op1, para1);
		
		List<IASTExpression> para2 = new ArrayList<>();
		boolean right = isPow2Add(op2, para2);
		
		
		if(left==true && right==false && Domain.isNum(op2)==true)
		{
			double c = Double.parseDouble(op2.getRawSignature());
			if(c == 0)
			{
				allSubExpZero.addAll(para1);
			}
			else if(c<0)
			{
				ConstraintParameter.hasSolution = false;
				String info = "复合约束中存在最小不可解集,找到这样一个: "+iast.getRawSignature()+" ,所以不可解\n";
				ConstraintParameter.noSolutionInfo += info;
			}
		}else if(left==false && right==true && Domain.isNum(op1)==true )
		{
			double c = Double.parseDouble(op1.getRawSignature());
			if(c == 0)
			{
				allSubExpZero.addAll(para2);
			}
			else if(c<0)
			{
				ConstraintParameter.hasSolution = false;
				String info = "复合约束中存在最小不可解集,找到这样一个: "+iast.getRawSignature()+" ,所以不可解\n";
				ConstraintParameter.noSolutionInfo += info;
			}
		}
		

	}
	
	@SuppressWarnings("restriction")
	public static boolean isPow2Add(IASTExpression iast,List<IASTExpression> para)
	{
		iast = Domain.removeBracket(iast);
		if(iast instanceof IASTBinaryExpression)
		{
			IASTBinaryExpression tmp = (IASTBinaryExpression)iast;
			IASTExpression op1 = Domain.removeBracket(tmp.getOperand1());
			IASTExpression op2 = Domain.removeBracket(tmp.getOperand2());
			
			boolean oop1 = isPow2(op1, para);
			boolean oop2 = isPow2(op2, para);
			if(tmp.getOperator()==IASTBinaryExpression.op_plus)
			{
				if(oop1==true && oop2==true)
					return true;
				else if(oop1==false && oop2==true)
					return isPow2Add(op1, para);
				else if(oop1==true && oop2==false)
					return isPow2Add(op2, para);
				else
					return isPow2Add(op1, para) && isPow2Add(op2, para);
			}else 
			{
				return false;
			}
		}else if(iast instanceof CPPASTUnaryExpression)
		{
			return isPow2(iast, para);
		}else
		{
			return false;
		}	
	}
	
	
	/*
	 * 这个是 a*a*100 == c的特殊识别
	 * */
	public void calaPow2AddConstOne(IASTBinaryExpression iast) 
	{
		IASTExpression op1 = Domain.removeBracket(iast.getOperand1());
		IASTExpression op2 = Domain.removeBracket(iast.getOperand2());
		
		List<IASTExpression> para1 = new ArrayList<>();
		List<Double> kk1 = new ArrayList<>();
		boolean left = isPow2MulConst(op1,para1,kk1);
		
		List<IASTExpression> para2 = new ArrayList<>();
		List<Double> kk2 = new ArrayList<>();
		boolean right = isPow2MulConst(op2,para2,kk2);
		
		if(left==true && right==false && Domain.isNum(op2))
		{
			
			double c = Double.parseDouble(op2.getRawSignature());
			if(kk1.size()==1)
			{
				double res = c/kk1.get(0);
				if(res>=0)
				{
					allSubExpNotZero.add(para1.get(0));
					allSubExpNotZeroValue.add(Math.sqrt(res));
				}else
				{
					ConstraintParameter.hasSolution = false;
					String info = "复合约束中存在最小不可解集,找到这样一个: "+iast.getRawSignature()+" ,所以不可解\n";
					ConstraintParameter.noSolutionInfo += info;
				}
			}else
			{
				System.out.println("WRONG ^^^^^^^^^^^ ");
			}
			
		}else if(left==false && right==true && Domain.isNum(op1))
		{
			double c = Double.parseDouble(op1.getRawSignature());
			if(kk2.size()==1)
			{
				double res = c/kk2.get(0);
				if(res>=0)
				{
					allSubExpNotZero.add(para2.get(0));
					allSubExpNotZeroValue.add(Math.sqrt(res));
				}else
				{
					ConstraintParameter.hasSolution = false;
					String info = "复合约束中存在最小不可解集,找到这样一个: "+iast.getRawSignature()+" ,所以不可解\n";
					ConstraintParameter.noSolutionInfo += info;
				}
			}else
			{
				System.out.println("FFFFFFFF UUUUUU CCCC KKKK YOU！！！！ WRONG ^^^^^^^^^^^ ");
			}
		}
		
	}
	
	/*
	 * 这个是 a*a*100 + 100*b*b == 0的特殊识别
	 * */
	public boolean calaPow2AddConstMore(IASTBinaryExpression iast) 
	{
		IASTExpression op1 = Domain.removeBracket(iast.getOperand1());
		IASTExpression op2 = Domain.removeBracket(iast.getOperand2());
		
		IASTExpression deal=null;
		double c = 0;
		if(Domain.isNum(op1)==true && Domain.isNum(op2)==false)
		{
			c = Double.parseDouble(op1.getRawSignature());
			deal = op2;
		}else if(Domain.isNum(op1)==false && Domain.isNum(op2)==true)
		{
			c = Double.parseDouble(op2.getRawSignature());
			deal = op1;
		}else
		{
			return false;
		}
		
		if(deal instanceof IASTBinaryExpression)
		{
			IASTBinaryExpression tmp = (IASTBinaryExpression)deal;
			IASTExpression oop1 = tmp.getOperand1();
			IASTExpression oop2 = tmp.getOperand2();
			if(tmp.getOperator() == IASTBinaryExpression.op_plus)
			{
				List<IASTExpression> para1 = new ArrayList<>();
				List<Double> kk1 = new ArrayList<>();
				boolean left = isPow2MulConst(oop1,para1,kk1) || isPow2(oop1, para1);
				
				for(double ii :kk1)
				{
					if(ii<0)
						return false;
				}
				
				List<IASTExpression> para2 = new ArrayList<>();
				List<Double> kk2 = new ArrayList<>();
				boolean right = isPow2MulConst(oop2,para2,kk2) || isPow2(oop2, para2);
				
				for(double ii :kk1)
				{
					if(ii<0)
						return false;
				}
				
				if(left==true && right==true)
				{
					if(c==0)
					{
						allSubExpZero.addAll(para1);
						allSubExpZero.addAll(para2);	
						return true;
					}else if(c<0)
					{
						ConstraintParameter.hasSolution = false;
						String info = "复合约束中存在最小不可解集,找到这样一个: "+iast.getRawSignature()+" ,所以不可解\n";
						ConstraintParameter.noSolutionInfo += info;
						return true;
					}else
					{
						return false;
					}
				}
			}
		}else
		{
			return false;
		}
		return false;
	}
	
	/*
	 * 这个是 a*a*100 , 100*b*b , pow(x,2)*100 和 100*pow(x,2)的特殊识别
	 * */
	public static boolean isPow2MulConst(IASTExpression iast,List<IASTExpression> para,List<Double> kk)
	{		
		iast = Domain.removeBracket(iast);
		if(iast instanceof IASTBinaryExpression)
		{
			IASTBinaryExpression tmp = (IASTBinaryExpression)iast;
			IASTExpression op1 = Domain.removeBracket(tmp.getOperand1());
			IASTExpression op2 = Domain.removeBracket(tmp.getOperand2());
			//处理 a*a*100 和 pow(x,2)*100 情况
			if(Domain.isNum(op2)==true)
			{
				if(isPow2(op1, para) == true)
				{
					kk.add(Double.parseDouble(op2.getRawSignature()));
					return true;
				}else
				{
					return false;
				}
			}
			else 
			{
				if(Domain.isNum(op1) && isPow2(op2, para)==true)
				{
					 //处理 100*pow(x,2) 情况
					 kk.add(Double.parseDouble(op1.getRawSignature()));
					 return true;
				}
				else
				{
					//处理 100*b*b 情况
					if(op1 instanceof IASTBinaryExpression)
					{
						IASTBinaryExpression ttmp = (IASTBinaryExpression)op1;
						IASTExpression oop1 = Domain.removeBracket(ttmp.getOperand1());
						IASTExpression oop2 = Domain.removeBracket(ttmp.getOperand2());
						if(Domain.isNum(oop1))
						{
							para.add(op2);
							String a = oop2.getRawSignature().replace(" ", "");
							String b = op2.getRawSignature().replace(" ", "");
							if(a.equals(b)==true)
							{
								kk.add(Double.parseDouble(oop1.getRawSignature()));
								return true;
							}else
							{
								return false;
							}
						}else
						{
							return false;
						}
					}else
					{
						return false;
					}
				}
			}
		}else
		{
			return false;
		}
	}
	
	/*
	 * 判断一个节点是不是x的平方的形式，
	 * 一共有两种形式：x*x 和 pow(x,2)这两种可能
	 * */
	@SuppressWarnings({ "restriction", "deprecation" })
	public static boolean isPow2(IASTExpression iast,List<IASTExpression> para)
	{
		iast = Domain.removeBracket(iast);
		if(iast instanceof IASTBinaryExpression)
		{
			IASTBinaryExpression tmp = (IASTBinaryExpression)iast;
			IASTExpression op1 = Domain.removeBracket(tmp.getOperand1());
			IASTExpression op2 = Domain.removeBracket(tmp.getOperand2());
			String oop1 = op1.getRawSignature().replace(" ", "");
			String oop2 = op2.getRawSignature().replace(" ", "");
			if(tmp.getOperator()==IASTBinaryExpression.op_multiply && oop1.equals(oop2)==true)
			{
				para.add(op1);
				return true;
			}else
			{
				return false;
			}
		}else if(iast instanceof CPPASTFunctionCallExpression)
		{
			CPPASTFunctionCallExpression tmp = (CPPASTFunctionCallExpression)iast;
			String func = tmp.getFunctionNameExpression().getRawSignature();
			if(func.equals("pow")==true)
			{
				IASTNode[] children = tmp.getParameterExpression().getChildren();
				IASTExpression x = Domain.removeBracket((IASTExpression)children[0]);
				IASTExpression y = Domain.removeBracket((IASTExpression)children[1]);
				
				if(Domain.isNum(y)==true && Double.parseDouble(y.getRawSignature())==2)
				{
					para.add(x);
					return true;
				}else
				{
					return false;
				}
			}else
			{
				return false;
			}
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


	public Domain getDomain()
	{
		return domain;
	}


	public void setDomain(Domain domain) 
	{
		this.domain = domain;
	}


	public Map<String, Set<Double>> getAllEqual()
	{
		return allEqual;
	}


	public void setAllEqual(Map<String, Set<Double>> allEqual) 
	{
		this.allEqual = allEqual;
	}


	public Map<String, Set<Double>> getAllNotEqual()
	{
		return allNotEqual;
	}


	public void setAllNotEqual(Map<String, Set<Double>> allNotEqual) 
	{
		this.allNotEqual = allNotEqual;
	}


	public Map<String, String> getNotLinearSubToValue()
	{
		return NotLinearSubToValue;
	}


	public void setNotLinearSubToValue(Map<String, String> notLinearSubToValue)
	{
		NotLinearSubToValue = notLinearSubToValue;
	}


	public List<IASTExpression> getAllSubExpZero() 
	{
		return allSubExpZero;
	}


	public void setAllSubExpZero(List<IASTExpression> allSubExpZero) 
	{
		this.allSubExpZero = allSubExpZero;
	}


	public List<IASTExpression> getAllSubExpNotZero()
	{
		return allSubExpNotZero;
	}


	public void setAllSubExpNotZero(List<IASTExpression> allSubExpNotZero) 
	{
		this.allSubExpNotZero = allSubExpNotZero;
	}


	public List<Double> getAllSubExpNotZeroValue()
	{
		return allSubExpNotZeroValue;
	}


	public void setAllSubExpNotZeroValue(List<Double> allSubExpNotZeroValue) 
	{
		this.allSubExpNotZeroValue = allSubExpNotZeroValue;
	}
	
	
}
