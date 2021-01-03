package com.jspiders.jdbcprograms;
import java.sql.*;
public class Jdbc1 
{
public static void main(String[] args) 
{
	String url="jdbc:mysql://localhost:3306?user=root&password=12345";
	try
	{
	Connection	connection = DriverManager.getConnection(url);
	System.out.println("step 1");
	connection.close();
	System.out.println("step 5");
	
	} 
	catch (SQLException e)
	{
	e.printStackTrace();
	}
}
}
