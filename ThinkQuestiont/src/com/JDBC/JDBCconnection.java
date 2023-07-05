package com.JDBC;
import java.sql.*;//import --->java.sql
/*
 *1. import --->java.sql
 *2. load and register the driver ---> com.jdbc.
 *3. create connection
 *4. create a statement
 *5. execute the query
 *6. process the results
 *7. close
 */
public class JDBCconnection {
	public static void main(String[] args) throws Exception {
		
	String url="jdbc:mysql://localhost:3306/table_name";
	String username="root";
	String password="root";
	String quary="select * from students";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,username,password);
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(quary);
	rs.next();
	String name=rs.getString("name");
	System.out.println(name);
	st.close();
	con.close();
	}
	
	

}
