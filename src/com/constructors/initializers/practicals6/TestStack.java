package com.constructors.initializers.practicals6;

public class TestStack {

	public static void main(String[] args)
	{
		IntStack i = new IntStack(10);
		i.push(10);
		i.push(20);
		i.push(-30);
		System.out.println(i.pop(0));
		System.out.println(i.pop(2));
	}
}
