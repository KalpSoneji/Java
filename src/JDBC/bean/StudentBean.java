package JDBC.bean;

public class StudentBean {

	private int id;
	private String name;
	private int std;
	private int marks;
	
	public StudentBean() {}

	public StudentBean(int id, String name, int std, int marks) {
		this.id = id;
		this.name = name;
		this.std = std;
		this.marks = marks;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getStd() {
		return std;
	}
	public int getMarks() {
		return marks;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}
