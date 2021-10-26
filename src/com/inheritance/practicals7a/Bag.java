package com.inheritance.practicals7a;

public class Bag {

	String name;
	Item[] items;
	int count = 0;
	
	public Bag(String n,int size)
	{
		name = n;
		items = new Item[size];
	}
	public void addItem(Item it)
	{
		items[count] = it;
		count++;
	}
	public boolean searchItem(String n)
	{
		boolean b = false;
		for(Item h:items)
		{
			if(h.name.equals(n))
				{
				b=true;
				break;
				}
			else
				b=false;
		}
		if(b)
		{
			return true;
		}
		else
			return false;
	}
	public double getItemPrice(String n)
	{
		double hold=0.0;
		for(Item h:items)
		{
			if(h.name.equals(n))
			{
				hold = h.price;
			}
		}
		return hold;
	}
	public double getTotal()
	{
		double sum=0.0;
		for(Item h:items)
		{
			sum = sum+h.price;
		}
		return sum;
	}
	public Item getItem(int pos)
	{
		return items[pos];
	}
}
