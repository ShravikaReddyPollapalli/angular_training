package com.capgemini.assignment;

public class Assignment {

  // sleepIn
	// The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
	// We sleep in if it  * is not a weekday or we're on vacation. Return true if we sleep in. 
	public boolean sleepIn(boolean weekday, boolean vacation) {
		  if(weekday && vacation) {
		    return false;
		  }
		  return true;
		}
	
	// monkeyTrouble
	// We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
	// We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble. 
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
	  return (aSmile == bSmile);
	}
	
	// sumDouble
	// Given two int values, return their sum. 
	// Unless the two values are the same, then return double their sum. 
	public int sumDouble(int a, int b) {
	  int sum = a + b;
	  if (a == b) {
	    sum = sum *2;
	  }
	  return sum;
	}
	
	
	
	// diff21
	// Given an int n, return the absolute difference between n and 21, 
	// except return double the absolute difference if n is over 21. 
	public int diff21(int n) {
	  int difference = 21 - n;
	  
	  if (n > 21) {
	    difference = Math.abs(difference) * 2;
	  }
	  return difference;
	}
	
	
	
	// nearHundred
	// Given an int n, return true if it is within 10 of 100 or 200. 
	// Note: Math.abs(num) computes the absolute value of a number. 
	public boolean nearHundred(int n) {
	  int value1 = 100-n;
	  int value2 = 200-n;
	  return (Math.abs(value1) <= 10 || Math.abs(value2) <=10);
	}
	
	
	
	// in3050
	// Given 2 int values, return true if they are both in the range 30..40 inclusive, 
	// or they are both in the range 40..50 inclusive. 
	public boolean in3050(int a, int b) {
	  return (((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) ||
	          ((a >= 40 && a <= 50) && (b >= 40 && b <= 50)));
	}
	
	public int caughtSpeeding(int speed, boolean isBirthday) {
	    if(isBirthday) {
	        if(speed <= 65) {
	            return 0;
	        } else if(66 <= speed && speed <= 85) {
	            return 1;
	        } else if(86 <=  speed) {
	            return 2;
	        }
	    }
	                                        
	    if(speed <= 60) {
	        return 0;
	    } else if(61 <= speed && speed <= 80) {
	        return 1;
	    } else {
	        return 2;
	    }
	}
	

	 void location(int n ) {
			if(n%2==0 && n%3==0) {
				System.out.println("DELHI");
			}
			else if(n%2==0){
				System.out.println("BANGLORE");
				
			}
			else if(n%3==0){
				System.out.println("MUMBAI");
			
		}
			else {
				System.out.println("KOLKATTA");
			}
		}

	

	public static void main(String[] args) {
		Assignment assignment = new Assignment();
		System.out.println(assignment.sleepIn(true,true));
		System.out.println(assignment.monkeyTrouble(true, true));
		System.out.println(assignment.sumDouble(3, 3));
		System.out.println(assignment.diff21(19));
		System.out.println(assignment.nearHundred(105));
		System.out.println(assignment.in3050(30, 31));
		System.out.println(assignment.caughtSpeeding(60,false));
		assignment.location(11);
}
}
