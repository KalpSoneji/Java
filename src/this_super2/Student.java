package this_super2;

public class Student extends Person{

	int rno, std, marks;
	
	public Student() {
		System.out.println("Student - Def Con");
	}

	public Student(int rno, String name, int std, int marks) {
	
		super(name);
		System.out.println("START - Para Con");
		this.rno = rno;
		this.std = std;
		this.marks = marks;
		System.out.println("EXIT - Para Con");
		
	}
	
	public void dispData() {
		System.out.println(rno + "\t" + name + "\t" + std + "\t" + marks);
	}
	
}
