package com.practice.Str;


import java.util.Arrays;
import java.util.Scanner;

public class StringLengthAdjustment {
	public static void equalParts(String str[],int noOfstr) {
		String st=String.join("", str);
		
		
		if(st.length()%noOfstr!=0) {
			int x=noOfstr-(st.length()%noOfstr);
			for(int i=0;i<x;i++) {
				st=st.concat("#");
			}
		}
		int length=st.length();
			String newstr[]=new String[str.length];
			int index=0;
			for(int i=0;i<length;i+=noOfstr) {
				newstr[index]=st.substring(i,i+noOfstr);
				index++;
			}
		
			System.out.println(Arrays.toString(newstr));
		
		
	}
    public static void main(String[] args) {
        String[] str = {"i", "am", "very","good"};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of string: ");
        int noofstr=sc.nextInt();
        StringLengthAdjustment.equalParts(str,noofstr);
    }
}

