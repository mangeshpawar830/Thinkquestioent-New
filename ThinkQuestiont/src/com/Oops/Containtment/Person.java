package com.Oops.Containtment;

public class Person {
	private int id;
	private String name;
	private Address address;
	
	public Person(int id, String name,Address address) {
	       this.id = id;
	       this.name = name;
	       this.address=address;
	    }
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
        return "Person id=" + id + ", name=" + name+ ", address=" + address;
    }
	
	public static void main(String[] args) {
		
        
        Person person=new Person(1,"Mangesh",new Address(431708,"Nanded"));
        System.out.println(person);
	}


		
		
		
		
	
		
		
	}
	
	
	


