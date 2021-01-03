//email
//phonenumber

package com.jspiders.jdbcprograms;
import java.sql.*;
import java.util.*;
public class LoginProgram {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306";
	String user="root";
	String password="12345";
	//String query="select name from test.userinfo where phone=? and password=?";
	String query="select name from test.userinfo where email=? and password=?";
	try 
	{
		Connection connection=DriverManager.getConnection(url, user, password);
		PreparedStatement preparedstatement=connection.prepareStatement(query);
		Scanner scanner=new Scanner(System.in);
		//System.out.println("enter phone number");
		//String phone=scanner.next();
		//preparedstatement.setString(1,phone);
		System.out.println("enter email");
		String email=scanner.next();
		preparedstatement.setString(1,email);
		System.out.println("enter password");
		String userpassword=scanner.next();
		preparedstatement.setString(2,userpassword);
		ResultSet resultset=preparedstatement.executeQuery();
		
		if(resultset.next())
		{
			System.out.println("login successful");
			String name=resultset.getString("name");
			System.out.println("welcome "+name);
		}
		else
		{
			System.err.println("login unsuccessful");
		}
		connection.close();
	}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
