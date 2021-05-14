package oop.state.behaviour.practicals3;

public class TestFish {

	public static void main(String[] args)
	{
		Fish f = new Fish();
		f.name = "gomu";
		Croc c = new Croc();
		c.name = "croccu";
		System.out.println("before eat "+f.name);
		c.eat(f);
		System.out.println("after eat "+f.name);
	}
}
