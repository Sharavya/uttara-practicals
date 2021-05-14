package com.arrays.strings.part1.practicals5;

public class MathClassDemo {

	public static void main(String[] args)
	{
		isSquareRootOf(100);
		isSquareRootOf(25);
	}
	
	public static void isSquareRootOf(int num)
	{
		System.out.println(Math.sqrt(num));
		double d = Math.sqrt(num);
		if(d== Math.round(d))
			System.out.println("Integer");
		else
			System.out.println("Not Integer");
	}
}
