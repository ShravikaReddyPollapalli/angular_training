package com.jspiders.jdbcprograms;
// to dispaly all the records from student info
import java.sql.*;
public class Jdbc3
{
public static void main(String[] args)
{
	
	String url="jdbc:mysql://localhost:3306?user=root&password=12345";
	
	String query="select * from test.studentinfo";
	
		 
		try {
			Connection connection = DriverManager.getConnection(url);
			System.out.println("step 1");
			
			Statement statement=connection.createStatement();
			System.out.println("step 2");
			
			statement.executeQuery(query);
			ResultSet resultset=statement.executeQuery(query);
			System.out.println("step 3");
			while(resultset.next()) {
				
			int id=resultset.getInt("id");
			String name=resultset.getString("name");
			String phone=resultset.getString("phone");
			
			System.out.println(id+"  "+name+" "+phone+" ");
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
    }
}
