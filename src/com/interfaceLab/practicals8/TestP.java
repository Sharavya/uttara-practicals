package com.interfaceLab.practicals8;

public class TestP {

	public static void main(String[] args)
	{
		Q q = new Q("Sharavya");
		System.out.println("q.name= "+q.name);
		P p = q;
		System.out.println("p.name= "+p.name);
		q.print();
		p.print();
		// NOTE: *always parent state is accessed
		// * static variables depends on ref
	}
}
