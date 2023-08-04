package jdbcConn.Resultset;





import java.sql.Connection;
import java.sql.DriverManager;

public class ClassConeect {
	static Connection conn=null;
	
	public static Connection getConnect() {
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("Driver loaded....");
			
			//Establish the connection
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile", "root", "1303");
			//System.out.println("establish the connection..");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return conn;
		
	}
	

}
