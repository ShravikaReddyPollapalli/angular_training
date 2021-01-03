package com.capgemini.oops;

public class Demo1{
	   public static void main(String args[])
{
		   SimpleCalculator obj  = new SimpleCalculator ();
	       System.out.println(obj.add(10, 20));
	       System.out.println(obj.add(10, 20, 30));
	       System.out.println(obj.add(10, 20.5));

	   }
}