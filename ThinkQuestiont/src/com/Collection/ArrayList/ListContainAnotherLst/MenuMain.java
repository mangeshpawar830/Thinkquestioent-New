package com.Collection.ArrayList.ListContainAnotherLst;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class MenuMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no.of menu: ");
		int noMenu=sc.nextInt();
		ArrayList<Menu>mn=new ArrayList<>();
		for(int i=0;i<noMenu;i++) {
			System.out.print("Enter the menu Id: ");
			int mId=sc.nextInt();
			System.out.print("Enter the menu name: ");
			String mName=sc.next();
			System.out.print("Enter the no.of menu Item:");
			int noMI=sc.nextInt();
			ArrayList<MenuItem>list=new ArrayList<>();
			for(int j=0;j<noMI;j++) {
				System.out.print("Enter the menu item id: ");
				int miID=sc.nextInt();
				System.out.print("Enter the menu item name: ");
				String miName=sc.next();
				System.out.print("Enter the menu item price: ");
				int miPrice=sc.nextInt();
				list.add(new MenuItem(miID,miName,miPrice));
			}
			mn.add(new Menu(mId,mName,list));

		}
		System.out.println("--------------");
		Iterator<Menu>itr=mn.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
