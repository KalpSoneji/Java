package Two_Dimensional_Array;

import java.util.Scanner;

public class Prime_ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, j, k;
		int a[][] = new int[3][3];
		
		for(i=0; i<a.length; i++)
			for(j=0; j<a.length; j++)
				a[i][j] = sc.nextInt();
		
		for(i=0; i<a.length; i++) {
			
			for(j=0; j<a.length; j++) {
				
				int num = a[i][j];
				
				boolean flag = true;
				
				for(k=2; k<num; k++) {
					
//					if(num == 1)
//						System.out.print(a[i][j] + "\t");
					
					if(num % k == 0)
						flag = false;
					
				}

				if(flag)
					System.out.print("_\t");
				else
					System.out.print(num + "\t");
					
			}
			
			System.out.println();
			
		}
		
	}
	
}

//1 2 3 4 5 6 7 8 9