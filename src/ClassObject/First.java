package ClassObject;

import java.util.Scanner;

public class First {

	int rno, std;
	String name;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		First f = new First();
		
		System.out.print("Enter rno: ");
		f.rno = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name: ");
		f.name = sc.nextLine();
		System.out.print("Enter std: ");
		f.std = sc.nextInt();
		
		System.out.println();
		System.out.println(f.rno + "\t" + f.name + "\t" + f.std);
		
		sc.close();
	}

}
