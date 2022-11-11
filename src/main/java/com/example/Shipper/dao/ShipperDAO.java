package com.example.Shipper.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Shipper.entity.Shipper;

@Repository
public interface ShipperDAO extends JpaRepository<Shipper, String> {
	
}
