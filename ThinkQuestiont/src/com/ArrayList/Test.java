package com.ArrayList;

import java.util.*;
public class Test {

	public static void main(String[] args) {
		
		
		ArrayList list=new ArrayList();//non-generic
		
		list.add(78);
		list.add("pune");
		list.add('h');
		list.add(90.67);
		
		System.out.println(list);
		
		Iterator<Object>it=list.iterator();
		while(it.hasNext())
		{
			Object o=it.next();
			System.out.println(o);
		}
		
		
		
		ArrayList<Integer>al=new ArrayList<Integer>();//generic-1.5
		al.add(89);
		al.add(56);
		al.add(12);
		al.add(78);
		System.out.println(al);
		for(Integer x:al)
		{
			System.out.println(x);
		}
		
		
		
		
		
		ArrayList<String>al2=new ArrayList<>();		
		
		
		
	}

}
