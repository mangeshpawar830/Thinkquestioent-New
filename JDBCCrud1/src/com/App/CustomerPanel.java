package com.App;

import java.util.Scanner;

import com.DAOImpl.CustomerImpl;
import com.entity.Customer;

public class CustomerPanel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;
		do{
			System.out.println("------Customer panel----------");
			System.out.println("1: Add Customer");
			System.out.println("2: update Customer");
			System.out.println("3: delete Customer");
			System.out.println("4: search Customer by id");
			System.out.println("5: display all Customer");
			System.out.println("6: Exit Customer panel");
			System.out.println("-----------------------------");
			CustomerImpl ci=new CustomerImpl();
			Customer cust=new Customer();
			ch=sc.nextInt();
			switch(ch){
			case 1:
				System.out.print("Enter customer id: ");
				cust.setCust_id(sc.nextInt());
				System.out.print("Enter first name: ");
				cust.setFname(sc.next());
				System.out.print("Enter last name: ");
				cust.setLname(sc.next());
				System.out.print("Enter phone number: ");
				cust.setPhoneNumber(sc.nextLong());
				System.out.print("Enter email: ");
				cust.setEmail(sc.next());
				System.out.print("Enter address: ");
				cust.setAddress(sc.next());
				ci.addCustomer(cust);
				break;
			case 2:
				System.out.print("Enter customer id to be updated: ");
					int id=sc.nextInt();
					ci.updateCustomerFname(id);
					break;
			case 3:
				System.out.print("Enter the customer id to be deleted: ");
				int id2=sc.nextInt();
				ci.deleteCustomer(id2);
				break;

			
			case 4:
				System.out.print("Enter customer id: ");
				int id1=sc.nextInt();
				ci.searchCustomer(id1);
				break;
				}
			
		}while(ch!=6);
		
	}
	

}
