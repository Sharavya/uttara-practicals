package oo.state.instance.variable.practicals4;

public class Croc {

	String name;
	
	public void eat(Fish fi)
	{
		System.out.println("croc name "+name+" eating fish "+fi.name);
		//fi = new Fish();
		fi.name = "flippy";
		//fi.name = null;
	}
}
