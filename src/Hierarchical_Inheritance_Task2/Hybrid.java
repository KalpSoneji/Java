package Hierarchical_Inheritance_Task2;

public class Hybrid extends Course{

	int roomNo;
	String platform;
	
	public Hybrid() {}

	public Hybrid(int courseID, int duration, String courseName, int roomNo, String platform) {
		super(courseID, duration, courseName);
		this.roomNo = roomNo;
		this.platform = platform;
	}
	
	void showHybridDetails() {
        displayCourseInfo();
        System.out.println("Room Number  : " + roomNo);
        System.out.println("Platform     : " + platform);
    }
	
}
