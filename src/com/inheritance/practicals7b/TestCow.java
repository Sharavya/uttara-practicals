package com.inheritance.practicals7b;

public class TestCow {

	public static void main(String[] args)
	{
		Cow c1 = new Cow();
		c1.name = "gange";
		c1.moo();
		Cow c2 = c1;
		c2.name = "tunge";
		c1.moo();
	}
}
