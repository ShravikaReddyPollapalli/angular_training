package com.capg.abhi.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {
public static void main(String[] args) {
	HashMap<Integer, String > h1 = new HashMap<Integer, String >();
	h1.put(20, "divya");
	h1.put(24, "chandan");
	h1.put(67, "rakesh");
	h1.put(67, null);
	h1.put(null, null);
	
	System.out.println(h1);
	Set<Entry<Integer,String>> s1 = h1.entrySet();
	
	for(Entry<Integer, String> e : s1) {
		System.out.println(e.getValue());
		System.out.println(e.getKey());
		System.out.println("=====");
	}
	
	System.out.println(h1.containsKey(20));
	System.out.println(h1.containsValue("chandan"));
	
	Set<Integer> s2 = h1.keySet();
	
	System.out.println("====set of keys====");
	for(Integer i : s2) {
		System.out.println(i);
		System.out.println("=======");
	}
	
	System.out.println("====set of values====");
	Collection<String > c1 = h1.values();
	for(String value : c1) {
		System.out.println(value);
	}
}
}
