package com.connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	

	public static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String JDBC_URL="jdbc:mysql://localhost:3306/JDBCCrud1";
	public static final String USERNAME="root";
	public static final String PASSWORD="1303";
	
	static Connection conn=null; 

	
	public static Connection getConnect()
	{
		try
		{
		
			Class.forName(JDBC_DRIVER);
			

			conn = DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return conn;
	}

}
