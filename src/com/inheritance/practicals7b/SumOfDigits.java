package com.inheritance.practicals7b;

public class SumOfDigits {

	public static void main(String[] args)
	{
		System.out.println(sumOfDigits(-222));
	}
	public static boolean sumOfDigits(int i)
	{
		//each digit using %
		// loop over
		// check even by div 2
		int sum=0;
		while(i>0)
		{
			int digit = i%10;
			i = i/10;
			sum = sum+digit;
		}
		if((sum&1)==0)
			return true;
		else
			return false;
	}
}
