package com.jspiders.jdbcprograms;
import java.sql.*;
import java.util.*;
public class RetrieveUsingBetween {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String callStoredProcedure="{call test.firstSP(?,?)}";
		try {
			Connection connection=DriverManager.getConnection(url);
			CallableStatement callablestatement=connection.prepareCall(callStoredProcedure);
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter minimum value:");
			callablestatement.setInt(1, scanner.nextInt());
			System.out.println("enter maximum value:");
			callablestatement.setInt(2, scanner.nextInt());
			ResultSet resultset=callablestatement.executeQuery();
			System.out.println("the records between ids 40 and 80 are:");
			while(resultset.next())
			{
				int id=resultset.getInt("id");
				String Name=resultset.getString("name");
				String dept=resultset.getString("dept");


				System.out.println(id+" "+Name+" "+dept);
			}

			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
