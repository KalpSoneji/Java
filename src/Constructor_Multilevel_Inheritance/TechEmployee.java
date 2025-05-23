package Constructor_Multilevel_Inheritance;

public class TechEmployee extends Employee{
	
	String tech;
	
	public TechEmployee(int id, String name, int salary, String dsgn, String tech) {
		super(id, name, salary, dsgn);
		this.tech = tech;
	}

	void dispData(){
		System.out.println(name + " " + id + " " + salary + " " + dsgn + " " + tech);
	}

}

