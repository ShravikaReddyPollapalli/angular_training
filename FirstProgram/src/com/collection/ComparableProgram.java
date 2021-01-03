package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ComparableProgram {
	public static void main(String[] args) {
		List<Customer1> cust1 = new ArrayList<Customer1>();
		cust1.add(new Customer1(4, "ram", "bng"));
		cust1.add(new Customer1(1, "ravi", "che"));
		cust1.add(new Customer1(3, "mahesh", "mys"));
		cust1.add(new Customer1(2, "sachin", "mangalore"));
		
		for (Customer1 c : cust1)
			System.out.println(c.getId() + "," + c.getName() + "," + c.getAddress());
		
	}
}
