package com.capgemini.designpattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capgemini.designpattern.dto.EmployeeInfoBeans;

import java.sql.*;
public class Employee {
	
// public EmployeeInfoBeans getEmployeeDetailByName(String name) {
//	 PreparedStatement preparedStatement = null;
//	 Connection connection = null;
//	 ResultSet resultset = null;
//	try {
//		Class.forName("com.mysql.jdbc.Driver").newInstance();
//		String dbUrl = "jdbc:mysql://localhost:3306/ems_db?user=root&password=12345";
//		connection = DriverManager.getConnection(dbUrl);
//		String query = "select * from emp_info where name = ?";
//		preparedStatement = connection.prepareStatement(query);
//		preparedStatement.setString(1,name);
//		resultset = preparedStatement.executeQuery();
//		
//		EmployeeInfoBeans bean = new EmployeeInfoBeans();
//		if(resultset.next()) {
//			bean.setId(resultset.getInt("id"));
//			bean.setName(resultset.getString("name"));
//			bean.setPhoneNumber(resultset.getLong("phoneNumber"));
//			return bean;
//		} else {
//			return null;
//		}
//	} catch (Exception e) {
//		e.printStackTrace();
//	}finally {
//		try {
//			if (connection != null) {
//				connection.close();
//			}
//			if(preparedStatement != null) {
//				preparedStatement.close();
//			}
//			if(resultset != null) {
//				resultset.close();
//			}
//		} catch (Exception e1) {
//			e1.printStackTrace();
//		}
//	}
//	return null;
//	 
// }
}
