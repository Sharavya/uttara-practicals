package oop.state.behaviour.practicals3;

public class TestSuperDuck {

	public static void main(String[] args)
	{
		SuperDuck s = new SuperDuck();
		s.setSize(-5);
		//s.setName("Jaanu");
		s.dance();
		s.setSize(1);
		s.setName(null);
		s.dance();
	}
}
