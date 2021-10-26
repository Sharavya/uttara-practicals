package com.arrays.strings.part1.practicals5;

public class Person {

	private String name;
	private int age;
	private String[] petNames = new String[20];
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String[] getPetNames() {
		return petNames;
	}
	public void setPetNames(String[] petNames) {
		this.petNames = petNames;
	}
	
	public void dance()
	{
		if(age<25)
			System.out.println("chacha");
		else
			System.out.println("waltz");
	}
	public void sing()
	{
		String song="";
		for(int i=0;i<petNames.length;i++)
		{
			int pos = (int)(Math.random()*20);
			song = song+petNames[pos];
		}
		System.out.println(song);
	}
}
