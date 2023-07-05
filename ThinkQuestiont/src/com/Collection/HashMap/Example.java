package com.Collection.HashMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Example {
	public static void main(String[] args) {
		HashMap<Integer, String>hm=new HashMap<>();
		hm.put(10, "jay");
		hm.put(15, "vedang");
		hm.put(9, "vedant");
		hm.put(19, "suraj");
		
		System.out.println("-------Treemap-------");
		TreeMap<Integer, String>tm=new TreeMap<>(new Mykey());
		tm.putAll(hm);
		
			for(Map.Entry<Integer, String>et:tm.entrySet()) {
				System.out.println(et.getKey()+" "+et.getValue());
			}
			System.out.println("-------Navigable map------------");
			NavigableMap<Integer, String>nm=tm.descendingMap();
			for(Map.Entry<Integer, String>em:nm.entrySet()){
				System.out.println(em.getKey()+" "+em.getValue());
			}
			
		
	}

}
class Mykey implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	}
	
}
