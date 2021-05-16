package com.interfaceLab.practicals8;

public abstract class Animal {

	String name;
	public abstract void eat();
	public void sleep()
	{
		System.out.println("Animal Sleeping closing eyes... zzz...");
	}
	public Animal()
	{
		System.out.println("Animal non-arg constr...");
	}
	public Animal(String name)
	{
		this.name = name;
	}
	 /*NOTE: * Abstract classes can have constructors
	 	   * it can have abstract methods & instance methods
	 	   * it has instance variables
	 	   * can't create object out of abstract class
	 	   * using subclass have to access behavior of abstract class*/
}
