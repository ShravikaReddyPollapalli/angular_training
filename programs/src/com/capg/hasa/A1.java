package com.capg.hasa;

public class A1 {
int x = 10;
public void assign(int x) {
	x=x;
	System.out.println(this.x);
}
public static void main(String[] args) {
	new A1().assign(100);
}
}
