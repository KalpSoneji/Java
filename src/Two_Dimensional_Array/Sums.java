package Two_Dimensional_Array;

import java.util.Scanner;

public class Sums {

	public static void main(String[] args) {
		
		int a[][] = new int[3][3], i, j, k, rowsum = 0, colsum = 0, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0; i<a.length; i++)
			for(j=0; j<a.length; j++)
				a[i][j] = sc.nextInt();
		
		for(i=0; i<a.length; i++) {
			
			rowsum = 0;

			for(j=0; j<a.length; j++) {
				System.out.print(a[i][j] + "\t");
				rowsum += a[i][j];
			}
			
			System.out.print(rowsum + "\t");
			System.out.print("\n");
		}
		
//		System.out.println();
		
		for (i = 0; i < a.length; i++) {
            colsum = 0;
            
            for (j = 0; j < a.length; j++) 
                colsum += a[j][i];
            
            System.out.print(colsum + "\t");
        }
		
		for(i=0; i<a.length; i++)
			for(j=0; j<a.length; j++)
				sum += a[i][j];
		
		System.out.print(sum);

	}

}
