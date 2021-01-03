package com.collection;

import java.util.LinkedHashSet;

public class TestPatientSet {
	 public static void main(String[] arg){
	        LinkedHashSet<Patient> hashSet = new LinkedHashSet<Patient>();
	        hashSet.add(new Patient(666,"bhagi", 30));
	        hashSet.add(new Patient(333,"vikas", 40));
	        hashSet.add(new Patient(111,"shruthi", 30));

	        System.out.println("The Size Of the Set "+ hashSet.size());

	        System.out.print("All Patient Details" +hashSet);
	         

	    }
}
