package Array;

import java.util.Scanner;

public class Search {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        int i, find, count = 0;

        System.out.println("Enter 5 elements: ");
        
        for (i = 0; i < a.length; i++) 
            a[i] = sc.nextInt();

        System.out.print("Enter the number you want to search: ");
        find = sc.nextInt();

        for (i = 0; i < a.length; i++) {
            if (find == a[i]) {
                System.out.println("Element " + find + " found at index " + i);
                count++;
            }
        }

        if (count == 0) 
            System.out.println(find + " was not present in the array.");

        System.out.println("Count: " + count);
    }
}