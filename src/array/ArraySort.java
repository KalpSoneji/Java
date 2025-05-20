package array;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i, j, temp;
		int a[] = new int[5];
		
		for(i=0; i < a.length; i++) {
			System.out.println("Enter a[" + i + "]: ");
			a[i] = sc.nextInt();
		}
		
		for(i=0; i<a.length; i++) {
			for(j=i+1; j<a.length; j++) {
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(i=0; i<a.length; i++)
			System.out.println("a[" + i + "]: " + a[i]);
		
		sc.close();
	}

}
