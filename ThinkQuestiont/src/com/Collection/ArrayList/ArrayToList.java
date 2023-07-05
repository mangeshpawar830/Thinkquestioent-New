package com.Collection.ArrayList;

import java.util.*;
public class ArrayToList {

	public static void main(String[] args) {
	
		
		Integer a[]= {6,5,23,7};
		
		ArrayList<Integer>al=new ArrayList(Arrays.asList(a));
		
		System.out.println(al);
		
		
		ArrayList<Integer>al2=new ArrayList<>();
		
		Collections.addAll(al2, a);
		
		System.out.println(al2);
		
		ArrayList<Integer>al3=new ArrayList<>();
		
		for(int i=0;i<a.length;i++)
		{
			al3.add(a[i]);
		}
		
		System.out.println(al3);

	}

}

