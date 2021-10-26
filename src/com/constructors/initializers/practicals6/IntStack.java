package com.constructors.initializers.practicals6;

public class IntStack {

	// holds 10 ints
	//push(int)
	//pop int value
	
	int[] stack;
	static int count;
	 IntStack(int size)
	{
		stack = new int[size];
	}
	public void push(int i)
	{
		if(i>0)
		{
			stack[count] = i;
			count++;
		}
		else
			System.out.println("VALUE NOT PUSHED...");
	}
	public int pop(int pos)
	{
		return stack[pos];
	}
}
