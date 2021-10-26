package com.constructors.initializers.practicals6;

public class ReverseCaseOfString {

	public static void main(String[] args)
	{
		String str = "aBc%12x";
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			char c = ch[i];
			if(Character.isUpperCase(c))
			{
				ch[i] = Character.toLowerCase(c);
			}
			else if(Character.isLowerCase(c))
			{
				ch[i] = Character.toUpperCase(c);
			}
		}
		System.out.println(new String(ch));
	}
}
