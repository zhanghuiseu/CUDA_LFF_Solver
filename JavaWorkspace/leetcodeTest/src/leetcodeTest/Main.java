package leetcodeTest;

public class Main 
{

	public int calaTaskNum(int numOfParams,int level)
	{
		if(level<=0)
			return 0;
		else if(level==1)
			return numOfParams;
		else 
		{
			int sum = numOfParams;
			int k = numOfParams;
			for(int i=1;i<level;i++)
			{
				k = k*(numOfParams-1);
				sum+=k;
			}
			return sum;
		}
	}
	public static void main(String[] args) 
	{
		Main test = new Main();
		System.out.println(test.calaTaskNum(6, 6));
	}

}
