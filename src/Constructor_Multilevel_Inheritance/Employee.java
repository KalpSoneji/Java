package Constructor_Multilevel_Inheritance;

public class Employee extends Person{
	
	int id, salary;
	String dsgn;
	
	public Employee(int id, String name, int salary, String dsgn) {
		
		super();
//		super(name);
		this.id = id;
		this.salary = salary;
		this.dsgn = dsgn;
		
	}

}

//if we use super(), then we need to give a
//default constructor to Person.java(Parent file) 

//since we are using super(name), it 
//already exists in Person.java(Parent file)
