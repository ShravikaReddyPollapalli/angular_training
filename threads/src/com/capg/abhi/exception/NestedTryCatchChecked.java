package com.capg.abhi.exception;

public class NestedTryCatchChecked {
public static void main(String[] args) {
	Person p1 = new Person();
	try {
	   try {
		Class.forName("com.capg.abhi.newconcept.Person");
		
	}  catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	} 
	p1.clone();
	}catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
	
}
}
