package com.collection.practicals.part1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMapMethods {

	public static void main(String[] args) {
		Map<String,String> hs = new HashMap<String,String>();
		hs.put("Karnataka", "Bangalore");
		hs.put("Tamil nadu", "Chennai");
		hs.put("Kerala", "Thiruvananthapuram");
		
		System.out.println(hs.get("Karnataka"));
		//System.out.println(hs.remove("Kerala"));
		for (Map.Entry<String,String> entry : hs.entrySet())
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
		System.out.println(hs.keySet());
		System.out.println(hs.values());
		System.out.println(hs.containsKey("Karnataka"));
		System.out.println(hs.containsValue("Karnataka"));
		System.out.println(hs.containsValue("Bangalore"));
	}
}
