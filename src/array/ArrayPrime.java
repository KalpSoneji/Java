package array;

import java.util.Scanner;

public class ArrayPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, j, count=0, pcount = 0, ccount=0;
		int a[] = new int[5];
		
		for(i=0; i<a.length; i++) {
			System.out.println("Enter a[" + i + "]: ");
			a[i] = sc.nextInt();
		}
		
		for(i=0; i<a.length; i++) {
			count = 0;
			for(j=2; j<a[i]; j++) {
				if(a[i] % j == 0) { 
					count++;
				}
			}
			
			if(count > 0)
				ccount++;
			else {
				pcount++;
				System.out.print("a[" + i + "]: " + a[i] + "\t");
			}
		}
		
		System.out.println("\nPrime count: " + pcount);
		System.out.println("Composite count: " + ccount);
		
		sc.close();

	}

}
