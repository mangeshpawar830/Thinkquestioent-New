package com.practice.Array;

import java.util.Arrays;

public class Example3 {
	public static void shift(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(i<arr.length/2) {
					if(arr[i]>arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}else {
					
					if(arr[i]<arr[j]) {
						int temp=arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
					}
			}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}
	public static void main(String[] args) {
		int arr[]= {11,2,3,6,7,9};
		Example3.shift(arr);
	}

}
