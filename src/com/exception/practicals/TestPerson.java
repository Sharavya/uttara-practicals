package com.exception.practicals;

public class TestPerson {

	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(1);
		p.setName("h");
		try {
			p.dance("hi");
		} catch (DanceFailureException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
