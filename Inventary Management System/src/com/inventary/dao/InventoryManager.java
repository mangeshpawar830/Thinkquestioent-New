package com.inventary.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.inventary.bean.Category;
import com.inventary.bean.InventoryItem;
import com.inventary.bean.Product;

import jdbcConn.DBConnect;

public class InventoryManager {
	List<Product> products;
	List<Category> categories;
	List<InventoryItem> inventary;
	Connection conn;
	PreparedStatement pr;

	public InventoryManager() {
		conn=DBConnect.getConnect();
		products = new ArrayList<>();
		categories = new ArrayList<>();
		inventary = new ArrayList<>();
	}

	public void addProduct(Product product) {
		try {

            pr = conn.prepareStatement("INSERT INTO product (id, name, category_id, price) VALUES (?, ?, ?, ?)");
            pr.setInt(1, product.getId());
            pr.setString(2, product.getName());
            pr.setInt(3, product.getCategory().getId());
            pr.setDouble(4, product.getPrice());

            int rowsInserted = pr.executeUpdate();

            if (rowsInserted > 0) {
                products.add(product);
                
                pr=conn.prepareStatement("INSERT INTO category (id, name) VALUES (?, ?)");
                
                pr.setInt(1, product.getCategory().getId());
                pr.setString(2, product.getCategory().getName());
                pr.executeUpdate();
            	
                pr = conn.prepareStatement("INSERT INTO inventory_item (product_id) VALUES (?)");
                pr.setInt(1, product.getId());
                pr.executeUpdate();


                InventoryItem inventoryItem = new InventoryItem(product, 0);
                inventary.add(inventoryItem);

                System.out.println("Product added successfully.");
            } else {
                System.out.println("Failed to add product.");
            }

            pr.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
    


	public void removeProduct(Product product) {
		products.remove(product);
		for (InventoryItem item : inventary) {
			if (item.getProduct() == product)
				inventary.remove(product);

		}
	}

	public void updateInventory(Product product, int quantity) {
		for (InventoryItem item : inventary) {
			if (item.getProduct() == product) {
				item.setQuantity(quantity);
				return;
			}
		}
		inventary.add(new InventoryItem(product, quantity));
	}

	public void display() {
		for (InventoryItem item : inventary) {
			Product product = item.getProduct();
			System.out.println("Product:" + product.getName() + " " + "Category:  " + product.getCategory().getName()
					+ " " + "Stock level: " + item.getQuantity());
		}
	}

	public void displayTotalValue() {
		double totalvalue = 0;
		for (InventoryItem item : inventary) {
			totalvalue = totalvalue + item.getQuantity() * item.getProduct().getPrice();
		}
		System.out.println("Total value: " + totalvalue);
	}

	public List<Product> searchByName(String name) {
		List<Product> matchingProducts = new ArrayList<>();
		for (Product product : products) {
			if (product.getName().equalsIgnoreCase(name)) {
				matchingProducts.add(product);
			}
		}
		return matchingProducts;

	}

	
	  public List<Product> searchByCategory(Category category) {
	  List<Product>matchingProducts=new ArrayList<>();
	  for(Product product:products) {
		  if(product.getCategory().equals(category)) {
	  matchingProducts.add(product); 
	  } 
	  } 
	  return matchingProducts; }
	 

}
