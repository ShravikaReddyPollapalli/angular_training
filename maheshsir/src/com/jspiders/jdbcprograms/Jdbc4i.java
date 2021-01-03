package com.jspiders.jdbcprograms;
import java.sql.*;
import java.util.*;
public class Jdbc4i {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String query="select * from test.studentinfo where name=?";
		try
		{
			Connection connection=DriverManager.getConnection(url);
			System.out.println("step 1");

			PreparedStatement preparedstatement=connection.prepareStatement(query);
			System.out.println("step 2");
			preparedstatement.executeQuery(query);
			ResultSet resultset=preparedstatement.executeQuery(query);
			System.out.println("step 3");

			while(resultset.next())
			{

				int id=resultset.getInt("id");
				String name=resultset.getString("name");
				String phone=resultset.getString("phone");

				System.out.println(id+"  "+name+" "+phone+" ");
			}
			connection.close();
			System.out.println("step 5");
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}
}
