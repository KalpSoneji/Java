package ImmutableString;

public class Concat {

	public static void main(String[] args) {

		String name = "Kalp";
		String surname = "Soneji";
		
		System.out.println("Name : " + name);
		System.out.println("Surname : " + surname);
		
		String full_name = name.concat(" ".concat(surname));
		
		System.out.println("Name : " + name);
		System.out.println("Surname : " + surname);
		System.out.println("Full name : " + full_name);

	}

}
