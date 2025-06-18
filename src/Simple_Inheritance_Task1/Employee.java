package Simple_Inheritance_Task1;

import java.util.Scanner;

public class Employee {
	
	int empID;
	String name;
	
	Scanner sc = new Scanner(System.in);
	
	public void getDetails() {
		System.out.print("Enter ID: ");
		empID = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name: ");
		name = sc.nextLine();
	}
	
	public void showDetails() {
		System.out.println(empID + "\t" + name);
	}
}
