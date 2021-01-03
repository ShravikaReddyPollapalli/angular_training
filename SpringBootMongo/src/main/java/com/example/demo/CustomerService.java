package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	@Autowired
private CustomerRepository cr;
public void addCustomer(Customer c) {
	cr.save(c);
}
}
