package Array;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[5];
		int i;
		
		System.out.println("Enter 5 elements: ");
		
		for(i=0; i<a.length; i++)
			a[i] = sc.nextInt();
		
		int max = a[0];
		
		for(i=0; i<a.length; i++) 
			if(a[i] > max)
				max = a[i];
		
		System.out.println("Max: " + max);
		
		sc.close();
	}
	
}
