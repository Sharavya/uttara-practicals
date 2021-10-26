package com.constructors.initializers.practicals6;

public class X {

	 int a = 10;
	 static int b = 15;
	 static {
		 System.out.println("static init 1 b= "+b);
		 b=25;
	 }
	 static 
	 {
		 System.out.println("static init 2 b= "+b);
		 b = 35;
	 }
	{
		System.out.println("instance init 1 a = "+a);
		a = 20;
	}
	{
		System.out.println("instance init 2 a = "+a);
		a = 30;
	}
	public X()
	{
		System.out.println("a = "+a);
		a = 40;
		System.out.println("b = "+b);
		b = 45;
	}
}
