package com.multthreading.createThread;

public class JoinMethod  extends Thread {  
		
		public void run() {
			for(int i=1;i<=5;i++) {
				System.out.println( Thread.currentThread().getName()+":"+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		

		public static void main(String[] args) throws InterruptedException {
			JoinMethod t1= new JoinMethod();
			JoinMethod t2= new JoinMethod();
			JoinMethod t3= new JoinMethod();
			
//			t1.start();
//			t1.join();
//			t2.start();
//			
			
			t3.start();
			t3.join();
			t2.start();
			t1.start();
			
			
		}

	

}
