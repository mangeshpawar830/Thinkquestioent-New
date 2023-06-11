package com.Array;

import java.util.Scanner;

public class AlternateNumber {
	public void alternate(int arr[]) {
		for(int i=0;i<arr.length;i+=2) {
			System.out.println(arr[i]);
		}
	}
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter the size of array: ");

    	int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements: ");
        for(int i=0;i<arr.length;i++) {
        	arr[i]=sc.nextInt();
        }
        
        AlternateNumber an=new AlternateNumber();
        System.out.println("Alternate Elements are: ");
        an.alternate(arr);
       
    }
}

