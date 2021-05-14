package com.constructors.initializers.practicals6;

public class Joke {

	private String text;
	static int count = 0;
	public void setText(String t)
	{
		if(t.equals(null) || t.equals(" "))
			System.out.println("INVALID MSG");
		else
			text = t;
	}
	public String getText()
	{
		return text;
	}
	public Joke(String text)
	{
		if(text.equals(null) || text.equals(" "))
			System.out.println("INVALID MSG FROM CONSTR");
		else
			this.text = text;
		count++;
	}
	public void print()
	{
		System.out.println("printing msg -"+text);
	}
}
