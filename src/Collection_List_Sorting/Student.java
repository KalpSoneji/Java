package Collection_List_Sorting;

import java.util.*;

public class Student implements Comparable<Student> {

	int rno; 
	String name;
	int std;
	
	public Student() {}

	public Student(int rno, String name, int std) {
		this.rno = rno;
		this.name = name;
		this.std = std;
	}

	public int getRno() {
		return rno;
	}

	public String getName() {
		return name;
	}

	public int getStd() {
		return std;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStd(int std) {
		this.std = std;
	}
	
	public void dispData() {
		System.out.println(rno + "\t" + name + "\t" + std);
	}

	public void scanData() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rno: ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter std: ");
		std = sc.nextInt();

	}

//	@Override
//	public int compareTo(Student s2) {
//		
//		if(getStd() > s2.getStd())
//			return 1;
//		else if(getStd() < s2.getStd())
//			return -1;
//		else
//			return 0;
//		
//	}
	
	@Override
	public int compareTo(Student s2) {
		
		return getName().compareTo(s2.getName());
		
	}
	
}
