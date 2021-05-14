package com.inheritance.practicals7a;

public class Device {
	
	private String name;
	
	public Device(String name)
	{
		super();
		this.name = name;
		System.out.println("parameterised constr...");
	}
	public void setName(String name)
	{
			this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public Device()
	{
		System.out.println("non-arg device constr....");
	}
	public void doSomething()
	{
		System.out.println("shouting its name..."+" "+name);
	}
}
