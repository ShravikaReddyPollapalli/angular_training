package com.capg.hasa;

public class Paytm  extends Irctc{
public Irctc i;
public Paytm(Irctc i ) {
	this.i=i;
}
public void bookTrainTicket(){
	i.bookTicket();
}
}
