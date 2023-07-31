package jdbcConn.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class StoredProcedureCall {
	Connection conn;
	Statement st;
	CallableStatement cst;
	ResultSet rs;
	static Scanner sc=new Scanner(System.in);
	StoredProcedureCall(){
		conn=DBConnect.getConnect();
		
		try {
			st=conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void getNameSalary() {
		System.out.print("Enter the employee id: ");
		int id=sc.nextInt();
		try {
			cst=conn.prepareCall("call getNameSalary(?,?,?,?)");
			cst.setInt(1, id);
			cst.registerOutParameter(2, Types.VARCHAR);
			cst.registerOutParameter(3, Types.VARCHAR);
			cst.registerOutParameter(4, Types.FLOAT);
			boolean status=cst.execute();
			if(status) {
				rs=cst.getResultSet();
				while(rs.next()) {
					System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));
				}
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		StoredProcedureCall sp=new StoredProcedureCall();
		sp.getNameSalary();
	}

}
