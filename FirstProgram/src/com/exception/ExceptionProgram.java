package com.exception;

public class ExceptionProgram {
public static void main(String[] args) {
	int result = 0;
	try {
		int num1 = 10;
		int num2 = 10;
		result = num1/num2;
	} catch (ArithmeticException e) {
		System.out.println(e);
	} catch(Exception e1) {
		System.out.println(e1);
	}finally {
		System.out.println(result);
	}
	System.out.println("continue");
}
}
