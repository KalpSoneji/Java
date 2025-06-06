package Two_Dimensional_Array;

import java.util.Scanner;

public class Matrix {
	
	public static final int SIZE = 2;

	public static void main(String[] args) {

		int a[][] = new int[SIZE][SIZE];
		int i, j;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter " + Math.pow(SIZE, 2) + " 2D elements: ");

		for (i = 0; i < a.length; i++)
			for (j = 0; j < a.length; j++)
				a[i][j] = sc.nextInt();

		System.out.println();

		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
