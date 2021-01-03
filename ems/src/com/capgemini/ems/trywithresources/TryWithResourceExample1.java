package com.capgemini.ems.trywithresources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWithResourceExample1 {
	public static void main(String args[]) {
		
	     String dbUrl = "jdbc:mysql://localhost/ems_db?user=root&password=12345";
	     String query = "select * from emp_info";
	     
	    try(Connection connection = DriverManager.getConnection(dbUrl);
	      Statement statement = connection.createStatement(); 
	      ResultSet resultset = statement.executeQuery(query);){
	           
	       while(resultset.next()) {
	            System.out.println("id------>" + resultset.getInt("id"));
				System.out.println("name---->" + resultset.getString("name"));
				System.out.println("mobile--->" + resultset.getLong("phonenumber"));    
	            }
	         } catch (SQLException e) {
	            e.printStackTrace();
	         }
	      } 
	}

