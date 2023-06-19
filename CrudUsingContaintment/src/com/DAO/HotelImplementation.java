package com.DAO;

import java.util.Scanner;

import com.Bean.Hotel;
import com.Bean.Menu;

public class HotelImplementation implements HotelDetails{
	Scanner sc=new Scanner(System.in);
	int count=0;
	Hotel hotel[];
	Menu menu[];
	
	
	public HotelImplementation() {
		count=0;
		hotel=new Hotel[4];
		menu=new Menu[5];
	}

	@Override
	public void Hinsert() {
		System.out.println("Enter the number of hotel: ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.print("Enter the hotel Id: ");
			int id=sc.nextInt();
			System.out.print("Enter the hotel name: ");
			String name=sc.next();
			System.out.println("--------------------");
			System.out.println("Enter the Hotel menu");
			System.out.println("Enter the no of menu: ");
			int num1=sc.nextInt();
			for(int j=0;j<num1;j++) {
			System.out.print("Enter the menu id: ");
			int mId=sc.nextInt();
			System.out.print("Enter the menuName: ");
			String menuName=sc.next();
			System.out.print("Enter the menu price: ");
			
			int menuPrice=sc.nextInt();
			hotel[count]=new Hotel(id,name,new Menu(mId,menuName,menuPrice));
			count++;
			}
		}
		
	}

	@Override
	public void Hupdate() {
		
	}

	@Override
	public void Hdelete() {
		
	}

	@Override
	public void Hsearch(int id) {
		for(int i=0;i<count;i++) {
			if(hotel[i]!=null) {
				if(hotel[i].id==id)
					System.out.println(hotel[i]);
			}
		}
		
	}


	@Override
	public void display() {
		for(int i=0;i<hotel.length;i++) {
			System.out.println(hotel[i]);
		}
		
	}

}
