package com.capg.Jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc3 {
	public static void main(String[] args)
	{
		
	String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		
//	String query="select * from test.studentinfo";
//	String query="select * from test.studentinfo order by id";
//	String query = "SELECT * FROM test.studentinfo WHERE id IN(SELECT id FROM test.studentinfo WHERE id%2 = 0)";
	String query = "select * from test.studentinfo where mod(id,2)=0";
	
			 
			try {
				
				Connection connection = DriverManager.getConnection(url);
				
				
				Statement statement=connection.createStatement();
				
				
				statement.executeQuery(query);
				ResultSet resultset=statement.executeQuery(query);
				
				while(resultset.next()) {
					
				int id=resultset.getInt("id");
				String name=resultset.getString("name");
				String phone=resultset.getString("phone");
				
				System.out.println(id+ "  " +name+" "+ phone +" ");
				}
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			
	    }
}
