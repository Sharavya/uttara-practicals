package com.exception.practicals;

public class TestArrayOOBEx {
	/*Write a main() method program to generate and catch an
	ArrayIndexOutOfBoundsException. Test it without try catch. Code try..catch to catch this
	exception and print the stack trace. First have specific catch
	ArrayIndexOutOfBoundsException. Also have a SOP outside the try..catch.Is this
	executed? How come? Then replace the catch parameter to RuntimeException and see if
	the code still works. Change it to Exception and Throwable as well and see if it works. If
	the stack trace is printed when you do not have try..catch at all, why do we need try catch
	then?*/
	
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] =i+1;
		}
		try {
			
			System.out.println(arr[11]);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("after catch block...");	
	}
}
