package Multiple_Inheritance;

public class PublicPlace implements Person {

	@Override
	public void getBehave() {
		System.out.println("PublicPlace : citizen Behaviour");
	}

	public void getPublicEvent() {
		System.out.println("PublicPlace---Citizen---getPublicEvent()");
	}
}
