package Multiple_Inheritance;

public class Home implements Person {

	@Override
	public void getBehave() {
		System.out.println("Home---Child : Son/Daughter Behaviour");
	}

	public void getMovieOnTime() {
		System.out.println("Home---Child--getMovieOnTime");
	}
}
