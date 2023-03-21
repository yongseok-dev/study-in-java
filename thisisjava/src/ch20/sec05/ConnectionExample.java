package ch20.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "sys as sysdba", "sys1234");
			System.out.println("connect!");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		} finally {
			if (conn != null) {
				try {
					conn.close();
					System.out.println("disconnect");
				} catch (Exception e2) {
				}
			}
		}
	}
}
