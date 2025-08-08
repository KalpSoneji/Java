package IO_Byte;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	int id;
	String name;
	String designation;
	int salary;
	String orgName;

	public Employee() {}

	public Employee(int id, String name, String designation, int salary, String orgName) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.orgName = orgName;
	}

	public void dispData() {
		System.out.println("\nID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + salary);
		System.out.println("Organization: " + orgName);
	}
}