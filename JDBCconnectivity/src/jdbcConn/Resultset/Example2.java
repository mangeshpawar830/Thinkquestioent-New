package jdbcConn.Resultset;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Example2 {
	Connection conn;
	Statement st;
	public Example2() {
		conn=ClassConeect.getConnect();
	}
		void addAll() {
		try {
			st=conn.createStatement();
			st.addBatch("update model set model_name='pulsar' where model_id=102");
			st.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Example2 e=new Example2();
		e.addAll();
	}

}
