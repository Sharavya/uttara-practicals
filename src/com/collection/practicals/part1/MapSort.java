package com.collection.practicals.part1;

import java.util.HashMap;
import java.util.Map;

public class MapSort {

	public static void main(String[] args) {
		Map<String,Integer> hs = new HashMap<String,Integer>();
		String str = "my my fav colour colour is is is is blue blue";
		for(String s:str.split(" "))
		{
			if(hs.get(s)==null)
				hs.put(s, 1);
			else
				hs.put(s, hs.get(s)+1);
		}
		for(Map.Entry<String, Integer> entry:hs.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
