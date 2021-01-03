package com.capg.abhi.exceptionpropagation;

public class TestPaytm {
public static void main(String[] args) {
	Irctc i1 = new Irctc();
	
	Paytm p1 = new Paytm(i1);
	 p1.bookTicket();
	 System.out.println("main ende");
}
}
