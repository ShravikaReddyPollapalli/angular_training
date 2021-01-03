package com.capg.abhi.stringbufferandstringbuilder;

public class MutableString {
public static void main(String[] args) {
	StringBuffer s1 = new StringBuffer("divya");
	System.out.println(s1);
	System.out.println(s1.hashCode());
	//synchronized in nature  thread safe
	s1.append("bogar");
	System.out.println(s1);
	System.out.println(s1.hashCode());
	
	
	System.out.println("=====stringbuilder");
	StringBuilder s2 = new StringBuilder("abhi");
	//non synchronised in nature  not thread safe
	s2.append("bogar");
	System.out.println(s2);
	System.out.println(s2.hashCode());
}
}
