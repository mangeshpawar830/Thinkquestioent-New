package JDBCConn2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class FetchData {
	public static Connection con=null;
	public static PreparedStatement pr;
	static ResultSet rs;
	public static Scanner sc=new Scanner(System.in);
	
	public FetchData(){
		con=Connect.getConnect();
		
		
	}
	
	public void insert() {
		System.out.print("Enter emploee id: ");
		int id=sc.nextInt();
		System.out.print("Enter employee name: ");
		String name=sc.next();
		System.out.print("Enter the dept id: ");
		int dept_id=sc.nextInt();
		
		try {
			pr=con.prepareStatement("insert into employee values(?,?,?)");
			pr.setInt(1, id);
			pr.setString(2, name);
			pr.setInt(3, dept_id);
			
			 int noRow=pr.executeUpdate();
			if(noRow>=1) {
				System.out.println("inserted successfully....");
			}else {
				System.out.println("error");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void update() {
		System.out.print("Enter employee id you eant to update:  ");
		int emp_id=sc.nextInt();
		System.out.print("Enter employee new name:  ");
		String name=sc.next();

		
		try {
		pr=con.prepareStatement("update employee set name=? where id=? ");
		pr.setString(1, name);
		pr.setInt(2, emp_id);
		int rows=pr.executeUpdate();
		if(rows>=1) {
			System.out.println("updated...");
		}else {
			System.out.println("error");
		}
		}catch(Exception e){
			System.out.println(e);
		}
		
		
	}
	public void delete() {
		System.out.print("Enter employee id you want to delete: ");
		int id=sc.nextInt();
		
		try {
			pr=con.prepareStatement("delete from employee where id=?");
			pr.setInt(1, id);
			int rows=pr.executeUpdate();
			if(rows>=1) {
				System.out.println("deleted..");
			}else {
				System.out.println("Error...");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void display() {
		try {
			pr=con.prepareStatement("select * from employee");
			rs=pr.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void search() {
		System.out.print("Enter employee id you want to search: ");
		int id=sc.nextInt();
		try {
			pr=con.prepareStatement("select * from employee where id=?");
			pr.setInt(1, id);
			rs=pr.executeQuery();
			
			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		FetchData fd=new FetchData();
		//fd.insert();
		//fd.update();
		//fd.delete();
		//fd.display();
		fd.search();
	}
	

}
