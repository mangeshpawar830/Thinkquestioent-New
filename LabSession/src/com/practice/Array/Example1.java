package com.practice.Array;

import java.util.Arrays;

public class Example1 {
    public static void merge(int arr[], int arr1[]) {
    	int length=(arr.length+arr1.length)/2;
        int merge[] = new int[length];
        int index=0;
        
        for (int i=0;i<length;i++) {
            if (i%2==0) {
                merge[index]=arr[i];
            } else {
                merge[index]=arr1[i];
            }
            index++;
        }
        
        System.out.println(Arrays.toString(merge));
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int arr1[]={10,20,30,40,50,60};
        Example1.merge(arr,arr1);
    }
}
