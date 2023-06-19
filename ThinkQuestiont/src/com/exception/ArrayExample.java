package com.exception;

import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		
		try {
		System.out.println("Enter the elements: ");
		for(int i=0;i<6;i++) {
			arr[i]=sc.nextInt();
		}
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array Bound Exceed..");
		//System.out.println(e);
	}
	}

}
