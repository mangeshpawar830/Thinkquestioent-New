package com.Collection.HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PartyMain {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("123", "BJP");
		hm.put("456", "congress");
		hm.put("789", "BJP");
		hm.put("555", "shivsena");
		hm.put("111", "shivsena");
		hm.put("222", "BJP");

		HashMap<String, Integer> m1 = new HashMap<>();
		
		/*
		 * for(String key:hm.values()) { m1.put(key, m1.getOrDefault(key, 0)+1); } int
		 * count=0; for(String value:m1.keySet()) { count=m1.get(value); }
		 */
		 
		
		  ArrayList<String> al = new ArrayList<>(hm.values());
		  for(int i=0;i<al.size();i++) { 
			  int count=Collections.frequency(al,al.get(i)); 
		  		m1.put(al.get(i), count); 
		  }
		 
		 

		Set set = m1.entrySet();

		Iterator<Map.Entry<String, Integer>> it = set.iterator();
		while (it.hasNext()) {
			Entry<String, Integer> m = it.next();
			System.out.println(m.getKey() + " :" + m.getValue());

		}

	}
}
