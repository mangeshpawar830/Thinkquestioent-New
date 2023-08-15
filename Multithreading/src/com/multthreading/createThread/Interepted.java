package com.multthreading.createThread;

public class Interepted extends Thread{
	
	public void run()
	{
		for(int i = 1; i <= 5;i++)
		{
			if(Thread.interrupted())
			{
				System.out.println("Interrupt : "+i);
			}
			else
			{
				System.out.println("Normal : "+i);
			}
		}
	}

	public static void main(String[] args) {

		Interepted t1 = new Interepted();
		
		t1.interrupt();
		t1.start();
	}
}
	