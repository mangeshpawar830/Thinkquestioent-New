package com.Main;

import java.util.Scanner;

import com.DAO.BookImplementation;

public class BookMain {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		BookImplementation b=new BookImplementation();
		char ch;
		do
		{
			System.out.println("Enter the choice for Book");
			System.out.println("1.insert\n2.display\n3.update\n4.delete\n5.search");
			int choice=sc.nextInt();
		switch(choice)
		{
		case 1: 
			b.insert();
			break;
		case 2:
			b.displayAllBooks();
			break;
		case 3:
			System.out.println("Enter the id(update): ");
			int id=sc.nextInt();
			b.update(id);
			break;
		case 4:
			System.out.println("Enter the id(delete): ");
			int id1=sc.nextInt();
			b.delete(id1);
		break;
		case 5:
			System.out.println("Enter the id(search): ");
			int id2=sc.nextInt();
			b.search(id2);
			break;
		default:
			System.out.println("Invalid operation");
		}
		
		System.out.println("Do you want continue");
		ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		
		
		

	}

}