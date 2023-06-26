package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFast {

	public static void main(String[] args) {
		
		
		ArrayList<String>al=new ArrayList<>();
		al.add("pune");
		al.add("mumbai");
		al.add("nasik");
		al.add("goa");
		al.add("nagpur");
		al.add("Bangor");
		
		System.out.println(al);
		
		
		Iterator<String>itr=al.iterator();
		
		while(itr.hasNext())
		{
			String s=itr.next();
			if(s.equals("nasik"))
			{
				//al.remove(s);//fail-fast
				itr.remove();//fail-safe
				
			}
		}
		
		System.out.println(al);
	
	}

}