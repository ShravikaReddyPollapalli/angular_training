package com.capg.abhi.collectionconcept;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection1 {
public static void main(String[] args) {
	//collection methods
	//size , isEmpty,contains,toArray,add, remove ,addAll,removeAll
	//clear, containsAll , retainAll ,removeIf(Predicate p)
	//stream () will be taught in stream api
	  Collection<Integer> c1 = new ArrayList<Integer>();
	  
	  //we can add elements into the collection
	  c1.add(11);
	  c1.add(23);
	  c1.add(36);
	  
	  System.out.println("is collection empty: " +c1.isEmpty());
	  System.out.println("size of collection:" +c1.size());
	  System.out.println("element 11 is there or not: " + c1.contains(11));
	  
	  System.out.println("removing 11 from collection");
	  c1.remove(11);
	  System.out.println(c1);
	  c1.removeIf(c -> (c==23)); //if it satisfies the condition then remove the element
	  System.out.println(c1);
	  c1.clear();
	  System.out.println(c1);
	  System.out.println("=======================");
	  //working one or more collections
	  Collection<Integer> c2 = new   ArrayList<Integer>();
	  c2.add(25);
	  c2.add(50);
	  c2.add(75);
	  
	  Collection<Integer> c3 = new   ArrayList<Integer>();
	  c3.add(100);
	  
	  System.out.println(c2);
	  System.out.println(c3);
	  //addAll()
	  c3.addAll(c2);
	  System.out.println(c2);
	  System.out.println(c3);
	  //retainAll
	  c3.retainAll(c2);
	  System.out.println(c2);
	  System.out.println(c3);
	  
	  System.out.println(c2.containsAll(c3));
	  c3.removeAll(c2);
	  System.out.println(c3);
	  
}
}
