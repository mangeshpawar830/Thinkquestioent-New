package com.Array;

import java.util.Scanner;

public class SumOffOddElement {
	void sumOdd(int arr[]){
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0)
				sum=sum+arr[i];
		}
		System.out.println("Sum of odd elements in array is: "+sum);
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[6];
		System.out.println("Enter the elements in array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		SumOffOddElement sum=new SumOffOddElement();
	
		sum.sumOdd(arr);
		
	}

}
