package com.inheritance.practicals7a;

public class Person {

	private String name;
	private String[] petName = new String[20];
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getPetName() {
		return petName;
	}
	public void setPetName(String[] petName) {
		this.petName = petName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	int count = 0;
	
	public void dance()
	{
		if(age<25)
		System.out.println("i am dancing...chacha..");
		else
			System.out.println("i am dancing...waltz..");
	}
	public void sing()
	{
		String song = "";
		for(int i=0;i<petName.length;i++)
		{
			int n = (int) (20*Math.random());
			song = song+petName[n];
		}
		System.out.println(song);
	}
	public void addPetName(String n)
	{
		if(count<petName.length)
		{
			petName[count++] = n;
		}
		else
			System.out.println("INVALID PETNAME");
	}
	public boolean searchPetName(String n)
	{
		for(String s:petName)
		{
			if(s.equals(n))
				return true;
		}
		return false;
	}
}
