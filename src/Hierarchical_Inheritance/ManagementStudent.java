package Hierarchical_Inheritance;

public class ManagementStudent extends Student{
	
	int PSR;
	String role;
	String IC;
	
	public ManagementStudent(int rno, String name, int PSR, String role, String IC){
		
		super(rno, name);
		this.PSR = PSR;
		this.role = role;
		this.IC = IC;
		
	}
	
	public void disp() {
		System.out.println(rno + "  " + name + " " + PSR + " " + role + " " + IC);
	}

}
