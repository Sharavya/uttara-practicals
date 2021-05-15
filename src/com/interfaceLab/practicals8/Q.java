package com.interfaceLab.practicals8;

public class Q extends P{

	static String name="Q";
	public Q(String n)
	{
		super(n);
		//name = n;
		System.out.println("Q param constr calling");
	}
	public static void print()
	{
		System.out.println("in Q="+name);
	}
}
