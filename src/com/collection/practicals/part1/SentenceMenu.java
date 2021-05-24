package com.collection.practicals.part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SentenceMenu {

	/* a)print how many occurrences you find of an input word in the sentence (use Collections.
			frequency() on a List where you add the words in the sentence)
			b) sort the sentence i) with duplicates ii) without duplicates and print
			c) sort the sentence using string length comparison
			d) remove all the occurrences of the word from the sentence*/
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
				
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter sentence : ");
			String sen = sc1.nextLine();
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter word: ");
			String word = sc2.next();
			
		for (String s : sen.split(" ")) {
			l.add(s);
		}
		System.out.println(Collections.frequency(l, word)); // a) output
		
		Collections.sort(l);
		String str = "";
		for (String s : l) {
			str = str + " " + s;
		}
		System.out.println("sorted sentence with duplicates: " + str); //b) output
			
		Set<String> lhs = new LinkedHashSet<String>(l);
		String str1 = "";
		for(String s:lhs)
		{
			str1 = str1+" "+s;
		} 
		System.out.println("sorted sentence without duplicates: " + str1);// c) output
		
		String temp=" ";
		for(String s:l)
		{
			if(!(s.equals(word)))
				temp= temp+" "+s;
		}
		System.out.println("After removing word in sentence: "+temp); //d) output
	}
}
