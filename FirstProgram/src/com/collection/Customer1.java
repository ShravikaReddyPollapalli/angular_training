package com.collection;

public class Customer1 implements Comparable<Customer1> {
	private int id;
	private String name;
	private String address;
	public Customer1() {
	}
	public Customer1(int id, String name, String address) {
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
//
@Override
public int compareTo(Customer1 o) {
	if(id == o.id)
		return 0;
	else if(id > o.id)
		return 1;
	else
		return -1;
}
}
