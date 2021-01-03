package com.capgemini.exception;

public class Pro2 {
public static void main(String[] args) {
	doStuff();
	System.out.println(10/0);
}
public  static void doStuff()
{
	doMoreStuff();
	System.out.println("hi");
//	System.out.println(10/0);
}
public static void  doMoreStuff() {
System.out.println("hello stuff");
//	System.out.println(10/0);
}
}
