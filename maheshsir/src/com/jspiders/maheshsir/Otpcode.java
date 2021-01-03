package com.jspiders.maheshsir;
import java.util.Random;
import java.util.Scanner;
public class Otpcode {
public static void main(String[] args) {
	Random random=new Random();
	int otp=random.nextInt(10000);
	if(otp<1000)
	{
		otp=otp+1000;
	}
	if(otp<0)
	{
	otp=otp*-1;
    }
	System.out.println("OTP is: "+otp);
	System.out.println("---------------------");
	Scanner scanner=new Scanner(System.in);
	int userOtp=scanner.nextInt();
	if(otp==userOtp)
	{
		System.out.println("OTP is verified");
	}
	else
	{
		System.err.println("OTP is not verified");
	}
}
}
