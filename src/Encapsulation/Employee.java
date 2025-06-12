package Encapsulation;

public class Employee {

	private int id;
	private String name;
	private int salary;
	private String dsgn;
	private String orgName;
	
	// Getters / Accessors
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public String getDsgn() {
		return dsgn;
	}

	public String getOrgName() {
		return orgName;
	}

	// Setters / Mutators 

	public void setId(int id) {
		this.id = id; //this.id -> data member		id -> local variable
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setDsgn(String dsgn) {
		this.dsgn = dsgn;
	}
	
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
}
