package com.capg.abhi.customuncheckedexception;

public class SBIAtm {
 ATMSimulator atm;

public SBIAtm(ATMSimulator atm) {
	super();
	this.atm = atm;
}
 public void withdraw(double amount) {
	  try {
	  atm.withdraw(amount); 
	  } catch (InsufficientBalanceException i) {
		  System.out.println(i.getMessage()); //if not handled it will show error then and there itself
	  }
  }
}
