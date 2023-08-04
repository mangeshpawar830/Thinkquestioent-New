package jdbcConn.Resultset;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Example {
	Connection conn;
	ResultSet rs;
	Statement st;
	static Scanner sc=new Scanner(System.in);
	
	public Example() {
		conn=ClassConeect.getConnect();
		
		try {
			st=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs=st.executeQuery("select * from customer");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void Fetchmodel() {
		try {
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4)+" "+rs.getString(5)+" "+rs.getString(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	//Reverse
	public void FetchmodelReverse() {
		try {
			rs.afterLast();
			while(rs.previous()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void SecondLastRow() {
		try {
			if(rs.absolute(-2)) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void insert() {
		try {
			Fetchmodel();
		
		rs.moveToInsertRow();

		System.out.print("Enter customer id: ");
		int id=sc.nextInt();
		System.out.print("Enter customer first name: ");
		String fname=sc.next();
		System.out.print("Enter customer last name: ");
		String lname=sc.next();
		System.out.println("Enter phone number: ");
		double phone=sc.nextInt();
		System.out.println("enter gender: ");
		String gender=sc.next();
		System.out.println("enter email: ");
		String email=sc.next();
		rs.updateInt(1, id);
		rs.updateString(2, fname);
		rs.updateString(3, lname);
		rs.updateDouble(4, phone);
		rs.updateString(4, gender);
		rs.updateString(5, email);
		rs.insertRow();
		
		System.out.println("-------------------");
		Fetchmodel();
		
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	public void updateCost() {
		Fetchmodel();
		System.out.println("Enter the id: ");
		int id=sc.nextInt();
		try {
		rs.beforeFirst();
		while(rs.next()) {
			if(rs.getInt(1)==id) {
				System.out.println("old phone: "+rs.getInt(4));
				System.out.print("Enter new phone: ");
				double phone=sc.nextInt();
				rs.updateDouble(4, phone);
				rs.updateRow();
				
			}
		}
		Fetchmodel();
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	public void delete() {
		Fetchmodel();
		System.out.println("Enter the id: ");
		int id=sc.nextInt();
		try {
			rs.beforeFirst();
			while(rs.next()) {
				if(rs.getInt(1)==id) {
					rs.deleteRow();
				}
			}

			
		}catch (Exception e) {
			System.out.println(e);
		}
		Fetchmodel();
	}
	
	public static void main(String[] args) {
		Example e=new Example();
		//e.Fetchmodel();
		//System.out.println("-------------");
		//e.FetchmodelReverse();
		//System.out.println("--------------");
		//e.SecondLastRow();
		System.out.println("-------------------------");
		System.out.println("1.insert\n2.updatephone\n3.delete\n4.display");
		System.out.println("-------------------------");
		System.out.print("Enter input: ");
		
		int input=sc.nextInt();
		switch (input) {
		case 1: 
			e.insert();
			break;
		case 2:
			e.updateCost();
			break;
		case 3:
			e.delete();
			break;
		case 4:
			e.Fetchmodel();
		
		default:System.out.println("invalid input..");
		}
	}
	

}
