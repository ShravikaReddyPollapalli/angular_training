package com.capg.abhi.threads.racecondition;

public class User extends Thread {
	 BookMyShow bookMyShow;

	public User(BookMyShow bookMyShow) {
		super();
		this.bookMyShow = bookMyShow;
	}
	 
	@Override
	public void run() {
		bookMyShow.bookTicket();
	}
	 
}
