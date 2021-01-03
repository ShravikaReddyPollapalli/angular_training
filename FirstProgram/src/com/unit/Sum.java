package com.unit;

public class Sum {
public static int sum(int num1,int num2) {
	return num1 + num2;
}
public static int multi(int num1,int num2) {
	return num1* num2;
}
public static int findArray(int arr[]) {
	int max = 0;
	for(int i =0; i<arr.length;i++)
		if(max < arr[i])
			max = arr[i];
	
	return max;
}

public void calcDivide() {
	int a = 0;
	int b = 1/0;
}
}
