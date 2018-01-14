package cn.nju.seg.atpc.model;

/**
 * 一个子表达式和它父表达式之间的关系
 * @author zhanghui
 *
 */
public enum ExprProperty
{
	
  	OPERAND_ONE("operand_one"),
  	OPERAND_TWO("operand_two");

    private final String name;
    
    ExprProperty(String name)
    {
 	   this.name= name;
    }
    
    @Override
	public String toString() 
    {
		return name;
	}
}
