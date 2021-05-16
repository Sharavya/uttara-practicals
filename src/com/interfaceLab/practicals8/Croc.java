package com.interfaceLab.practicals8;

public class Croc extends Animal{

	public void swim()
	{
		System.out.println("i am croc swimming....");
	}
	public Croc()
	{
		System.out.println("croc non-arg constr calling...");
	}
	public Croc(String s)
	{
		super(s);
	}
	@Override
	public void eat() {
		System.out.println("croc eating...");
	}
	public void sleep()
	{
		System.out.println("croc sleeping by opening eyes");
	}
}
