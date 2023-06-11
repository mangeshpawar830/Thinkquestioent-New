package com.Day4.patternChar;
/*
A 
A B 
A B C 
A B C D 
*/

public class Pattern1 {
	public static void main(String[] args) {
		for(char ch='A';ch<='D';ch++) {
			for(char ch1='A';ch1<=ch;ch1++) {
				System.out.print(ch1+" ");
			}
			System.out.println();
		}
	}

}
