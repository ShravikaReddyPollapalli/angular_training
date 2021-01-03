package com.capg.Jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc2 {
public static void main(String[] args) {
	
	
	String url="jdbc:mysql://localhost:3306?user=root&password=12345";
	String query = "insert into test.studentinfo values(403,'shruthi','9010616252')";
//	String query="delete from test.studentinfo where name='shra'";
	try {
		Connection connection = DriverManager.getConnection(url);
		Statement statement = connection.createStatement();
		statement.executeUpdate(query);
		connection.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
