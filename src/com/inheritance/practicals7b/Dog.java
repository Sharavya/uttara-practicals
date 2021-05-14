package com.inheritance.practicals7b;

public class Dog {

	private String name;
	private int size;
	
	public void setName(String n)
	{
		if(n.equals(null) || n.equals(""))
			System.out.println("INVALID NAME");
		else
			name = n;
	}
	public String getName()
	{
		return name;
	}
	public void setSize(int s)
	{
		if(s>0)
			size = s;
		else
			System.out.println("INVALID SIZE");
	}
	
	public void bark()
	{
		if(size>10)
			System.out.println("meow..meow...");
		else
			for(int i=1;i<=size;i++)
			{
				System.out.println("bow.. bow.."+name);
			}
	}
}
