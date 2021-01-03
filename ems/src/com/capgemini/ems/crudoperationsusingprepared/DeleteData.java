package com.capgemini.ems.crudoperationsusingprepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteData {
	public static void main(String[] args) {
		Connection connection = null;
		 PreparedStatement  preparedStatement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			String dbUrl = "jdbc:mysql://localhost:3306/ems_db?user=root&password=12345";
			
			  connection = DriverManager.getConnection(dbUrl);
			  
			  String query = "delete from emp_info where id = ?";
			  
			  preparedStatement = connection.prepareStatement(query);
			  
			  preparedStatement.setInt(1, Integer.parseInt(args[0]));
			  int res = preparedStatement.executeUpdate();
			  System.out.println(res +" is deleted");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
