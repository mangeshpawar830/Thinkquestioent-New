package com.practice.Array;

import java.util.Arrays;

public class Example2 {
	public static void zeroshift(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]!=0) {
					if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));

	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,0,0,4,6};
		Example2.zeroshift(arr);
	}

}
