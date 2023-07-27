package com.Array;

import java.util.Scanner;


public class DisplayPrimeNumber {
	
	public void primeNumber(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(arr[i]%j==0)
					count++;
			}
			if(count==0)
				System.out.println(arr[i]);
		}
		
		}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element in array: ");
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		DisplayPrimeNumber dp=new DisplayPrimeNumber();
		System.out.println("Prime numbers in given array: ");
		dp.primeNumber(arr);
	}

}
