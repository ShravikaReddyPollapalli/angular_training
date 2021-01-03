package com.capgemini.ems.crudoperationsusingprepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetrievedData {
	public static void main(String[] args) {
		
		
		Connection connection = null;
		PreparedStatement preparedstatement = null;
		ResultSet resultset = null;
		//step1 load the driver
		try {
			
			String dbUrl = "jdbc:mysql://localhost:3306/ems_db?user=root&password=12345";
			
			connection = DriverManager.getConnection(dbUrl);
			String query ="select * from emp_info where name = ?";
			 preparedstatement = connection.prepareStatement(query);
			
			 preparedstatement.setString(1, args[0]);
			 //preparedstatement.setInt(1,Integer.parseInt(args[0]));
			 resultset =  preparedstatement.executeQuery();
		
			while(resultset.next()) {
				System.out.println("id------>" + resultset.getInt("id"));
				System.out.println("name---->" + resultset.getString("name"));
				
				System.out.println("mobile--->" + resultset.getLong("phone"));
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {
			try {
				if(connection != null) {
					connection.close();
					
				}
				if(preparedstatement != null) {
					preparedstatement.close();
				}
				if(resultset != null) {
					resultset.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
}
