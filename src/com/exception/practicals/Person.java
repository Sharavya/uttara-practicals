package com.exception.practicals;

public class Person {

	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0 || age>100)
			throw new IllegalArgumentException("Is this person dead?");
		else
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.equals(null) || name.equals(" "))
			throw new IllegalArgumentException("Name is invalid");
		else
		this.name = name;
	}
	public Person(int age, String name) {
		super();
		if(age<0 || age>100)
			throw new IllegalArgumentException("s this person dead?");
		else
		this.age = age;
		if(age<0 || age>100)
			throw new IllegalArgumentException("s this person dead?");
		else
		this.name = name;
	}
	public Person()
	{
		System.out.println("non-arg constr");
	}
	
	public void dance(String s) throws DanceFailureException
	{
		if(age>50)
			System.out.println("salsa");
		else
			throw new DanceFailureException("Person above 50?");
	}
}
