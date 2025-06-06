package Two_Dimensional_Array;

import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {
		
		int a[][] = new int[3][3];
		int i, j;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 9 2D elements: ");
		
		for(i = 0; i < a.length; i++)
			for(j = 0; j < a.length; j++)
				a[i][j] = sc.nextInt();
		
		System.out.println();
		
		for(i = 0; i < a.length; i++) {
			System.out.println("Student " + i + ": ");
			for(j = 0; j < a.length; j++) {
				System.out.print("\tMarks " + j + ": " + a[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
