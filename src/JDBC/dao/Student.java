package JDBC.dao;

import java.sql.*;

import JDBC.util.DataBaseConnection;

public class Student {

	public int insert() {
		
		int rowsAffected = 0;
		
		String insertQuery = "insert into student(name, std, marks) values('Vatsal', 12, 75);";
		
		Statement stmt = null;
		
		Connection conn = DataBaseConnection.getConnection();
		
		if (conn != null) {
			
			try {
				stmt = conn.createStatement();
				
				rowsAffected = stmt.executeUpdate(insertQuery);
			}
			
			catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		else
			System.out.println("DATABASE NOT CONNECTED");
		
		return rowsAffected;

	}
	
	public void update() {}
	
	public void delete() {}
	
	public void getData() {}
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		int rowsAffected = s1.insert();
		
		if (rowsAffected > 0)
			System.out.println("Insertion Successfull!");
		else
			System.out.println("INSERTION FAILED");
		
	}
	
	
}
