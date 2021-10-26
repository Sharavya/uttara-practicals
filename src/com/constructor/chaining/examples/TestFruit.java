package com.constructor.chaining.examples;

public class TestFruit {

	public static void main(String[] args)
	{
		Mango m = new Mango();
		System.out.println("m.name= "+m.getName());
		m.setName("Mango");
		m.taste();
		m.squish();
	}
	
}
