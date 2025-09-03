package JDBC.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import JDBC.bean.StudentBean;
import JDBC.util.DataBaseConnection;

public class StudentPrep {
	
//	Insert Query

//	public int insertStudent(StudentBean s) {
//
//		int rowsAffected = 0;
//
//		String insertQuery = "INSERT INTO student(name, std, marks) VALUES(?, ?, ?)";
//
//		System.out.println("Insert query : " + insertQuery);
//
//		PreparedStatement pstmt = null;
//
//		Connection conn = DataBaseConnection.getConnection();
//
//		if (conn != null) {
//
//			try {
//
//				pstmt = conn.prepareStatement(insertQuery);
//
//				pstmt.setString(1, s.getName());
//				pstmt.setInt(2, s.getStd());
//				pstmt.setInt(3, s.getMarks());
//
//				rowsAffected = pstmt.executeUpdate();
//			}
//
//			catch (SQLException e) {
//				e.printStackTrace();
//			}
//
//		}
//
//		else
//			System.out.println("DB not connected");
//
//		return rowsAffected;
//	}

	// Update Query
//	public int updateStudent(StudentBean s, int id) {
//
//		String updateQuery = "UPDATE student SET name=?,std=? ,marks=? WHERE id=?";
//		System.out.println("updateQuery : " + updateQuery);
//		
//		Connection conn = DataBaseConnection.getConnection();
//		
//		PreparedStatement pstmt = null;
//		int rowsAffected = 0;
//
//		if (conn != null) {
//
//			try {
//				pstmt = conn.prepareStatement(updateQuery);
//
//				pstmt.setString(1, s.getName());
//				pstmt.setInt(2, s.getStd());
//				pstmt.setInt(3, s.getMarks());
//				pstmt.setInt(4, id);
//
//				rowsAffected = pstmt.executeUpdate();
//
//			}
//
//			catch (SQLException e) {
//				e.printStackTrace();
//			}
//
//		}
//
//		else
//			System.out.println("Db not connected : " + conn);
//
//		return rowsAffected;
//	}

//	Delete Query
//	public int deleteStudent(int id) {
//
//		int rowsAffected = 0;
//		String deleteQuery = "DELETE FROM student WHERE id = ?";
//
//		Connection conn = DataBaseConnection.getConnection();
//		PreparedStatement pstmt = null;
//
//		if (conn != null) {
//
//			try {
//
//				pstmt = conn.prepareStatement(deleteQuery);
//
//				pstmt.setInt(1, id);
//
//				rowsAffetced = pstmt.executeUpdate();
//
//			}
//
//			catch (SQLException e) {
//				e.printStackTrace();
//			}
//
//		}
//
//		else
//			System.out.println("Db not connected");
//
//		return rowsAffected;
//	}

	public ArrayList<StudentBean> getAllRecords() {
		
		String selectQuery = "SELECT * FROM student";
		Connection conn = DataBaseConnection.getConnection();

		ResultSet rs = null;
		PreparedStatement pstmt = null;
		StudentBean s = null;
		
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		
		if (conn != null) {
		
			try {
			
				pstmt = conn.prepareStatement(selectQuery);

				rs = pstmt.executeQuery();

				while (rs.next()) {
				
					int id = rs.getInt(1);
					String name = rs.getString(2);
					int std = rs.getInt(3);
					int marks = rs.getInt(4);

					s = new StudentBean(id, name, std, marks);

					list.add(s);
				}
			} 
			
			catch (SQLException e) {
				e.printStackTrace();
			}
		} 
		
		else 
			System.out.println("Db not connected");
		
		return list;
	}

// Below is the main method for insert query
	
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Enter name: ");
//		String name = sc.nextLine();
//		System.out.print("Enter std: ");
//		int std = sc.nextInt();
//		System.out.print("Enter marks: ");
//		int marks = sc.nextInt();
//
//		StudentBean s = new StudentBean(0, name, std, marks);
//
//		StudentPrep stupr = new StudentPrep();
//
//		int rowsAffected = stupr.insertStudent(s);
//
//		if (rowsAffected > 0)
//			System.out.println("Record inserted =" + rowsAffected);
//		else
//			System.out.println("Record wasn't inserted = " + rowsAffected);
//
//	}
	
// Below is the main method for update query
	
//	public static void main(String[] args) {
//		
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter student ID to update: ");
//        int id = sc.nextInt();
//        sc.nextLine(); // consume newline
//
//        System.out.print("Enter new name: ");
//        String name = sc.nextLine();
//
//        System.out.print("Enter new std: ");
//        int std = sc.nextInt();
//
//        System.out.print("Enter new marks: ");
//        int marks = sc.nextInt();
//
//        StudentBean s = new StudentBean(0, name, std, marks);
//
//        StudentPrep dao = new StudentPrep();
//        int rowsAffected = dao.updateStudent(s, id);
//
//        if (rowsAffected > 0)
//            System.out.println("Record Updated Successfully!");
//        else
//            System.out.println("Update Failed!");
//    }

// Below is the main method for Delete query
	
//	public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter student ID to delete: ");
//        int id = sc.nextInt();
//
//        StudentPrep dao = new StudentPrep();
//        int rowsAffected = dao.deleteStudent(id);
//
//        if (rowsAffected > 0)
//            System.out.println("Record Deleted Successfully!");
//        else
//            System.out.println("Deletion Failed!");
//    }
	
//  Below is the main method for select query
	
	public static void main(String[] args) {
     
    	StudentPrep dao = new StudentPrep();

        ArrayList<StudentBean> students = dao.getAllRecords();

        if (students.size() > 0) {
        
        	System.out.println("ID\tName\tStd\tMarks");
            
        	for (StudentBean s : students) 
                System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getStd() + "\t" + s.getMarks());
            
        } 
        
        else 
            System.out.println("No Records Found!");
        
    }	
	
}
