package Simple_Inheritance_Task1;

import java.util.Scanner;

public class Salary extends Employee{

	float basic, hra, da, gross;
	
	Scanner sc = new Scanner(System.in);
	
	public void getSalary() {
		
		System.out.print("Enter basic salary: ");
		basic = sc.nextFloat();
		System.out.print("Enter HRA: ");
		hra = sc.nextFloat();
		System.out.print("Enter DA: ");
		da = sc.nextFloat();
	}
	
	public void calcGrossSal() {
		gross = (basic * hra * da)/10;
	}
	
	public void showSalary() {
		System.out.println(basic + "\t" + hra + "\t" + da + "\t" + gross);
	}
	
}
