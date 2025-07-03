package Runtime_Polymorphism;

import java.util.Scanner;

public class TestApp {

    // This method handles any Person object using polymorphism and downcasting
    public void getPersonBasedOnPlace(Person person) {
        person.getBehave(); // Common behavior for all

        // Specific behaviors using safe downcasting
        if (person instanceof School) {
            School student = (School) person;
            student.getResult();
        } 
        
        else if (person instanceof Home) {
            Home child = (Home) person;
            child.getMovieOnTime();
        } 
        
        else if (person instanceof Org) {
            Org employee = (Org) person;
            employee.getSalary();
        } 
        
        else if (person instanceof PublicPlace) {
            PublicPlace citizen = (PublicPlace) person;
            citizen.getPublicEvent();
        }
    }

    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
        Person person = null;

        System.out.println("1) School");
        System.out.println("2) Org");
        System.out.println("3) Public Place");
        System.out.println("4) Home");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        // Upcasting based on user input
        switch (choice) {
        
        	case 1: person = new School(); 
        			break;
            
        	case 2: person = new Org(); 
        			break;
            
        	case 3: person = new PublicPlace(); 
        			break;
            
        	case 4: person = new Home(); 
        			break;
            
        	default:
                System.out.println("Invalid choice.");
                sc.close();
                return;
        }

        TestApp app = new TestApp();
        app.getPersonBasedOnPlace(person); // Pass base-class reference

        sc.close();
    }
}