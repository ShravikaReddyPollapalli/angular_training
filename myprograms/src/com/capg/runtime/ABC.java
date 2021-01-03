package com.capg.runtime;


 public class ABC
{
	   public void myMethod(){
		System.out.println(" Method");
	   }
	}
	
 class XYZ extends ABC {
	 @Override
	public void myMethod() {
		System.out.println("overridden method");
	}
 }