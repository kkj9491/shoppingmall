package org.study.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HRDShopDao {

	public static Connection getConnection() throws Exception {
		Class.forName("oracle.jdb.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin@//localhost:1521/xe", "sys as sysdb", "1111");
		return con;		
	}
	
	public int getNextMemberId() throws Exception {
		
		Connection conn = getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		if(conn != null) {
			
		}
		
	}
	
}
