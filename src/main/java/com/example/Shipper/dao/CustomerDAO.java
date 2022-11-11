package com.example.Shipper.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Shipper.entity.Customer;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, String> {
	
}

