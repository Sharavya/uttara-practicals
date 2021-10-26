package com.constructors.initializers.practicals6;

public class WrapperClass {

	public static void main(String[] args)
	{
		int i=10;
		Integer obj1 = new Integer(i);
		int j = obj1.intValue();
		System.out.println(j);
		double d = 12.34;
		Double objd = new Double(d);
		double k = objd.doubleValue();
		System.out.println(k);
		boolean b = true;
		Boolean objb = new Boolean(b);
		boolean c = objb.booleanValue();
		System.out.println(c);
	}
}
