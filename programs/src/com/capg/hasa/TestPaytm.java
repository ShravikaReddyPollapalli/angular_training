package com.capg.hasa;

public class TestPaytm {
public static void main(String[] args) {
	Paytm p1 = new Paytm(new Irctc() );
	p1.bookTrainTicket();
}
}
