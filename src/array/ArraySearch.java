package array;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int i, search;
		boolean flag = true;
		int[] a = new int[5];
		
		for(i=0; i<a.length; i++) {
			System.out.println("Enter a[" + i + "]: ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter value you wanna find: ");
		search = sc.nextInt();
		
		for(i=0; i<a.length; i++) {
			if(a[i] == search) {
				flag = false;
				System.out.println(search + " found at index " + a[i-1]);
			}
			
		}
		
		if(flag)
			System.out.println(search + " wasn't found in the array.");

	}

}
