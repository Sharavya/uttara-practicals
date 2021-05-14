package com.constructor.chaining.examples;

public class Fruit {

	private String name;
	
	public void setName(String n)
	{
		if(n.equals(null) || n.equals(""))
		{
			System.out.println("INVALID NAME");
		}
		else
			name = n;
	}
	public String getName()
	{
		return name;
	}
	public Fruit()
	{
		System.out.println("non-arg constr... fruit...");
	}
	public void taste()
	{
			System.out.println("Fruit "+name+" being tasted");
	}
}
