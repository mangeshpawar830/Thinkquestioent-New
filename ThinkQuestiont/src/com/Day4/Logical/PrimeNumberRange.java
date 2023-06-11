package com.Day4.Logical;

public class PrimeNumberRange {
	public static void main(String[] args) {
		for(int num=1;num<=10;num++) {
			int count=0;
			for(int j=2;j<num;j++) {
				if(num%j==0){
					count++;
					break;
				}
				
			}
			if(count==0)
				System.out.println(num);
		}
	}

}
