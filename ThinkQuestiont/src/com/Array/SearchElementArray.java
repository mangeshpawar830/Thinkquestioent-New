package com.Array;

import java.util.Scanner;

public class SearchElementArray {
	public void search(int arr[],int givenNumber) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==givenNumber)
				count++;
		}
		if(count==0)
			System.out.println("It is not present");
		else
			System.out.println("It is present"+count+" times");
			
		
	}
	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements in array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the given number: ");
		int givenNumber=sc.nextInt();
		SearchElementArray searchArray=new SearchElementArray();
		
		searchArray.search(arr,givenNumber);
	}

}
