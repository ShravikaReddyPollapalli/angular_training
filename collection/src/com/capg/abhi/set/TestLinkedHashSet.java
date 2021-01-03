package com.capg.abhi.set;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {
public static void main(String[] args) {
	LinkedHashSet<Integer> l1 = new LinkedHashSet<Integer>();
	l1.add(23);
	l1.add(45);
	l1.add(98);
	l1.add(2);
	l1.add(42);
	l1.add(45);
	l1.add(42);
	l1.add(null);
	l1.add(null);
	System.out.println(l1);
}
}
