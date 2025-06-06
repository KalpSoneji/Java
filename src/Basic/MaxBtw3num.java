package Basic;

import java.util.Scanner;

public class MaxBtw3num {

	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 3 numbers: ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a > b) {
			
			if ( a > c) 
				System.out.println("A - " + a);
			
			else if ( a == c) 
				System.out.println("A, C - " + a);
			
			else 
				System.out.println("C - " + c);
		}
		
		else if ( a == b) {
			
			if ( a > c) 
				System.out.println("A B");
			
			else if (a == c) 
				System.out.println("A B C");
			
			else 
				System.out.println("C");	
		}
		
		else {
			
			if ( b > c) 
				System.out.println("B");
			
			else if ( b == c) 
				System.out.println("B C");
			
			else 
				System.out.println("C");
		}
		
		sc.close();

	}

}
