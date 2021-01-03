package com.capgemini.array;

import java.util.Scanner;

public class Second {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter array size");
		int size = scan.nextInt();
		System.out.println("enter array elements");
		int[] a1 = new int[size];
		for (int i = 0; i <= a1.length - 1; i++) {
			a1[i] = scan.nextInt();
		}
		System.out.println("elements present in even index are");

		for (int i = 0; i <= a1.length - 1; i++) {
			if (i % 2 == 0) {

				System.out.println(a1[i]);
			}
		}

	}
}
