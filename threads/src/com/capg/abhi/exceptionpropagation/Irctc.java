package com.capg.abhi.exceptionpropagation;

public class Irctc {
     void bookticket() throws ClassNotFoundException {
	try {
		Class.forName("com.capg.abhi.exceptionpropagation.A");
	} catch (ClassNotFoundException e) {
		System.out.println("please try some other time");
		throw e; //throw new ClassNotFoundException();
	}
   }
}
