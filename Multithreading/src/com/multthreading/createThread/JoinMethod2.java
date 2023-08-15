package com.multthreading.createThread;

public class JoinMethod2 {
	public static void main(String[] args) {
		
	
	Thread t = new Thread() {
		public void run() {
			for (int i = 1; i <= 5; i++) {

				System.out.println(Thread.currentThread().getName() + " :" + i);
				//System.out.println("Thread"+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}

		}

	};

	Thread t2 = new Thread() {
		public void run() {
			 try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for (int i = 11; i <= 15; i++) {
				System.out.println(Thread.currentThread().getName() + " :" + i);
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		}
	};

	Thread t3 = new Thread() {
		public void run() {
			for (int i = 21; i <= 25; i++) {
				System.out.println(Thread.currentThread().getName() + " :" + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		}
	};

	t.start();
	//t.join();
	t2.start();
	t3.start();

}
}


