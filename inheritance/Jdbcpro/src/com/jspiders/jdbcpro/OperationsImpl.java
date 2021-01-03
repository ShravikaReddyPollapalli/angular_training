package com.jspiders.jdbcpro;
import java.sql.*;
import java.util.*;
public class OperationsImpl implements Operations 
{
String url="jdbc:mysql://localhost:3306?user=root&password=12345";
Scanner scanner=new Scanner(System.in);
	@Override
	public void addBook()
	{
		String query="insert into mysql.library values(?,?,?,?,?)";
		Random random=new Random();
		int id=random.nextInt(1000);
		if(id<0)
		{
			id=id*-1;
		}
		if(id<10000)
		{
			id=id+1000;
		}
		try {
			Connection connection=DriverManager.getConnection(url);
			PreparedStatement preparedstatement=connection.prepareStatement(query);
			
			preparedstatement.setInt(1, id);
			
			System.out.println("enter title");
			String title=scanner.next();
			preparedstatement.setString(2, title);
			
			System.out.println("enter author");
			String author=scanner.next();
			preparedstatement.setString(3, author);
			
			System.out.println("enter price");
			double price=scanner.nextDouble();
			preparedstatement.setDouble(4, price);
			
			System.out.println("enter genre");
			String genre=scanner.next();
			preparedstatement.setString(5, genre);
			
			preparedstatement.executeUpdate();
			connection.close();
			
		} 
		catch (SQLException e)
		{
			
			e.printStackTrace();
		}
	}

	
	
	@Override
	public void searchByTitle()
	{
		String query="select * from mysql.library where name=?";
		try
		{
			Connection connection=DriverManager.getConnection(url);
			

			PreparedStatement preparedstatement=connection.prepareStatement(query);
			String title=scanner.next();
			
			preparedstatement.setString(1,title);
			ResultSet resultset=preparedstatement.executeQuery(query);
			

			while(resultset.next())
			{

				int id=resultset.getInt("id");
				String btitle =resultset.getString("title");
				String author=resultset.getString("author");
				String price=resultset.getString("price");
				String genre=resultset.getString("genre");

				System.out.println(id+"  "+title+" "+author+" "+price+" "+genre);
				
			}
			connection.close();
			System.out.println("step 5");
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePrice()
	{
		String query="update mysql.library set price=? where bookid=?";
		System.out.println("enter price to update");
		System.out.println("enter id");
		try
		{
             Connection connection=DriverManager.getConnection(url);
			

			PreparedStatement preparedstatement=connection.prepareStatement(query);
			double price=scanner.nextDouble();
			preparedstatement.setDouble(1, price);
			int id=scanner.nextInt();
			preparedstatement.setInt(2, id);
			preparedstatement.executeUpdate();
			connection.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	@Override
	public void removeById() {
		String query="delete from mysql.library where bookid=?";
		System.out.println("enter id to remove");
		try
		{
             Connection connection=DriverManager.getConnection(url);
			PreparedStatement preparedstatement=connection.prepareStatement(query);
		    int id=scanner.nextInt();
			preparedstatement.setInt(1, id);
			preparedstatement.executeUpdate();
			connection.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void getAllBooks() 
	{
		String query="select * from mysql.library";
		try {
			Connection connection=DriverManager.getConnection(url);
			PreparedStatement preparedstatement=connection.prepareStatement(query);
			ResultSet resultset=preparedstatement.executeQuery();
			while(resultset.next())
			{
				int id=resultset.getInt("id");
				String btitle=resultset.getString("title");
				String author=resultset.getString("author");
				double price=resultset.getDouble("price");
				String genre=resultset.getString("genre");
				System.out.println(id+" "+btitle+" "+author+" "+price+" "+genre);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
