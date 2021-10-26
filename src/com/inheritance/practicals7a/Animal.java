package com.inheritance.practicals7a;

public class Animal {

	private String name;
	public void setNAme(String name)
	{
		if(name.equals(null) || name.equals(""))
			System.out.println("INVALID NAME");
		else
			this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public Animal()
	{
		System.out.println("non-arg const calling...");
	}
	public Animal(String name)
	{
		super();
		System.out.println("param constr calling...");
		this.name = name;
	}
	public void eat()
	{
		System.out.println("Animal eating....");
	}
	public void sleep()
	{
		System.out.println("Animal sleeping & snoring...");
	}
	public void dance()
	{
		System.out.println("Animal dancing...");
	}
}
