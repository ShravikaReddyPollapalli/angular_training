package com.exception;



class SalaryException extends Exception {

	public SalaryException() {
		super();
	}

	public SalaryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);	
	}

	public SalaryException(String message, Throwable cause) {
		super(message, cause);	
	}

	public SalaryException(String message) {
		super(message);	
	}

	public SalaryException(Throwable cause) {
		super(cause);
	}
	
}
public class UserDefinedException {
public static void display() throws SalaryException {
	int salary = -40000; //40000
	if(salary < 0)
		throw new SalaryException("salary cant be lesser than 0");
	else
		System.out.println(salary);

}
public static void main(String[] args) {
	try {
		display();
	} catch(Exception e) {
		System.out.println(e);
	}
}
}
