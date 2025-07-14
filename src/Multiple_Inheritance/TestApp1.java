package Multiple_Inheritance;

import java.util.Scanner;

public class TestApp1 {

	public void getPersonBasedOnPlace(Person person) {
		person.getBehave();

		if (person instanceof School) {
			School student = (School) person;
			student.getResult();
		} else if (person instanceof Home) {
			Home chlid = (Home) person;
			chlid.getMovieOnTime();
		} else if (person instanceof PublicPlace) {
			PublicPlace citizen = (PublicPlace) person;
			citizen.getPublicEvent();
		} else if (person instanceof Org) {
			Org employee = (Org) person;
			employee.getSalary();
		}
	}

	public static void main(String[] args) {

		TestApp1 app1 = new TestApp1();
		Person person = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("1) For School");
		System.out.println("2) For Org");
		System.out.println("3) For PublicPlace");
		System.out.println("4) For Home");
		System.out.print("Enter Below Choice: ");
		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			School student = new School();
			app1.getPersonBasedOnPlace(student);
			break;

		case 2:
			Org employee = new Org();
			app1.getPersonBasedOnPlace(employee);
			break;

		case 3:
			PublicPlace citizen = new PublicPlace();
			app1.getPersonBasedOnPlace(citizen);
			break;

		case 4:
			Home child = new Home();
			app1.getPersonBasedOnPlace(child);
			break;
		}
		Person.testStatic();

		person = new Home();
		person.testdefault();
	}

}