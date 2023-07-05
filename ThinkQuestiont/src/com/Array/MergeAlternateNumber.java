package com.Array;

import java.util.Arrays;

public class MergeAlternateNumber {
	public static void mergeAlternate(int arr1[],int arr2[]) {
	    int merge[]=new int[arr1.length+arr2.length];
	    int index=0;
	    int maxLength=Math.max(arr1.length,arr2.length);

	    for (int i=0;i<maxLength;i++) {
	        if (i<arr1.length){
	            merge[index]=arr1[i];
	            index++;
	        }
	        if (i<arr2.length){
	            merge[index]=arr2[i];
	            index++;
	        }
	    }

	    System.out.println(Arrays.toString(merge));
	}
	public static void main(String[]args) {
		int arr1[]={1,2,3,4,5,9};
		int arr2[]={6,7,8,9,10};
		MergeAlternateNumber.mergeAlternate(arr1,arr2);
	}


}
