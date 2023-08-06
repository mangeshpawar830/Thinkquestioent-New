package com.jdbcConn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {
	static Connection conn=null;
	public static Connection getConnect() {
		try { 
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish the connection
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle_management_system", "root", "1303");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return conn;
		
	}
	public static void main(String[] args) {
		DbConnect.getConnect();
	}
	
	

}
