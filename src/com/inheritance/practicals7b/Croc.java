package com.inheritance.practicals7b;

public class Croc {

	String name;
	
	public void eat(Fish fi)
	{
		System.out.println("i am croc "+name+" eating fish "+fi.name);
		
		fi.name = "flippy";
	}
}
