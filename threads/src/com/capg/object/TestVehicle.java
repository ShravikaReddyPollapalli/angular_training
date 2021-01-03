package com.capg.object;

public class TestVehicle {
public static void main(String[] args) {
	System.out.println("mian strated");
	Vehicle v1 = new Vehicle();
	v1 =  null;
	System.gc();
	System.out.println("main ended");
}
}
