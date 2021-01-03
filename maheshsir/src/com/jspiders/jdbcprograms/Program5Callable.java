//callableStatement
package com.jspiders.jdbcprograms;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Program5Callable {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String query="{call test.write}";
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
