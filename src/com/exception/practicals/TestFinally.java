package com.exception.practicals;

public class TestFinally {

	public int m1() {
		int x = 10;
		try {
			System.out.println("in m1() x=" + x);
			return ++x;
		} 
		catch (Exception e) {
			System.out.println("in catch of m1() " + e.getMessage());
			return ++x;
		} 
		finally {
			System.out.println("in finally() of m1() x = " + x);
			//return ++x; never have return in finally block, jvm forgets exception in
			//try block and executes finally and progm never executes any exception
		}
	}
}
