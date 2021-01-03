package com.capg.abhi.customuncheckedexception;

public class InsufficientBalanceException extends Exception { //runtimeexception
String msg = "insufficient balance";
@Override
	public String getMessage() {
		
		return msg;
	}
}
