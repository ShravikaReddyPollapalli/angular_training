package com.capg.Jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbc5Prepared {
public static void main(String[] args) {
	String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
	String query = "insert into test.studentinfo value(?,?,?)";
	try {
		Connection connection = DriverManager.getConnection(url);
		PreparedStatement preparedstatement = connection.prepareStatement(query);
		
		//pass runtime values for place holders in query.
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter id");
		int id = scanner.nextInt();
		preparedstatement.setInt(1,id);
		
		System.out.println("enter name");
		String name = scanner.next();
		preparedstatement.setString(2,name);
		
		System.out.println("enter phone number");
		String phone = scanner.next();
		preparedstatement.setString(3,phone);
		preparedstatement.executeUpdate();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
}
}
