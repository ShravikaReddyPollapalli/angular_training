package com.capgemini.ems.crudoperationsusingprepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateData {
	public static void main(String[] args) {
		Connection connection = null;
		 PreparedStatement  preparedStatement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			String dbUrl = "jdbc:mysql://localhost:3306/ems_db?user=root&password=12345";
			
			  connection = DriverManager.getConnection(dbUrl);
			  
			  String query = "update emp_info set name = ? where id = ?";
			  
			  preparedStatement = connection.prepareStatement(query);
			  
			  preparedStatement.setString(1, args[0]);
			  preparedStatement.setInt(2, Integer.parseInt(args[1]));
			  
			  int res = preparedStatement.executeUpdate();
			  System.out.println(res +" is updated");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
