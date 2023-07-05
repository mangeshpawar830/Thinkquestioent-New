package com.Collection.ArrayList;

import java.util.*;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();

		System.out.println(al.isEmpty());

		al.add("red");
		al.add("green");
		al.add("black");
		System.out.println(al);

		System.out.println(al.isEmpty());

		System.out.println(al.size());

		al.add(1, "blue");
		System.out.println(al);

		System.out.println(al.get(2));

		al.set(0, "pink");

		System.out.println(al);

		al.remove(2);
		System.out.println(al);

		al.remove("black");
		System.out.println(al);

		ArrayList<String> al2 = new ArrayList();
		al2.add("red");
		al2.add("green");

		System.out.println("al2------  " + al2);

		// al.addAll(al2);
		al.addAll(1, al2);

		System.out.println(al);
		System.out.println(al2);

	}

}
