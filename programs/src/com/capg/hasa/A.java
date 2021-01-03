package com.capg.hasa;

public class A {
public static void main(String[] args) {
	String x = null;
	giveMeAString(x);
	System.out.println(x);
}
static void giveMeAString(String y) {
	y = "javaquiz";
}
}
