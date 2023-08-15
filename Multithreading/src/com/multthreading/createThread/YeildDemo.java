package com.multthreading.createThread;

public class YeildDemo extends Thread{
	public static void main(String[] args) {
		Thread t1=new Thread() {
			
			public void run() {
				for(int i=1;i<=5;i++)
				   {
					   Thread.yield();
					   System.out.println(i);
					
				   }
			}
			
		};
		 Thread t2 = new Thread(){
				
				public void run()
				{
				   for(int i=11;i<=15;i++)
				   {
					   System.out.println(i);
					 
				   }
				}
				
			};
			
	    Thread t3 = new Thread(){
				
				public void run()
				{
				   for(int i=21;i<=25;i++)
				   {
					   System.out.println(i);
					   
				   }
				}
				
			};
			
			t1.start();
			t2.start();
			t3.start();
			
		}	

}
