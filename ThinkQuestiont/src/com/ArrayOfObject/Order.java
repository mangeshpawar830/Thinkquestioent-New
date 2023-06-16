package com.ArrayOfObject;
//create array of order order has order_d,cust_name,order_quantity,order_status
	//create order using getter setter 1. display all the orders 2.display only 
	//orders which quantity is more than 2

public class Order {
	int orderId;
	String custName;
	int orderQuantity;
	String orderStatus;
	
	public void setOrderId(int orderId) {
		this.orderId=orderId;
	}
	public void setCustName(String custName) {
		this.custName=custName;
	}
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity=orderQuantity;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus=orderStatus;
	}
	public int getOrderId() {
		return orderId;
	}
	public String getCustName() {
		return custName;
	}
	public int getOrderQuantity() {
		return orderQuantity;
	}
	public String getOrderStatus() {
		return orderStatus;
	}

}
