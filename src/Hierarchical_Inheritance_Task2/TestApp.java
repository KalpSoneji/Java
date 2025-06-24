package Hierarchical_Inheritance_Task2;

import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Select between online, offline and hybrid: ");
		
		String mode = sc.nextLine();
		
		System.out.print("Enter Course ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Course Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Duration (in weeks): ");
        int duration = sc.nextInt();
        sc.nextLine();
        
		switch(mode) {
		
			case "online":
				System.out.print("Enter platform: ");
				String platform = sc.nextLine();
				OnlineCourse OnC = new OnlineCourse(id, duration, name, platform); 
				OnC.showOnlineDetails();
				break;
				
			case "offline":
				System.out.print("Enter room no: ");
				int roomNo = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter campus: ");
				String campusLocation = sc.nextLine();
				OfflineCourse OfC = new OfflineCourse(id, duration, name, roomNo, campusLocation);
				OfC.showOfflineDetails();
				break;
			
			case "hybrid":
				System.out.print("Enter room no: ");
				int HroomNo = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter platform: ");
				String Hplatform = sc.nextLine();
				Hybrid h = new Hybrid(id, duration, name, HroomNo, Hplatform);
				h.showHybridDetails();
				break;
			
		}
		
		sc.close();

	}

}
