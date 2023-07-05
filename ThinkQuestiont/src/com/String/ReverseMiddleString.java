package com.String;

public class ReverseMiddleString {
	public static void reverse(String st) {
		String str[]=st.split(" ");
		String rev="";
		for(int i=0;i<str.length;i++) {
			if(i==0||i==str.length-1) {
				for(int j=0;j<str[i].length();j++) {
					rev=rev+str[i].charAt(j);
				}
				rev=rev+" ";
			}else {
				for(int j=str[i].length()-1;j>=0;j--) {
					rev=rev+str[i].charAt(j);
				}
				rev=rev+" ";
			}
		}
		System.out.println(rev);

		
		
	}
	
	

	
	public static void main(String[] args) {
		String st="i love java programming";
		ReverseMiddleString.reverse(st);
	}

}
