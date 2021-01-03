package com.capg.abhi.exception;

public class NestedTryCatchUnchecked {
	public static void main(String[] args) {
		String s1 = "sha";
		try {
			
			try {
			System.out.println(10/0);
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
			System.out.println(s1.length());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
	}
}
