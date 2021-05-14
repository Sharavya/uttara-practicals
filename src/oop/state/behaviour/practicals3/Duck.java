package oop.state.behaviour.practicals3;

public class Duck {

	int size;
	String name;
	public void dance()
	{
		if (size < 10)
			System.out.println("Duck with name "+name+" doing cha cha...");
		else
			System.out.println("Duck with name "+name+" doing bharatnatya");
	}

}

