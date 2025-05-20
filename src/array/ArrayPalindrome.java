package array;

import java.util.Scanner;

public class ArrayPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i, rem=0, rev=0, temp;
		int a[] = new int[5];
		
		for(i=0; i<a.length; i++) {
			System.out.println("Enter a[" + i + "]: ");
			a[i] = sc.nextInt();
		}
		
		for(i=0; i<a.length; i++) {
			rem=0;
			rev=0;
			temp = a[i];
			
			while(temp != 0) {				
				rem = temp % 10;
				rev = (rev * 10) + rem;
				temp /= 10;
			}
			
			if(a[i] != rev)
				System.out.println(a[i]);
				
		}
		
		sc.close();

	}

}
