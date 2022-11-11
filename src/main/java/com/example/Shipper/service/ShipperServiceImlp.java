package com.example.Shipper.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Shipper.dao.ShipperDAO;
import com.example.Shipper.entity.Shipper;

public class ShipperServiceImlp implements ShipperService {
	
	@Autowired
	private ShipperDAO shipperDAO;
	public Shipper findById(String theId) {
		Optional<Shipper> result = shipperDAO.findById(theId);
		Shipper shipper = null;
		if (result.isPresent()) {
			shipper = result.get();
		}
		else {
			throw new RuntimeException("Did not find shipper id="+ theId);
		}
 		return shipper;
	}

	public void saveShipper(Shipper shipper) {
		// TODO Auto-generated method stub
		shipperDAO.save(shipper);
		
	}

}
