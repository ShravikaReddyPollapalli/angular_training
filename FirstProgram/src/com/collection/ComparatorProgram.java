package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorProgram {
	public static void main(String[] args) {
		List<Customer> cust = new ArrayList<Customer>();
		cust.add(new Customer(4, "ram", "bng"));
		cust.add(new Customer(1, "ravi", "che"));
		cust.add(new Customer(3, "mahesh", "mys"));
		cust.add(new Customer(2, "sachin", "mangalore"));
		Collections.sort(cust, new IdSort());
		for (Customer c : cust)
			System.out.println(c.getId() + "," + c.getName() + "," + c.getAddress());
		System.out.println("----------------------");
		Collections.sort(cust, new NameSort());
		for (Customer c : cust)
			System.out.println(c.getId() + "," + c.getName() + "," + c.getAddress());
		System.out.println("----------------------");
	}
}
