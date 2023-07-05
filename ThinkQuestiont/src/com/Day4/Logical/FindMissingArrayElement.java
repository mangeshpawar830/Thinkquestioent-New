package com.Day4.Logical;

public class FindMissingArrayElement {
	public static void missing(int arr1[],int arr2[]) {
		for(int i=0;i<arr1.length;i++) {
			boolean isFound=false;

			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					isFound=true;
					break;
				}
				
			}
			if(isFound!=true)
				System.out.println(arr1[i]);
		}
		
	}
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {1,2,4,6};
		FindMissingArrayElement.missing(arr1, arr2);
		
	}

}
