package com.Day4.patternChar;

/*
D C B A 
D C B 
D C 
D 

 */
public class Pattern3 {
	public static void main(String[] args) {
		for(char ch='A';ch<='D';ch++) {
			for(char ch1='D';ch1>=ch;ch1--) {
				System.out.print(ch1+" ");
			}
			System.out.println();
			
		}
	}

}
