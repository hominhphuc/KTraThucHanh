package com.example.Shipper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Shipper.entity.Shipper;
import com.example.Shipper.service.ShipperService;

@RestController
@RequestMapping("/api")
public class ShipperController {
	@Autowired
	private ShipperService shipperService;
	
	@PostMapping("shippers")
	public Shipper addShipper(@RequestBody Shipper shipper) {
		shipperService.saveShipper(shipper);
		return shipper;
	}
	
	@GetMapping("shippers/{shipperID}")
	public Shipper findOneShipper(@RequestBody String theId) {
		Shipper  shipper= shipperService.findById(theId);
		return shipper;
	}
}