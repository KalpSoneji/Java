package construtor;

public class Student {

	private int rno, std;
	private String name;
	
	public Student() {
		
		System.out.println("START : Default Student Constructor");
		
		System.out.println(rno + " " + name + " " + std);
		
		rno = 1;
		name = "Kalp";
		std = 12;
		
		System.out.println(rno + " " + name + " " + std);
		
		System.out.println("EXIT : Default Student Constructor");
		
	}
	
	public Student(int rno, String name, int std) {
		
		System.out.println("START : Parameterized constructor starts here");
		
		this.rno = rno;
		this.name = name;
		this.std = std;
		
		System.out.println("EXIT : Parameterized constructor ends here");
		
	}
	
	public Student(Student s) {
	
		System.out.println("START : Parameterized constructor starts here" + this);
		
		this.rno = s.rno;
		this.name = s.name;
		this.std = s.std;
		
		System.out.println("EXIT : Parameterized constructor ends here");
		
	}
	
	public Student(int rno, String name) {
		
		System.out.println("START : Parameterized constructor starts here" + this);
		
		this.rno = rno;
		this.name = name;
		
		System.out.println("EXIT : Parameterized constructor ends here");
		
	}
	
	public int getrno() {
		return rno;
	}
	
	public void setrno(int rno){
		this.rno = rno;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name){
		this.name = name;
	}
	
	public int getstd() {
		return std;
	}
	
	public void setstd(int std){
		this.std= std;
	}

}
