package com.capg.abhi.arrays;

public class TestArray1 {
public static void main(String[] args) {
	String names[]; //declaring an array
	names = new String[4];  //instantiate the array
	
	names[0] = "anu";
	names[1] = "divya";
//	names[2] = "shree";
	names[3] = "sunil";
//	names[4] = 34; //error 
//	names[5] = "yeshwanth";   ArrayIndexOutOfBounds exception
	
	//iterating array in  4 ways
	for(int i =0; i < names.length;i++) {   //length is property, not method
		System.out.println(names[i]);
	}
	
	
	
	//another way
	int age[] = {23,24,25,26};   //array size will be fixed
	System.out.println(age.length);
//	age[4] = 27;   //exception
	System.out.println(age);
	//for each loop
	for(int a:age) {
		System.out.println(a);
	}
	
	//array only takes homogeneous type of data
	//int type int type of value ,string type string type of  data
	//size of array is always fixed .y it cannot grow the size?
	//we cannot modify the array i.e., update,delete,etc bcoz there are no inbuilt methods
	//there are 2d and 3d arrays also.
}
}
