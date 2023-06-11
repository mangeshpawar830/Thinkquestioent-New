package com.Day4.patternStar;

/*
*   
**  
* * 
**** 
*/
public class Pattern7 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(j==1 || i==j || i==4)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
