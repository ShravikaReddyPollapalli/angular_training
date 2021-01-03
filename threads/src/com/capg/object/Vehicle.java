package com.capg.object;

public class Vehicle {
@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method is called");
	}
}
