package org.study.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnectionTest {

	public static Connection getConnection() throws Exception {
		Class.forName("oracle.jdb.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin@//localhost:1521/xe", "sys as sysdb", "1111");
		return con;		
	}
	
	public static void main(String[] args) {
		
		try {
			Connection conn = getConnection();
			System.out.println(conn.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
