package com.String;

import java.util.Arrays;

public class ReverseAStringWord {
	public static void reverse(String st) {
		String str[]=st.split(" ");
		String rev="";
		
		for(int i=0;i<str.length;i++) {
			for(int j=str[i].length()-1;j>=0;j--) {
				
				rev=rev+str[i].charAt(j);
			}
			rev=rev+" ";
		}
		System.out.println(rev);
		
		
	}
	public static void main(String[] args) {
		String st="i love java programming";
		ReverseAStringWord.reverse(st);
	}

}
