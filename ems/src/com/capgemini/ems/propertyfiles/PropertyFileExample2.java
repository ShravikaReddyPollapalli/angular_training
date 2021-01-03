package com.capgemini.ems.propertyfiles;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class PropertyFileExample2 {
public static void main(String[] args) {
		
		
		Connection connection = null;
		PreparedStatement preparedstatement = null;
		ResultSet resultset = null;
		//step1 load the driver
		try {
			
			FileInputStream fileInputStream = new FileInputStream("demo.properties");
			Properties properties = new Properties();
			properties.load(fileInputStream);
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(properties.getProperty("dbUrl"),properties.getProperty("user"),properties.getProperty("password"));
			
		
			String query ="select * from emp_info where name = ?";
			 preparedstatement = connection.prepareStatement(query);
			
			 preparedstatement.setString(1, args[0]);
			 //preparedstatement.setInt(1,Integer.parseInt(args[0]));
			 resultset =  preparedstatement.executeQuery();
			
			//step 4
			while(resultset.next()) {
				System.out.println("id------>" + resultset.getInt("id"));
				System.out.println("name---->" + resultset.getString("name"));
				System.out.println("mobile--->" + resultset.getLong("phonenumber"));
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
				if(preparedstatement != null) {
					preparedstatement.close();
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
