package com.Day4.patternNumber;

/*
 * 
1 
A B 
1 2 3 
A B C D 
*/
public class Pattern5 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2!=0)
				System.out.print(j+" ");
				else
					System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
	}

}
