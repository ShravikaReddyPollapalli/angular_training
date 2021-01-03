package com.capgemini.array;


import java.util.Scanner;
class Third {
   public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      int size = scanner.nextInt();
      int[] array = new int[size];
      int sum = 0;
      System.out.println("Enter the elements:");
      for (int i=0; i<=array.length-1; i++)
      {
    	  array[i] = scanner.nextInt();
      }
      for( int num : array) {
          sum = sum+num;
      }
      System.out.println("Sum of array elements is:"+sum);
   }
}