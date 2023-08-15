package com.ArrayList;

public class Department {
	
	private int did;
	private String dname;
	Employee e;
	
	public Department(int did, String dname, Employee e) {
		this.did = did;
		this.dname = dname;
		this.e = e;
	}

	

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Employee getE() {
		return e;
	}

	public void setE(Employee e) {
		this.e = e;
	}



	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", e=" + e + "]";
	}

	
	
	
	

}
	


