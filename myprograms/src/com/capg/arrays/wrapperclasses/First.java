package com.capg.arrays.wrapperclasses;

public class First {
public static void main(String[] args) {
	int m = 24;
	 Integer obj = Integer.valueOf(m);
	 
	 System.out.println(m+ " "+ obj); 
	 
	 
	 
	//Creating Wrapper class object 
		Integer obj1 = new Integer(100);  
			
		//Converting the wrapper object to primitive
		int num = obj1.intValue();

		System.out.println(num+ " "+ obj1); 
}
}
