package com.capg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Select {
public static void main(String[] args) {
	Connection connection = null;
	Statement statement = null;
	ResultSet resultset = null;
	//step1 load the driver
	try {
		
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		
//		Driver ref = new com.mysql.jdbc.Driver();
//		
//		DriverManager.registerDriver(ref);
		//step 2
		String dbUrl = "jdbc:mysql://localhost:3306/test?user=root&password=12345";
		
		 connection = DriverManager.getConnection(dbUrl);
		
		//step 3 
		String query ="select * from studentinfo where id = 413";
		 statement = connection.createStatement();
		
		 resultset = statement.executeQuery(query);
		
		//step 4
		while(resultset.next()) {
			System.out.println("id------>" + resultset.getInt("id"));
			System.out.println("name---->" + resultset.getString("name"));
			
			System.out.println("mobile--->" + resultset.getLong("phone"));
		}
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	finally {
		try {
			if(connection != null) {
				connection.close();
				
			}
			if(statement != null) {
				statement.close();
			}
			if(resultset != null) {
				resultset.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	}
	}


