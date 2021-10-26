package com.exception.practicals;
/*3) Create an Animal class (empty body) and a subclass called Pig (empty body). Create a
class called TextEx with a method m1(). In m1(), put an SOP(“m1()") and invoke m2() of
same class. In m2(), invoke m3() as shown:
Code m3() like this:
public static void m3(Animal a)
{
SOP(“in m3()”);
Pig p = (Pig) a;
}
public static void m2()
{
SOP(“in m2()”);
Animal a = new Animal();
m3(a);
Pig p = new Pig();
m3(p);
}
public static void m1()
{
SOP(“in m1()”);
m2();
}
In main(), invoke m1(). Embed in try..catch, print ST. Identify bad code and fix it!*/

public class TestEx {

	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void m1()
	{
		System.out.println("in m1()");
		m2();
	}
	public static void m2()
	{
		System.out.println("in m2()");
		Animal a = new Animal();
		m3(a);
		Pig p = new Pig();
		m3(p);
	}
	public static void m3(Animal a)
	{
		System.out.println("m3()");
		if(a instanceof Pig)
		{
			Pig p = (Pig) a;
		}
	}
}
