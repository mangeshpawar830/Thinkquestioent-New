package jdbcConn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedSTMTDemo {
	public static Connection conn=null;
	public static Statement st;
	public static PreparedStatement pr;
	static Scanner sc=new Scanner(System.in);
	
	public PreparedSTMTDemo() {
		conn=DBConn.getConnect();
		System.out.println("Connection done..");
		
		try {
			st=conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void insert() {
		System.out.print("Enter model id: ");
		int id=sc.nextInt();
		System.out.print("Enter model name: ");
		String name=sc.next();
		System.out.print("Enter model cost: ");
		int cost=sc.nextInt();
		
		try {
			pr=conn.prepareStatement("insert into model values(?,?,?)");
			pr.setInt(1, id);
			pr.setString(2, name);
			pr.setInt(3, cost);
			int noOfrow=pr.executeUpdate();
			if(noOfrow>=1) {
				System.out.println("Inserted successfully...");
			}else {
				System.out.println("error");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void delete(int id) {
		try {
			int noOfRows=st.executeUpdate("delete from model where model_id="+id);
			if(noOfRows>=1) {
				System.out.println("Deleted..");
			}else {
				System.out.println("error...");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void delete1(int id) {
		try {
			pr=conn.prepareStatement("delete from model where model_id=?");
			pr.setInt(1, id);
			int noOFRows=pr.executeUpdate();
			if(noOFRows>=1) {
				System.out.println("Deleted..");
			}
			else {
				System.out.println("Error..");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void updateCost(int id) {
		System.out.print("Enter the new cost: ");
		int cost=sc.nextInt();
		try {
			pr=conn.prepareStatement("update model set cost=? where model_id=?");
			pr.setInt(1, cost);
			pr.setInt(2, id);
			int noOfRows=pr.executeUpdate();
			if(noOfRows>=1) {
				System.out.print("updated successfully: ");
			}else {
				System.out.println("Error...");
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}
	public void updateModelName(int id) {
		System.out.print("Enter new model name: ");
		String name=sc.next();
		try {
			pr=conn.prepareStatement("update model set model_name=? where model_id=?");
			pr.setString(1, name);
			pr.setInt(2, id);
			int noOfRows=pr.executeUpdate();
			if(noOfRows>=1) {
				System.out.println("Updated Successfully...");
			}else {
				System.out.println("error...");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		PreparedSTMTDemo ps=new PreparedSTMTDemo();
		//ps.insert();
		System.out.print("Enter the id: ");
		int id=sc.nextInt();
		//ps.delete(id);
		//ps.delete1(id);
		ps.updateCost(id);
		//ps.updateModelName(id);
	}

}
