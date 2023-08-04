package com.entity;

public class Order {
	private int order_id;
	private int cust_id;
	private int item_id;
	private int qty;
	private String orderStatus;
	private String payStatus;
	private int total_cost;
	
	public Order(int order_id, int cust_id, int item_id, int qty, String orderStatus, String payStatus,
			int total_cost) {
		super();
		this.order_id = order_id;
		this.cust_id = cust_id;
		this.item_id = item_id;
		this.qty = qty;
		this.orderStatus = orderStatus;
		this.payStatus = payStatus;
		this.total_cost = total_cost;
	}
	
	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public int getTotal_cost() {
		return total_cost;
	}

	public void setTotal_cost(int total_cost) {
		this.total_cost = total_cost;
	}

	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", cust_id=" + cust_id + ", item_id=" + item_id + ", qty=" + qty
				+ ", orderStatus=" + orderStatus + ", payStatus=" + payStatus + ", total_cost=" + total_cost + "]";
	}
	
	
	
	
	

	

}
