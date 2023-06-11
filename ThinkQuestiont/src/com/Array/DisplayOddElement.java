package com.Array;

import java.util.Scanner;

public class DisplayOddElement {
	
	public void oddElement(int arr[]) {
		for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0)
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array element: ");
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		DisplayOddElement displayOddElement = new DisplayOddElement();
		System.out.println("Odd Elemets in given array: ");
		displayOddElement.oddElement(arr);
		

	}


}

//write code to display prime numbers from the array
//linear search
//sorting integer type of array with ascending and descending 
//sorting character type of array with ascending and descending 
//frequency of each element in array
//frequency of given element
//find of unique element in array
//find duplicate element in array
//create two integer type of array and merge both array into the third array
//write code to merge 2 array into third array without duplicate element.
//

