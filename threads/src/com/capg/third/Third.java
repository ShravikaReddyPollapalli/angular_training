package com.capg.third;

public class Third extends Thread {
public void run() {
	System.out.println("no args");
}
public void run(int i) {
	
	System.out.println("paramneters");
}
}
