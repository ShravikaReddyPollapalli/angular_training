package com.capg.abhi.customuncheckedexception;

public class User {
public static void main(String[] args) {
	System.out.println("main start");
	SBIAtm s1 = new SBIAtm(new ATMSimulator());
	s1.withdraw(40000);
	System.out.println("main ende");
}
}
