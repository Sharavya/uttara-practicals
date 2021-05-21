package com.collection.practicals.part1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student("sharavya", 1, 25);
		Student s2 = new Student("pummy", 1, 25);
		Student s3 = new Student("chiri", 1, 25);
		Student s4 = new Student("sahana", 1, 25);
		Student s5 = new Student("swathi", 1, 25);
		Student s6 = new Student("sharavya", 1, 25);
		
		List<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		Iterator l = al.iterator();
		while(l.hasNext())
		{
			System.out.println("Array list..."+l.next());
		}
		
		Set<Student> hs = new HashSet<Student>();
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		hs.add(s6);
		for(Student s:hs)
		{
			System.out.println("Hashset..."+s);
		}
		
		Set<Student> lhs = new LinkedHashSet<Student>();
		lhs.add(s1);
		lhs.add(s2);
		lhs.add(s3);
		lhs.add(s4);
		lhs.add(s5);
		lhs.add(s6);
		for(Student s:lhs)
		{
			System.out.println("Linked Hashset..."+s);
		}
		
		Set<Student> ts = new TreeSet<Student>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		for(Student s:ts)
		{
			System.out.println("tress set..."+s);
		}
		}
}
