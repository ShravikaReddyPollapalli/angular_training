package com.capg.abhi.exceptionpropagation;

public class Paytm {
 Irctc i;

public Paytm(Irctc i) {
	
	this.i = i;
}
   void bookTicket() {
	   try {
		i.bookticket();
		System.out.println("booking ticket");
	} catch (ClassNotFoundException e) {
		System.out.println("please try some other time");
	}
	   }
}
