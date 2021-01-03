package com.capg.Jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbc5i {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
//		String query="select * from test.studentinfo ";
		String query="select * from test.studentinfo where name=?";
		try
		{
			Connection connection=DriverManager.getConnection(url);
			System.out.println("step 1");

			PreparedStatement preparedstatement=connection.prepareStatement(query);
			System.out.println("step 2");
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter name");
//			 String name=scanner.next();
			 preparedstatement.setString(1,scanner.next());
			 
			
			ResultSet resultset=preparedstatement.executeQuery(query);
			System.out.println("step 3");

			while(resultset.next())
			{

				int id=resultset.getInt("id");
				String name1=resultset.getString("name");
				String phone=resultset.getString("phone");

				System.out.println(id+"  "+name1+" "+phone+" ");
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
