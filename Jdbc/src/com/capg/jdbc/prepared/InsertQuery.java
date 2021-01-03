package com.capg.jdbc.prepared;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
public class InsertQuery {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedstatement = null;
		
		//step1 load the driver
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
//			Driver ref = new com.mysql.jdbc.Driver();
//			
//			DriverManager.registerDriver(ref);
			//step 2
			String dbUrl = "jdbc:mysql://localhost:3306/test?user=root&password=12345";
			
			 connection = DriverManager.getConnection(dbUrl);
			
			//step 3 
			String query ="insert into test.studentinfo values(?,?,?)";
//			String query = "delete from test.studentinfo where name='vikas'";
		
//			String query = "update studentinfo set name='supraja' where id=411";
			preparedstatement = connection.prepareStatement(query);
			preparedstatement.setInt(1, Integer.parseInt(args[0]));
			preparedstatement.setString(2, args[1]);
			preparedstatement.setLong(3, Long.parseLong(args[2]));
//			int res =  preparedstatement.executeUpdate();
//			System.out.println(res + "rows affected");
		} catch (Exception e) {
			
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
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
}
