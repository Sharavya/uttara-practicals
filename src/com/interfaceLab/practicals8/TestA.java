package com.interfaceLab.practicals8;

public class TestA {

	public static void main(String[] args)
	{
		A a = new A(10);
		/*a.p = 20;           ---> cannot  change value of final variable*/
		System.out.println("a.p= "+a.p);  // accessing final var 
		System.out.println("A.R= "+A.R);  // accessing static final var directly
	}
}
