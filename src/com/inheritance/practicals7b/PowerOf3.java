package com.inheritance.practicals7b;

import java.util.Arrays;

public class PowerOf3 {

	public static void main(String[] args)
	{
		arrayProg();
		System.out.println(checkPowOf3(4));
		System.out.println(checkSqrtOfNum(14));
	}
	public static boolean checkPowOf3(int i)
	{
		int rem ;
		int qut;
		while(i>1)
		{
			rem = i%3;
			qut = i/3;
			if(rem ==0 && qut==1)
				return true;
			i=qut;
		}
		return false;
	}
	public static boolean checkSqrtOfNum(int i)
	{
		double d = Math.sqrt(i);
		if((int)d*(int)d ==i)
			return true;
		else
			return false;
			
	}
	public static void arrayProg()
	{
		int[] arr1 = new int[10];
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		for(int  i=0;i<arr1.length;i++)
		{
			arr1[i] = i+1;
		}
		/*for(int val:arr2)
		{
			System.out.println(val);
		}
		for(int val:arr1)
		{
			System.out.println(val);
		}*/
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
 