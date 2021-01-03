package com.jspiders.jdbcprograms;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ChangePWbasedOnEmail {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306";
	String user="root";
	String password="12345";
	String query="select email from test.userinfo where email=?";
	String updatequery="update test.userinfo set password=? where email=?";
	
	try {
		Connection connection=DriverManager.getConnection(url,user,password);
		
		PreparedStatement prepared=connection.prepareStatement(query);
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter email");
		String email=scanner.next();
		prepared.setString(1, email);
		
		ResultSet resultset=prepared.executeQuery();
		if(resultset.next()) {
			PreparedStatement prepare=connection.prepareStatement(updatequery);
			
			System.out.println("enter new password");
			String newpassword=scanner.next();
			System.out.println("confirm password");
			String confirm=scanner.next();
			if(newpassword.equals(confirm)) {
				prepare.setString(1,newpassword);
			}
			
		
			prepare.setString(2, email);
			prepare.executeUpdate();
			connection.close();
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
