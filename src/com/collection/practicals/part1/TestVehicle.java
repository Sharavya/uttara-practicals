package com.collection.practicals.part1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Bullet", 100);
		Vehicle v2 = new Vehicle("Bullet", 100);
		Vehicle v3 = new Vehicle("Duke",200);
		Vehicle v4 = new Vehicle("R15",250);
		System.out.println(v1.equals(v2));

		List al = new ArrayList();
		System.out.println(al.add(v1));
		System.out.println(al.contains(v1));
		
		Set hs1 = new HashSet();
		System.out.println(hs1.add(v1));
		System.out.println(hs1.add(v2));
		
		Set ts = new TreeSet();
		ts.add(v1);
		ts.add(v2);
		ts.add(v3);
		ts.add(v4);
		Iterator iterator = ts.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next()+",");
		}
		System.out.println();
		
		int i = v1.compareTo(v2);
		if(i>0)
		System.out.println(ts.add(v1));
		else
		System.out.println(ts.add(v2));
		
	}
}
