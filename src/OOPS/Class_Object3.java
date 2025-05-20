package OOPS;

import java.util.Scanner;

public class Class_Object3 {

	private int id, salary;
	private String name, designation, orgName;
	
	public void setData() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID: ");
		id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter name: ");
		name = sc.nextLine();
		
		System.out.println("Enter designation: ");
		designation = sc.nextLine();
		
		System.out.println("Enter salary: ");
		salary = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter organisation: ");
		orgName = sc.nextLine();
		
	}
	
	public void getData() {
		
		System.out.println(id + "\t" + name + "\t" + designation + "\t" + salary + "\t" + orgName);
		
	}
	
	public static void main(String[] args) {

		Class_Object3 e1 = new Class_Object3();
		Class_Object3 e2 = new Class_Object3();
		Class_Object3 e3 = new Class_Object3();
		
		e1.setData();
		e2.setData();
		e3.setData();
		
		e1.getData();
		e2.getData();
		e3.getData();

	}

}
