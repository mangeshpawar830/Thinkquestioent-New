package com.Main;

import java.util.Scanner;

import com.Bean.Hotel;
import com.Bean.Menu;
import com.DAO.HotelImplementation;

public class HotelMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		HotelImplementation hi=new HotelImplementation();
		char ch;
		do{
		System.out.println("Enter the choice: ");
		System.out.println("1.insert\n2.display\n3.update\n4.delete\n5.search");
		int input=sc.nextInt();
		switch(input) {
		case 1:
			hi.Hinsert();
			break;
		case 2:
			hi.display();
			break;
		case 5:
			hi.Hinsert();
			break;
		default:
			System.out.println("Invalid input");
			
			
			
		}
		System.out.println("Do you want to continue: ");
		ch=sc.next().charAt(0);
		}while(ch=='y'|| ch=='Y');
	}

}
