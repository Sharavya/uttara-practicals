package com.interfaceLab.practicals8;

public class StrImpl2 implements StringReverser{

	@Override
	public String reverseString(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		 return sb.toString();
	}

	
}
