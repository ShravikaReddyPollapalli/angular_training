package com.capg.abhi.set;

import java.util.HashSet;

public class TestHashSet {
public static void main(String[] args) {
	HashSet<Integer> h1 = new HashSet<Integer>();
	h1.add(24);
	h1.add(76);
	h1.add(38);
	h1.add(34);
	h1.add(2);
	h1.add(null);
	h1.add(2);
	h1.add(2);
	h1.add(null);
	//unorederd collection
	System.out.println(h1);
	
	HashSet<Student> h2 =  new HashSet<Student>();
	h2.add(new Student("vikas",24));
	h2.add(new Student("janu",32));
	System.out.println(h2);
}
}
