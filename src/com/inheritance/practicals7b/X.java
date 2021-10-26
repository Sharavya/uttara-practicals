package com.inheritance.practicals7b;

/*Order of execution when an object of Y is created for first time:
1) Class loading for parent.class
a) class Class object created for parent
b) all static members allocated mem and
created in class Class object
c) static field initializers executed
d) static initializers gets executed of parent
2) Class loading for child.class
a) class Class object created for child
b) all static members allocated mem and
created in class Class object
c) static field initializers executed
d) static initializers gets executed of child
3) allocates mem, creates object, creates all
instance variables of child and parent (all parent classes),
irrespective of access specifiers
4) Enter constructor. Execute first statement super() -> to reach parent
most class in class hierarchy
5) inst intializers of parent executed
6) constructor body of parent executed
7) inst initalizers of child executed
8) constructor body of child executed!*/

public class X {

	int a=10;
	static int b=15;
	static
	{
		System.out.println("in static init 1 b= "+b);
		b=25;
	}
	static
	{
		System.out.println("in static init 2 b= "+b);
		b=35;
	}
	{
		System.out.println("in inst init 1 a= "+a);
		a= 20;
	}
	{
		System.out.println("in inst init 2 a= "+a);
		a= 30;
	}
	public X()
	{
		System.out.println("a = "+a);
		a=40;
		System.out.println("b= "+b);
		b=45;
	}
}
