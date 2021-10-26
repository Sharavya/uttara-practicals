package com.inheritance.practicals7a;

public class Item {

	String name;
	double price;
	public Item()
	{
		System.out.println("non-arg constr calling...");
	}
	public Item(String n, double p)
	{
		super();
		System.out.println("param constr calling...");
		name = n;
		price = p;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}
	
}
