package Array;

import java.util.Scanner;

public class Declaration_Initialisation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		int a[] = new int[5];
		
//		int []b = new int[5];
		
//		int[] c = new int[5];
		
//		int [] d = new int[5];
		
//		int arr[] = {1, 2, 3, 4, 5};
		
		int e[] = null;
		e = new int[5];
		
		System.out.println("Length of array: " + e.length);
		
		for(int i=0; i<e.length; i++) {
			System.out.print("Enter e[" + i + "]: ");
			e[i] = sc.nextInt();
		}
		
		System.out.println();
		
		for(int i=0; i<e.length; i++)
			System.out.print(e[i] + "\t");
		
		sc.close();

	}

}
