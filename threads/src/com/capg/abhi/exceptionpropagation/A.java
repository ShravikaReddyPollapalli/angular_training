package com.capg.abhi.exceptionpropagation;

public class A {
	
	static void m() {
		B.n();
// static void m() {
//	 try {
//		B.n();
//	} catch (ClassNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
		
 }
	static void q () {
		try {
		B.p();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
}


//one more way
//static void m() throws ClassNotFoundException {
//	 B.n();
//}