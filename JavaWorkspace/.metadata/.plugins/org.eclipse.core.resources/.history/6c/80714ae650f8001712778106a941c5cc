package cn.nju.seg.atpc.generate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.nju.seg.atpc.main.ConstraintParameter;
import cn.nju.seg.atpc.model.BinaryExpression;
import cn.nju.seg.atpc.model.Operator;
import cn.nju.seg.atpc.parser.BinaryExpressionParse;

/*
 * 这个函数主要是负责CUDA并行代码部分的自动生成，
 * 主要涉及了循环展开等等情况的处理
 * */
public class ForExcuteConstraint 
{
	/*
	 * 下面是保存相关文件内容的字符串
	 * */
	public StringBuilder head = null;
	public StringBuilder code = null;
	public String codeFilePath = "";
	
	/*
	 * 构造函数
	 * */
	public ForExcuteConstraint (String path)
	{
		head = new StringBuilder();
		code = new StringBuilder();
		codeFilePath = path;
	}
	
	/*
	 * 自动的生成所有的内容，并写到文件内
	 * */
	public boolean generateCode()
	{
		gelAllHeadFileContent();
		gelAllCodeFileContent();
		writeHeadFile(head, "ExcuteConstraint.cuh");
		writeCodeFile(code, "ExcuteConstraint.cu");
		return true;
	}
	
	/*
	 * 写到head文件内部
	 * */
	public boolean writeHeadFile(StringBuilder head,String filename)
	{
		String folderPath = new File("").getAbsolutePath()+"/ATPC_Result/";
		folderPath = codeFilePath;
		File folder = new File(folderPath);
		if (!folder.exists()) 
			folder.mkdirs();
		String resultPath = folderPath + "/"+filename;
		try {
            FileOutputStream out=new FileOutputStream(resultPath);   
            BufferedWriter bufferedwriter = new BufferedWriter(new OutputStreamWriter(out));
            bufferedwriter.write(head.toString());
            bufferedwriter.flush();
            bufferedwriter.close();
        }catch (Exception e){   
            e.printStackTrace();   
        }
		return true;
	}
	
	/*
	 * 写到code文件内部
	 * */
	public boolean writeCodeFile(StringBuilder head,String filename)
	{
		String folderPath = new File("").getAbsolutePath()+"/ATPC_Result/";
		folderPath = codeFilePath;
		File folder = new File(folderPath);
		if (!folder.exists()) 
			folder.mkdirs();
		String resultPath = folderPath + "/"+filename;
		try {
            FileOutputStream out=new FileOutputStream(resultPath);   
            BufferedWriter bufferedwriter = new BufferedWriter(new OutputStreamWriter(out));
            bufferedwriter.write(head.toString());
            bufferedwriter.flush();
            bufferedwriter.close();
        }catch (Exception e){   
            e.printStackTrace();   
        }
		return true;
	}
	
	/*
	 * 获取所有的head文件内容
	 * */
	public boolean gelAllHeadFileContent()
	{
		//获取头文件部分的声明
		String begin = getHBegin();
		head.append(begin);
		
		//获取RuntimeValue的相关声明
		String runFunc = HgetRuntimeValue();
		head.append(runFunc);
		
		//获取calaConstraint();的相关声明
		String calaFunc = HcalaConstraint();
		head.append(calaFunc);
		
		//其他的函数的声明，其他函数的声明可以直接生成
		String otherFunc = HotherFunctions();
		head.append(otherFunc);
		
		//结束部分
		String end = "\n\n\t#endif /* EXCUTECONSTRAINT_CUH_ */\n";
		head.append(end);
		return true;
	}
	
	/*
	 * 获取所有的code文件内容
	 * */
	public boolean gelAllCodeFileContent()
	{
		//获取头文件部分的声明
		String begin = getCBegin();
		code.append(begin);
		
		//获取getRuntimeValue的相关函数的实现过程
		String run = CgetRuntimeValue();
		code.append(run);
		
		//获取calaConstraint();的声明的实现部分
		String cala = CcalaConstraint();
		code.append(cala);
		
		//获取calaRuntimeValue()函数的实现部分
		String cala1 = CcalaRuntimeValue();
		code.append(cala1);
		
		//获取calaFeasibleSolution()函数的实现部分
		String cala2 = CcalaFeasibleSolution();
		code.append(cala2);
		
		//获取checkisFullCovered()函数的实现部分
		//String check = CcheckisFullCovered();
		//code.append(check);
		
		//获取calaFinalIntervel()函数的实现部分
		String calaFinal = CcalaFinalIntervel();
		code.append(calaFinal);
		
		//获取generatePredictMat()函数的实现部分
		String gen = CgeneratePredictMat();
		code.append(gen);
		
		//获取calaPriority()函数的实现部分
		String calaPri = CcalaPriority();
		code.append(calaPri);
 		
		return true;
	}
	
	
	/*
	 * 其他的函数的声明，其他函数的声明可以直接生成
	 * */
	public String HotherFunctions()
	{
		String res = "";
		res += getComment("复合约束的并行计算模块,注意，这个函数还可以使用CUDA提供的流加速计算");
		res += "\tvoid calaRuntimeValue(int paraIndex,Coodinate* dev_predictArray,FloatType* dev_parameter,const int row,const int col);\n\n";
		
		res += getComment(" 这个核函数是为了寻找可行解");
		res += "\t__global__ void calaFeasibleSolution(FullCoveredInfo* dev_coveredInfo,Coodinate* dev_predictArray,const int calaMatCol);\n\n";
		
		res += getComment("判断是否有满足复合约束的可行解,CPU验证模块");
		res += "\tbool checkisFullCovered(FullCoveredInfo* dev_coveredInfo,Coodinate* initArray, bool &findSolution,const int row,const int col);\n\n";
		
		res += getComment("就是区间交运算的计算");
		res += "\t__global__ void calaFinalIntervel(Interval* dev_finalIntervel,Interval* dev_interval,const int calaArraySize);\n\n";
		
		res += getComment("根据预测的序列生成predct矩阵");
		res += "\t__global__ void generatePredictMat(Coodinate* dev_predictArray,PredictValueWithOne* dev_finalAllPredictValue,const int col);\n\n";
		
		res += getComment("并行计算所有的预测解向量的优先级");
		res += "\t__global__ void calaPriority(Priority* dev_priority,Coodinate* dev_calaArray,const int row,const int Size);\n\n";
		return res;
	}
	
	//获取calaPriority()函数的实现部分
	public String CcalaPriority()
	{
		String res = "";
		res += getComment("并行计算所有的预测解向量的优先级");
		res += "\t__global__ void calaPriority(Priority* dev_priority,Coodinate* dev_calaArray,const int row,const int Size)\n";
		res += "\t{\n";
		
		res += "\t\tint i = threadIdx.x + blockIdx.x*blockDim.x;\n";
		res += "\t\tif( i < Size )\n";
		res += "\t\t{\n";
		
		res += "\t\t\tFloatType pri = 0.0;\n";
		for(int i=0;i<ConstraintParameter.NumOFConstraint;i++)
			res = res + "\t\t\tCoodinate* a" + i + " = dev_calaArray + i + " + i + " * Size;\n\n";
		
		for(int i=0;i<ConstraintParameter.NumOFConstraint;i++)
		{
			//不可以这么做，因为计算会出现NaN的情况，还是采用常规的情况去做
/*			res = res + "\t\t\tpri = pri + ((int)(a" 
			          + i + "->isCovered==true))*1 + ((int)(a" 
					  + i + "->isCovered==false))*((int)(a" 
			          + i + "->isValid==true))*1.0/(1.0+abs(a" 
					  + i + "->y));\n";*/
			if(ATPC.forDouble)
			{
				res =  res + "\t\t\tif(a" + i + "->isCovered==true) pri = pri + 1.0;\n"
						+ "\t\t\telse if(a" + i + "->isValid==true) pri = pri + 1.0/(1.0+fabs(a" + i + "->y));\n\n";
			}else
			{
				res =  res + "\t\t\tif(a" + i + "->isCovered==true) pri = pri + 1.f;\n"
						+ "\t\t\telse if(a" + i + "->isValid==true) pri = pri + 1.f/(1.f+fabsf(a" + i + "->y));\n\n";
			}
		}
		res += "\t\t\tdev_priority[i].priority =  pri / (FloatType)row;\n";
		res += "\t\t\tdev_priority[i].x = a0->x;\n";
		
		res += "\n\t\t\t//下面是测试代码\n";
		String isOne="";
		if(ConstraintParameter.NumOFConstraint == 1)
			isOne = "bool isOne = true;";
		else
		{
			isOne = "bool isOne = (a0->x == a1->x)";
			for(int i=1;i<ConstraintParameter.NumOFConstraint-1;i++)
				isOne = isOne + " && (a" + i + "->x == a" + (i+1)  + "->x)";
			isOne+=";";
		}
		res = res + "\t\t\t" + isOne + "\n";
		String isCovered="bool isCovered = a0->isCovered";
		String isValid="bool isValid= a0->isValid";
		for(int i=1;i<ConstraintParameter.NumOFConstraint;i++)
		{
			isCovered = isCovered + " && a" +  i + "->isCovered";
			isValid = isValid + " && a" +  i + "->isValid";
		}
		res = res + "\t\t\t" + isCovered + ";\n";
		res = res + "\t\t\t" + isValid + ";\n";
		res += "\t\t\tif(isCovered == true)\n";
		res += "\t\t\t{\n";
		String print = "printf(\"Cala Prioruty Wrong,index:%d: (%f,%f,%d,%d)";
		for(int i=1;i<ConstraintParameter.NumOFConstraint;i++)
			print = print + " , (%f,%f,%d,%d)";
		print = print + " , isOne:%d , isCovered:%d , isValid:%d  \\n\"," + "i,";
		for(int i=0;i<ConstraintParameter.NumOFConstraint;i++)
			print = print + "a" + i + "->x,a" + i + "->y,a" + i + "->isCovered,a" + i + "->isValid,";
		print = print + "isOne,isCovered,isValid);";
		res = res + "\t\t\t\t" + print + "\n";
		res += "\t\t\t}\n";
		
		
		res += "\t\t}\n";
		
		res += "\t}\n\n";
		return res;
	}
	
	//获取generatePredictMat()函数的实现部分
	public String CgeneratePredictMat()
	{
		String res = "";
		res += getComment("根据预测的序列生成predct矩阵");
		res += "\t__global__ void generatePredictMat(Coodinate* dev_predictArray,PredictValueWithOne* dev_finalAllPredictValue,const int Size)\n";
		res += "\t{\n";
		
		res += "\t\tint i = threadIdx.x + blockIdx.x*blockDim.x;\n";
		res += "\t\tif( i < Size )\n";
		res += "\t\t{\n";
		for(int i=0;i<ConstraintParameter.NumOFConstraint;i++)
		{
			res = res + "\t\t\tdev_predictArray[i + " + i + "*Size].x = dev_finalAllPredictValue[i].value;\n";
		}
		res += "\t\t}\n";
		
		res += "\t}\n\n";
		return res;
	}
	
	//获取calaFinalIntervel()函数的实现部分
	public String CcalaFinalIntervel()
	{
		String res = "";
		res += getComment("就是区间交运算的计算");
		res += "\t__global__ void calaFinalIntervel(Interval* dev_finalIntervel,Interval* dev_interval,const int calaArraySize)\n";
		res += "\t{\n";
		
		res += "\t\tint i = threadIdx.x + blockIdx.x*blockDim.x;\n";
		res += "\t\tbool condition = (i>=1) && (i<calaArraySize);\n";
		res += "\t\tif(condition)\n";
		res += "\t\t{\n";
		
		for(int i=0;i<ConstraintParameter.NumOFConstraint;i++)
			res = res + "\t\t\tInterval* a" + i + " = dev_interval + i + calaArraySize * " + i + ";\n";
		res += "\n";
		
		if(ATPC.forDouble)
		{
			res = res + "\t\t\tFloatType left = a" + 0 + "->left;\n";
			for(int i=1;i<ConstraintParameter.NumOFConstraint;i++)
				res = res + "\t\t\tleft = fmax( left , a" + i + "->left);\n";
			res += "\n";
			res = res + "\t\t\tFloatType right = a" + 0 + "->right;\n";
			for(int i=1;i<ConstraintParameter.NumOFConstraint;i++)
				res = res + "\t\t\tright = fmin( right , a" + i + "->right);\n";
			res += "\n";
		}else
		{
			res = res + "\t\t\tFloatType left = a" + 0 + "->left;\n";
			for(int i=1;i<ConstraintParameter.NumOFConstraint;i++)
				res = res + "\t\t\tleft = fmaxf( left , a" + i + "->left);\n";
			res += "\n";
			res = res + "\t\t\tFloatType right = a" + 0 + "->right;\n";
			for(int i=1;i<ConstraintParameter.NumOFConstraint;i++)
				res = res + "\t\t\tright = fminf( right , a" + i + "->right);\n";
			res += "\n";
		}
		
		res = res + "\t\t\tbool hasIntervel = a" + 0 + "->hasIntervel";
		for(int i=1;i<ConstraintParameter.NumOFConstraint;i++)
			res = res + " && a" + i + "->hasIntervel";
		res += ";\n";
		
		res = res + "\t\t\tdev_finalIntervel[i].left = left;\n";
		res = res + "\t\t\tdev_finalIntervel[i].right = right;\n";
		res = res + "\t\t\tdev_finalIntervel[i].hasIntervel = hasIntervel;\n";
		
		res = res + "\t\t\t//这里可以自行添加打印获取区间交运算的结果\n";
		res = res + "\t\t\t//printf(\"(%f , %f ) (%f , %f ) (%f , %f ) Final %d (%f , %f)\\n\",a1->left,a1->right,a2->left,a2->right,a3->left,a3->right,hasIntervel,left,right);\n";
		
		res += "\t\t}\n";
		res += "\t}\n\n";
		return res;
	}
	 
	
	//获取checkisFullCovered()函数的实现部分
	public String CcheckisFullCovered()
	{
		String res = "";
		res += getComment("判断是否有满足复合约束的可行解,CPU验证模块");
		res += "\tbool checkisFullCovered(FullCoveredInfo* dev_coveredInfo,Coodinate* initArray, bool &findSolution,const int row,const int col)\n";
		res += "\t{\n";
		
		res += "\t\tFullCoveredInfo* coveredInfo = new FullCoveredInfo[col];\n";
		res += "\t\tcudaMemcpy(coveredInfo,dev_coveredInfo,col * sizeof(FullCoveredInfo),cudaMemcpyDeviceToHost);\n";
		res += "\t\tfor(int i=0;i<col;i++)\n";
		res += "\t\t{\n";
		
		res = res + "\t\t\tFloatType " + ConstraintParameter.parameterNames[0]+" = 0";
		for(int i=1;i<ConstraintParameter.parameterNames.length;i++)
			res = res + " , " +ConstraintParameter.parameterNames[i]+" = 0";
		res += ";\n";
		
		
		for(int i=0;i<ConstraintParameter.NumOfParam;i++)
		{
			if(i==0)
				res = res + "\t\t\tif(ATG::currentSearchParamIndex == " + i + ")\n";
			else
				res = res + "\t\t\telse if(ATG::currentSearchParamIndex == " + i + ")\n";
			
			res = res + "\t\t\t{\n";
			for(int j=0;j<ConstraintParameter.parameterNames.length;j++)
			{
				res = res + "\t\t\t\t" + ConstraintParameter.parameterNames[j] + " = ";
				if(j == i)
					res = res + "initArray[i].x;\n";
				else
					res = res + "ATG::parameters[" + j + "];\n";
			}
			res = res + "\t\t\t}\n";
		}
		res = res + "\t\t\telse\n";
		res = res + "\t\t\t\tcout<<\"FFFUCK  YOU   *************   \"<<endl;\n\n";
		res = res + "\t\t\tbool tmpp = " + BinaryExpressionParse.targetBinaryExpression.toString() + ";\n";
		
		res = res + "\t\t\tif(coveredInfo[i].isCovered == tmpp )\n";
		res = res + "\t\t\t{\n";
		res = res + "\t\t\t\tif(tmpp)\n";
		res = res + "\t\t\t\t\tfindSolution = true;\n";
		res = res + "\t\t\t}else\n";
		res = res + "\t\t\t{\n";
		res = res + "\t\t\t\tcout<<\"*************  Not Equal  ******************\"<<endl;\n";
		res = res + "\t\t\t\treturn false;\n";
		res = res + "\t\t\t}\n";
		res += "\t\t}\n";
		
		res += "\t\tdelete []coveredInfo;\n";
		res += "\t\treturn true;\n";
		res += "\t}\n\n";
		return res;
	}
	
	/*
	 * 获取calaFeasibleSolution()函数的实现部分
	 * */
	public String CcalaFeasibleSolution()
	{
		String res = "";
		res += getComment(" 这个核函数是为了寻找可行解");
		res += "\t__global__ void calaFeasibleSolution(FullCoveredInfo* dev_coveredInfo,Coodinate* dev_predictArray,const int Size)\n";
		res += "\t{\n";
		res += "\t\tint i = threadIdx.x + blockIdx.x*blockDim.x;\n";
		res += "\t\tif (i < Size)\n";
		res += "\t\t{\n";
		res += "\t\t\tdev_coveredInfo[i].index = i;\n";
		
		res = res + "\t\t\tdev_coveredInfo[i].isCovered = dev_predictArray[i + " + 0 + "*Size].isCovered";
		for(int i=1;i<ConstraintParameter.NumOFConstraint;i++)
			res = res +  " && dev_predictArray[i + " + i + "*Size].isCovered";
		res +=";\n";
		
		res = res + "\t\t\tdev_coveredInfo[i].isVaild =  dev_predictArray[i + " + 0 + "*Size].isValid";
		for(int i=1;i<ConstraintParameter.NumOFConstraint;i++)
			res = res +  " && dev_predictArray[i + " + i + "*Size].isValid";
		res +=";\n";
		
		res += "\t\t\tdev_coveredInfo[i].vaildNum = (int)(dev_coveredInfo[i].isVaild == true);\n";
		res += "\t\t}\n";
		res += "\t}\n\n";
		return res;
	}
	
	/*
	 * 获取calaRuntimeValue()函数的实现部分
	 * */
	public String CcalaRuntimeValue()
	{
		String res = "";
		res += getComment("复合约束的并行计算模块,注意，这个函数还可以使用CUDA提供的流加速计算");
		res += "\tvoid calaRuntimeValue(int paraIndex,Coodinate* dev_predictArray,FloatType* dev_parameter,const int row,const int col)\n";
		res += "\t{\n";
		res += "\t\tBlock res = HardwareStrategy::getHardwareStrategy(col);\n\n";	
		
		res += "\t\t//根据不同的搜索方向做判断\n";
		
		for(int i=0;i<ConstraintParameter.NumOfParam;i++)
		{
			if(i==0)
				res += "\t\tif(paraIndex == " + i + ")\n";
			else
				res += "\t\telse if(paraIndex == " + i + ")\n";
			res += "\t\t{\n";
			for(int j=0;j<ConstraintParameter.NumOFConstraint;j++)
			{
				String order = "_0_" + j + "_" + i;
				if(ATPC.useStream)
				{
					res = res + "\t\t\tcalaConstraint" + order;
					String streamString = "<<<res.NumOfBlock , res.ThreadPreBlock , 0 , ParallelATG::stream[" + j + "]>>>";
					res = res + streamString + "(dev_predictArray,dev_parameter,";
				}else
				{
					res = res + "\t\t\tcalaConstraint" + order;
					res = res + "<<<res.NumOfBlock , res.ThreadPreBlock>>>(dev_predictArray,dev_parameter,";	
				}
				res = res + j + "*col,col);\n";
			}
			res += "\t\t}\n";
		}
		
		res += "\t\telse\n";
		res += "\t\t{\n";
		res += "\t\t\tcout<<\"************   You Should Never Get Here. In Function Of: void calaRuntimeValue(int paraIndex,Coodinate* dev_predictArray,FloatType* dev_parameter,const int row,const int col)\"<<endl;\n";
		res += "\t\t}\n\n";
		
		if(ATPC.useStream)
		{
			res += "\t\t//下面是流并行计算部分的同步\n";
			res += "\t\tParallelATG::synStream();\n";
		}
		res += "\t}\n\n\n";		
		return res;
	}
	
	
	/*
	 * 获取calaConstraint();的声明的实现部分
	 * */
	public String CcalaConstraint()
	{
		String res = getComment("下面是所有的  约束  在  各个搜索方向  的获取运行时刻值的关系（假如n个约束m个搜索方向，那么一共 m*n 个函数）") + "\n";
		for(int i=0; i<ConstraintParameter.NumOFConstraint; i++)
		{
			for(int j=0; j<ConstraintParameter.NumOfParam;j++)
			{
				res += getComment("第"+i+"个约束在第"+j+"个搜索方向的执行");
				String order = "_0_" + i + "_" +j;
				res = res + "\t__global__ void calaConstraint" + order
					+ "(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int Size)\n";
				res += "\t{\n";
				res += "\t\tint i = threadIdx.x + blockIdx.x*blockDim.x;\n";
				res += "\t\tif (i < Size)\n";
				res += "\t\t{\n";
				res = res + "\t\t\tgetRuntimeValue" + "_0_" + i + "(" + getCalaParaList(j) + " , dev_predictArray + i + base);\n";
				res += "\t\t}\n";
				res += "\t}\n\n";
			}
			res += "\n\n";
		}
		return res;
	}
	
	/*
	 * 在某一个搜索方向上的函数参数的声明
	 * */
	public String getCalaParaList(int a)
	{
		String res = "";
		if(a==0)
		{
			res += "dev_predictArray[i+base].x";
			for(int i=1;i<ConstraintParameter.NumOfParam;i++)
				res += " , dev_parameter["+i+"]";
		}else
		{
			res += "dev_parameter[0]";
			for(int i=1;i<ConstraintParameter.NumOfParam;i++)
			{
				if(i==a)
					res += " , dev_predictArray[i+base].x";
				else
					res += " , dev_parameter["+i+"]";
			}
		}
		return res;
	}
	
	/*
	 * 获取calaConstraint();的相关声明
	 * */
	public String HcalaConstraint()
	{
		String res = getComment("下面是所有的  约束  在  各个搜索方向  的获取运行时刻值的关系（假如n个约束m个搜索方向，那么一共 m*n 个函数）") + "\n";
		for(int i=0; i<ConstraintParameter.NumOFConstraint; i++)
		{
			for(int j=0; j<ConstraintParameter.NumOfParam;j++)
			{
				res += getComment("第"+i+"个约束在第"+j+"个搜索方向的执行");
				String order = "_0_" + i + "_" +j;
				res = res + "\t__global__ void calaConstraint" + order
					+ "(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);\n\n";
			}
			res += "\n\n";
		}
		return res;
	}
	
	/*
	 * 获取getRuntimeValue的相关函数的实现过程
	 * */
	public String CgetRuntimeValue()
	{
		String res = getComment("这个文件是函数获取运行时刻的各种函数的声明") + "\n";
		ArrayList<String> comm = new ArrayList<>();
		comm.add("注意这里计算有两部的计算优化：");
		comm.add("1）在计算运行时刻值的时候，顺便把子约束满足情况计算了");
		comm.add("2）计算子约束的满足情况的时候没有使用if等判断分支结构，");
		comm.add("   同时使用到已经计算好的运行时刻值去减少复杂的浮点数计算过程");
		comm.add("这里采用的编码函数命名编码规则是这样的:");
		comm.add("getRuntimeValue_i_j表示计算第i个析取范式的第j个约束的运行时刻值");
		res += getComment(comm);
		
		List<List<BinaryExpression>> all = BinaryExpressionParse.targetConstraint.getAtomicConstraintGroups();
		List<BinaryExpression> one = all.get(0);
		for(int i=0; i<ConstraintParameter.NumOFConstraint; i++)
		{
			String order = "_0_" + i;
			res +=  getComment("第"+i+"个约束的CUDA计算函数");
			res = res + "\t__device__ void getRuntimeValue" + order + "(" + getParaList() + " , Coodinate* res )\n";
			res += "\t{\n";
			res = res + "\t\tres->y = " + getInstrument(one.get(i)) + ";\n";
			//res = res + "\t\tres->isCovered = (bool)(" + one.get(i).toString() + " );\n";
			
			if(ATPC.forDouble)
			{
				if(one.get(i).getOp().equals(Operator.EQ))
					res = res + "\t\tres->isCovered = (bool)( abs(res->y)<=SolverParameter::floatAccuracy );\n";
				else
					res = res + "\t\tres->isCovered = (bool)(res->y " + getOp(one.get(i).getOp()) + " 0.0);\n";
			}
			else
			{
				if(one.get(i).getOp().equals(Operator.EQ))
					res = res + "\t\tres->isCovered = (bool)( abs(res->y)<=SolverParameter::floatAccuracy );\n";
				else
					res = res + "\t\tres->isCovered = (bool)(res->y " + getOp(one.get(i).getOp()) + " 0.f);\n";
			}
			
			res +=  "\t\tres->isValid = (bool)(isfinite(res->y));\n";
			res +=  "\t\treturn ;\n";
			res += "\t}\n\n";
		}
		res += "\n";
		
		return res;
	}
	
	
	/*
	 * 获取getRuntimeValue的相关函数
	 * */
	public String HgetRuntimeValue()
	{
		String res = getComment("这个文件是函数获取运行时刻的各种函数的声明") + "\n";
		ArrayList<String> comm = new ArrayList<>();
		comm.add("注意这里计算有两部的计算优化：");
		comm.add("1）在计算运行时刻值的时候，顺便把子约束满足情况计算了");
		comm.add("2）计算子约束的满足情况的时候没有使用if等判断分支结构，");
		comm.add("   同时使用到已经计算好的运行时刻值去减少复杂的浮点数计算过程");
		comm.add("这里采用的编码函数命名编码规则是这样的:");
		comm.add("getRuntimeValue_i_j表示计算第i个析取范式的第j个约束的运行时刻值");
		res += getComment(comm);
		
		for(int i=0; i<ConstraintParameter.NumOFConstraint; i++)
		{
			String order = "_0_" + i;
			res +=  getComment("第"+i+"个约束的CUDA计算函数");
			res = res + "\t__device__ void getRuntimeValue" + order + "(" + getParaList() + " , Coodinate* res );\n\n";
		}
		res += "\n";
		return res;
	}
	
	
	/*
	 * 获取当前的begin注释
	 * */
	public String getCBegin()
	{
		String begin = "\t/*\n\t * ExcuteConstraint.cu\n"
			     + "\t * \n"
			     + "\t * ***************   Notice   ***************\n"
			     + "\t * Auto Generated By ATPC on:"+getNowTime()+"\n"
			     + "\t * Author: ZhangHui\n"
			     + "\t * \n" 
			     + "\t */ \n\n" ;
		begin = begin
			  + "\t#include <iostream>\n\n"
			  + "\t#include \"./../ConstraintParser/ConstraintParameter.cuh\"\n"
			  + "\t#include \"./../model/Coodinate.cuh\"\n"
			  + "\t#include \"./../model/Interval.cuh\"\n"
			  + "\t#include \"./../model/Priority.cuh\"\n"
			  + "\t#include \"./../model/FullCoveredInfo.cuh\"\n"
			  + "\t#include \"./../model/PredictValue.cuh\"\n"
			  + "\t#include \"./../model/PredictValueWithOne.cuh\"\n"
			  + "\t#include \"./../solver/type.h\"\n"
			  + "\t#include \"./../solver/ATG.h\"\n"
			  + "\t#include \"./../solver/PCATG.h\"\n"
			  + "\t#include \"./../solver/ConstantValue.h\"\n"
			  + "\t#include \"ExcuteConstraint.cuh\"\n"
			  + "\t#include \"HardwareStrategy.cuh\"\n\n"
			  + "\t#include \"ParallelATG.cuh\"\n\n"
			  
			  + "\t#include \"cuda_runtime.h\"\n"
			  + "\t#include \"device_launch_parameters.h\"\n"
			  + "\t#include \"device_functions.hpp\"\n"
			  + "\t#include \"math_functions.h\"\n\n"
			  
			  + "\t#include <stdio.h>\n\n"
			  + "\tusing namespace std;\n\n";
		return begin;
	}
	
	/*
	 * 获取当前的begin注释
	 * */
	public String getHBegin()
	{
		String begin = "\t/*\n\t * ExcuteConstraint.cuh\n"
			     + "\t * \n"
			     + "\t * ***************   Notice   ***************\n"
			     + "\t * Auto Generated By ATPC on:"+getNowTime()+"\n"
			     + "\t * Author: ZhangHui\n"
			     + "\t * \n" 
			     + "\t */ \n\n" ;
		begin =begin 
			  + "\t#ifndef EXCUTECONSTRAINT_CUH_\n"
			  + "\t#define EXCUTECONSTRAINT_CUH_\n\n"
			  
			  + "\t#include <iostream>\n\n"
			  + "\t#include \"./../ConstraintParser/ConstraintParameter.cuh\"\n"
			  + "\t#include \"./../model/Coodinate.cuh\"\n"
			  + "\t#include \"./../model/Interval.cuh\"\n"
			  + "\t#include \"./../model/Priority.cuh\"\n"
			  + "\t#include \"./../model/FullCoveredInfo.cuh\"\n"
			  + "\t#include \"./../model/PredictValue.cuh\"\n"
			  + "\t#include \"./../model/PredictValueWithOne.cuh\"\n"
			  + "\t#include \"./../solver/type.h\"\n"
			  + "\t#include \"./../solver/ATG.h\"\n"
			  + "\t#include \"./../solver/PCATG.h\"\n"
			  + "\t#include \"./../solver/ConstantValue.h\"\n"
			  + "\t#include \"ExcuteConstraint.cuh\"\n"
			  + "\t#include \"HardwareStrategy.cuh\"\n\n"
			  + "\t#include \"ParallelATG.cuh\"\n\n"
			  
			  + "\t#include \"cuda_runtime.h\"\n"
			  + "\t#include \"device_launch_parameters.h\"\n\n"
			  
			  + "\t#include <stdio.h>\n\n"
			  + "\tusing namespace std;\n\n";
		return begin;
	}
	
	/*
	 * 获取当前的Parammeter注释
	 * */
	public String getParaList()
	{
		String para = "FloatType "+ConstraintParameter.parameterNames[0];
		for(int i=1;i<ConstraintParameter.NumOfParam;i++)
			para += " , " + "FloatType "+ConstraintParameter.parameterNames[i];
		return para;
	}
	
	
	/*
	 * 获取约束的
	 * */
	public String getOp(Operator op)
	{
		String res = ">=";
		if(op==Operator.GE)
			res = ">=";
		else if(op==Operator.GT)
			res = ">";
		else if(op==Operator.EQ)
			res = "==";
		else if(op==Operator.NE)
			res = "!=";
		else 
			System.out.println("*************    Error:约束出现<和<=的情况，应该是转化为>和>=的过程中出现问题了");
		return res;
	}
	
	
	/*
	 * 获取约束的
	 * */
	public String getInstrumentForAccurcy(BinaryExpression a)
	{
		if(a.getOp().equals(Operator.EQ))
		{
			return "abs( ( " + a.getOperand1().toString() + " ) - ( "
					+a.getOperand2().toString() + " ) ) <= SolverParameter::floatAccuracy";
		}else 
		{
			return a.toString();
		}
	}
	
	
	/*
	 * 获取约束的
	 * */
	public String getInstrument(BinaryExpression a)
	{
		String res = "( " + a.getOperand1().toString() + " ) - ( "
				   + a.getOperand2().toString() + " )";
		return res;
	}
	
	
	/*
	 * 获取当前的注释
	 * */
	public String getComment(String comm)
	{
		String res = "\t/*\n"
		           + "\t * " + comm + "\n" 
		           + "\t * */ \n";
		return res;
	}
	
	/*
	 * 获取当前的注释
	 * */
	public String getComment(ArrayList<String> comm)
	{
		String res = "\t/*\n";
		for(String oneString : comm)
		{
			res += "\t * " + oneString + "\n" ;
		}
		res += "\t * */ \n";
		return res;
	}
	
	/*
	 * 获取当前的日期的字符串
	 * */
	public String getNowTime()
	{
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = sdf.format(d);
		return time;
	}
}
