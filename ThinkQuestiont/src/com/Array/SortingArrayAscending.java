package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArrayAscending {
	public void ascending(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}}
			}
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		SortingArrayAscending sa=new SortingArrayAscending();
		sa.ascending(arr);
		
	}

}
