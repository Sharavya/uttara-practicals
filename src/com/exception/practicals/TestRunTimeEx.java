package com.exception.practicals;


public class TestRunTimeEx {

	public static void main(String[] args) {
		/****null pointer*****/
		try {
			String str = null;	
			System.out.println(str.length());
		} 
		catch (Throwable e) {
			System.out.println("NULL POINTER EXCEPTION");
			e.printStackTrace();
		}
	
	/*****ClassCast EX******/
	
		try {
			Object o = new Object();
			TestArrayOOBEx t = (TestArrayOOBEx) o;
		}
		catch (Throwable e) {
			System.out.println("CLASS CAST EXCEPTION");
			e.printStackTrace();
		}
		
		/****NumberFormat Ex****/
	
		try {
			String s = "one";
			int i = Integer.parseInt(s);
		} 
		catch (Throwable e) {
			System.out.println("NUMBER FORMAT EXCEPTION");
			e.printStackTrace();
		}
		
	}
}
