package Hierarchical_Inheritance_Task2;

public class Course {

	int courseID, duration;
	String courseName;
	
	public Course() {}

	public Course(int courseID, int duration, String courseName) {
		this.courseID = courseID;
		this.duration = duration;
		this.courseName = courseName;
	}
	
	void displayCourseInfo() {
        System.out.println("\nCourse ID    : " + courseID);
        System.out.println("Course Name  : " + courseName);
        System.out.println("Duration     : " + duration + " weeks");
    }
	
}
