package com.collection.practicals.part1;

import java.util.ArrayList;
import java.util.List;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Bullet", 100);
		Vehicle v2 = new Vehicle("Bullet", 100);
		System.out.println(v1.equals(v2));

		List al = new ArrayList();
		System.out.println(al.add(v1));
		System.out.println(al.contains(v1));
	}
}
