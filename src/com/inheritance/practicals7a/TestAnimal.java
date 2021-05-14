package com.inheritance.practicals7a;

public class TestAnimal {

	public static void main(String[] args)
	{
		Animal a = new Animal();
		a.setNAme("Ugram");
		Croc c = new Croc();
		Hippo h = new Hippo();
		Vet v = new Vet();
		v.treat(c);
		v.treat(h);
		v.treat(a);
	}
}
