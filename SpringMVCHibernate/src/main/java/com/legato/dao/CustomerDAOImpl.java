package com.legato.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.legato.model.Customer;
@Repository
@Transactional
public class CustomerDAOImpl implements CustomerDAO {
private SessionFactory sf;
@Autowired
public CustomerDAOImpl(SessionFactory sf) {
	this.sf = sf;
}
	@Override
	public boolean saveCustomer(Customer customer) {
		try {
			sf.getCurrentSession().save(customer);
		} catch(Exception e) {
			System.out.println(e);
			return false;
		}
		return true;
	}

	@Override
	public List<Customer> getCustomerDetails() {
		List<Customer> list = sf.getCurrentSession().createQuery (" from Customer",Customer.class).list();
		return list;
	}

}
