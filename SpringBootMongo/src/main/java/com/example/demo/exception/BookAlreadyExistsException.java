package com.example.demo.exception;

public class BookAlreadyExistsException extends Exception {
public BookAlreadyExistsException() {
		
	}

	public BookAlreadyExistsException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public BookAlreadyExistsException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BookAlreadyExistsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public BookAlreadyExistsException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	

}
