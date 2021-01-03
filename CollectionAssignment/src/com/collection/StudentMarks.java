package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;


public class StudentMarks {
	public static void main(String[] args) {

		int totalMarks=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students:");
		int noOfStudents=input.nextInt();
		ArrayList<Integer> student = new ArrayList<Integer>(noOfStudents);

		// Storing Student marks
		for(int i=0;i<noOfStudents;i++){
			System.out.print("Enter " +(i+1)+ " Student marks:");
			int marks = input.nextInt();
			totalMarks=totalMarks+marks;
			student.add(marks);
		}
		// Highest
		
		System.out.println( "Highest Marks: " + Collections.max(student) );

		//Average Marks
		float averageMarks = totalMarks/noOfStudents;
		System.out.println("Average Marks: "+averageMarks);

		// displaying the marks
		System.out.print("Marks: ");
		for(int i=0;i<noOfStudents;i++){
			System.out.print((i+1)+"-"+student.get(i)+" ");;

		}

		//     3rd student display
		System.out.println("3rd Student marks :"+student.get(2));

		//    sort
		Collections.sort(student);
		System.out.println("sorted order");
		for(int i : student) {
			System.out.println(i);
		}

	}

}

