package com.inheritance.practicals7b;

public class Car {

	boolean isStarted = false;
	String name;
	int fuelQty;
	
	public void start()
	{
		if(fuelQty>0)
			isStarted = true;
	}
	public void drive()
	{
		if(isStarted)
		{
			if(fuelQty>0)
				fuelQty--;
			if(fuelQty==0)
				stop();
		}
	}
	public void stop()
	{
		isStarted = false;
	}
	public void reverse()
	{
		if(isStarted)
		{
			if(fuelQty>0)
				fuelQty--;
			if(fuelQty==0)
				stop();
		}
	}
}
