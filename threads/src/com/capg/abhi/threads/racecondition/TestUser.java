package com.capg.abhi.threads.racecondition;

public class TestUser {
public static void main(String[] args) {
	System.out.println("main strated");
	BookMyShow bookMyShow = new BookMyShow();
	User u1 = new User(bookMyShow);
	User u2 = new User(bookMyShow);
	u1.start();
	u2.start();
//	try {
//		Thread.sleep(1000);
//	} catch (InterruptedException e1) {
//		// TODO Auto-generated catch block
//		e1.printStackTrace();
//	}
//	bookMyShow.leaveMe();
	try {
		u1.join();
		u2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("main ended");
	}
}
