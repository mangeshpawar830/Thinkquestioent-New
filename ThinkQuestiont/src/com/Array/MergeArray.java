package com.Array;

import java.util.Arrays;

public class MergeArray {
	public static void merge(int arr1[],int arr2[]) {
		int merge[]=new int[arr1.length+arr2.length];
		int index=0;
		
			
			for(int j=0;j<arr1.length;j++) {
				merge[index]=arr1[j];
				index++;
				
			}
		
			for(int j=0;j<arr2.length;j++) {
				merge[index]=arr2[j];
				index++;
			}
			
		
		System.out.println(Arrays.toString(merge));
	}
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {6,7,8,9,10};
		MergeArray.merge(arr1, arr2);
	}

}
