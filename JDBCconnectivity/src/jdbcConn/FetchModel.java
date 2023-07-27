package jdbcConn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FetchModel {
	public static Connection con=null;
	public static Statement st;
	public static ResultSet rs;
	
	public FetchModel(){
		con=DBConn.getConnect();
		
		try {
			st=con.createStatement();
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
	public void FetchCustomer() {
		try {
		rs=st.executeQuery("select * from customer");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getLong(4)+" "+rs.getString(5)+" "+rs.getString(6));
		}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public void FetchUsingJoin() {
		try {
			rs=st.executeQuery("select concat(c.first_name,\" \",c.last_name) from \r\n"
					+ "purchase p join model m join payment_mode pm join feedback_rating f join customer c\r\n"
					+ "on p.model_id=m.model_id and p.payment_id=pm.payment_id and p.rating_id=f.rating_id and p.cust_id=c.cust_id;");
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
	
	public static void main(String[] args) {
		FetchModel f1=new FetchModel();
		Scanner sc=new Scanner(System.in);
		f1.Fetchmodel();
		System.out.println("---------------------------------");
		f1.FetchCustomer();
		System.out.println("---------------------------------");
		
		f1.FetchUsingJoin();

	}

}
