package com.constructors.initializers.practicals6;

public class StringMethodTest {

	public static void main(String[] args)
	{
		String str = "blah";
		str.toUpperCase();
		System.out.println(str);
		String s = " blah ";
		System.out.println(s.trim());
		System.out.println(s.length());
		printUnicode("abc");
	}
	public static void printUnicode(String s)
	{
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.print((int)ch[i]+".");
		}
	}
}
