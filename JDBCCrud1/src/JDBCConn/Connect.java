package JDBCConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	static Connection conn=null;
	
	public static  Connection getConnect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCCrud1","root","1303");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
		
	}
	

}
