package com.Array;

public class FindOutEvenPosition {
	void evenPosition(int arr[]){
		for(int i=0;i<arr.length;i++) {
			if(i%2==0)
				System.out.println(arr[i]);
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]= {2,4,6,8};
		FindOutEvenPosition even=new FindOutEvenPosition();
		even.evenPosition(arr);
	}

}
