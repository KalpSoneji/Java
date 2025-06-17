package Inheritance;

//import java.util.Scanner;

public class TestApp1 {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter rno: ");
//		s1.rno = sc.nextInt();
//		sc.nextLine();
//		System.out.print("Enter name: ");
//		s1.name = sc.nextLine();
//		System.out.print("Enter std: ");
//		s1.std = sc.nextInt();
//		System.out.print("Enter marks: ");
//		s1.marks = sc.nextInt();
//		
//		System.out.println(s1.rno + "\t" + s1.name + "\t" + s1.std + "\t" + s1.marks);
//		
//		sc.close();
		
		s1.scanData();
		
		s1.dispData();
		
		// If the members are private, they have to be accessed using functions like this
	}

}
