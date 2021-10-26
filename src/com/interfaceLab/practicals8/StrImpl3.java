package com.interfaceLab.practicals8;

public class StrImpl3 implements StringReverser{

	@Override
	public String reverseString(String str) {
		String temp = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			temp = temp+str.charAt(i);
		}
		return temp;
	}

}
