// to delete a particular record from database.
package com.jspiders.jdbcprograms;

import java.sql.*;

public class Jdbc2i
{
public static void main(String[] args)
{
	String url="jdbc:mysql://localhost:3306?user=root&password=12345";
	String query="delete from test.studentinfo where name='asd'";

	try
	{
		Connection connection=DriverManager.getConnection(url);
		System.out.println("step 1");
		
		Statement statement=connection.createStatement();
		System.out.println("step 2");
		
		statement.executeUpdate(query);
		System.out.println("step 3:deleted the record successfully");
		
		connection.close();
		System.out.println("step 5");
	}
	catch (SQLException e) 
	{
		e.printStackTrace();
	}
}
}
