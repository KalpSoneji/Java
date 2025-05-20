package basic;

import java.util.Scanner;

public class Maxof3numbers {
    public static void main(String args[]) {

        int no1, no2, no3;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 3 numbers: ");
        
        no1 = sc.nextInt();
        no2 = sc.nextInt();
        no3 = sc.nextInt();
        
        if (no1 > no2){
            if(no1 > no3)
                System.out.println("no1 is the largest number");
            else if(no1 == no3)
                System.out.println("no1 and no3 are the largest numbers");
            else
                System.out.println("no3 is the largest number");
        }
        
        else if(no1 == no2){
            if(no1 > no3)
                System.out.println("no1 and no2 are the largest numbers");
            else if(no1 == no3)
                System.out.println("All three numbers are the same");
            else
                System.out.println("no3 is the largest number");
        }
        
        else{
            if(no2 > no3)
                System.out.println("no2 is the largest number");
            else if(no2 == no3)
                System.out.println("no2 and no3 are the largest numbers");
            else
                System.out.println("no3 is the largest number");
        }
        
        sc.close();
        
    }
}
