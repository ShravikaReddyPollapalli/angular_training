package com.capgemini.designpattern.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.designpattern.dto.EmployeeInfoBeans;

public class EmployeeJDBCImple implements EmployeeDAO {

    @Override
	public EmployeeInfoBeans getEmployeeDetailByName(String name) {
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		ResultSet resultset = null;
		EmployeeInfoBeans bean = new EmployeeInfoBeans();
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String dbUrl = "jdbc:mysql://localhost:3306/ems_db?user=root&password=12345";
			connection = DriverManager.getConnection(dbUrl);
			String query = "select * from emp_info where name = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,name);
			resultset = preparedStatement.executeQuery();
			
			if(resultset.next()) {
				bean.setId(resultset.getInt("id"));
				bean.setName(resultset.getString("name"));
				bean.setPhoneNumber(resultset.getLong("phoneNumber"));
				return bean;
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(resultset != null) {
					resultset.close();
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		return bean;
   }
    
	@Override
	public boolean deleteEmployeeInfo(int id) {
		    PreparedStatement preparedStatement = null;
			Connection connection = null;
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				String dbUrl = "jdbc:mysql://localhost:3306/ems_db?user=root&password=12345";
				connection = DriverManager.getConnection(dbUrl);
				String query = "delete from emp_info where id = ?";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setInt(1,id);
				int resultset1 = preparedStatement.executeUpdate();
				EmployeeInfoBeans bean1 = new EmployeeInfoBeans();
				preparedStatement.executeUpdate();
				if(resultset1 != 0) {
					return true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if (connection != null) {
						connection.close();
					}
					if(preparedStatement != null) {
						preparedStatement.close();
					}
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			return false;			 
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBeans bean) {
		PreparedStatement preparedStatement = null;
		 Connection connection = null;
		 String dbUrl = "jdbc:mysql://localhost:3306/ems_db?user=root&password=12345";
		 String query = "update emp_info set name = ? where id = ?";
		 EmployeeInfoBeans bean1 = new EmployeeInfoBeans();
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(dbUrl);
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,bean.getName());
			preparedStatement.setInt(2,bean.getId());
			int resultset2 = preparedStatement.executeUpdate();
			if(resultset2 != 0) {
				return true;
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBeans bean) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String dbUrl = "jdbc:mysql://localhost:3306/ems_db?user=root&password=12345";
			connection = DriverManager.getConnection(dbUrl);
			String query ="insert into emp_info values(?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, bean.getId());
			preparedStatement.setString(2, bean.getName());
			preparedStatement.setLong(3, bean.getPhoneNumber());
			int resultset3 =  preparedStatement.executeUpdate();
			if(resultset3 != 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		return  false;
	}

	@Override
	public List<EmployeeInfoBeans> getAllEmployeeDetail() {
		
		PreparedStatement preparedStatement = null;
		 Connection connection = null;
		 ResultSet resultset = null;
		 List<EmployeeInfoBeans> list = new ArrayList<EmployeeInfoBeans>();
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String dbUrl = "jdbc:mysql://localhost:3306/ems_db?user=root&password=12345";
			connection = DriverManager.getConnection(dbUrl);
			String query = "select * from emp_info";
			preparedStatement = connection.prepareStatement(query);
			resultset = preparedStatement.executeQuery();

			
			
			while(resultset.next()) {
				EmployeeInfoBeans bean = new EmployeeInfoBeans();
				bean.setId(resultset.getInt("id"));
				bean.setName(resultset.getString("name"));
				bean.setPhoneNumber(resultset.getLong("phoneNumber"));
				list.add(bean);
				
			} 
//			if(info.isEmpty()) {
//				return null;
//			} else {
//				return info;
//			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(resultset != null) {
					resultset.close();
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		return null;
       }
	}

	
		
	


