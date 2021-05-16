package com.interfaceLab.practicals8;

public class ArrayStack implements Stack{

	int[] arr  = new int[10];
	int count;
	
	@Override
	public void push(int element) {
		if(count<arr.length)
		{
			arr[count] = element;
			count++;
		}	
	}

	@Override
	public int pop() {
		int temp = arr[count];
		arr[count] = 0;
		count--;
		return temp;
	}

	@Override
	public int peek() {
			return arr[count];
	}

	@Override
	public void printElements() {
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]!=0)
				System.out.println(arr[i]+" ");
		}
		System.out.println();
	}

	
}
