package Basic;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		
		int a, b;
		String choice;
		
		System.out.print("Enter 2 numbers: ");
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		sc.nextLine();
		
		System.out.println("1. +\t2. -\t3. *\t4. /");
		System.out.print("Enter your choice: ");
		choice = sc.nextLine();
		
		switch(choice) {
		
			case "+":
				System.out.println(a + b);
				break;
			
			case "-":
				System.out.println(a - b);
				break;
			
			case "*":
				System.out.println(a * b);
				break;
				
			case "/":
				if ( b == 0)
					System.out.println("Can't divide by zero!");
				else
					System.out.println(a / b);
				break;
				
			default:
				System.out.println("Invalid operation.");
			
		}
		
		sc.close();
	
	}

}
