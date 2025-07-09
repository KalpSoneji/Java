
package RunTime_Polymorphism_Task1;

import java.util.Scanner;

public class TestApp {

	public void getBallBySport(Ball ball) {

		ball.random();

		if (ball instanceof Cricket) {
			Cricket cric = (Cricket) ball;
			cric.caught();
		}

		else if (ball instanceof Football) {
			Football fb = (Football) ball;
			fb.goal();
		}

		else if (ball instanceof Golf) {
			Golf gf = (Golf) ball;
			gf.putt();
		}

		else if (ball instanceof BasketBall) {
			BasketBall bb = (BasketBall) ball;
			bb.basket();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Ball ball = null;

		System.out.println("1. Cricket\n2. Football\n3. Golf\n4. BasketBall");
		System.out.print("Enter your choice: ");

		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			ball = new Cricket();
			break;

		case 2:
			ball = new Football();
			break;

		case 3:
			ball = new Golf();
			break;

		case 4:
			ball = new BasketBall();
			break;

		default:
			System.out.println("Invalid choice");
			break;
		}

		TestApp app = new TestApp();
		app.getBallBySport(ball);

		sc.close();
	}
}
