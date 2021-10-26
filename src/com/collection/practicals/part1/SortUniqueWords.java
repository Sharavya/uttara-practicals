package com.collection.practicals.part1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortUniqueWords {

	public static void main(String[] args) {
		String str = "today is very good day and your looking good today";
		String[] arr = str.split(" ");
		System.out.println(addMethod(arr, new HashSet<String>()));
		System.out.println(addMethod(arr,new LinkedHashSet<String>()));
		System.out.println(addMethod(arr,new TreeSet<String>()));
	}
	public static String addMethod(String[] arr,Set<String> hs)
	{
		for(String s:arr)
		{
			hs.add(s);
		}
		return hs.toString();
	}
}
