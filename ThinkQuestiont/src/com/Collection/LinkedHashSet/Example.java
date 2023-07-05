package com.Collection.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

/*1)create two integer type of set take a one integer value from user as
a input and check that value is present in both the set or not and
find out the position of that value in both the set*/
public class Example {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int find=sc.nextInt();
		
		
		LinkedHashSet<Integer>lhs1=new LinkedHashSet<>();
		LinkedHashSet<Integer>lhs2=new LinkedHashSet<>();
		lhs1.add(10);
		lhs1.add(20);
		lhs1.add(30);
		lhs1.add(40);
		lhs1.add(50);
		lhs1.add(60);
		lhs2.add(10);
		lhs2.add(70);
		lhs2.add(80);
		lhs2.add(20);
		lhs2.add(80);
		
		
		
		
		int position1=0;
		int position2=0;
		if(lhs1.contains(find)) {
			position1=getPosition(lhs1, find);
		}
		if(lhs2.contains(find)) {
			position2=getPosition(lhs2, find);
					
		}
		if(position1!=0&&position2!=0) {
			System.out.println("Both set contains value..");
			System.out.println("position at set1: "+position1);
			System.out.println("position at set2: "+position2);
		}else
			System.out.println("The value does not contains in a set");
		
		
		
		
	}
	static int getPosition(LinkedHashSet<Integer>ls,int find) {
		int position=0;
		for(int i:ls) {
			if(i==find)
				return position;
			position++;
			}
		return 0;
		
	}

}
