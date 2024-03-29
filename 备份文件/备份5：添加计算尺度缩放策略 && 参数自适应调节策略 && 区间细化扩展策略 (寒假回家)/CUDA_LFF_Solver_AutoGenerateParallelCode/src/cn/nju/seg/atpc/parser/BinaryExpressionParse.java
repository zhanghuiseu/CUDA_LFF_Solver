package cn.nju.seg.atpc.parser;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Set;

import org.eclipse.cdt.core.dom.ast.IASTExpression;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;

import cn.nju.seg.atpc.generate.ForConstraintParameter;
import cn.nju.seg.atpc.generate.ForExcuteConstraint;
import cn.nju.seg.atpc.main.ConstraintParameter;
import cn.nju.seg.atpc.model.BinaryExpression;
import cn.nju.seg.atpc.model.BinaryExpressionUtil;
import cn.nju.seg.atpc.model.Constraint;
import cn.nju.seg.atpc.model.Expression;

public class BinaryExpressionParse 
{	
	public static BinaryExpression targetBinaryExpression=null;
	public static Constraint targetConstraint=null;
	
	public BinaryExpressionParse() 
	{
		// TODO Auto-generated constructor stub
	}
    /**
	 * 带求解约束的输入
	 * @param BinaryExpression
	 */
	public static void setBinartExpression(String binaryExpression,String nodeName) 
	{
		String AbsolutePath=new File("").getAbsolutePath().toString();
		String filePath=AbsolutePath+"/binaryExpression.c";
		//建立待处理约束的AST树
		try {
			File beFile=new File(filePath);
			if(!beFile.exists())
			{
				beFile.createNewFile();
			}
			
			FileOutputStream outFile=new FileOutputStream(beFile);
			BufferedWriter writeFile=new BufferedWriter(new OutputStreamWriter(outFile));
			
			StringBuilder code=new StringBuilder();
			code.append("int main(){if(" + binaryExpression + "){}}");
			writeFile.write(code.toString());
			writeFile.flush();
			writeFile.close();
		}catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			System.err.println("Input Source Code has problems!");
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		IASTBinaryExprssionVisitor expressionVisitor=new IASTBinaryExprssionVisitor();
		CDTAstUtil ast=new CDTAstUtil(filePath);
		IASTTranslationUnit astUnit=ast.getIASTTranslationUnit();
		
		System.out.println("AST Parse Bgein： ");
		astUnit.accept(expressionVisitor);
		System.out.println("AST Parse End!!\n");
		
		IASTExpression iabe=expressionVisitor.getIabe();
		BinaryExpressionParse.targetBinaryExpression = BinaryExpressionUtil.translateExpr2(iabe);
		
		System.out.println("The Input Expression is :"+binaryExpression);
		System.out.println("The Final Binary Expression Without '!' is: "+BinaryExpressionParse.targetBinaryExpression.toString()+"\n\n");	
		
		/*
		 * 针对复杂约束的静态分析主要包含下面几个部分，这几个部分都在这个函数里面做了
		 * 1）提取析取范式
		 * 2）针对每一个合取子式做排序
		 * 3）求解初始搜索区间病针对不等式和等式做花间
		 * 
		 * ）等式符号的调整
		 * */
		BinaryExpressionParse.targetConstraint = new Constraint((Expression)targetBinaryExpression);
		
		BinaryExpressionParse.targetConstraint.printConstraint();
	}
	
    /**
	 * 待处理约束的类型
	 * @param typeString
	 */
	public static void setParameterTypes(String typeString)
	{
		ConstraintParameter.parameterTypes=typeString.replace(" ","").split(",");
		ConstraintParameter.NumOfParam = ConstraintParameter.parameterTypes.length;
		BinaryExpressionParse.setParameters();
	}
	
	/**
	 * 获取输入变量的类型（仅区分int与double)
	 */
	public static void setParameters()
	{
		for (int i=0; i<ConstraintParameter.NumOfParam; i++)
		{
			if (ConstraintParameter.parameterTypes[i].equals("int"))
			{
				ConstraintParameter.parameterTypes[i] = "int";
			}
			else if (ConstraintParameter.parameterTypes[i].equals("const int"))
			{
				ConstraintParameter.parameterTypes[i] = "int";
			}
			else if (ConstraintParameter.parameterTypes[i].equals("int&"))
			{
				ConstraintParameter.parameterTypes[i] = "int";
			}
			else if (ConstraintParameter.parameterTypes[i].equals("long"))
			{
				ConstraintParameter.parameterTypes[i] = "int";
			}
			else if (ConstraintParameter.parameterTypes[i].equals("double"))
			{
				ConstraintParameter.parameterTypes[i] = "double";
			}
			else if (ConstraintParameter.parameterTypes[i].equals("float"))
			{
				ConstraintParameter.parameterTypes[i] = "double";
			}
			else if (ConstraintParameter.parameterTypes[i].equals("short"))
			{
				ConstraintParameter.parameterTypes[i] = "int";
			}
			else if (ConstraintParameter.parameterTypes[i].equals("unsigned short"))
			{
				ConstraintParameter.parameterTypes[i] = "int";
			}
			else if (ConstraintParameter.parameterTypes[i].equals("unsigned long"))
			{
				ConstraintParameter.parameterTypes[i] = "int";
			}
			else 
			{
				ConstraintParameter.parameterTypes[i] = "double";
			}
		}
	}
	
    /**
	 * 待处理约束的变量名
	 * @param nameString
	 */
	public static void setParameterNames(String nameString)
	{
		ConstraintParameter.parameterNames = nameString.replace(" ","").split(",");
		if(ConstraintParameter.NumOfParam != ConstraintParameter.parameterNames.length)
			System.out.println("约束输入有问题");
	}
	
    /**
	 * 待处理约束的依赖关系
	 * 主要就是通过字符串查找的方式来判断搜索变量和约束的依赖关系
	 * @param nameString
	 */
	public static void setDependencyRele()
	{
		String binaryExpression = BinaryExpressionParse.targetConstraint.getAtomicConstraintGroups().get(0).toString();
		ConstraintParameter.DependencyRele = new boolean[ConstraintParameter.NumOfParam];
		for(int i=0;i<ConstraintParameter.NumOfParam;i++)
		{
			boolean dep = binaryExpression.contains(ConstraintParameter.parameterNames[i]);
			if(dep == true)
				ConstraintParameter.DependencyRele[i] = true;
			else
				ConstraintParameter.DependencyRele[i] = false;
		}
		
		//为了防止标记错误，所以再做一遍检查
		Set<String> keySet=ConstraintParameter.allVarEqualMap.keySet();
		for(int i=0;i<ConstraintParameter.NumOfParam;i++)
		{
			if(keySet.contains(ConstraintParameter.parameterNames[i])==true)
				ConstraintParameter.DependencyRele[i] = false;
		}
	}
	
    /**
	 * 设置约束的名字，这个是用来区分不同的约束的一个名字
	 * @param nameString
	 */
	public static void setConstraintName(String nodeName)
	{
		ConstraintParameter.constraintName = nodeName;
	}
	
    /**
	 * 第三方使用者初始化入口
	 * @param nameString
	 */
	public static void initAll(String binaryExpression,String nodeName,String typeString,String nameString,String initNum) 
	{
		BinaryExpressionParse.setParameterTypes(typeString);
		BinaryExpressionParse.setParameterNames(nameString);
		BinaryExpressionParse.setConstraintName(nodeName);
		
		BinaryExpressionParse.setBinartExpression(binaryExpression,nodeName);
		BinaryExpressionParse.setDependencyRele();
		
		ConstraintParameter.needCustomizedParams = true;
		ConstraintParameter.NumOFConstraint = BinaryExpressionParse.targetConstraint.getAtomicConstraintGroups().get(0).size();
		
		if(initNum.equals("")==false)
		{
			String[] numStr = initNum.split(",");
			ConstraintParameter.CustomizedParams = new double[numStr.length];
			for(int i=0;i<numStr.length;i++)
			{
				ConstraintParameter.CustomizedParams[i] = Double.parseDouble(numStr[i]);
			}
		}
	}
	
    /**
	 * 第三方使用者初始化入口
	 * @param nameString
	 */
	public static void initAll(String binaryExpression,String nodeName,String typeString,String nameString) 
	{
		BinaryExpressionParse.setParameterTypes(typeString);
		BinaryExpressionParse.setParameterNames(nameString);
		BinaryExpressionParse.setConstraintName(nodeName);
		
		BinaryExpressionParse.setBinartExpression(binaryExpression,nodeName);
		
		//在完成化简工作之后去做依赖性判断
		BinaryExpressionParse.setDependencyRele();
		
		ConstraintParameter.needCustomizedParams = false;
		ConstraintParameter.NumOFConstraint = BinaryExpressionParse.targetConstraint.getAtomicConstraintGroups().get(0).size();
	}
	
	public static void beginAutoGenerateParallelCode(String headFilePath,String codeFilePath)
	{
		new ForConstraintParameter(headFilePath).generateCode();
		new ForExcuteConstraint(codeFilePath).generateCode();
	}
}
