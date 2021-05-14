package com.constructors.initializers.practicals6;

public class Item {

	String name;
	double price;
	
	public Item()
	{
		System.out.println("non-arg constr...");
	}
	public Item(String name,double price)
	{
		System.out.println("param constr calling...");
		this.name = name;
		this.price = price;
	}
}
