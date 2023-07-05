package com.Array;

public class MaxElementFromArray {
	public static void max(int arr[]) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println(max);
		
	}
	public static void main(String[] args) {
		int arr[]= {11,22,33,44,55};
		MaxElementFromArray.max(arr);
		
	}

}
