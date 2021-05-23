package com.collection.practicals.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Menu {

	/*Add a friend name
	b) List the friend names
	c) Remove a friend name
	d) Search for friend names given a part string
	e) Sort the friend names based on i) alphabetical ii) lengthwise*/
	
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		
		while(true)
		{
			System.out.println("1: Add a friend");
			System.out.println("2: List the friend names");
			System.out.println("3: Remove a friend name");
			System.out.println("4: Search for friend names given a part string");
			System.out.println("5: Sort the friend names based on alphabetical");
			System.out.println("6: Sort the friend names based on lengthwise");
			Scanner sc1 = new Scanner(System.in);
			String input = sc1.next();
			
			switch (input) {
			case "1":
				System.out.println("Please enter friend name: ");
				Scanner nameScanner = new Scanner(System.in);
				l.add(nameScanner.next());
				break;
			case "2":
				System.out.println("Printing friend");
				System.out.println(Arrays.asList(l.toArray()));
				break;
			case "3":
				System.out.println("Enter name to delete");
				Scanner deleteName = new Scanner(System.in);
				l.remove(deleteName.next());
				System.out.println("Successfully deleted..");
				break;
			case "4":
				System.out.println("Enter the name to search");
				Scanner searchName = new Scanner(System.in);
				System.out.println("Found status: "+l.contains(searchName.next()));
				break;
			case "5":
				Collections.sort(l);
				System.out.println(l);
				break;
			case "6": 
				Collections.sort(l,new StringLengthComparator1());
				System.out.println(l);
				break;

			default:
				break;
			}
		}
		
	}
}

class StringLengthComparator1 implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		return o1.length()-o2.length();
	}

	
}
	

