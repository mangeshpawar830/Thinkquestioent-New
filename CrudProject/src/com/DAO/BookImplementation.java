package com.DAO;

import java.util.Scanner;

import com.Bean.Book;

public class BookImplementation implements BookDetails {

	Book[] book;
	int count;
	Scanner sc = new Scanner(System.in);

	public BookImplementation() {
		count = 0;
		book=new Book[4];
	}

	@Override
	public void search(int id) {
		for (int i = 0; i < count; i++) {
			if (book[i] != null) {
				if (book[i].bookId == id) {
					System.out.println(book[i]);
				}
			}
		}

	}

	@Override
	public void insert() {
		System.out.println("Enter the no .of book");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println("Entre the bookId");
			int bid = sc.nextInt();
			System.out.println("Enter the book_name");
			String bname = sc.next();
			System.out.println("enter the Price");
			int price = sc.nextInt();
	
			book[count] = new Book(bid, bname, price);
			count++;

		}

	}

	@Override
	public void update(int id) {
		System.out.println("Enter the choice we want to update: ");
		System.out.println("1.Id\n2.Name\n3.Price");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the new id");
			int id1=sc.nextInt();
			for(int i=0;i<count;i++) {
				if(book[i].bookId==id&&book[i]!=null) {
					book[i].bookId=id1;
				}
			}
			break;
		case 2:
			System.out.println("Enter the new name");
			String name=sc.next();
			for(int i=0;i<count;i++) {
				if(book[i].bookId==id&&book[i]!=null) {
					book[i].bookName=name;
				}
			}
			break;
		case 3:
		System.out.println("enter the new Price");
		int price = sc.nextInt();
		for (int i = 0; i < count; i++) {
			if (book[i].bookId == id && book[i] != null) {
				book[i].price = price;
			}
		}
		break;
		}
		}



	@Override
	public void delete(int id) {

		for (int i = 0; i < count; i++) {
			if (book[i] != null) {
				if (book[i].bookId == id) {
					book[i] = null;
				}
			}
		}
	}

	@Override
	public void displayAllBooks() {

		for (int i = 0; i < count; i++) {
			System.out.println(book[i]);
		}

	}

}