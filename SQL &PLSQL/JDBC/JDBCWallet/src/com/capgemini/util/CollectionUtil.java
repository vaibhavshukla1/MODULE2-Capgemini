package com.capgemini.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CollectionUtil {
	public Connection getConnection() {
		try{Class.forName("oracle.jdbc.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String password="Capgemini123";
		Connection con= DriverManager.getConnection(url, user, password);
		return con;}catch(ClassNotFoundException e) {
			System.out.println("class cannot be loaded...");
		}catch(SQLException e) {
			System.out.println("sql error"+e);
		}
		return null;
	}
}
