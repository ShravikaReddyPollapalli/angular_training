package com.capgemini.ems.trywithresources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TryWithResourceExample2 {
	public static void main(String[] args) {
		
		String dbUrl = "jdbc:mysql://localhost:3306/ems_db?user=root&password=12345";
		String query = "insert into emp_info values(?,?,?)";
		
		try (
			Connection connection = DriverManager.getConnection(dbUrl);
			PreparedStatement preparedstatement = connection.prepareStatement(query);){
			preparedstatement.setInt(1, Integer.parseInt(args[0]));
			preparedstatement.setString(2, args[1]);
			preparedstatement.setLong(3, Long.parseLong(args[2]));
			int res =  preparedstatement.executeUpdate();
			System.out.println(res + "rows affected");
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}

