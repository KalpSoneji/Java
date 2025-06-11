package ClassObject;

import java.util.Scanner;

public class Employee {

	private int id, salary;
	private String name, org, dsg;
	
	public void scanData() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter id: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter salary: ");
		salary = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter org: ");
		org = sc.nextLine();
		System.out.print("Enter dsg: ");
		dsg = sc.nextLine();
		
	}
	public void dispData() {
		
		System.out.println(id + "\t" + name + "\t" + salary + "\t" + org + "\t" + dsg);
		
	}
	
}
