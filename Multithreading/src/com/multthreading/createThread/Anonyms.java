package com.multthreading.createThread;

public class Anonyms extends Thread{
	public static void main(String[] args) {
		
	
	new Thread() {
		public void run() {
			for (int i=0; i<=5; i++) {
				System.out.println(i);
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}.start();;
	new Thread() {
		public void run() {
			
			for (int i =11; i <15; i++) {
				System.out.println(i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}.start();;
	

}
}