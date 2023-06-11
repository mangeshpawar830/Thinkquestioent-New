package com.Day4.patternChar;

public class Pattern2 {
	public static void main(String[] args) {
		for(char ch='D';ch>='A';ch--) {
			for(char ch1='A';ch1<=ch;ch1++) {
				System.out.print(ch1+" ");
			}
			System.out.println();
		}
		
	}

}
