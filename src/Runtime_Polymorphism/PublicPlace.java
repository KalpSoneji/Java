package Runtime_Polymorphism;

public class PublicPlace extends Person {
		
		@Override
		public void getBehave() {
			System.out.println("PublicPlace : Citizen Behaviour");
		}	
		
		public void getPublicEvent() {
			System.out.println("PublicPlace---Citizen---getPublicEvent()");
		}	
		
}