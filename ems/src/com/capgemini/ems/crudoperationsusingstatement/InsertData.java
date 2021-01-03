package com.capgemini.ems.crudoperationsusingstatement;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;	

public class InsertData {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			
			FileInputStream fileInputStream = new FileInputStream("test.properties");
			Properties properties = new Properties();
			properties.load(fileInputStream);
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(properties.getProperty("dbUrl"),properties.getProperty("user"),properties.getProperty("password"));
	
	       String query ="insert into emp_info values(425,'vikas','9010612224')";
		
			statement = connection.createStatement();
		
			statement.executeUpdate(query);
			
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
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
}
