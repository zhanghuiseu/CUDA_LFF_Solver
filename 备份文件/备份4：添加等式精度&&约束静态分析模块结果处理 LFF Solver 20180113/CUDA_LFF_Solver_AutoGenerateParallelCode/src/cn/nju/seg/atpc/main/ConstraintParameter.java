package cn.nju.seg.atpc.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.nju.seg.atpc.simplification.Interval;


public class ConstraintParameter 
{
	/**
	 * 变量的数量
	 */
	public static int NumOfParam = 0;
	
	/**
	 * 约束的名字
	 */
	public static String constraintName = "";
	
	/**
	 * 约束输入参数的类型
	 */
	public static String[] parameterTypes = null;

	/**
	 * 约束输入参数的变量名称
	 */
	public static String[] parameterNames = null;
	
	/**
	 * 约束输入参数的以来分析情况
	 */
	public static boolean[] DependencyRele = null;
	
	/**
	 * 约束的数量
	 */
	public static int NumOFConstraint = 0;
	
	/**
	 * 用户的自定义的搜索起点的设置
	 */
	public static boolean needCustomizedParams = false;
	public static double[] CustomizedParams = null;
	
	
	/**
	 * 针对复杂约束昨晚化简和定义域求解之后，然后求解最小不可达集合，确定是否是无解的标志变量
	 * eg x>0 && x<0  <===> 无解
	 * 1）有解 ---------- true  没找到最小不可达集合，所以无法确定无解，也即有解
	 * 2）无解 ---------- false 存在最小不可达集合，也即可以直接判定无解
	 */
	public static boolean hasSolution = true;
	
	/**
	 * 这个参数是用来记录当存在不可行解的时候，为什么不存在解的原因
	 */
	public static String noSolutionInfo = "";
	
	/**
	 * 这连个变量是定义求解的定义域的最大最小值，为什么用这两个值
	 * 的原因是这样的，首先这连个值的大小基本够用，其次这样容易去
	 * 做判断到底是区间走势
	 */
	public static double minNum = -1e10;
	public static double maxNum =  1e10;
	
	/**
	 * 所有的求解的结果的保留
	 *这个主要存储的是经过化简求解过的变量的对应的值
	 */
	public static Map<String, String> allVarEqualMap = new HashMap<String, String>();
	
	/**
	 * 所有的求解的结果的保留
	 * 这个主要存储的是每一个变量的定义域，
	 */
	public static List<Interval> allVarDomain = new ArrayList<>();
	
}
