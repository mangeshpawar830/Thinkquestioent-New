package com.Enum;


public class Direction {
	public enum Directions{SOUTH,EAST,WEST,NORTH};
	public static void main(String[] args) {
		Direction d1=new Direction();
		Direction d2=new Direction();
		
		if(d1.equals(d2)) {
			System.out.println("same");
		}
		if(d1==d2) {
			System.out.println("SAME");
		}
		System.out.println(Directions.EAST);
		System.out.println(Directions.NORTH.ordinal());
	}

}
