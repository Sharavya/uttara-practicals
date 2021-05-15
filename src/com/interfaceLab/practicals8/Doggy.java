package com.interfaceLab.practicals8;

public class Doggy implements Pet{

	public void bark()
	{
		System.out.println("Bow...Bow....");
	}

	@Override
	public void play() {
		System.out.println("I am playing with ball....");
	}
	
}
