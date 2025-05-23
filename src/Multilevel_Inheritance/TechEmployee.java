package Multilevel_Inheritance;

import java.util.Scanner;

public class TechEmployee extends Employee{

	String organisation;
	
	void scanData() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter id: ");
		id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter name: ");
		name = sc.nextLine();
		
		System.out.println("Enter salary: ");
		salary = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter designation: ");
		designation = sc.nextLine();
		
		System.out.println("Enter organisation: ");
		organisation = sc.nextLine();
		
//		sc.close();
	}
	
	void dispData() {
		System.out.println(name + " " + id + " " + salary + " " + designation + " " + organisation);
	}
	


	public static void main(String[] args) {
		
		TechEmployee TE = new TechEmployee();
		
		TE.scanData();
		TE.dispData();
		
	}
	
	//you can write the main function in another file in the same package and yet it will work

}