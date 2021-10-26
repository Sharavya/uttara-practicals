package com.interfaceLab.practicals8;

public class StrImpl1 implements StringReverser{

	@Override
	public String reverseString(String str) {
		char[] ch = str.toCharArray();
		String temp="";
		for(int i=ch.length-1;i>=0;i--)
		{
			temp = temp+ch[i];
		}
		return temp;
	}

	
}
