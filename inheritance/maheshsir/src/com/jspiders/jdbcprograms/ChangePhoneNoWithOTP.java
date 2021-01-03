package com.jspiders.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class ChangePhoneNoWithOTP {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306";
	String user="root";
	String password="12345";
	String query="select phone from test.userinfo where phone=?";
	String updateQuery="update test.userinfo set phone=? where phone=?";
	
	try {
		Connection connection=DriverManager.getConnection(url,user,password);
		
		PreparedStatement prepared=connection.prepareStatement(query);
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter phone no");
		String phone=scanner.next();
		prepared.setString(1,phone);
		
		
		ResultSet resultset=prepared.executeQuery();
		if(resultset.next()) {
		//	String phoneno=resultset.getString("phone");
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
	        	PreparedStatement preparedstatement = connection.prepareStatement(updateQuery);
	        	
	        	System.out.println("enter new phone no");
	        	String newphone=scanner.next();
	        	preparedstatement.setString(1, newphone);
	        	
	        	
	        	preparedstatement.setString(2, phone);
	        	preparedstatement.executeUpdate();
	        	connection.close();
	        }
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
