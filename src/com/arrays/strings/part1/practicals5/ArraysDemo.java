package com.arrays.strings.part1.practicals5;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args)
	{
		int[] a = {1,2,4};
		int[] b = {8,9,10};
		String[] arr = {"blue","white","black","red","yellow"};
		//randomAcces(arr);
		System.out.println(average(a,b));
		
	}
	
	public static void add(int[] a)
	{
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		System.out.println("sum= "+sum);
	}
	public static int secondBiggestNum(int[] a)
	{
		Arrays.sort(a);
		return a[a.length-2]; 
	}
	public static void randomAcces(String[] arr)
	{
		int len = arr.length;
		double value = Math.random()*len;
		int pos = (int) value;
		System.out.println("colour at position "+pos+" is "+arr[pos]);
	}
	public static String average(int[]a,int[]b)
	{
		int[] a3 = new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			a3[i] = (int)(a[i]+b[i])/2;
		}
		return Arrays.toString(a3);
	}
}
