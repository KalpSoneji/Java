package construtor;

public class Employee {

	private int id, salary;
	private String name, des, com;
	
	public Employee() {
		
		System.out.println("Default Employee Constructor");
		
	}

	public Employee(int id, String name, int salary, String des, String com) {
		
		this(id, salary, name, des);
		this.com = com;
		
	}

	public Employee(int id, int salary, String name, String des) {
		
		this(id, salary, name);
		this.des = des;
		
	}

	public Employee(int id, int salary, String name) {
		
		this(id, name);
		this.salary = salary;
		
		
	}

	public Employee(int id, String name) {
		
		this();
		this.id = id;
		this.name = name;
		
	}
	
	public void dispData() {
		
		System.out.println(id + " " + name + " " + salary + " " + des + " " + com);
		
	}

	
	
	
	

}
