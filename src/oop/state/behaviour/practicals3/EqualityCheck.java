package oop.state.behaviour.practicals3;

public class EqualityCheck {

	public static void main(String[] args)
	{
		System.out.println("233,3"+checkDigit(233,3));
		System.out.println("255,3"+checkDigit(255,3));
	}
	
	public static boolean checkDigit(int num ,int digit)
	{
		String str = String.valueOf(num);
		for(int i=0;i<=str.length();i++)
		{
			if(num%10 == digit)
				return true;
			else 
				num=num/10;
		}
		return false;
	}
}
