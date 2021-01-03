//to insert a particular record in database.
package com.jspiders.jdbcprograms;
import java.sql.*;
public class Jdbc2 
{
public static void main(String[] args) 
{
	String url="jdbc:mysql://localhost:3306?user=root&password=12345";
	String query="insert into test.studentinfo values(424,'ranga','0987654661')";
	//String query="insert into test.cardinfo values('3333 3333 3333 3333','bunty','09/25',323)";
	try
	{
		Connection	connection = DriverManager.getConnection(url);
		System.out.println("step 1");
		
		Statement statement=connection.createStatement();
		System.out.println("step 2");
		
		statement.executeUpdate(query);
		System.out.println("step 3");
		
		connection.close();
		System.out.println("step 5");
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
}
}
