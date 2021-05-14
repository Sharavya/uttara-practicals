package com.inheritance.practicals7b;

public class Y extends X{

	int c=10;
	static int d=15;
	static
	{
		System.out.println("in static init 1 d= "+d);
		d=25;
	}
	static
	{
		System.out.println("in static init 2 d= "+d);
		d=35;
	}
	{
		System.out.println("in inst init 1 c= "+c);
		c= 20;
	}
	{
		System.out.println("in inst init 2 c= "+c);
		c= 30;
	}
	public Y()
	{
		System.out.println("c = "+c);
		c=40;
	}
}
