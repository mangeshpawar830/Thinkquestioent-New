package jdbcConn.scalable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ScalableEx {
	Connection conn;
	CallableStatement cst;
	ResultSet rs,rs1;
	public ScalableEx(){
		conn=DBConn.getConnect();
		
	}
	public void scal() {
		try {
			cst=conn.prepareCall("{call ScalableEx()}");
			
			if(cst.execute()) {
				rs=cst.getResultSet();
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4)+" "+rs.getString(5)+" "+rs.getString(6));
				}
				
			}
			System.out.println("--------------------------------------------");
			if(cst.getMoreResults()) {
				rs1=cst.getResultSet();
				while(rs1.next()) {
					System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getInt(3));
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ScalableEx se=new ScalableEx();
		se.scal();
	}

}
