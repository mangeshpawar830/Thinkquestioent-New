package com.Day4.Logical;

public class RightBottomTriangle2d {
	public static void rightBottom(char ch[][]) {
		int row=ch.length;
		int coloumn=ch[0].length;
		for(int i=0;i<row;i++) {
			for(int j=0;j<coloumn;j++) {
				if(j>=row-i-1) 
					System.out.print(ch[i][j]+" ");
					else
						System.out.print(" ");
				}
			System.out.println();
			}
		}
		
	
	public static void main(String[] args) {
		char ch[][]= {{'a','b','c'},
					{'d','e','f'},
					{'g','h','i'}};	
		RightBottomTriangle2d.rightBottom(ch);
		}

}
