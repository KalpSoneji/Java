package Simple_Inheritance;

public class Student_Constructor extends Person_Constructor{

	int rno, std, marks;
	
	public Student_Constructor() {
		System.out.println("Student - Default Constructor");
	}

	public Student_Constructor(int rno, String name, int std, int marks) {
		System.out.println("START - Parameterized Student Constructor");
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
		System.out.println("EXIT - Parameterized Student Constructor");
	}
	
	public void dispData() {
		System.out.println(rno + "\t" + name + "\t" + std + "\t" + marks);
	}
	
}
