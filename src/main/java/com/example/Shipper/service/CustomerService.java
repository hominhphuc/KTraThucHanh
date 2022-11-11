package com.example.Shipper.service;

import org.springframework.stereotype.Service;


import com.example.Shipper.entity.Shipper;
import com.example.Shipper.entity.Customer;

@Service
public interface CustomerService {
	public Customer findById(String theId);
	public void saveCustomer(Customer shipper);
}

