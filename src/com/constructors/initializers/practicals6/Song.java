package com.constructors.initializers.practicals6;

public class Song {

	private String name;
	private String lyrics;
	public void setName(String n)
	{
		if(n.equals(null) || n.equals(""))
		{
			System.out.println("enter valid name");
		}
		else
			name = n;
	}
	public String getName()
	{
		return name;
	}
	public void setLyrics(String ly)
	{
		if(ly.equals(null) || ly.equals(""))
		{
			System.out.println("enter valid lyrics");
		}
		else
			lyrics = ly;
	}
	public void play()
	{
		System.out.println("my name is "+name+" singing "+lyrics);
	}
	public Song(String name,String lyrics)
	{
		System.out.println("param constr...");
		this.name = name;
		this.lyrics = lyrics;
	}
	public Song(String name)
	{
		this.name = name;
	}
}
