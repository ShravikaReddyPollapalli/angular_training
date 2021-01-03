package com.capg.abhi.customuncheckedexception;

public class ATMSimulator {
	double balance = 30.000;
   public void withdraw(double amount) throws InsufficientBalanceException { //throws for checked
	 if(amount > balance) {
		 //syopln("insuffi'); is wrong
		 throw new InsufficientBalanceException();
		 }
   }
	
}
