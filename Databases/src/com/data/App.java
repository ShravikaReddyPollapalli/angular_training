package com.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class App {

	// CRUD: Create | Read | Update | Delete
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Users", "root", "root");
            User user1 = new User("sai@sample.com", "sai", "tej");
//			User user2 = new User("samson@sample.com", "samson", "sanju");
//          User user3 = new User("warner@sample.com", "warner", "david");
//          PreparedStatement statement =  connection.prepareStatement("update users set email =? where firstname=?");
			PreparedStatement statement = connection.prepareStatement("insert into users value(?,?,?)");
//          PreparedStatement statement =  connection.prepareStatement("delete from users where email = ?");
//          PreparedStatement statement = connection.prepareStatement("select * from users");
			statement.setString(1, user1.getEmail());
			statement.setString(2, user1.getFirstName());
			statement.setString(3, user1.getLastName());

			int result = statement.executeUpdate();
			System.out.println(result +" is updated");
			          
//			ResultSet result = smt2.executeQuery();
//			while (result.next()) {
//				System.out.println("email------>" + result.getString(1));
//				System.out.println("firstname---->" + result.getString(2));
//				System.out.println("lastname--->" + result.getString(3));
//			}
	} catch (Exception e) {
			System.out.println(e);
		}
	}
}
