package Collection_List_Array_List;

import java.util.*;

public class TestApp_Student2 {

    public static void main(String[] args) {
    	
        ArrayList<Student2> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 6) {
            System.out.println("[1]. Insert the student");
            System.out.println("[2]. Update the student");
            System.out.println("[3]. Delete the student");
            System.out.println("[4]. Display the student");
            System.out.println("[5]. Sort the students by Roll No");
            System.out.println("[6]. Exit");
            System.out.print("\nEnter choice: ");

            choice = sc.nextInt();

            switch (choice) {
            
                case 1:
                    Student2 s = new Student2();
                    s.scandata();
                    list.add(s);
                    System.out.println("Student Successfully Inserted");
                    break;

                case 2:
                    System.out.print("Enter the Roll No you want to update: ");
                    int up = sc.nextInt();
                    boolean found = false;

                    for (Student2 stu : list) {
                        if (stu.getroll() == up) {
                            stu.update();
                            System.out.println("Student Updated Successfully");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student Not Found");
                    }
                    break;

                case 3:
                    System.out.print("Enter the rno you want to delete: ");
                    int del = sc.nextInt();

                    boolean removed = list.removeIf(stu -> stu.getroll() == del);
                    if (removed) 
                        System.out.println("Student Deleted Successfully");
                    else 
                        System.out.println("Student Not Found");
                    
                    break;

                case 4:
                    System.out.println("--------All Student Data--------");
                    
                    if (list.isEmpty()) 
                        System.out.println("No student records found.");
                    else
                        for (Student2 stu : list) 
                            stu.dispData();
                        
                    break;

                case 5:
                    System.out.println("Students Sorted by Roll No:");
                    for (Student2 stu : list) {
                        stu.dispData();
                    }
                    break;

                case 6:
                    System.out.println("Exiting... Bye!");
                    break;

                default:
                    System.out.println("Invalid Choice, Please Try Again");
            }
        }
    }
}