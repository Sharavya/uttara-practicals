package com.constructors.initializers.practicals6;

public class Person{
	
	private String name;
	private int age;
	static int count=0;
	
	public void setName(String n)
	{
		if(n!=null && n!="" && n.length()<30)
			name = n;
		else
			System.out.println("name is INVALID");
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int a)
	{
		if(a>0&& a<100)
			age = a;
		else
			System.out.println("age is INVALID");
	}
	public int getAge()
	{
		return age;
	}
	public Person()
	{
		count++;
		System.out.println("non-arg constr calling....");
	}
	public Person(String name)
	{
		if(name.equals(null) || name.equals(""))
		{
			System.out.println("enter valid name");
		}
		else {
			System.out.println("name arg constr calling...");
		}
		this.name = name;
		count++;
	}
	public Person(String name, int age)
	{
		this(name);
		if((name.equals(null) || name.equals("")) && ((age<=0 || age>100)) )
		{
			System.out.println("enter valid input");
		}
		else {
			System.out.println("name & age arg constr calling...");
		}
		this.name = name;
		this.age = age;
		count++;
	}
}