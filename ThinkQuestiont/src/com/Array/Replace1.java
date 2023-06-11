package com.Array;

import java.util.Arrays;

public class Replace1 {
	void replace1(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				arr[i]=1;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int arr[]= {2,4,5,9,8};
		Replace1 replace=new Replace1();
		replace.replace1(arr);
		
	}

}
