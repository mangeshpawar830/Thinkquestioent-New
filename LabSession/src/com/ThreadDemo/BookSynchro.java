package com.ThreadDemo;

class Book{
	public synchronized void write() {
		System.out.println(Thread.currentThread().getName()+"Author is written a book");
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Book is available..");
	}
	public synchronized void read() {
		try {
			wait();
			System.out.println(Thread.currentThread().getName()+"Can read book");
			Thread.sleep(1000);

		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	
		
		System.out.println("Book is ready...");
	}
}


class User1{
	Book b=new Book();
	public void run() {
		b.read();
		
	}
	
}
class User2{
	Book b=new Book();
	public void run() {
		b.read();
		
	}
	
}

 class Author{
	 Book b=new Book();
		public void run() {
			b.write();
			
	}
	
}
 class BookSynchro extends Thread{
		

 }
