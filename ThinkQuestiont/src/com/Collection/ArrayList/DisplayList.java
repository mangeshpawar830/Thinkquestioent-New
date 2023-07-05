package com.Collection.ArrayList;

import java.util.*;
public class DisplayList {

	public static void main(String[] args) {
	
		ArrayList<String>al=new ArrayList<>();
		al.add("pune");
		al.add("mumbai");
		al.add("pune");
		al.add("Goa");
		al.add("Nasik");
		
		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println(".......................");
		
		for(String s:al)
		{
			System.out.println(s);
		}
		System.out.println("..........................");
		
		Iterator<String>itr=al.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println(s);
		}
		
		System.out.println("...............................................");
		
		ListIterator<String>lt=al.listIterator(al.size());
		
		while(lt.hasPrevious())
		{
			System.out.println(lt.previous());
		}
		
		
//		ListIterator<String>ltr=al.listIterator();
//		while(ltr.hasNext())
//		{
//			ltr.next();
//		}
//		
//		while(ltr.hasPrevious())
//		{
//			System.out.println(ltr.previous());
//		}
		

	}

}




















