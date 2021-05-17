package com.collection.practicals.part1;

public class Person {

	String name;
	int height;
	
	public Person(String name,int height)
	{
		super();
		this.name = name;
		this.height = height;
	}
	public boolean equals(Object o)
	{
		if(o instanceof Person)
		{
			Person p = (Person) o;
			if(this.name.equals(p.name) && this.height == p.height)
				return true;
			else 
				return false;
		}
		else
			throw new IllegalArgumentException("Pass only Person");
	}
	public String toString()
	{
		return "Person[name="+name+",height="+height+"]";
	}
}
