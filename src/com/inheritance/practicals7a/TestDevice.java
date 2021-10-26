package com.inheritance.practicals7a;

public class TestDevice {

	public static void main(String[] args)
	{
		Electrician e = new Electrician();
		Tv t = new Tv();
		Printer p = new Printer();
		MicroWave mv = new MicroWave();
		e.Test(t);
		e.Test(p);
		e.Test(mv);
	}
}
