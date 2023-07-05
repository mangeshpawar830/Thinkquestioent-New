package com.Collection.ComparableComparator;
//create a train class which contain id train name and  number of seats
	//arrange the train on the bass of number of seats n descending order
//if no.of seats are same then arrange on the basis of id

public class Train implements Comparable<Train>{
	int trainId;
	String trainName;
	int noOfSeats;
	
	public Train(int trainId,String trainName,int noOfSeats) {
		this.trainId=trainId;
		this.trainName=trainName;
		this.noOfSeats=noOfSeats;
	}
	
	public String toString() {
		return "Train id:"+trainId+" TrainName: "+trainName+" NoOf Seats: "+noOfSeats;
	}

	@Override
	public int compareTo(Train o) {
		if(o.noOfSeats==this.noOfSeats) 
			
			return o.trainId-this.trainId;
		else
			return o.noOfSeats-this.noOfSeats;
	}
	

}
