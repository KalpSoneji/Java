package Hierarchical_Inheritance_Task2;

public class OfflineCourse extends Course{

	int roomNo;
	String campusLocation;
	
	public OfflineCourse() {}

	public OfflineCourse(int courseID, int duration, String courseName, int roomNo, String campusLocation) {
		super(courseID, duration, courseName);
		this.roomNo = roomNo;
		this.campusLocation = campusLocation;
	}
	
	void showOfflineDetails() {
        displayCourseInfo();
        System.out.println("Room Number  : " + roomNo);
        System.out.println("Campus       : " + campusLocation);
    }
	
}
