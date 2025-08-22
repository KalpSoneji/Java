package Collection_List_Sorting_Comparator;

import java.util.Comparator;

public class NamewiseSorting implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.getName().compareTo(s2.getName());
		
	}
	
}