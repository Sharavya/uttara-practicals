package oop.state.behaviour.practicals3;

public class Croc {

	String name;
	
	public void eat(Fish fi)
	{
		System.out.println("croc of name "+name+" eating fish "+fi.name);
		fi.shout();
		System.out.println();
		fi.name="somu";
	}
}
