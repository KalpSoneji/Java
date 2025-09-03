package JDBC.dao;

import java.sql.*;
import java.util.*;

import JDBC.bean.StudentBean;
import JDBC.util.DataBaseConnection;

public class Student {

//	public int insert() {
		
	public int insert(StudentBean s) {
		
		int rowsAffected = 0;
		
		String insertQuery = "insert into student(name, std, marks) values('"+s.getName()+"' , "+s.getStd()+" , "+s.getMarks()+");";
//		String insertQuery = "insert into student(name, std, marks) values('Vatsal', 12, 75);"
		
		System.out.println("Insert query : " + insertQuery);
		
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
	
	public int update(StudentBean s, int id) {
		
		String updateQuery = "UPDATE student SET name = '"+s.getName()+"' , std = "+s.getStd()+" , marks = "+s.getMarks()+" WHERE id = " + id;
		
		System.out.println("Update query : " + updateQuery);
		
		Connection conn = DataBaseConnection.getConnection();
		
		Statement stmt = null;
		int rowsAffected = 0;
		
		if (conn != null) {
			
			try {

				stmt = conn.createStatement();
				
				rowsAffected = stmt.executeUpdate(updateQuery);
				
			} 
			
			catch (SQLException e) {
				e.printStackTrace();
			}		
			
		}
		
		else 
			System.out.println("Database not connected - " + conn);
		
		
		return rowsAffected;
	}
	
	public int delete(int id) {
		
		int rowsAffected = 0;
		
		String deleteQuery = "DELETE FROM student WHERE id = " + id;
		
		Connection conn = DataBaseConnection.getConnection();
		
		Statement stmt = null;
		
		if (conn != null) {
			
			try {

				stmt = conn.createStatement();
				
				rowsAffected = stmt.executeUpdate(deleteQuery);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		else {
			System.out.println("Database not connected");
		}
		
		return rowsAffected;
		
	}
	
	public ArrayList<StudentBean> getAllRecords() {
		
		String selectQuery = "SELECT * FROM student";
		
		ResultSet rs = null;
		Statement stmt = null;
		StudentBean sb = null;
		
		Connection conn = DataBaseConnection.getConnection();

		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		
		if (conn != null) {
		
			try {
				stmt = conn.createStatement();

				rs = stmt.executeQuery(selectQuery);

				while (rs.next()) {
					
					int id = rs.getInt(1);
					String name = rs.getString(2);
					int std = rs.getInt(3);
					int marks = rs.getInt(4);

					sb = new StudentBean(id, name, std, marks);
					list.add(sb);
				}
				
			} 
			
			catch (SQLException e) {
				e.printStackTrace();
			}
		} 
		
		else 
			System.out.println("DB not connected");
		
		return list;

	}


	
//	FOR INSERTION, FOLLOW BELOW
	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter name: ");
//		String name = sc.nextLine();
//		System.out.print("Enter marks: ");
//		int marks = sc.nextInt();
//		System.out.print("Enter std: ");
//		int std = sc.nextInt();
//		
//		StudentBean s = new StudentBean();
//		s.setName(name);
//		s.setMarks(marks);
//		s.setStd(std);
//		
//		Student s1 = new Student();
//			
//		int rowsAffected = s1.insert(s);
//		
//		if (rowsAffected > 0)
//			System.out.println("Insertion Successfull!");
//		else
//			System.out.println("INSERTION FAILED");
//		
//	}
//		
//}

//FOR DELETION, FOLLOW BELOW

//public static void main(String[] args) {
//	
//	Scanner sc = new Scanner(System.in);
//	
//	System.out.print("Enter id: ");
//	int id = sc.nextInt();
//	
//	Student s1 = new Student();
//	
//	int rowsAffected = s1.delete(id);
//	
//	if (rowsAffected > 0)
//		System.out.println("Deletion Successfull!");
//	else
//		System.out.println("DELETION FAILED");
//	
//}

// TO UPDATE , FOLLOW BELOW
	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter id: ");
//		int id = sc.nextInt();
//		sc.nextLine();
//		System.out.print("Enter name: ");
//		String name = sc.nextLine();
//		System.out.print("Enter marks: ");
//		int marks = sc.nextInt();
//		System.out.print("Enter std: ");
//		int std = sc.nextInt();
//		
//		StudentBean s = new StudentBean (0, name, std, marks); 
//		
//		Student s1 = new Student();
//		
//		int rowsAffected = s1.update(s, id);
//		
//		if (rowsAffected > 0)
//			System.out.println("UPDATED SUCCESSFULLY!");
//		else
//			System.out.println("UPDATE FAILED");
//		
//	}
	
	
//Select Query
//	
//	public static void main(String[] args) {
//		
//		Student s1 = new Student();
//		
//		ArrayList<StudentBean> list = s1.getAllRecords();
//		
//		for (int i = 0; i < list.size(); i++) {
//			
//			StudentBean s = list.get(i);
//			System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getStd() + "\t" + s.getMarks());
//			
//		}
//		
//	}
	
//  All CRUD operations together below
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();

		ArrayList<StudentBean> list = stu.getAllRecords();

		for (int i = 0; i < list.size(); i++) {
			StudentBean s = list.get(i);
			System.out.println(s.getId() + " " + s.getName() + " " + s.getStd() + " " + s.getMarks());
		}
	
		while (true) {
		    System.out.println("\n===== STUDENT DATABASE MENU =====");
		    System.out.println("1. Insert Student");
		    System.out.println("2. Update Student");
		    System.out.println("3. Delete Student");
		    System.out.println("4. View All Students");
		    System.out.println("5. Exit");
		    System.out.print("Enter your choice: ");
		    int choice = sc.nextInt();
		    sc.nextLine();

		    switch (choice) {
		    
		        case 1: // Insert
		            System.out.println("Enter Name : ");
		            String name = sc.nextLine();
		            System.out.println("Enter Std : ");
		            int std = sc.nextInt();
		            System.out.println("Enter Marks : ");
		            int marks = sc.nextInt();

		            StudentBean s1 = new StudentBean(0, name, std, marks);
		            int insertRows = stu.insert(s1);
		            
		            if (insertRows > 0) 
		                System.out.println("Student inserted successfully!");
		            else 
		                System.out.println("Insertion failed!");
		            
		            break;

		        case 2: // Update
		            System.out.print("Enter ID to update: ");
		            int idU = sc.nextInt(); sc.nextLine();
		            System.out.print("Enter New Name : ");
		            String newName = sc.nextLine();
		            System.out.print("Enter New Std : ");
		            int newStd = sc.nextInt();
		            System.out.print("Enter New Marks : ");
		            int newMarks = sc.nextInt();

		            StudentBean s2 = new StudentBean(0, newName, newStd, newMarks);
		            stu.update(s2, idU);
		            
		            break;

		        case 3: // Delete
		            System.out.print("Enter ID to delete: ");
		            int idD = sc.nextInt();
		            int delRows = stu.delete(idD);
		            
		            if (delRows > 0) 
		                System.out.println("Student deleted successfully!");
		            else 
		                System.out.println("No student found with ID: " + idD);
		            
		            break;

		        case 4: // View All
		            ArrayList<StudentBean> allStudents = stu.getAllRecords();
		            if (allStudents.size() > 0) {
		                System.out.println("\n===== STUDENT RECORDS =====");
		                for (StudentBean s : allStudents) 
		                    System.out.println(s.getId() + " " + s.getName() + " " + s.getStd() + " " + s.getMarks());
		            } 
		            else 
		                System.out.println("No records found!");

		            break;

		        case 5: // Exit
		            System.out.println("Exiting!");
		            sc.close();
		            System.exit(0);
		            break;

		        default:
		            System.out.println("Invalid choice, try again!");
		    }
		}

	}

}