package com.collection.practicals.part1;

public class TestEqualsMethod {

	public static void main(String[] args) {
		String s1 = "Sharavya";
		String s2 = "Sharavya";
		String s3 = new String("Sharavya");
		String s4 = new String("Sharavya");
		
		System.out.println("s1==s2? "+(s1==s2)); // t
		System.out.println("s1.equals(s2)? "+s1.equals(s2)); //t
		System.out.println("s1==s3? "+(s1==s3));//f
		System.out.println("s1.equals(s3)? "+s1.equals(s3));//t
		System.out.println("s3==s4? "+(s3==s4));//f
		System.out.println("s3.equals(s4)? "+s3.equals(s4));//t
	}
}
