package com.collection.practicals.part1;

public class Vehicle {

	String name;
	int engineCapacity;
	public Vehicle(String name, int engineCapacity) {
		super();
		this.name = name;
		this.engineCapacity = engineCapacity;
	}

	public boolean equals(Object o) {
		if (o instanceof Vehicle) {
			Vehicle v = (Vehicle) o;
			if (this.name.equals(v.name) && this.engineCapacity == v.engineCapacity)
				return true;
			else
				return false;
		} else
			throw new IllegalArgumentException("Pass only vehicle");
	}
	
	public int hashCode()
	{
		return (this.name.toString()+this.engineCapacity).hashCode();
	}

}
