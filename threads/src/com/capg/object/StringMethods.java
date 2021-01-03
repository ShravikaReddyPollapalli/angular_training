package com.capg.object;

public class StringMethods {
public static void main(String[] args) {
	String s1 = "joehn walker";
	
	String s2 = "john walker";
	System.out.println(s1.toUpperCase());
	System.out.println(s1.toLowerCase());
	System.out.println(s1.length());
	
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s2));
	
	String s3 = "  Shree ";
	System.out.println(s3.trim());
	
	System.out.println(s1.indexOf('n'));
	System.out.println(s1.lastIndexOf('e'));
	System.out.println(s1.indexOf('e'));
	
	System.out.println(s1.substring(5));
	System.out.println(s1.substring(6));
	
	System.out.println(s1.substring(0, 5)); //end index will not be include
}
}
