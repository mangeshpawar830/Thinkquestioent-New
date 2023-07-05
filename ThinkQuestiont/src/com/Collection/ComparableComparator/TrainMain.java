package com.Collection.ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TrainMain {
	public static void main(String[] args) {
		ArrayList<Train>tr=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of train: ");
		int nooftrain=sc.nextInt();
		for(int i=0;i<nooftrain;i++) {
		System.out.print("Enter the train id: ");
		int trainid=sc.nextInt();
		System.out.print("Enter the train name: ");
		String trainname=sc.next();
		System.out.print("Enter the no of seats: ");
		int noofseats=sc.nextInt();
		tr.add(new Train(trainid,trainname,noofseats));
		
		
		}
		for(Train t:tr) {
			System.out.println(t);
		}
		System.out.println("-----------");
		Collections.sort(tr);
		for(Train t:tr) {
			System.out.println(t);
		}
		
	}

	

}
