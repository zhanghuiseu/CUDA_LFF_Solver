package cn.nju.seg.atpc.parser;

import cn.nju.seg.atpc.generate.ATPC;


/*
 * 主要是替换字符串
 * 主要是替换字符串,这个主要是由于CUDA单精度和双精度的数学函数的签名是不一样的，所以要做专门的替换
 */
public class MathFunctionReplace 
{
	private String expression;
	
	public MathFunctionReplace () 
	{
		// TODO Auto-generated constructor stub
	}
	
	public MathFunctionReplace(String expression) 
	{
		// TODO Auto-generated constructor stub
		this.expression=expression;
	}
	
	/**
	 * 这里的替换函数主要是自动生成单双精度的代码
	 * 对于双精度无需处理，直接返回
	 * 对于单精度要在相关的math库函数的末尾添加字符f
	 * 
	 * @param expression
	 * @param res
	 */
	public String runReplace()
	{
		//部分预处理
		String expression = this.expression;
		expression = dealMath(expression);
		
		//双精度直接返回
		if(ATPC.forDouble == true)
			return expression;
		else
		{
			//单精度去做替换处理
			if (this.shouldReplace(expression))
			{
				expression=this.dealCos(expression);
				expression=this.dealSin(expression);
				expression=this.dealTan(expression);
				expression=this.dealLog(expression);
				expression=this.dealExp(expression);
				expression=this.dealPow(expression);
				expression=this.dealSqrt(expression);
				expression=this.dealCeil(expression);
				expression=this.dealFloor(expression);
				expression=this.dealRound(expression);
			}
			return expression;
		}
	}
	
	/**
	 *  处理可能存在的java代码中的多余的字符串，
	 *  比如Math.sin等等情况的出现，直接去掉即可
	 *  
	 * @param expression
	 */
	public String dealMath(String expression)
	{
		expression = expression.replace("math." , "");
		expression = expression.replace("Math." , "");
		return expression;
	}
	
	
	/**
	 * 简单的判断是否需要做函数替换
	 * 
	 * @param expression
	 * @param shouldReplace
	 */
	public boolean shouldReplace(String expression) 
	{
		boolean shouldReplace=false;
		if(expression.contains("cos")  ||  expression.contains("sin")
		 ||expression.contains("tan")  ||  expression.contains("log")
		 ||expression.contains("exp")  ||  expression.contains("sqrt")
		 ||expression.contains("ceil") ||  expression.contains("floor")
		 ||expression.contains("pow")  ||  expression.contains("round") )
			
		{
			shouldReplace = true;
		}else 
			shouldReplace = false;
		
		 return shouldReplace;
	}
	
	/**
	 * 针对cos、acos特殊处理
	 * 由于是在函数的尾部添加f，所以无需处理直接替换即可，
	 * 这次是在尾部添加，而不是头部，所以这个的处理很简单 
	 * 
	 * @param expression
	 */
	public String dealCos(String expression)
	{
		if(expression.contains("cos"))
		{
			expression=expression.replace("cos","cosf");
		}
		return expression;
	}

	/**
	 * 针对sin、asin特殊处理
	 * 由于是在函数的尾部添加f，所以无需处理直接替换即可，
	 * 这次是在尾部添加，而不是头部，所以这个的处理很简单 
	 * 
	 * @param expression
	 */
	public String dealSin(String expression)
	{
		if(expression.contains("sin"))
		{
			expression=expression.replace("sin","sinf");
		}
		return expression;
	}

	/**
	 * 针对tan、atan、atan2特殊处理
	 * 这个相对于sin和cos函数的替换，复杂多了
	 * 首先要做atan2的替换，然后做atan和tan的替换，
	 * 这是因为atan和tan是atan2的子串，
	 * 
	 * @param expression
	 */
	public String dealTan(String expression)
	{
		//处理包含atan2的情况
		if(expression.contains("atan2"))
		{
			expression=expression.replace("atan2","atan2f");
			String res = "";
			int index = 0;
			while((index = expression.indexOf("tan"))!=-1)
			{
				res += expression.substring(0, index+3);
				expression = expression.substring(index+3);
				if(expression.charAt(0)!='2')
					res += "f";
			}
			res += expression;
			expression = res;
		}else 
		{
			//处理atan和tan的函数，这个是因为不包含atan2.所以直接想cos和acos那样处理即可
			expression=expression.replace("tan","tanf");
		}
		return expression;
	}
	

	/**
	 * 处理exp函数的替换
	 * 
	 * @param expression
	 */
	public String dealExp(String expression) 
	{
		//处理出现exp10和exp2的情况
		if(expression.contains("exp10") || expression.contains("exp2"))
		{
			expression=expression.replace("exp10","exp10f");
			expression=expression.replace("exp2","exp2f");
			int index = 0;
			String res = "";
			while((index = expression.indexOf("exp"))!=-1)
			{
				res += expression.substring(0, index+3);
				expression = expression.substring(index+3);
				if(expression.charAt(0) == '(' )
					res += "f";
			}
			res += expression;
			expression = res;
		}else
		{
			//处理只有tan函数的情况
			expression=expression.replace("exp","expf");
		}
		return expression;
	}
	
	
	/**
	 * 处理log函数的替换
	 * 最先处理的是log10和log2的替换，因为二者没有并不是子串的关系
	 * 所以对log10和log2的替换的替换是平行的
	 * 然后最log的替换，这是最重要的就是找到真正的log，而不是
	 * log2和log10
	 * 
	 * @param expression
	 */
	public String dealLog(String expression) 
	{
		//处理出现log10和log2的情况
		if(expression.contains("log10") || expression.contains("log2"))
		{
			expression=expression.replace("log10","log10f");
			expression=expression.replace("log2","log2f");
			int index = 0;
			String res = "";
			while((index = expression.indexOf("log"))!=-1)
			{
				res += expression.substring(0, index+3);
				expression = expression.substring(index+3);
				if(expression.charAt(0) == '(')
					res += "f";
			}
			res += expression;
			expression = res;
		}else
		{
			//处理只有tan函数的情况
			expression=expression.replace("log","logf");
		}
		return expression;
	}
	
	/**
	 * 处理pow函数的替换
	 * @param expression
	 */
	public String dealPow(String expression)
	{
		if(expression.contains("pow"))
		{
			expression=expression.replace("pow","powf");
		}
		 return expression;
	}
	
	
	/**
	 * 处理sqrt函数的替换
	 * 
	 * @param expression
	 */
	public String dealSqrt(String expression) 
	{
		if(expression.contains("sqrt"))
		{
			expression=expression.replace("sqrt","sqrtf");
		}
		 return expression;
	}
	

	
	/**
	 * 处理ceil函数的替换
	 * 
	 * @param expression
	 */
	public String dealCeil(String expression) 
	{
		if(expression.contains("ceil"))
		{
			expression=expression.replace("ceil","ceilf");
		}
		 return expression;
	}
	
	
	
	/**
	 * 处理floor函数的替换
	 * 
	 * @param expression
	 */
	public String dealFloor(String expression) 
	{
		if(expression.contains("floor"))
		{		
			expression=expression.replace("floor","floorf");
		}
		 return expression;
	}
	
	
	
	/**
	 * 处理floor函数的替换
	 * 
	 * @param expression
	 */
	public String dealRound(String expression)
	{
		if(expression.contains("round"))
		{
			expression=expression.replace("round","roundf");
		}
		 return expression;
	}
	
	
	public String getExpression() 
	{
		return expression;
	}

	public void setExpression(String expression) 
	{
		this.expression = expression;
	}
	
	
	public static void main(String[] args) 
	{
		
		String tt="cos(cos(x))+acos(1+cos(5))+pow(round(),ceil(4))+sqrt(floor(23))";
		String tmp=new MathFunctionReplace(tt.replace(" ","")).runReplace();
		System.out.println(tt+"\n"+tmp);
		System.out.println();
		
		tt="asin(sin(x))+asin(-1+sin(5))";
		tmp=new MathFunctionReplace(tt.replace(" ","")).runReplace();
		System.out.println(tt+"\n"+tmp);
		System.out.println();

		
		tt="atan(tan(x))+atan(e+tan(5))+atan2(tan(x),atan2(atan(x),tan(x)))";
		tmp=new MathFunctionReplace(tt.replace(" ","")).runReplace();
		System.out.println(tt+"\n"+tmp);
		System.out.println();
		
		tt="log10(a)*log2(x)+log10(log(2))+log2(log(2))+log(log10(2))+log(log2(2))".replace(" ","");
		tmp=new MathFunctionReplace(tt.replace(" ","")).runReplace();
		System.out.println(tt+"\n"+tmp);
		System.out.println();
		
		tt="exp10(a)*exp2(x)+exp10(exp(2))+exp2(exp(2))+exp(exp10(2))+exp(exp2(2))".replace(" ","");
		tmp=new MathFunctionReplace(tt.replace(" ","")).runReplace();
		System.out.println(tt+"\n"+tmp);
		System.out.println();
	}
}
