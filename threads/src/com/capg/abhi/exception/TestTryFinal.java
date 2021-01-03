package com.capg.abhi.exception;

public class TestTryFinal {
 public static void main(String[] args) {
	System.out.println("main started");
	try {
		System.out.println(10/0);
	} finally {
		System.out.println("finally block executed");
	}
	System.out.println("main ended");
}
}
