package this_super_task1;

import java.util.Scanner;

public class Result extends Student{

	int marks[] = new int[3];
	int total = 0;
	float avg = 0;
	
	Scanner sc = new Scanner(System.in);
	
	void getMarks() {
		
		System.out.print("Enter marks of 3 subjects: ");
		
		for(int i=0; i<3; i++)
			marks[i] = sc.nextInt();
		
	}
	
	void calcResult() {
		
		for(int i=0; i<3; i++)
			total += marks[i];
		
		avg = total / 3;
		
	}
	
	void dispResult() {
		for(int i=0; i<3; i++)
			System.out.print(marks[i] + "\t");
		
		System.out.println("Total = " + total);
		System.out.println("Average = " + avg);
	}
	
}
