package com.interfaceLab.practicals8;

public class PersonWithThing {

	public void testThing(Thing thing) // Polymorphic method which tests any thing
	{
		System.out.println("testing..."); 
		thing.doSomething();
	}
}
