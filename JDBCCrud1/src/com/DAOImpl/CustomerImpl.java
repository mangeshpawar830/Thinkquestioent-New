package com.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.DAO.CustomerDAO;
import com.entity.Customer;

import JDBCConn.Connect;

public class CustomerImpl implements CustomerDAO{
	static Connection conn=null;
	static PreparedStatement pr;
	static ResultSet rs;
	static Scanner sc=new Scanner(System.in);

	
	
	public CustomerImpl() {
		conn=Connect.getConnect();
		
	}

	@Override
	public void addCustomer(Customer cust) {
		try {
			pr=conn.prepareStatement("insert into customer values(?,?,?,?,?,?)");
			pr.setInt(1, cust.getCust_id());
			pr.setString(2, cust.getFname());
			pr.setString(3, cust.getLname());
			pr.setLong(4, cust.getPhoneNumber());
			pr.setString(5, cust.getEmail());
			pr.setString(6, cust.getAddress());
			
			int rows=pr.executeUpdate();
			if(rows>=1) {
				System.out.println("Customer inserted successfully...");
			}else {
				System.out.println("Customer not inserted..");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

	@Override
	public void updateCustomerFname(int id) {
		
		 try
	     {
	    	 Customer c= new Customer();
	    	 c= searchCustomer(id);
	    	 if(c!=null)
	    	 {
	    	  System.out.println("Customer Old details are:...........................");	 
	         System.out.println(c);		
	         System.out.println(".....................................................");
	         System.out.println("Enter the new mobile number:");
	         long mno= sc.nextLong();
	    	 pr= conn.prepareStatement("update customer set mobileno=? where cid=?");
	    	 pr.setLong(1, mno);
	    	 pr.setInt(2, id);
	    	 
	    	 int noOfRowsUpdated= pr.executeUpdate();
	    	 if(noOfRowsUpdated>0)
	    	 {
	    		 System.out.println("Customer is updated........");
	    	 }
	    	 else
	    	 {
	    		 System.out.println("Error");
	    	 }
	    	
	    	 }
	    	 else
	    	 {
	    		 System.out.println("Customer id doesnot exist..................");
	    	 }
	    	 
	     }
	     catch(Exception e)
	     {
	    	 System.out.println(e);
	     }
			
		}


	@Override
	public void deleteCustomer(int id) {
		try {
			pr=conn.prepareStatement("delete from customer where cid=?");
			pr.setInt(1, id);
			int row=pr.executeUpdate();
			if(row>=1) {
				System.out.println("Deleted successfully..");
			}else {
				System.out.println("error..");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Customer searchCustomer(int id) {
		try {

			pr=conn.prepareStatement("select * from customer where cid=?");
			pr.setInt(1, id);
			rs=pr.executeQuery();
			if(rs.next()) {
				 Customer cust=new Customer();

				cust.setCust_id(rs.getInt(1));
				cust.setFname(rs.getString(2));
				cust.setLname(rs.getString(3));
				cust.setPhoneNumber(rs.getLong(4));
				cust.setEmail(rs.getString(5));
				cust.setAddress(rs.getString(6));
				System.out.println(cust);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public Customer displayCustomer() {
		return null;
	}

}
