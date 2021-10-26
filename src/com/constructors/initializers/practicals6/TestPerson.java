package com.constructors.initializers.practicals6;

public class TestPerson {

	public static void main(String[] args)
	{
		Person p1 = new Person();
		/*p1.setName(null);
		p1.setAge(25);
		System.out.println("name of person "+p1.getName()+" of age "+p1.getAge());
		Person p2 = new Person("ramu",10);*/
		System.out.println(p1.count);
		for(int i=0;i<100;i++)
		{
			Person pi = new Person();
		}
		System.out.println(p1.count);
	}
}
