package com.exception.practicals;

public class FinallyClass {

	public static void main(String[] args) {
		try {
			TestFinally tf = new TestFinally();
			System.out.println(tf.m1());
		} catch (Exception e) {
			System.out.println("catch block..");
			e.printStackTrace();
		}
		
	}
}
