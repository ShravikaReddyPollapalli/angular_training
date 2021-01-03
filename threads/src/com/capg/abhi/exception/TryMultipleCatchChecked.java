package com.capg.abhi.exception;

public class TryMultipleCatchChecked {
	public static void main(String[] args) {
        System.out.println("main started");
		Person p1 = new Person();
		try {
			p1.clone();
			Class c = Class.forName("com.capg.abhi.newconcept.Person");  //package name is chnaged from newconcept to exception
			System.out.println("class found");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
