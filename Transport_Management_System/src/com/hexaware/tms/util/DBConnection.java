package com.hexaware.tms.util;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection {
	
	private static final String URL = "jdbc:mysql://localhost:3306/transport_management_system";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static Connection connection = null;
	
	public static Connection getConnection() throws SQLException {
		if(connection == null || connection.isClosed()) {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		}
		return connection;
	}

}