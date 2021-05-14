package oo.state.instance.variable.practicals4;

public class Car {

	String name;
	int fuelQty;
	boolean isStarted;
	
	public void start()
	{
		if(fuelQty>0)
			isStarted = true;
	}
	public void drive()
	{
		if(isStarted)
			if(fuelQty>0)
				fuelQty--;
		if(fuelQty==0)
			stop();
	}
	public void stop()
	{
		isStarted = false;
	}
}
