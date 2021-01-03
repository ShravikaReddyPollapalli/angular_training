package com.capg.abhi.threads.racecondition;

public class BookMyShow {
public synchronized void bookTicket() {
	for(int i = 0; i < 4;i++) {
		System.out.println(i);
//		try {
//			wait(1000);  //in object class
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println("ticket booked succesffuly");
}
	public synchronized void leaveMe() {
		System.out.println("notify all");
		notifyAll();
	}

}