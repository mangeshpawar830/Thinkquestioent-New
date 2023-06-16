package com.ArrayOfObject;

import java.util.Scanner;

public class OrderMain {
	public static void main(String[] args) {
		Order order[]=new Order[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<order.length;i++) {
			System.out.print("Enter the Order id: ");
			int orderId=sc.nextInt();
			System.out.print("Enter Customer name: ");
			String custName=sc.next();
			System.out.print("Enter the order quantity: ");
			int orderQuantity=sc.nextInt();
			System.out.print("Enter the order status: ");
			String orderStatus=sc.next();
			
			order[i]=new Order();
			order[i].setOrderId(orderId);
			order[i].setCustName(custName);
			order[i].setOrderQuantity(orderQuantity);
			order[i].setOrderStatus(orderStatus);
			
		}
		System.out.println("-----Order Details-----");
		for(int i=0;i<order.length;i++) {
			System.out.println(order[i].getOrderId()+" "+order[i].getCustName()+" "+order[i].getOrderQuantity()+" "+order[i].getOrderStatus());
		}
		System.out.println("-----Order Quantity is Greter than 2---------");
		for(int i=0;i<order.length;i++) {
			if(order[i].getOrderQuantity()>2)
				System.out.println(order[i].getOrderId()+" "+order[i].getCustName()+" "+order[i].getOrderQuantity()+" "+order[i].getOrderStatus());
		}
	}

}
