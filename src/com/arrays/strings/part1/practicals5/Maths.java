package com.arrays.strings.part1.practicals5;

public class Maths {
	public static void main(String[] args)
	{
		int a[] = {2,4,6};
		System.out.println("Sum of two ints = "+add(2,4));
		System.out.println("Sum of n ints = "+addNIntegers(a));
		System.out.println("Sum of two doubles = "+addDoubles(2.545,6.785));
		//Complex c1 = new Complex(6,8);
		//Complex c2 = new Complex(5,8);
		//Complex c3 = addComplex(c1,c2);
		System.out.println();
	}

	private static long add(int n1,int n2)
	{
		long result = (long)n1+n2;
		return result;
	}
	private static long addNIntegers(int[] n)
	{
		long sum = 0;
		for(int i=0;i<n.length;i++)
		{
			sum = sum+n[i];
		}
		return sum;
	}
	private static double addDoubles(double n1,double n2)
	{
		double result = n1+n2;
		return result;
	}
	
	/*public static Complex addComplex(Complex c1,Complex c2)
	{
		Complex real = c1.real+c2.real;
		Complex img = c1.img+c2.img;
		Complex c3 = new Complex(real,img);
		return c3;
	}*/
	
}
