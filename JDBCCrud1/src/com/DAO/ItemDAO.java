package com.DAO;

import com.entity.Items;

public interface ItemDAO {
	
	 public void addItem(Items item);
	 public void updateItem(int id);
	 public void deleteItem(int id);
	 public void searchItem(int id);
	 public  void displayItem();

}
