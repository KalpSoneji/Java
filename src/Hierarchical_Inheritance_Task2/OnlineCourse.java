package Hierarchical_Inheritance_Task2;

public class OnlineCourse extends Course{

	String platform;
	
	public OnlineCourse() {}

	public OnlineCourse(int courseID, int duration, String courseName, String platform) {
		super(courseID, duration, courseName);
		this.platform = platform;
	}
	
	void showOnlineDetails() {
        displayCourseInfo();
        System.out.println("Platform     : " + platform);
    }
	
}
