package com.entity;

public class Customer {
	private int cust_id;
	private String fname;
	private String lname;
	private long phoneNumber;
	private String email;
	private String address;
	
	public Customer(int cust_id, String fname,String lname, long phoneNumber, String email, String address) {
		super();
		this.cust_id = cust_id;
		this.fname = fname;
		this.lname = lname;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}
	
	

	public Customer() {
		super();
	}



	public int getCust_id() {
		return cust_id;
	}



	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public long getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", fname=" + fname + ", lname=" + lname + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", address=" + address + "]";
	}

	
	

}
