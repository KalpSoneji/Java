package Array;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[5];
		int i, j;
		
		System.out.println("Enter 5 elements: ");
		
		for(i=0; i<a.length; i++)
			a[i] = sc.nextInt();
		
		for(i=0; i<a.length; i++) {
			for(j=i+1; j < a.length; j++) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		
		System.out.print("Sorted: ");
		for(i=0; i<a.length; i++)
			System.out.print(a[i] + "\t");
		
		sc.close();

	}

}
