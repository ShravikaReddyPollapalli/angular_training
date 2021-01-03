package com.capg.abhi.exception;

public class CheckedException {
public static void main(String[] args) {
	System.out.println("main started");
	Person p1 = new Person();
	
	try {
		p1.clone();
		System.out.println("cloning an object");
	} catch (CloneNotSupportedException e) {
//		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	
	System.out.println("main ended");
}
}
