package oop.state.behaviour.practicals3;

public class TestDog {

	public static void main(String[] args)
	{
		Dog d = new Dog();
		d.age = 10;
		d.bark();
		d.age = 5;
		d.bark();
	}
}
