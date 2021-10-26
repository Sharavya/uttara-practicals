package com.collection.practicals.part1;

import java.util.Scanner;

public class CountrySortMap {

	/*Create a program to take in the country and capitals from the user as inputs. Then a
	menu should be given to the user to be able to a) search for the capital given a country
	name b) list the countries and their respective capitals. c) Sort the list output based on
	country d) *very important* sort the list output based on capitals*/
	
	public static void main(String[] args) {
		
		 CountryAndCapitals cac = new CountryAndCapitals();
		 
		 while(true)
		 {
			 System.out.println("Select any option from below");
			 System.out.println("1. Add capital and country names");
			 System.out.println("2. Search capital for given country");
			 System.out.println("3. List all countries and respective capitals");
			 System.out.println("4. Sort based on country(key)");
			 System.out.println("5. Sort based on capital(value)");
			Scanner option = new Scanner(System.in);
			String input = option.next();
			
			switch (input) {
			case "1":
				System.out.println("Enter country name: ");
				Scanner countrysc = new Scanner(System.in);
				
				System.out.println("Enter its capital: ");
				Scanner capitalsc = new Scanner(System.in);	
				
				cac.addCountryAndCapital(countrysc.nextLine(),capitalsc.nextLine());
				break;
			case "2":
				System.out.println("Enter Country name: ");
				Scanner country = new Scanner(System.in);
				cac.getCaptical(country.nextLine());
				break;
			case "3":
				cac.printMap();
				break;
			case "4":
				cac.sortBasedOnCountry();
				break;
			case "5":
				cac.sortBasedOnValue();
				break;
			default:
				break;
			}
			 
		 }
	}
}
