package com.capg.abhi.set;

import java.util.TreeSet;

public class TestTreeSet {
public static void main(String[] args) {
	TreeSet<Integer> t1 = new TreeSet<Integer>(new SortDescendingOrder());
	t1.add(89);
	t1.add(64);
	t1.add(20);
	t1.add(98);
//	t1.add(null);
//	t1.add(98);
	System.out.println(t1);
	//if we want in descending oreder then impli Comparator and pass as object
	
	
	
	TreeSet<Employee> t2 = new TreeSet<Employee>(new SortByEmpName());
	t2.add(new Employee("yogesh",26));
	t2.add(new Employee("hsra",23));
	System.out.println(t2);
	
	
}
}
