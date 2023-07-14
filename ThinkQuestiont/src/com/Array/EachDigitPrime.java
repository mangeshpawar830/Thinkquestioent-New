package com.Array;

public class EachDigitPrime {
	public static void prime(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			int count=0;
			while(num>0) {
				int rem=num%10;
				
				for(int j=2;j<rem;i++) {
					if(rem%j==0)
						count++;
						break;
				}
				
				num=num/10;
			}
				
				if(count==0)
					System.out.println(arr[i]);
			}
		}

		
	
	public static void main(String[] args) {
		int arr[]= {56,77,24,18};
		EachDigitPrime.prime(arr);
		
	}

}
