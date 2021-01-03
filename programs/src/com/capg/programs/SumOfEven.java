package com.capg.programs;

public class SumOfEven {
public static void main(String[] args) {
	int sum = 0;
	for(int i=1;i<=10;i++) {
		if(i%2==0) {
//			System.out.print(i);
			sum=i+sum;
			
		}
	}
	System.out.println("the sum of even numbers are: " + sum);
}
}
