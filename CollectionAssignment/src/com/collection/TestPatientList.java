package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestPatientList {
	 public static void main(String[] args){
	        ArrayList<Patient> arrayList = new ArrayList<Patient>();
	        arrayList.add(new Patient(413,"sai", 24));
	        arrayList.add(new Patient(425,"sai teja",21));
	        arrayList.add(new Patient(735,"sai kumar",27));

	        System.out.println(" Sorting the List based on name");
	        Collections.sort(arrayList,Patient.name1);
	        for (Patient s1 : arrayList){
	            System.out.println(s1);
	        }

	        System.out.println("Sorting the List Based on Age");
	        Collections.sort(arrayList,Patient.age1);
	        for (Patient s1 : arrayList){
	            System.out.println(s1);
	        }
	    }
}
