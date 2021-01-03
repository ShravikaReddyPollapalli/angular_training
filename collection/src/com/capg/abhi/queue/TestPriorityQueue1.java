package com.capg.abhi.queue;

import java.util.PriorityQueue;

public class TestPriorityQueue1 {
public static void main(String[] args) {
	PriorityQueue<Student> p1 = new  PriorityQueue<Student>(new SortByName());
	//we can use add() also instead of offer,here we are using offer bcoz queue has it.
	
	//PQ always takes comparable type of object
	p1.offer(new Student("ramesh",28));
	p1.offer(new Student("divya",22));
	p1.add(new Student("anu",26));
	p1.add(new Student("Chandan",78));
	p1.add(new Student("Chandan",12));
	
	
	System.out.println(p1);
	
}
}
