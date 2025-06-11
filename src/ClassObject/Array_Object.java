package ClassObject;

import java.util.Scanner;

public class Array_Object {

	private int rno, std;
	private String name;
	
	public void scanData(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rno: ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter std: ");
		std = sc.nextInt();

	}
	
	public void dispData() {
		
		System.out.println(rno + "\t" + name + "\t" + std);
		
	}

}
