package Collection_List_Sorting_Comparable;

import java.util.*;

public class TestApp1 {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Kalp", 12);
		Student s2 = new Student(2, "Vidhi", 11);
		Student s3 = new Student(3, "Hash", 10);
		
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			s.dispData();
		}
		
		Collections.sort(list);		

        System.out.println("\nSorting by name:\n");
        
        for (Student s : list) 
            s.dispData();
        
	}

}
