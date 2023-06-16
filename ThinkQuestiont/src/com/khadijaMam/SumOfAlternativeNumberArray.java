package com.khadijaMam;

public class SumOfAlternativeNumberArray {
	void sum(int arr[]) {
		for(int i=0;i<arr.length/2;i++) {
			int first=arr[i];
			int last=arr[arr.length-1-i];
			int sum=first+last;
			System.out.println(sum);

				 
			}
		}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		SumOfAlternativeNumberArray sa=new SumOfAlternativeNumberArray();
		sa.sum(arr);
	}

}
