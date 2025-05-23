package Hierarchical_Inheritance;

public class TestApp1 {
	
	public static void main(String[] args) {
		
		TechStudent TS = new TechStudent(1, "Kalp", 10, "SQL", "StudentManagement", "Oracle");
		
		ManagementStudent MS = new ManagementStudent(2, "Vidhi", 12, "HR", "FreeLancer");
		
		TS.disp();
		
		MS.disp();
		
	}
}
