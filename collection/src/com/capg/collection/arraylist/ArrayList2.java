package com.capg.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {
public static void main(String[] args) {
//	ArrayList<String> a1 = new ArrayList<String>();
//	a1.add("shra");
//	a1.add("vika");
//	a1.add("reddy");
//	a1.add("polla");
//	for(String str:a1) {
//		System.out.println(str);
//	}
	
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	a1.add(23);
	a1.add(34);
	a1.add(75);
	a1.add(56);
	Collections.sort(a1);
	for(Integer str:a1) {                      //iterating ArrayList	
		System.out.println(str);
	}
	
}		
}
