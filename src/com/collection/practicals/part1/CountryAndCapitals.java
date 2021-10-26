package com.collection.practicals.part1;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CountryAndCapitals {

	Map<String, String> hm = new LinkedHashMap<String, String>();
	
	
	public void addCountryAndCapital(String country, String capital) {
		hm.put(country, capital);
	}
	public void getCaptical(String country)
	{
		System.out.println("Captical is: "+hm.get(country));
	}
	
	public void printMap()
	{
		for(Map.Entry<String, String> entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+"- "+entry.getValue());
		}
	}
	public void sortBasedOnCountry()
	{
		for(Map.Entry<String, String> entry:new TreeMap<String,String>(hm).entrySet())
		{
			System.out.println(entry.getKey()+"- "+entry.getValue());
		}
	}
	public void sortBasedOnValue()
	{
		List<Map.Entry<String,String>> list = new LinkedList<Map.Entry<String, String>>(hm.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<String,String>>() {

			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				return o1.getValue().compareTo(o2.getValue());	 
			}
			
		});
		System.out.println(list);
		
	}
}