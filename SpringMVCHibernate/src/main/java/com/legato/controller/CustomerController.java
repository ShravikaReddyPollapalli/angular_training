package com.legato.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.legato.dao.CustomerDAO;
import com.legato.model.Customer;

@Controller
public class CustomerController {
private CustomerDAO cdao;
	
	@Autowired
	public CustomerController(CustomerDAO cdao) {
		this.cdao = cdao;
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomerDetails(
			@ModelAttribute Customer c) {
		cdao.saveCustomer(c);
		return "redirect:customers";
	}
	
	@GetMapping(path = {"/","/customers"})
	public String getCustomerDetails(Model m) {
		List<Customer> lcustomer = cdao.getCustomerDetails();
		m.addAttribute("c",lcustomer);
		return "index";
	}
}
