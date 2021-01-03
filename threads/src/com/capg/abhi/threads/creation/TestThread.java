package com.capg.abhi.threads.creation;

public class TestThread {
public static void main(String[] args) {
	System.out.println("main started");
	Thread1 t1 = new Thread1();
	t1.start();
	try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} //to join with another thread
	System.out.println("main ended");
}
}
