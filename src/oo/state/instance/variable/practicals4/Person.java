package oo.state.instance.variable.practicals4;

public class Person {

	int age;
	String name;
	
	public void eat()
	{
		if(age<40)
			System.out.println("person eats less");
		else
			System.out.println("person eats more");
	}
	public void sleep()
	{
		if(age<40)
			System.out.println("person sleeps more");
		else
			System.out.println("person sleeps less");
	}
}
