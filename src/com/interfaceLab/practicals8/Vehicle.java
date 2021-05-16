package com.interfaceLab.practicals8;

public class Vehicle implements Thing{

	String name;
	public Vehicle(String name)
	{
		this.name = name;
	}
	@Override
	public void doSomething() {
		System.out.println("I am driving "+this.name);
		
	}

}
