package com.interfaceLab.practicals8;

public interface Pet {

	 void play();
	public static void eat()
	{
		System.out.println("I am eating...");
	}
	/*public Pet()
	{
		 // C.E ****No constructor in INTERFACE****
	}*/
	/*public final void sleep()
	{
		 // C.E ******No final method in INTERFACE*****
	}*/
	int X = 10;
	String NAME = "Sharavya";
	
	/*NOTE: * instance variables are by default static final
		  * instance variables are abstract methods
		  * only static methods
		  * can create reference of interface and point to subclass
		  * subclass must override abstract methods
		  * can't create object of interface
		  * can't have constructors
		  */
}
