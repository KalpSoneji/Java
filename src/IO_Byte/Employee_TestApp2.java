package IO_Byte;

import java.io.*;
import java.util.Scanner;

public class Employee_TestApp2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Employee[] employees = new Employee[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter details for Employee " + (i + 1));
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine(); 
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Designation: ");
			String designation = sc.nextLine();
			System.out.print("Salary: ");
			int salary = sc.nextInt();
			sc.nextLine(); 
			System.out.print("Organization Name: ");
			String org = sc.nextLine();

			employees[i] = new Employee(id, name, designation, salary, org);
		}

		System.out.println("Success");
		sc.close();

		try {
			FileOutputStream fout = new FileOutputStream("object2.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);

			objout.writeObject(employees);

			objout.close();
			fout.close();
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}
}