package com.capg.Jdbcexamples;
import java.sql.*;
public class Jdbc6Callable {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String query="{call test.first}";
		try {
			Connection connection=DriverManager.getConnection(url);
			System.out.println("step 1");
			CallableStatement callablestatement=connection.prepareCall(query);
			callablestatement.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
