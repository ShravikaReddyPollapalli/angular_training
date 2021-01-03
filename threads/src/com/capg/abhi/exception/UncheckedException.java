package com.capg.abhi.exception;

public class UncheckedException {
public static void main(String[] args) {
	System.out.println("main started");
	
	System.out.println(10+20);
	System.out.println(10*2);
	try {
	System.out.println(30/1);
	} catch(ArithmeticException a1){
//		System.out.println(a1.getMessage());
	a1.printStackTrace();
	}
		System.out.println("rest of the code");
	System.out.println("main ended");
	
	//train booking real time example
	//event occuring in our application which is abruptly occurred
}
}
//any exception classes which is directly extending 
//runtime exception class are called unchecked execption

//try {  put the code which is showing an exception }
//try block is always be follwed by catch or finally block