package com.example.Shipper.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_order")
public class Shipper {
	@Id
	@Column(name = "id")
	private String shipperID;
	@Column(name = "Name")
	private String name;
	@Column(name = "Price")
	private double price;
	@Column(name="Km")
	private int km;
	
	
	@ManyToOne
	@JoinColumn(name ="customerId")
	private Customer customer;


	public String getShipperID() {
		return shipperID;
	}


	public void setShipperID(String shipperID) {
		this.shipperID = shipperID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getKm() {
		return km;
	}


	public void setKm(int km) {
		this.km = km;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Shipper(String shipperID, String name, double price, int km, Customer customer) {
		super();
		this.shipperID = shipperID;
		this.name = name;
		this.price = price;
		this.km = km;
		this.customer = customer;
	}


	public Shipper() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Shipper [shipperID=" + shipperID + ", name=" + name + ", price=" + price + ", km=" + km + ", customer="
				+ customer + ", getShipperID()=" + getShipperID() + ", getName()=" + getName() + ", getPrice()="
				+ getPrice() + ", getKm()=" + getKm() + ", getCustomer()=" + getCustomer() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
	
	
