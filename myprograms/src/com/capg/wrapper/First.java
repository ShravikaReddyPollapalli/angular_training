package com.capg.wrapper;

public class First {
public static void main(String[] args) {
	//Converting int primitive into Integer object  
		int num= 100;  
		Integer obj=Integer.valueOf(num);  

		System.out.println(num+ " "+ obj); 
		
		//Creating Wrapper class object 
		Integer obj1 = new Integer(10);  
			
		//Converting the wrapper object to primitive
		int num1 = obj1.intValue();

		System.out.println(num1+ " "+ obj1);  
}
}
