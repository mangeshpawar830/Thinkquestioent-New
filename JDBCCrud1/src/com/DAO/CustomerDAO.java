package com.DAO;

import com.entity.Customer;

public interface CustomerDAO {
	
	 public void addCustomer(Customer cust);
	 public void updateCustomerFname(int id);
	 public void deleteCustomer(int id);
	 public Customer searchCustomer(int id);
	 public  Customer displayCustomer();

}
