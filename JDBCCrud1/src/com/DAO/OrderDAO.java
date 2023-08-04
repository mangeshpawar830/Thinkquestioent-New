package com.DAO;

import com.entity.Order;

public interface OrderDAO {
	 public void addOrder(Order order);
	 public void updateOrder(int id);
	 public void deleteOrder(int id);
	 public void searchOrder(int id);
	 public void displayOrder();

}
