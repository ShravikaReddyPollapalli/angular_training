package com.capg.abhi.stringclass;

public class TestString {
public static void main(String[] args) {
	
	
	String s1 = "mouna"; //literal
	String s2 = "mahesh";
	String s3 = "mahesh";
	
	System.out.println(s3.hashCode());
	System.out.println(s2.hashCode());
	
	//heap area 
	String s4 = new String("shra"); //heap area
	
	String s5 = new String("shra");
	System.out.println(s4.hashCode());
	System.out.println(s5.hashCode());
	
	//immutable in nature
	s4 = s4 +" valmiki";  //litral in scp area
	System.out.println(s4.hashCode());
	String s6 = "shra valmiki";
	System.out.println(s6.hashCode());
}
}
