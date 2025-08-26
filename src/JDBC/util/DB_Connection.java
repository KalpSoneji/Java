package JDBC.util;

import java.sql.*;

public class DB_Connection {

	private static final String URLNAME = "jdbc:mysql://localhost:3306/JDBC";
	private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Mysql@123";
	
	public static void getConnection() {
		
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
		
	}
	
	public static void main(String[] args) {
		
		DB_Connection.getConnection();
		
	}
	
}
