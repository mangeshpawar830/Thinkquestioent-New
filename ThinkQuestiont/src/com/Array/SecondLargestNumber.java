package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumber {
	public static void getSecondLargest(int arr[] ){
		int length=arr.length;
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}

			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[length-2]);
		
		
	}
	
	public static void main(String[] args) {
		int arr[]= new int[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		getSecondLargest(arr);
	}

}
