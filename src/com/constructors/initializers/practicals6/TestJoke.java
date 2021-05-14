package com.constructors.initializers.practicals6;

public class TestJoke {

	public static void main(String[] args)
	{
		System.out.println("count ="+Joke.count);
		Joke j1 = new Joke("i love cricket");
		j1.print();
		System.out.println("count = "+Joke.count);
		Joke j2 = new Joke("hello there...");
		System.out.println("count = "+Joke.count);
	}
}
