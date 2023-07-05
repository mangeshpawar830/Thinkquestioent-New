package com.Collection.ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MovieMain {
	public static void main(String[] args) {
		ArrayList<Movie>mv=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter movie we want to add: ");
		int no=sc.nextInt();
		for(int i=0;i<no;i++) {
			System.out.print("Enter movie id: ");
			int id=sc.nextInt();
			System.out.print("Enter movie name: ");
			String name=sc.next();
			System.out.print("Enter movie rating: ");
			float rating=sc.nextFloat();
			
			mv.add(new Movie(id, name, rating));
			}
		System.out.println("-----------------");
		for(Movie m:mv) {
			System.out.println(m);
		}
		Collections.sort(mv);
		System.out.println("-----------------");
		for(Movie m:mv) {
			System.out.println(m);
		}
	}

}
