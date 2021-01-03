package com.capg.abhi.threads.creation;

public class TestThread2 {
public static void main(String[] args) {
	System.out.println("main started");
	Thread2 t1 = new Thread2();
	 //create an object of thread class bcoz runnable has only run()
	Thread t2 = new Thread(t1);
	
	Thread2 t3 = new Thread2();
	
	Thread t4 = new Thread(t3);
	
	t2.setPriority(Thread.MIN_PRIORITY);
	
	t2.start();
	t4.start();
	try {
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("=====thread details====");
	//id , name , priority
	System.out.println(t2.getId());
	System.out.println(t2.getName());
	System.out.println(t2.getPriority());
	
	System.out.println("======");
	
	System.out.println(t4.getId());
	System.out.println(t4.getName());
	System.out.println(t4.getPriority());
	System.out.println("main ended");
}
}
