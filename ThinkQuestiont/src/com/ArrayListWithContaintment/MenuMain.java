package com.ArrayListWithContaintment;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuMain {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	ArrayList<Menu>al=new ArrayList();
	System.out.print("Enter the item you want: ");
	int num=sc.nextInt();
	for(int i=0;i<num;i++) {
		System.out.print("Enter the menu id:");
		int mId=sc.nextInt();
		System.out.print("Enter the menu Name: ");
		String mName=sc.next();
		System.out.println("Enter the menu Item deatils: ");
		System.out.print("Enter the menu item id:");
		int mIid=sc.nextInt();
		System.out.print("Enter the menu item Name: ");
		String mIname=sc.next();
		System.out.print("Enter the menu Item price: ");
		int mIprice=sc.nextInt();
		
		Menu menu=new Menu();
		menu.setMenuId(mId);
		menu.setMenuName(mName);
		menu.setMenuitem(new MenuItem());
		menu.getMenuitem().setMenuItemId(mIid);
		menu.getMenuitem().setMenuItemName(mIname);
		menu.getMenuitem().setMenuItemPrice(mIprice);
		
		al.add(menu);

	}
	System.out.println("------------");
	for(Menu m:al) {
		System.out.println(m.getMenuId()+" "+m.getMenuName()+" "+m.getMenuitem().getMenuItemId()+" "+m.getMenuitem().getMenuItemName()+" "+m.getMenuitem().getMenuItemPrice());
	}
	System.out.println("------Menu Item Price is more then 100----------");
	for(Menu m:al) {
		if(m.getMenuitem().getMenuItemPrice()>100) {
			System.out.println(m.getMenuId()+" "+m.getMenuName()+" "+m.getMenuitem().getMenuItemId()+" "+m.getMenuitem().getMenuItemName()+" "+m.getMenuitem().getMenuItemPrice());
		}
	}
	
	}

}
