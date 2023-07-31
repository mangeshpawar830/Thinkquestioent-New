package JDBCConn2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	static Connection conn=null;
	
	
	public static Connection getConnect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("Driver loaded..");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/course", "root", "1303");
			//System.out.println("Connection done...");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
		
	}
	/*
	 * public static void getData() { conn=Connect.getConnect();
	 * 
	 * try { st=conn.createStatement(); } catch (SQLException e) {
	 * e.printStackTrace(); } try { rs=st.executeQuery("select * from  employees");
	 * while(rs.next()) {
	 * System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3)
	 * +" | " +rs.getString(4)+" | "+rs.getString(5)); } } catch (SQLException e) {
	 * e.printStackTrace(); }
	 * 
	 * }
	 * 
	 * public static void main(String[] args) { Connect.getData(); }
	 */
}
