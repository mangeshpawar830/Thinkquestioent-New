package com.Oops.Containtment;

public class Address {
	private int pincode;
	private String city;
	
	public Address(int pincode, String city) {
	       this.pincode = pincode;
	       this.city = city;
	    }
	
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	 public String toString() {
	        return "Address pincode=" + pincode + ", city=" + city;
	    }
	
	
	

}
