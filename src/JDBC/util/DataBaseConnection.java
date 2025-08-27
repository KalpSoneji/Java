package JDBC.util;

import java.sql.*;

public class DataBaseConnection {

	private static final String URLNAME = "jdbc:mysql://localhost:3306/JDBC";
	private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Mysql@123";
	
	public static Connection getConnection() {
		
		Connection conn = null;

		try {
		
			Class.forName(DRIVERCLASS);
			
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
			
			if (conn != null) 
				System.out.println("Connection successfull!");
			else
				System.out.println("NOT CONNECTED");
			
		}
		
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
		
	}
	
	public static void main(String[] args) {
		DataBaseConnection.getConnection();
	}
	
}
