package com.capg.abhi.exceptionpropagation;

public class TestMain {
public static void main(String[] args)  {
	System.out.println("main started");
//	try {
//		A.m();
//	} catch (ClassNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	A.m();
	
	A.q();
	System.out.println("main ended");
}
}
