package array;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[5];
		int i, sum = 0;
		
		System.out.println("Array length: = " + a.length);
		
		for(i = 0; i < a.length; i++) {
			System.out.println("Enter a[" + i + "]: ");
			a[i] = sc.nextInt();
			sum += a[i];
		}
		
		for(i = 0; i < a.length; i++) {
			System.out.println("A[" + i + "]: " + a[i]);
		}
		
		System.out.println("Sum = " + sum);
		
//		advance/enhanced for loop aka foreach loop 
		for(int temp : a) {
			System.out.println(temp);
		}
		
		sc.close();

	}

}
