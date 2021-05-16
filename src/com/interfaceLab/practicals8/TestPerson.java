package com.interfaceLab.practicals8;

public class TestPerson {

	public static void main(String[] args)
	{
		Person p = new Person("Sharavya",25);
		System.out.println("p.name ="+p.name);
		System.out.println("p.age= "+p.age);
		/*p.age = 21; ----> cannot change value of final var*/
	}
}
