package com.collection.practicals.part1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class SortSentence {

	public static void main(String[] args) {
		String str = "my name is sharavya";
		String[] arr = str.split(" ");
		System.out.println(arrayListSort(arr));
		System.out.println(treeSetSort(arr));
		System.out.println(defaultArraySort(arr));
	}
	public static String arrayListSort(String[] arr)
	{
		List<String> l = Arrays.asList(arr);
		Collections.sort(l);
		StringBuilder sb = new StringBuilder();
		for(String str:l)
		{
			sb.append(str+" ");
		}
		return sb.toString();
	}
	public static String treeSetSort(String[] arr)
	{
		Set<String> ts = new TreeSet<String>();
		for(String s:arr)
		{
			ts.add(s);
		}
		StringBuilder sb = new StringBuilder();
		for(String str:ts)
		{
			sb.append(str+" ");
		}
		return sb.toString();
	}
	public static String defaultArraySort(String[] arr)
	{
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		for(String str:arr)
		{
			sb.append(str+" ");
		}
		return sb.toString();
	}
}
