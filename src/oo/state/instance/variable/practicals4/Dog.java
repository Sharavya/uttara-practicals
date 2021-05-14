package oo.state.instance.variable.practicals4;

public class Dog {

	String name;
	private int size;
	public void setSize(int s)
	{
		if(s<0)
			System.out.println("invalid size");
		else
			size = s;
	}
	public int getSize()
	{
		return size;
	}
	
	public void bark()
	{
		if(size>10)
			System.out.println("Meow Meow");
		else
		{
			for(int i=1;i<=size;i++)
			{
				System.out.println("bow bow");
			}
		}
	}
}
