package com.inheritance.practicals7a;

public class TestPerson {

	public static void main(String[] args)
	{
		Person p1 = new Person();
		String[] s = {"raja","raju","ranna","manna","hunna","junna","raju","ranna","manna","hunna","junna","kanna","lanna","loki","jam","chala","chandu","vikky","aru","chatu"};
		p1.setAge(25);
		p1.setPetName(s);
		p1.sing();
		p1.dance();	
	}
}
