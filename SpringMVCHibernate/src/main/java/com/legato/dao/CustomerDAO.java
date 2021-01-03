package com.legato.dao;

import java.util.List;

import com.legato.model.Customer;

public interface CustomerDAO {
public boolean saveCustomer(Customer customer);
public List<Customer> getCustomerDetails();
}
