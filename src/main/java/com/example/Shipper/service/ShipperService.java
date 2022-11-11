package com.example.Shipper.service;

import org.springframework.stereotype.Service;
import com.example.Shipper.entity.Shipper;

public interface ShipperService {
	public Shipper findById(String theId);
	public void saveShipper(Shipper shipper);
}
