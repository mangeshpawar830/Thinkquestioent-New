package com.multthreading.demo;

public class ThreadState {
	public static void main(String[] args) {
		Thread.State[] stat=Thread.State.values();
		for(Thread.State s:stat) {
			System.out.println(s);
		}

	}

}
