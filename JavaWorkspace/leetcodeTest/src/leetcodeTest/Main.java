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
		int totalNum = test.calaTaskNum(6, 6);
		System.out.println(totalNum);
		
		double a = 1800;
		double b = 2500;
		double c = 300;
		System.out.println(a/c + "     "+b/c);
		System.out.println(a/totalNum +"     "+b/totalNum+"     "+c/totalNum);
	}

}
