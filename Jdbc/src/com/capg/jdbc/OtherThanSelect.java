package com.capg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OtherThanSelect {
public static void main(String[] args) {
	Connection connection = null;
	Statement statement = null;
	
	//step1 load the driver
	try {
		
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		

		//step 2
		String dbUrl = "jdbc:mysql://localhost:3306/test?user=root&password=12345";
		
		 connection = DriverManager.getConnection(dbUrl);
		
		//step 3 
       //String query ="insert into test.studentinfo values(402,'vinay','9010612222')";
		 
		 //String query = "delete from test.studentinfo where name='vikas'";
	
		String query = "update studentinfo set name='supraja' where id=411";
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
