package com.legato.SpringJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class CustomerDAO {
	JdbcTemplate t;
	public CustomerDAO() {

	}
	public CustomerDAO(JdbcTemplate t) {
		this.t = t;
	}
	public int addCustomer(Customer c) {
		String str = "insert into ctest values(" + c.getId() + ",'" + c.getName()
		+ "','" + c.getAddress() + "')";
		return t.update(str);
	}
	public List<Customer> getCustomerDetails() {
		return t.query("select * from ctest", new RowMapper<Customer>() {
			public Customer mapRow(ResultSet r,int row) throws SQLException  {
				Customer c = new Customer();
				c.setId(r.getInt(1));
				c.setName(r.getString(2));
				c.setAddress(r.getString(3));
				return c;
			}
		});
	}
}
