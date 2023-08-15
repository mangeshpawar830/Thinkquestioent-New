package com.interthread;

class Shared1
{
	public synchronized void method1()
	{
		System.out.println(Thread.currentThread().getName()+"has locked method");
		System.out.println(Thread.currentThread().getName()+"has released method");
		
		try
		{
			wait();
		}
		catch (InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println(Thread.currentThread().getName()+"has Finished the  method");
	}
	
	public synchronized void method2()
	{
		try
		{
			Thread.sleep(1500);
		}
		catch (InterruptedException e) {
			System.out.println(e);
		}
		 
		notifyAll();
		System.out.println(Thread.currentThread().getName()+"has notfiy method");
	}
	
}

public class InterthreadComm2 extends Thread {

	public static void main(String[] args) {
		
		Shared1 s=new Shared1();
		Thread t=new Thread()
		{
			public void run()
			
			{
				s.method1();
			}
		};
		
		Thread t2=new Thread()
				{
			public void run()
			{
				s.method2();
			}
				};
				
				t.start();
				t2.start();

	
	Thread t3=new Thread()
	{
		public void run()
		{
			s.method1();
		}
	};
	
	t3.start();
	
		


	}
}

