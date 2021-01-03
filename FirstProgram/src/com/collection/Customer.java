package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 public class Customer {
	private int id;
	private String name;
	private String address;
	public Customer() {
	}
	public Customer(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
}
class IdSort implements Comparator<Customer> {
	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1.getId() == o2.getId())
			return 0;
		else if(o1.getId() > o2.getId())
			return 1;
		else
			return -1;
	}
}
class NameSort implements Comparator<Customer> {
	@Override
	public int compare(Customer arg0, Customer arg1) {
		return  arg0.getName().compareTo(arg1.getName());
	}
}
