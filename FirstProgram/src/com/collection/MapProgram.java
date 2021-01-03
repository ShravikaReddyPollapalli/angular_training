package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapProgram {
public static void main(String[] args) {
	Map<Integer,String> m = new HashMap<>();//HashMap
	m.put(1,"sun");
	m.put(2,"son");
	m.put(5,"pup");
	m.put(4,"bun");
	m.put(7,"yesh");
	m.put(6,"chikki");
	for(Map.Entry e : m.entrySet())
		System.out.println(e.getKey() + "," + e.getValue());
	
	System.out.println("-----------------------");
	System.out.println(m.get(4));
	for(int s : m.keySet())
        System.out.println(s);
	System.out.println("---------");
	for(String s : m.values())
		System.out.println(s);
	
	System.out.println("---------------");
	System.out.println(m.containsKey(2));
	m.remove(2);
	
	System.out.println(m.values());
}
}
