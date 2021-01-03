?package com.jspiders.jdbcprograms;
import java.sql.*;
import java.util.Scanner;
public class Jdbc4Prepared {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String query="insert into test.studentinfo values(?,?,?)"	;
		try {
			Connection connection=DriverManager.getConnection(url);
			System.out.println("step 1");

			PreparedStatement preparedstatement=connection.prepareStatement(query);
			System.out.println("step 2");

			//pass runtime values for place holders in query.
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter id");
			int id=scanner.nextInt();
			preparedstatement.setInt(1, id);

			System.out.println("enter name");
			String name=scanner.next();
			preparedstatement.setString(2, name);

			System.out.println("enter phone");
			String phone=scanner.next();
			preparedstatement.setString(3, phone);
			preparedstatement.executeUpdate();
			System.out.println("step 3");
			
			connection.close();
			System.out.println("step 5");
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}


	}
}
