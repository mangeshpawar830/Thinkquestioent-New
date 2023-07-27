package com.Array;


public class CombineEvenOdd {
	void evenOdd(int arr[],int[] evenOddArray,int evenIndex,int oddIndex) {
	for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0) {
            evenOddArray[evenIndex] = arr[i];
            evenIndex++;
        } else {
            evenOddArray[oddIndex] = arr[i];
            oddIndex--;
        }
    }
	
	for (int i = 0; i < evenOddArray.length; i++) {
        System.out.print(evenOddArray[i] + " ");
    }
}
	public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6,};
	        int[] evenOddArray = new int[arr.length];
	        int evenIndex = 0;
	        int oddIndex = arr.length - 1;
	        CombineEvenOdd cb=new CombineEvenOdd();
	        cb.evenOdd(arr, evenOddArray, evenIndex, oddIndex);
	        
	    }
}
	
