package Array;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[10];
		int i, sum = 0;
		
		System.out.println("Enter 10 elements: ");
		
		for(i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
			
		System.out.println("Sum: " + sum);
		
		sc.close();

	}

}
