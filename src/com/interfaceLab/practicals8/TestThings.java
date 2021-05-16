package com.interfaceLab.practicals8;

public class TestThings {

	public static void main(String[] args)
	{
		Spanner spanner = new Spanner();
		Thing thing = spanner;
		Tool tool = spanner; 
		thing.doSomething(); // spanner method
		tool.doSomething(); // spanner method
		spanner.doSomething(); // spanner method
		PersonWithThing personWithThing = new PersonWithThing();
		Thing vehicle = new Vehicle("BENZ");
		vehicle.doSomething();
		personWithThing.testThing(spanner);
		personWithThing.testThing(vehicle);
	}
}
