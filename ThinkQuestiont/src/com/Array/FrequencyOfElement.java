package com.Array;

import java.util.Scanner;

public class FrequencyOfElement {
	static void frequency(int arr[]) {
		int n=arr.length;
		boolean visited[]=new boolean[n];
		for(int k=0;k<n;k++) {
			if(visited[k])
				continue;
			int count=1;
			for(int j=k+1;j<arr.length;j++) {
				if(arr[k]==arr[j]) {
					visited[j] = true;
					count++;
			}
		}
		System.out.println(arr[k]+" occure :"+count+" times");
}}
	public static void main(String[] args) {
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		FrequencyOfElement.frequency(arr);
	}

}
