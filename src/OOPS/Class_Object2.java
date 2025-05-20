package OOPS;

import java.util.Scanner;

public class Class_Object2 {

	private int rno, std;
	private String name;
	
	public void scanData() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rno: ");
		rno = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter name: ");
		name = sc.nextLine();
		
		System.out.println("Enter std: ");
		std = sc.nextInt();
		
//		sc.close();
		
	}
	
	public void dispData() {
		System.out.println(rno + "\t" + name + "\t" + std);
	}

}
