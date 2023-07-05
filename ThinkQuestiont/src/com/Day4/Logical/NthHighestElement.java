package com.Day4.Logical;

import java.util.Scanner;

public class NthHighestElement {
	public static void nthhighest(int arr[],int nth) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[nth-1]);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements: ");
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the nth element: ");
		int nth=sc.nextInt();
		NthHighestElement.nthhighest(arr, nth);
	}

}
