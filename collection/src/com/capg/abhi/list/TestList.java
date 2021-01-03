package com.capg.abhi.list;

import java.util.ArrayList;
import java.util.List;

public class TestList {
public static void main(String[] args) {
	//y array is fixed size?
//	int a = 10;
//	int b[] = new int[3];
//	int c = 20;
	
	List<Integer> l1 = new ArrayList<Integer>();
	//add(int index,object), remove(int), set(int , value)
	//indexOf, lastIndexOf(), subList(), addAll(int, collection), listIterator
	l1.add(0, 15);
	l1.add(45);
	l1.add(78);
	System.out.println(l1);
	
	l1.remove(1);
	System.out.println(l1);
	l1.set(0, 20);
	System.out.println(l1);
	
	//iterating a list by using forloop
	for(int i = 0; i<l1.size(); i ++) {
		System.out.println(l1.get(i));
	}
	System.out.println(l1.indexOf(20));
	l1.add(20);
	System.out.println(l1);
	System.out.println(l1.lastIndexOf(20));
	
	//iterator and listIterator will be explained in arraylist
	}
}
