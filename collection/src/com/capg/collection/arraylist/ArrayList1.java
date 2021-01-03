package com.capg.collection.arraylist;

import java.util.ArrayList;

public class ArrayList1 {
public static void main(String[] args) {
	ArrayList a1 = new ArrayList();
	a1.add(45);
	a1.add(3.5);
//	a1.add(3.5);
	a1.add("shra");
	a1.add('s');
	System.out.println("the elements are" + a1);
	System.out.println(a1.size());
	a1.add(3,67);
	System.out.println(a1);
	a1.remove(4);
	System.out.println(a1);
	a1.set(3, "sow");
	System.out.println(a1);
	System.out.println(a1.contains(45));
	System.out.println(a1.get(0));
//	a1.clear();
//	System.out.println(a1);
//	System.out.println(a1.isEmpty());
	a1.remove("shra");
	System.out.println(a1);
	System.out.println(a1.indexOf("sow"));
	
	
}
}
