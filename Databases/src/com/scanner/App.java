package com.scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class App {
public static void main(String[] args) {
	
	  try {
		  Class.forName("com.mysql.cj.jdbc.Driver"); 
	  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Users", "root","root");
	  PreparedStatement preparedstatement = connection.prepareStatement("insert into users value(?,?,?)");
	  
	  //pass runtime values for place holders in query.
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("enter email"); 
	  String email =scanner.next(); 
	  preparedstatement.setString(1,email);
	  
	  System.out.println("enter firstname");
	  String fName = scanner.next();
	  preparedstatement.setString(2,fName);
	  
	  System.out.println("enter lastname"); 
	  String lName = scanner.next();
	  preparedstatement.setString(3,lName);
	  preparedstatement.executeUpdate();
	
	  }catch (Exception e) {
		  e.printStackTrace();
	  }
}
}
