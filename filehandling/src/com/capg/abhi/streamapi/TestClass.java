package com.capg.abhi.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {
public static void main(String[] args) {
	List<Integer> l1 = new ArrayList<Integer>();
	l1.add(24);  //even
	l1.add(35);  //odd
	List<Integer> l2 = new ArrayList<Integer>();
//	
//	for(Integer integer : l1) {
//		if(integer %2 != 0) {
//		l2.add(integer);  //to modify l2.add(integer*100);
//	}
//	}
	System.out.println(l2);
	List<Integer> l3 = l1.parallelStream().filter(i -> (i%2==0)).collect(Collectors.toList());
	System.out.println(l3);
	
	List<Integer> l4 = l1.parallelStream().map(i -> (i*100)).collect(Collectors.toList());
	System.out.println(l4);
	
	
	
	
	
}
}
