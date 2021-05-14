package com.inheritance.practicals7b;

public class TestCroc {

	public static void main(String[] args)
	{
		Croc c = new Croc();
		c.name = "cocky";
		Fish f = new Fish();
		f.name = "fishy";
		System.out.println("f.name = "+f.name);
		c.eat(f);
		System.out.println("f.name = "+f.name);
	}
}
