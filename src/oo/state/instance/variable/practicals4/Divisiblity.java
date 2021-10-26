package oo.state.instance.variable.practicals4;

public class Divisiblity {

	public static void main(String[] args)
	{
		System.out.println(addReverseOfNum(81));
		randomIntString();
	}
	
	public static boolean isOdd(int num)
	{
		int lstDigit = num%10;
		if(lstDigit%2 !=0 && lstDigit%3 !=0)
			return true;
		else 
			return false;
	}
	public static void powOf3(int num)
	{
		while(num%3==0)
		{
			num=num/3;
		}
			if(num==1)
				System.out.println("power of 3");
			else
				System.out.println("not power of 3");	
	}
	public static int addReverseOfNum(int num)
	{
		int temp = num;
		int  a=0;
		while(temp !=0)
		{
			int r = temp%10;
			a = 10*a+r;
			temp=temp/10;
		}
		return num+a;		
	}
	public static void randomIntString()
	{
		String str = "";
		for(int i=1;i<=10;i++)
		{
			str = str+(int)Math.random()*10;
			System.out.println(str);
		}
	}
	
}
