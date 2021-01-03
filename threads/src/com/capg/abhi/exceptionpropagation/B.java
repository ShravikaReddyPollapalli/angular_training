package com.capg.abhi.exceptionpropagation;

import javax.crypto.AEADBadTagException;

public class B {
// static void n() throws ClassNotFoundException {
//	 Class.forName("com.capg.abhi.exceptionpropagation.A");
// }
 
 static void n() {
	 try {
		Class.forName("com.capg.abhi.exceptionpropagation.A");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
 static void p() {
	
		 System.out.println(10/0);
	
	
 }
}
