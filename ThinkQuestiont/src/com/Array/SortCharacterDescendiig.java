package com.Array;

import java.util.Arrays;

public class SortCharacterDescendiig {
	void descending(char arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
				char temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(arr));

		
	}
	public static void main(String[] args) {
		char arr[]= {'a','b','e','f'};
		SortCharacterDescendiig sd=new SortCharacterDescendiig();
		sd.descending(arr);
		
	}

}
