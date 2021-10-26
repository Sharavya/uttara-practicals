package com.inheritance.practicals7a;

public class Electrician {

	public void Test(Device d)
	{
		d.doSomething();
		if(d instanceof Tv)
		{
			Tv tv = (Tv)d;
			tv.switchChannel();
		}
	}
}
