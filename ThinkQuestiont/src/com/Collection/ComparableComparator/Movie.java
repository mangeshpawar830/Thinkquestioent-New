package com.Collection.ComparableComparator;

public class Movie implements Comparable<Movie>{
	int id;
	String name;
	float rating;
	
	public Movie(int id, String name, float rating) {
		this.id = id;
		this.name = name;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}

	@Override
	public int compareTo(Movie o) {
		//return  (int) (o.rating-this.rating)
		return (int) (this.rating-o.rating);
	}
	
	
	
	
	

}
