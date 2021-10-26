package com.arrays.strings.part1.practicals5;

public class TestStringMethods {

	public static void main(String[] args)
	{
		/*String s = "Sharavya";
		String str = "arav";
		System.out.println("length="+s.length());
		for(int i=0;i<s.length();i++)
		{
			System.out.print(" "+s.charAt(i));
		}
		char[] c = s.toCharArray();
		System.out.println(c);
		System.out.println("upper case "+s.toUpperCase());
		System.out.println(s.contains(str));*/
		swapStrings("sharavya","patil");
		palindromeOfString("amma");
		numberOfOccurence("ramaramramre","ra");
		allSubStrings();
	}
	
	public static void palindromeOfString(String s)
	{
		String rev="";
		for(int i=1;i<=s.length();i++)
		{
			rev = rev+s.charAt(s.length()-i);
		}
		if(rev.equals(s))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}

	public static char[] uniqueChars(String s) {
		String result = "";
		char[] c = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			if (!result.contains(String.valueOf(s.charAt(i)))) {
				result = result + String.valueOf(s.charAt(i));
				c = result.toCharArray();
			}
		}
		return c;
	}
	public static void swapStrings(String s1,String s2)
	{
		System.out.println("before swap "+"s1= "+s1+"  s2= "+s2);
		s1 = s1+s2;
		s2 = s1.substring(0,s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("after swap "+"s1= "+s1+"  s2= "+s2);
	}
	public static void numberOfOccurence(String s1,String s2)
	{
		//search using indexOf in s1
		// in loop search and increase the index value
		int pos = s1.indexOf(s2);
		int count = 0;
		while(pos>=0&& pos<s1.length())
		{
			pos++;
			pos = s1.indexOf(s2,pos);
			count++;
		}
		System.out.println(count);	
	}
	public static void allSubStrings()
	{
		String s="abcd";
		int len = s.length();
		for(int i=0;i<=len;i++) {
			for(int j=i+1;j<=len;j++)
			{
				String x = s.substring(i,j);
				System.out.println(x);
			}
		}
	}
}
