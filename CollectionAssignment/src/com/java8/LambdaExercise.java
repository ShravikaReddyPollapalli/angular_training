package com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

//1. In the class LambdaExercise, create following static variables
//1. countries of type List<String>
//2. countryCapitals of type Map<String, String>  
//
//In a static block, initialize countries and countryCapitals with soe values
//
//Define following static methods and provide the implementation as given below
//
//- displayCountries
//- Iterate through the List and display the list using forEach(Consumer) method
//
//- displayCountryCapitals
//- Iterate through the Map and display the map using forEach(BiConsumer) method
//
//- sortCountriesByName
//- Sort the List using Comparator(Lambda Exp). Sort in the reverse alphabetical order
//
//- sortCountriesBylength
//- Sort the List using Comparator, in descending order of number of characters in the country name.
//If the number of characters are same for a country, it should be sorted alphabetically
//(Use Comparator's static/default methods)
//
//- removeCountry(String name)
//- remove the countries whose name is greater than 6 characters
//
//
//Execute the methods and display the results in main method 
public class LambdaExercise {
	static List<String> countries = new ArrayList<String>() {{
		add("India");
		add("France");
		add("US");
		add("Norway");
		
		}};
		
	static Map<String, String> countryCapitals = new HashMap<String, String>(){{
		put("India","Delhi");
		put("France","Paris");
		put("US","Washington");
		put("Norway","Osolo");

	}};
	public static void displayCountries() {
		Consumer <String> c = new Consumer <String>() {
			@Override
			
			public void accept(String i) {
				System.out.println(i);
			}
			
		};
		countries.forEach(c);
		
	}
	public static void displayCountryCapitals() {
		BiConsumer<String, String> k = new BiConsumer<String, String>(){
			@Override
			public void accept(String i,String e) {
				System.out.println(i+" : "+ e);
				
			}
			
		};
		countryCapitals.forEach(k); 
	}
	public static void  sortCountriesByName() {
		countries = countries.stream()
	            .sorted(Comparator.reverseOrder())
	            .collect(Collectors.toList());
		System.out.println(countries);
	}

	public static void main( String[] args ) {
		displayCountries();
		displayCountryCapitals();
		sortCountriesByName();
	}
}
