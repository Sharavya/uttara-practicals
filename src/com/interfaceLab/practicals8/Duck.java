package com.interfaceLab.practicals8;

public class Duck {

	int size;
	static int count;
	public Duck(int size)
	{
		this.size = size;
		count++;
	}
	
	public void swim()
	{
		if(size == 5)
			System.out.println("swimming slow");
		else if(size==10)
			System.out.println("swimming slowest");
		else if(size==15)
			System.out.println("swimming fastest");
		else
			System.out.println("INVALID SIZE");
	}
}
