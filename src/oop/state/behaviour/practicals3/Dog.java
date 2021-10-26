package oop.state.behaviour.practicals3;

public class Dog {

	 int age;
	 String name;
	
	public void bark()
	{
		if(age<7)
		{
			for(int i = 1;i<=age;i++)
				System.out.println("bow bow "+i);
		}
		else
			for(int i = 1;i<=age;i++)
				System.out.println("meow meow "+i);
	}
}
