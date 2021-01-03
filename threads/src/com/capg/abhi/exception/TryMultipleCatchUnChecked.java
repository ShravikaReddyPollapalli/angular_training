package com.capg.abhi.exception;

public class TryMultipleCatchUnChecked {
	public static void main(String[] args) {
		System.out.println("main started");
		String s1 = "sdf"; // null
		try {
			System.out.println(s1.length());
			System.out.println(10 / 0);
			System.out.println("rest of the code");
		} catch (NullPointerException | ArithmeticException e) {
			e.printStackTrace();
		} // catch(ArithmeticException e) {
			// e.printStackTrace();
			// }
		System.out.println("main ended");
	}
}
//try with multiple catch block
// handling more than one exception in single catch block