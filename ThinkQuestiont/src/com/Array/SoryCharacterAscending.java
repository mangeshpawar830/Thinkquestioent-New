package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SoryCharacterAscending {
	static void ascending(char arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}
	public static void main(String[] args) {
		char arr[]=new char[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character in the array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next().charAt(0);
		}
		SoryCharacterAscending.ascending(arr);
	}

}
