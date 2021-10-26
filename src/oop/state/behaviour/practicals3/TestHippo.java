package oop.state.behaviour.practicals3;

public class TestHippo {

	public static void main(String[] args)
	{
		Hippo h1, h2;
		h1 = new Hippo();
		System.out.println("hippo size ="+h1.size);
		h1.size = 5;
		System.out.println("hippo size after initialising "+h1.size);
		
		h2 = new Hippo();
		h1.sing();
		h2.sing(); // how will jvm keeps track of method calling?
		
		h2 = h1;
		h2.size = 10;
		System.out.println("h1.size = "+h1.size);
		System.out.println("h2.size = "+h2.size);
		
		h1.sing();
		h2.sing();
		
		h1 = null;
		h2 = h1;
		h1.sing();
	}
}
