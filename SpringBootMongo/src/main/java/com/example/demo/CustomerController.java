package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@Autowired
private CustomerService cs;
	@RequestMapping(value="/add",method=RequestMethod.POST)
public void saveCustomer(@RequestBody Customer c) {
	cs.addCustomer(c);
}
}
