package com.jspiders.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//to display card info based on cvv.
public class Jdbc3i 
{
public static void main(String[] args) 
{
	String url="jdbc:mysql://localhost:3306?user=root&password=12345";
	String query="select * from test.cardinfo order by cvv";
	try {
		Connection connection=DriverManager.getConnection(url);
		System.out.println("step 1");
		
		Statement statement=connection.createStatement();
		System.out.println("step 2");
		
		statement.executeQuery(query);
		ResultSet resultset=statement.executeQuery(query);
		System.out.println("step 3");
		
		while(resultset.next())
		{
			String cardno=resultset.getString("cardno");
			String cardholder=resultset.getString("cardholder");
			String expirydate=resultset.getString("expirydate");
			int cvv=resultset.getInt("cvv");
			System.out.println(cardno+" "+cardholder+" "+expirydate+" "+cvv+" ");
		}
		connection.close();
		System.out.println("step 5");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
