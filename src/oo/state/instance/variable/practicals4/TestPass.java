package oo.state.instance.variable.practicals4;

public class TestPass {

	public static void main(String[] args)
	{
		Croc c = new Croc();
		Fish f = new Fish();
		c.name = "cocky";
		f.name = "fishy";
		c.eat(f);
		System.out.println("fish name -"+f.name);
		c.eat(f);
		System.out.println("fish name -"+f.name);
		c.eat(f);
	}
}
