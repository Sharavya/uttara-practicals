package oo.state.instance.variable.practicals4;

public class TestCow {

	public static void main(String[] args)
	{
		Cow c1 = new Cow();
		Cow c2 ;
		c1.name = "gowri";
		c1.moo();
		c2 = c1;
		c2.name = "gange";
		c2.moo();
	}
}
