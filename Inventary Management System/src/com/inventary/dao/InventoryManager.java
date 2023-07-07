package com.inventary.dao;

import java.util.ArrayList;
import java.util.List;

import com.inventary.bean.Category;
import com.inventary.bean.InventoryItem;
import com.inventary.bean.Product;

public class InventoryManager {
	List<Product>products;
	List<Category>categories;
	List<InventoryItem>inventary;
	
	public InventoryManager(){
		products=new ArrayList<>();
		categories=new ArrayList<>();
		inventary=new ArrayList<>();
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	public void removeProduct(Product product) {
		products.remove(product);
		for(InventoryItem item:inventary) {
			if(item.getProduct()==product)
				inventary.remove(product);

		}
	}
	public void updateInventory(Product product,int quantity) {
		for(InventoryItem item:inventary) {
			if(item.getProduct()==product) {
				item.setQuantity(quantity);
				return;
			}
		}
		inventary.add(new InventoryItem(product, quantity));
	}
	public void display() {
		for(InventoryItem item:inventary) {
			Product product=item.getProduct();
			System.out.println("Product:"+product.getName()+" "+"Category:  "+product.getCategory().getName()+" "+"Stock level: "+item.getQuantity());
		}
	}
	public void displayTotalValue() {
		double totalvalue=0;
		for(InventoryItem item:inventary) {
			totalvalue=totalvalue+item.getQuantity()*item.getProduct().getPrice();
		}
		System.out.println("Total value: "+totalvalue);
	}
	
	
	
	
	

}
