package com.capg.abhi.arraylistconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class TestArrayList {
public static void main(String[] args) {
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	//adding element into arraylist
	a1.add(11);
	a1.add(36);
	a1.add(14);
	a1.add(null);
	a1.add(null);
	a1.add(14);
	
	a1.add(14);
	//null,duplicate, data structure
	//synchronised or not
	//insertion order
	System.out.println(a1);
	//for loop
	for (int i =0; i < a1.size(); i ++) {
		System.out.println(a1.get(i));  
	}
	Collections.sort(a1);
	//foreach loop
	for(Integer i : a1) {
		System.out.println(i);
	}
	System.out.println("===ietrator method");
	Iterator<Integer> i1 = a1.iterator();
	
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}
	//listiterator for forward and backward direction
	//forward
	ListIterator<Integer> i2 = a1.listIterator();
	
			while(i1.hasNext()) {
				System.out.println(i1.next());
			}
	//backward 
	ListIterator<Integer> l2 = a1.listIterator(a1.size());
	while(l2.hasPrevious()) {
		System.out.println(l2.previous());
	}
}
}
