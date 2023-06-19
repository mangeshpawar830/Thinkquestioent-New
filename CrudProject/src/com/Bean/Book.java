package com.Bean;

public class Book {
	public int bookId;
	public String bookName;
	public int price;
	
	public Book(int bookId,String bookName,int price) {
		this.bookId=bookId;
		this.bookName=bookName;
		this.price=price;
	}
	public String toString()
	{
		return bookId+" "+bookName+" "+price;
	}

}
