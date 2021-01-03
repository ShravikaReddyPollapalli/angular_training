package com.capg.abhi.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestPriorityQueue {
public static void main(String[] args) {
	PriorityQueue<Integer> p1 = new PriorityQueue<Integer>();
	p1.add(98);
	p1.add(56);
	p1.add(2);
	p1.add(46);
	p1.add(64);
	p1.add(1);
	p1.add(2);
	//p1.add(null);  //null value is not allowed
	//undorederd collection priority willbe always given for least element
	System.out.println(p1);
	//iterating the PQ
	//foreach,iterator
	//we cant use forloop bcoz there is not get () at index
	for(Integer i : p1) {
		System.out.println(i);
	}
	
	Iterator<Integer> itr = p1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
