package com.example.Shipper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Shipper.entity.Customer;
import com.example.Shipper.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("customers")
	public Customer addStudent(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
		return customer;
	}
	
	@GetMapping("customers/{customerId}")
	public Customer findOneStudent(@PathVariable String id) {
		Customer customer = customerService.findById(id);
		return customer;
	}
}