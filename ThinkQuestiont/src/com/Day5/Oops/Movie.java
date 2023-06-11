package com.Day5.Oops;

import java.util.Scanner;

//write code to create method 1.to accept the details for movie it contain m.id,m.name,ticket cost and no.of tickets
//1.accept the details for movie first method,2.to caolculate the tickete cost and available tickets 
//3.to display movie details including total tickete cost and available tickets

public class Movie {
	
	
		int movieId;
		String movieName;
		int movieCost;
		int noOfTickets;
		int totalCost;
		int totalTicket;
		int availableTicket;
		
		
		public void bill() {
			totalCost=noOfTickets*movieCost;
			availableTicket=totalTicket-noOfTickets;
		}
		public void dislplay() {
			this.bill();
			System.out.println("Movie Id:"+movieId);
			System.out.println("Movie Name:"+movieName);
			System.out.println("Total Cost: "+totalCost);
			System.out.println("Available Tickets: "+availableTicket);
			
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			Movie mv=new Movie();
			System.out.print("Enter Movie Id: ");
			mv.movieId=sc.nextInt();
			System.out.print("Enter Movie Name: ");
			mv.movieName=sc.next();
			System.out.print("Enter Movie Cost: ");
			mv.movieCost=sc.nextInt();
			System.out.print("Enter No.Of Tickets You Have Booked: ");
			mv.noOfTickets=sc.nextInt();
			System.out.print("Available Tickets: ");
			mv.totalTicket=sc.nextInt();
			
			mv.dislplay();
		}

}
