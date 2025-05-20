package OOPS;

import java.util.Scanner;

public class Class_Object {

	private int rno, std;
	private String name;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Class_Object obj = new Class_Object();
		
		System.out.println("Enter rno: ");
		obj.rno = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter name: ");
		obj.name = sc.nextLine();
		
		System.out.println("Enter std: ");
		obj.std = sc.nextInt();
		
		System.out.println(obj.rno + "\t" + obj.name + "\t" + obj.std);
		
		System.out.println("obj : " + obj);
		
		sc.close();

	}

}
