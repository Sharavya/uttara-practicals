package com.collection.practicals.part1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab2qest1 {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("adc");
		String s4 = new String("adc");

		System.out.println("s1==s2? " + (s1 == s2));
		System.out.println("s1.equals(s2)? " + s1.equals(s2));
		System.out.println("s3==s4? " + (s3 == s4));
		System.out.println("s3.equals(s4)? " + s3.equals(s4));

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());

		Set hs1 = new HashSet();
		System.out.println(hs1.add(s1));
		System.out.println(hs1.add(s2));
		System.out.println(hs1);

		Set ts1 = new TreeSet();
		System.out.println(ts1.add(s3));
		System.out.println(ts1.add(s4));
		System.out.println(ts1.add(s1));
		System.out.println(ts1.add(s2));

		Set<String> hs2 = new HashSet<String>();
		hs2.add("ramanna");
		hs2.add("ramanuja");
		hs2.add("rameshwara");
		hs2.add("eshwara");
		hs2.add("someshwaraa");
		hs2.add("marirama");

		for (String s : hs2) {
			if (s.contains("rama"))
				System.out.println("printing values that has rama.." + s);
		}

	}

}
