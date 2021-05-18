package com.collection.practicals.part1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestCollectionMethods {

	public static void main(String[] args) {
		
		List<String> colours = new ArrayList<String>();
		
		colours.add("Lavender"); //add
		colours.add("Sky Blue");
		colours.add("white");
		colours.add("Red");
		colours.add("Orange");
		System.out.println(colours);
		colours.add("Red");
		colours.add("Sky Blue");
		System.out.println(colours);
		
		String s = new String("Lavender");
		colours.add(s);
		System.out.println(colours);
		System.out.println(colours.contains(s));
		
		List favColours = new ArrayList<String>();
		favColours.addAll(colours);
		System.out.println(favColours);
		favColours.removeAll(colours);
		System.out.println(favColours);
		//Collections.sort(colours);
		System.out.println(colours);
		favColours.clear();
		System.out.println(favColours);
		System.out.println(favColours.isEmpty());
		
		List s1 = new ArrayList();
		s1.add("a");
		s1.add("b");
		s1.add("ab");
		s1.add("ac");
		s1.add("ad");
		System.out.println("s1 after adding items.."+s1);
		List s2 = new ArrayList();
		s2.addAll(s1);
		s2.add("cd");
		s2.add("nx");
		System.out.println("s2 after adding items.."+s2);
		s2.retainAll(s1);
		System.out.println("s2 after retaining-->"+s2);
		
		//Iterating contents
		
		for(String col:colours)
		{
			System.out.println(col);
		}
		
		//Hash set
		Set set = new HashSet();
		set.add("allu");
		set.add("mullu");
		set.add("sullu");
		set.add("kallu");
		set.add("allu");
		System.out.println("contents of set as it doesn't allow duplicates.."+set);
		
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		c1.add("Mango");
		c1.add("Mango");
		c1.add("Orange");
		c1.add("Pineapple");
		c1.add("Grapes");
		System.out.println("contents of c1.."+c1);
		c2.addAll(c1);
		System.out.println("contents of c2.."+c2);
		c2.retainAll(c1);
		System.out.println("after retaining.."+c2);
		c2.removeAll(c1);
		System.out.println("after removing.."+c2);
	}
}
