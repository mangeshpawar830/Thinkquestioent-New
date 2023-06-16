package com.Array.TwoDArray;

import java.util.Arrays;

//write code to find out the addition of two matrices

public class Addition {
	static void add(int arr[][],int arr1[][],int add[][],int row,int coloumn) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<coloumn;j++) {
				add[i][j]=arr[i][j]+arr1[i][j];
			}
						
		}
		System.out.println("Adddition is: ");
		System.out.println(Arrays.deepToString(add));

//		for(int i=0;i<row;i++) {
//			for(int j=0;j<coloumn;j++) {
//				System.out.print(add[i][j]+" ");
//			}
//			
//		}

	}
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{2,3,4}};
		int arr1[][]= {{2,6,5},{8,5,4}};
		
		int row=arr.length;
		int coloumn=arr[0].length;
		int add[][]= new int[row][coloumn];
		Addition.add(arr,arr1,add,row,coloumn);
	}

}
