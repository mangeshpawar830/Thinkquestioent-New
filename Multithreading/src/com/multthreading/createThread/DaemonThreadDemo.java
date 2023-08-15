package com.multthreading.createThread;

public class DaemonThreadDemo extends Thread{
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon: "+Thread.currentThread().getId()+"> "+Thread.currentThread().getPriority());
		}else {
			System.out.println("User: "+Thread.currentThread().getName()+"> "+Thread.currentThread().getPriority());
		}
		
	}
	public static void main(String[] args) {
		DaemonThreadDemo dm=new DaemonThreadDemo();
		DaemonThreadDemo dm1=new DaemonThreadDemo();
		dm.setDaemon(true);
		dm.start();
		dm1.start();
	}

}
