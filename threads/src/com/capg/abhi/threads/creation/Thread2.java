package com.capg.abhi.threads.creation;

public class Thread2  implements Runnable {

	@Override
	public void run() {
		System.out.println("run method is executed");
		System.out.println("=====");
		System.out.println(Thread.currentThread().getName());
		
	}

}
