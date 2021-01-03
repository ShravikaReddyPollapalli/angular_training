package com.capg.abhi.queue;

import java.util.ArrayDeque;

public class TestArrayDeque {
public static void main(String[] args) {
	 ArrayDeque<Integer> a1 = new ArrayDeque<Integer>();
	 a1.add(12);
	 a1.add(23);
	 a1.add(98);
	 a1.add(76);
	 a1.add(24);
	 a1.add(24);
	 
	 System.out.println(a1);
	 //FIFO
	 a1.pop(); //removes first element
	 a1.pop();  //23
	 System.out.println(a1);
	 
}
}
