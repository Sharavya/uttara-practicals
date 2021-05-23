package com.collection.practicals.part1;

import java.util.Set;
import java.util.TreeSet;

public class TestTree {

	public static void main(String[] args) {
	
		Set ts = new TreeSet<String>();
		ts.add("apple");
		ts.add("ramanna");
		ts.add("ramanuja");
		ts.add("rameshwara");
		ts.add("eshwara");
		ts.add("someshwaraa");
		ts.add("orenge");
		ts.add("grapes");
		ts.add("banana");
		ts.add("mango");
		System.out.println("tree set sorted..."+ts);
		
		StringLengthComparator slc = new StringLengthComparator();
		
		Set ts1 = new TreeSet(slc);
		ts1.add("apple");
		ts1.add("ramanna");
		ts1.add("ramanuja");
		ts1.add("rameshwara");
		ts1.add("eshwara");
		ts1.add("someshwaraa");
		ts1.add("orenge");
		ts1.add("grapes");
		ts1.add("banana");
		ts1.add("mango");
		System.out.println("sorted ts2.."+ts1);
	}
}
 