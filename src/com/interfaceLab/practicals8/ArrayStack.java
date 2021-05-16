package com.interfaceLab.practicals8;


/** 
class implements stack interface and uses array data structure
 */
public class ArrayStack implements Stack{

	int[] arr  = new int[10];
	int count = 0;
	
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
		int temp = arr[count-1];
		arr[count-1] = 0;
		count--;
		return temp;
	}

	@Override
	public int peek() {
			return arr[count-1];
	}

	@Override
	public void printElements() {
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]!=0)
				System.out.println(arr[i]+" ");
		}
	}

	
}
