package com.interfaceLab.practicals8;

public class P {

	 static String name="P";
	
	public P(String n)
	{
		name = n;
		System.out.println("P constr calling..."+n);
	}
	public  static void print()
	{
		System.out.println("in P="+name);
	}
	
}
