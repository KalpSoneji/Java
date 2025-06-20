package this_super_task1;

import java.util.Scanner;

public class TestApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Result[] students = new Result[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            students[i] = new Result();
            students[i].getStudentDetails();
            students[i].getMarks();
            students[i].calcResult();
        }

        System.out.println("\n----- Result -----");
        for (int i = 0; i < n; i++) {
            students[i].dispStudentDetails();
            students[i].dispResult();
            System.out.println();
        }

        sc.close();
    }
}