package Collection_List_Sorting_Comparator;

import java.util.*;

public class Student {

	int rno, std;
	String name;

	public Student() {}

	public Student(int rno, String name, int std) {
		this.rno = rno;
		this.name = name;
		this.std = std;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void dispData() {
		System.out.println(rno + " " + name + " " + std);
	}

	public void scanData() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std  : ");
		std = sc.nextInt();
	}
}
