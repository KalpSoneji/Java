package Collection_List_Array_List;

import java.util.Scanner;

public class Student2 {
    int rno;
    String name;
    String course;
    int marks;

    public Student2() {}

    public Student2(int rno, String name, String course, int marks) {
        this.rno = rno;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    public int getroll() {
        return rno;
    }

    public String getname() {
        return name;
    }

    public String getcourse() {
        return course;
    }

    public int getmarks() {
        return marks;
    }

    public void dispData() {
        System.out.println(rno + "\t" + name + "\t" + course + "\t" + marks);
    }

    public void scandata() {
    	
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rno : ");
        rno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name : ");
        name = sc.nextLine();
        System.out.println("Enter the Course name : ");
        course = sc.nextLine();
        System.out.println("Enter marks : ");
        marks = sc.nextInt();
        
    }

    public void update() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Updated Name : ");
        name = sc.nextLine();
        System.out.println("Enter the Updated Course name : ");
        course = sc.nextLine();
        System.out.println("Enter the Updated Marks : ");
        marks = sc.nextInt();
    
    }

    public String toString() {
        return rno + "\t" + name + "\t" + course + "\t" + marks;
    }
}