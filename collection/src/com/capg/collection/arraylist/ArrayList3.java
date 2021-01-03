package com.capg.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;

//multiple ways of initializing the ArrayList
public class ArrayList3 {
	public static void main(String[] args) {

//	ArrayList<String> a1 = new ArrayList<String>(Arrays.asList("shra","vika","reddy"));
//	for(String str : a1) {
//		System.out.println(str);
//	}
//	
//	ArrayList<Integer> a2 = new ArrayList<Integer>() {{
//		add(11);
//		add(22);
//		add(33);
//	}};
//		System.out.println(a2);
//		}

		ArrayList<String> a = new ArrayList<String>();
		a.add("shra");
		a.add("qwert");
		System.out.println(a);

		ArrayList<Integer> i1 = new ArrayList<Integer>(Collections.nCopies(5, 9));
		System.out.println(i1);

	}
}
