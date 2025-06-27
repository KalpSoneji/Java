package static_keyword;

import java.util.Scanner;

public class Student {

	int rno, std;
	String name;
	static String schoolName;
	
	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}
	
	public static void main(String[] args) {
		
		Student.schoolName = "Zydus";
		
		Student s[] = new Student[5];
		
		for (int i = 0; i < s.length; i++) {
			s[i] = new Student();
			s[i].scanData();
		}
		
		for (int i = 0; i < s.length; i++) 
			s[i].dispData();

	}
	
	public void scanData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rno: ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter std: ");
		std = sc.nextInt();
	}
	
	public void dispData() {
		System.out.println(rno + "\t" + name + "\t" + std + "\t" + schoolName);
	}

}
