package com.capg.abstraction2;

public interface Driver {
 void connect();
}
  class Bus implements Driver {
	public void connect() {
		 System.out.println("started");
	 }
 }
  
  class Karnataka implements Driver {
	 @Override
	public void connect() {
		System.out.println("strtated tran");	}
  }
  