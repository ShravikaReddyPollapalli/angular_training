package com.jspiders.jdbcprograms;
import java.util.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeactivateUserAcc {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306";
	String user="root";
	String password="12345";
	String query="select phone from test.userinfo where phone=?";
	String deletequery="delete  from test.userinfo where phone=?";
			
	try {
		Connection connection =DriverManager.getConnection(url,user,password);
		
		PreparedStatement prepared=connection.prepareStatement(query);
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no");
		String phone=scanner.next();
		prepared.setString(1,phone);
		
		
		ResultSet resultset=prepared.executeQuery();
		if(resultset.next())
		{
			PreparedStatement prepare=connection.prepareStatement(deletequery);
			//String deactivatephone=scanner.next();
			prepare.setString(1,phone);
			//if(phone.equals(deactivatephone)) {
				//prepare.setString(1,deactivatephone);
				
	//	}
			prepare.executeUpdate();
			connection.close();
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
