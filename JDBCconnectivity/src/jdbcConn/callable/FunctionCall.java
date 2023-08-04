package jdbcConn.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;


public class FunctionCall {
	Connection conn;
	 CallableStatement cst;
	 
	 Scanner sc=new Scanner(System.in);
	
	
	public FunctionCall() {
		conn=DBConnect.getConnect();
		
	}
	public void  countdepartment() {
		System.out.print("Enter the department id: ");
		int id=sc.nextInt();
		try {
			cst=conn.prepareCall("{?=call countemployee(?)}");
			cst.registerOutParameter(1, Types.INTEGER);
			cst.setInt(2, id);
			boolean status=cst.execute();
			if(!status) {
				System.out.println("Cout dept wise: "+cst.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		FunctionCall cs=new FunctionCall();
		cs.countdepartment();
	}

}
