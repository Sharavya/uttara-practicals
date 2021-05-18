package com.collection.practicals.part1;

import java.util.ArrayList;
import java.util.List;

public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person("Ramu",20);
		Person p2 = new Person("Ramu",20);
		Person p3 = new Person("Arun",30);
		Person p4 = new Person("Pinky",50);
		System.out.println("p1==p2? "+(p1==p2));
		System.out.println("p1.equals(p2)? "+p1.equals(p2));
		System.out.println(p1);
		System.out.println(p2);
		
		List l = new ArrayList();
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
		System.out.println("searching p3? "+l.contains(p3));
		System.out.println("Removing p3? "+l.remove(p3));
		System.out.println("searching p3? "+l.contains(p3));
	}
}
