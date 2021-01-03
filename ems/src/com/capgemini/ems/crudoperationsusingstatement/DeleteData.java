package com.capgemini.ems.crudoperationsusingstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteData {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		
		try {
		    Class.forName("com.mysql.jdbc.Driver").newInstance();
			String dbUrl = "jdbc:mysql://localhost:3306/ems_db?user=root&password=12345";
			connection = DriverManager.getConnection(dbUrl);
			String query = "delete from emp_info where name='vikas'";
	
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
