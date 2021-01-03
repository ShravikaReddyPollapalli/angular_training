package com.jspiders.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class ChangeAtmPinWithOTP {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306";
	String user="root";
	String password="12345";
	String query="select phone from test.studentinfo where phone =?";
	String updatequery="update test.studentinfo set atmpin=? where phone=?";
	
	try {
		Connection connection=DriverManager.getConnection(url,user,password);
		
		PreparedStatement prepare=connection.prepareStatement(query);
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter phone no");
		String phone=scanner.next();
		prepare.setString(1,phone);
		
		ResultSet resultset=prepare.executeQuery();
		if(resultset.next()) {
			System.out.println("generate otp");
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
	        System.out.println("enter otp");
	        int userOtp=scanner.nextInt();
	        if(otp==userOtp) {
			PreparedStatement prepared=connection.prepareStatement(updatequery);
			System.out.println("enter new pin");
			String newpin=scanner.next();
        	prepared.setString(1, newpin);
        	
        	
        	prepared.setString(2, phone);
        	prepared.executeUpdate();
        	connection.close();
		}
		
		}} catch (SQLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
