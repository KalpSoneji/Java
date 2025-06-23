package Hierarchical_Inheritance;

public class ScienceStudent extends Student{

	String subject;
	
	public ScienceStudent() {}
	
	public ScienceStudent(int rno, String name, int std, int marks, String subject) {
		super(rno, name, std, marks);
		this.subject = subject;
	}
	
	void dispData() {
		System.out.println(rno + "\t" + name + "\t" + std + "\t" + marks + "\t" + subject);
	}
}
