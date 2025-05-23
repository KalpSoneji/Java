package Hierarchical_Inheritance;

public class TechStudent extends Student{

	String PL;
	int LabScore;
	String PT;
	String IC;
	
	public TechStudent() {
		
	}
	
	public TechStudent(int rno, String name, int LabScore, String PL, String PT, String IC) {
		
		super(rno, name);
		
		this.IC = IC;
		this.LabScore = LabScore;
		this.PL = PL;
		this.PT = PT;
	}
	
	public void disp() {
		System.out.println(rno + " " + name + " " + PL + " " + LabScore + " " + PL + " " + PT + " " + IC);
	}

}
