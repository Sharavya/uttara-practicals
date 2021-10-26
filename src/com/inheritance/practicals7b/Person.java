package com.inheritance.practicals7b;

public class Person {

	String name;
	int age;
	
	public void eat()
	{
		if(age>=40)
			System.out.println("eats more");
		else
			System.out.println("eats less");
	}
	public void sleep()
	{
		if(age<40)
			System.out.println("sleeps more");
		else
			System.out.println("sleeps less");
	}
}
