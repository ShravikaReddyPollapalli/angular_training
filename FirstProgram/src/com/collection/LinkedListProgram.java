package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProgram {
public static void main(String[] args) {
	LinkedList<Integer> o  = new LinkedList<>();
	o.add(1);
	o.addFirst(2);
	o.addLast(3);
	
	o.addLast(5);
	o.add(4);
	 Iterator<Integer> i = o.iterator();
	 while(i.hasNext())
		 System.out.println(i.next());
		 System.out.println("-------------");
	 
	 System.out.println(o.getFirst());
	 System.out.println(o.getLast());
	 System.out.println(o.get(3));
	 o.remove();
	 System.out.println(o);
}
}
