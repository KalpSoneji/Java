package Inheritance;

import java.util.Scanner;

public class Student extends Person{

	private int rno, std, marks;
	
	public void scanData() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rno: ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter std: ");
		std = sc.nextInt();
		System.out.print("Enter marks: ");
		marks = sc.nextInt();
		
	}
	
	public void dispData() {
		
		System.out.println(rno + "\t" + name + "\t" + std + "\t" + marks);
		
	}
	
}