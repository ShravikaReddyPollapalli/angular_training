package com.capg.abhi.arraylistconcept;

import java.util.LinkedList;

public class TestLinkedList {
public static void main(String[] args) {
	//it is implementing two interface list and queue
	//few additional methods bcoz it is implementing form two interafces
	//addFirst() , addLast,removeFirst,removeLast
	//getFirst,getLast,offer,offerFirst,offerLast
	//poll,pollFirst,polllast
	//peek,peekFirst,peekLast
	//push,pop,element,remove
	LinkedList<Integer> l1 = new LinkedList<Integer>();
	l1.add(12);
	l1.add(102);
	l1.add(105);
	System.out.println(l1);
	l1.addFirst(89);
	System.out.println(l1);
	l1.removeFirst();
	System.out.println(l1);
	System.out.println(l1.getFirst());
	System.out.println(l1.getLast());
	l1.offer(90); //addlast
	System.out.println(l1);
	l1.offerFirst(2);
	System.out.println(l1);
	
	System.out.println(l1.peek());
	l1.poll();//top elemnet will be removed
	System.out.println(l1);
	l1.push(3); //add first
	System.out.println(l1);
	l1.pop(); //remove first
	System.out.println(l1);
	
	System.out.println(l1.element());//top element
	System.out.println(l1);
	l1.remove();
	System.out.println(l1);
	}
}
