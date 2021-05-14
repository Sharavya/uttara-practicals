package com.inheritance.practicals7a;

public class TestBag {

	public static void main(String[] args)
	{
		Bag b = new Bag("WildCraft",4);
		Item i1 = new Pen("cello",25);
		Item i2 = new NoteBook("classmate",55.5);
		Item i3 = new Pen("gel",15.34);
		Item i4 = new NoteBook("shiva's",20);
		b.addItem(i1);
		b.addItem(i2);
		b.addItem(i3);
		b.addItem(i4);
		boolean v = b.searchItem("cello");
		System.out.println("---->"+v);
		double price = b.getItemPrice("classmate");
		System.out.println("price of classmate = "+price);
		double total = b.getTotal();
		System.out.println("total amount= "+total);
		Item it = b.getItem(2);
		System.out.println("item fetched = "+it.toString());
	}
}
