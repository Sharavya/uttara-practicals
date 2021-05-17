package com.collection.practicals.part1;

public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person("Ramu",20);
		Person p2 = new Person("Ramu",20);
		System.out.println("p1==p2? "+(p1==p2));
		System.out.println("p1.equals(p2)? "+p1.equals(p2));
		System.out.println(p1);
		System.out.println(p2);
	}
}
