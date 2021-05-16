package com.interfaceLab.practicals8;

public class TestArrayStack {

	public static void main(String[] args)
	{
		Stack MyArrayStack = new ArrayStack();
		MyArrayStack.push(5);
		MyArrayStack.push(10);
		MyArrayStack.push(15);
		MyArrayStack.push(20);
		MyArrayStack.printElements();
		System.out.println("in peek "+MyArrayStack.peek());
		System.out.println("in pop "+MyArrayStack.pop());
		System.out.println("in peek "+MyArrayStack.peek());
		MyArrayStack.printElements();
		MyArrayStack.push(20);
		MyArrayStack.printElements();
	}
}
