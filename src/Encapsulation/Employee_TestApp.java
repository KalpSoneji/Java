package Encapsulation;

import java.util.Scanner;

public class Employee_TestApp {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		int id, salary;
		String name, dsgn, orgName;
		
		Scanner sc = new Scanner(System.in);
		
//		dynamic
		
		System.out.print("Enter id: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter salary: ");
		salary = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter designation: ");
		dsgn = sc.nextLine();
		System.out.print("Enter organisation name: ");
		orgName = sc.nextLine();
		
		sc.close();
		
		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		e.setDsgn(dsgn);
		e.setOrgName(orgName);
		
//		static
		
//		e.setId(1);
//		e.setName("Kalp");
//		e.setSalary(50000);
//		e.setDsgn("CEO");
//		e.setOrgName("Google");
		
		System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary() + " " + e.getDsgn() + " " + e.getOrgName());

	}

}
