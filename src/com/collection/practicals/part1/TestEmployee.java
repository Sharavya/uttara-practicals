package com.collection.practicals.part1;

import java.util.Date;

public class TestEmployee {

	public static void main(String[] args) {
		Address a1=new Address("banglore","xyz","12345","ffff");
		Address a2=new Address("banglore","xyz","12345","ffff");
		Date d1=new Date();
		Employee e1=new Employee("arun","lokichalapthy@gmail.com", d1,a1,a2);
		Employee e2=new Employee("arun","lokichalapthy@gmail.com", d1,a1,a2);
		System.out.println("the equals of adress"+"..............>"+a1.equals(a2));
		System.out.println("the equals of employee"+".............>"+e1.equals(e2));
	}
}
