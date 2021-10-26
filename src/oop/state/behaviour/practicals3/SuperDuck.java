package oop.state.behaviour.practicals3;

public class SuperDuck {

	private int size;
	private String name;
	
	public void setSize(int s)
	{
		if(s>0 && s<20)
			size = s;
		else
			System.out.println("invalid size... privide proper size!");
	}
	public int getSize()
	{
		return size;
	}
	
	public void setName(String n)
	{
		if(n!=null)
			name = n;
		else
			System.out.println("name is null...");
	}
	public String getName()
	{
		return name;
	}
	
	public void dance()
	{
		if(size!=0 && name !=null)
		{
			if(size<10)
				System.out.println("duck with name "+name+" is dancing cha.. cha...");
			else
				System.out.println("duck with name "+name+" is dancing bharatanatya...");
		}
		else
			System.out.println("provide correct values to size and name then call dance");
	}
}
