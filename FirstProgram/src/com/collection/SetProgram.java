package com.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetProgram {
public static void main(String[] args) {
	Set<String> str = new HashSet<>(); //Treeset also
	str.add("sunny");
	str.add("yes");
	str.add("pup");
	str.add("sony");
	str.add("bunty");
	str.add("sony");
	
	for(String s :str)
		System.out.println(s);
	
	str.remove("yes");
	System.out.println(str.contains("yes"));
	System.out.println(str);
	
}
}
