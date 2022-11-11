package com.example.Shipper.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Shipper.dao.CustomerDAO;
import com.example.Shipper.entity.Customer;
import com.example.Shipper.service.CustomerService;

@Service
public class CustomerServiceImlp implements CustomerService {
	@Autowired
	private CustomerDAO customerDao;
	
	public Customer findById(String theId) {
		Optional<Customer> result = customerDao.findById(theId);
		Customer customer = null;
		if (result.isPresent()) {
			customer = result.get();
		}
		else {
			throw new RuntimeException("Did not find student id="+ theId);
		}
 		return customer;
	}
	
	public void saveCustomer(Customer shipper) {
		 customerDao.save(shipper);
		 

	}

}