package com.bean;

import java.sql.Date;

public class ServiceRecord {
	Vehicle vehicle;
	Date date;
	String description;
	double cost;
	
	public ServiceRecord(Vehicle vehicle, Date date, String description, double cost) {
		this.vehicle = vehicle;
		this.date = date;
		this.description = description;
		this.cost = cost;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Date getDate() {
		return date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	
	

}
