package com.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//we have to calculate the total bill,for the given menu from order type 
	//of list order contain id,menuname,qty,price
//each menu calculate the bill
class Order{
	int oid;
	String menuName;
	int quantity;
	int price;
	
	public Order(int oid, String menuName, int quantity, int price) {
		super();
		this.oid = oid;
		this.menuName = menuName;
		this.quantity = quantity;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", menuName=" + menuName + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
	
}
public class OrderMain {
	public static void main(String[] args) {
		ArrayList<Order>al=new ArrayList<>();
		al.add(new Order(1, "dosa", 2, 80));
		al.add(new Order(2, "pavbhaji", 1, 150));
		al.add(new Order(3, "dosa", 2, 80));
		al.add(new Order(4, "gulabjamun", 5, 25));
		
		int totalBill=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the menu name: ");
		String menu=sc.next();
		for(int i=0;i<al.size();i++) {
			if(al.get(i).menuName.equals(menu)) {
				int quantity=al.get(i).quantity;
				System.out.println(quantity);
				 totalBill=al.get(i).quantity*al.get(i).price;
			}
			
		}
		
		System.out.println(menu+": "+totalBill);

	}

}
