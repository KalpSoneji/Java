package Collection_List_Array_List;

import java.util.Scanner;

public class Student {

    int rno;
    String name;
    int std;

    public Student() {}

    public Student(int rno, String name, int std) {
        this.rno = rno;
        this.name = name;
        this.std = std;
    }

    public int getroll() {
        return rno;
    }

    public void dispData() {
        System.out.println(rno + "\t" + name + "\t" + std);
    }

    public void scandata() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rno : ");
        rno = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter Name : ");
        name = sc.nextLine();
        System.out.println("Enter std : ");
        std = sc.nextInt();
        
    }

    public void update() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Updated Name : ");
        name = sc.nextLine();
        System.out.println("Enter the Updated Std : ");
        std = sc.nextInt();
        
    }

    public String toString() {
        return rno + "\t" + name + "\t" + std;
    }
}