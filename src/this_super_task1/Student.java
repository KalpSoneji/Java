package this_super_task1;

import java.util.Scanner;

public class Student {

	int rno; 
	String name;
	
	Scanner sc = new Scanner(System.in);
	
	void getStudentDetails() {
		System.out.print("Enter rno: ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name: ");
		name = sc.nextLine();
	}
	
	void dispStudentDetails() {
		System.out.println(rno + "\t" + name);
	}
	
}
