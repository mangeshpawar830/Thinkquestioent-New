package jdbcConn.Resultset;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ResultEx {
	Connection conn;
	ResultSet rs;
	Statement st;
	Scanner sc=new Scanner(System.in);
	
	public ResultEx() {
		conn=ClassConeect.getConnect();
		
		try {
			st=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs=st.executeQuery("select * from model");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void Fetchmodel() {
		try {
			rs=st.executeQuery("select * from model");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
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
	
	public void insert() {
		try {
			Fetchmodel();
		
		rs.moveToInsertRow();

		System.out.print("Enter model id: ");
		int id=sc.nextInt();
		System.out.print("Enter model name: ");
		String name=sc.next();
		System.out.print("Enter model cost: ");
		int cost=sc.nextInt();
		rs.updateInt(1, id);
		rs.updateString(2, name);
		rs.updateInt(3, cost);
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
				System.out.println("old cost: "+rs.getInt(3));
				System.out.print("Enter new cost: ");
				int cost=sc.nextInt();
				rs.updateInt(3, cost);
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
		ResultEx re=new ResultEx();
		System.out.print("Enter your choice: ");
		
		
		//re.Fetchmodel();
		System.out.println("------------------");
		//re.FetchmodelReverse();
		//re.insert();
		//re.updateCost();
		//re.delete();
		}
		
	
	
	

}
