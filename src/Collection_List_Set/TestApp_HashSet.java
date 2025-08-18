package Collection_List_Set;

import java.util.*;

public class TestApp_HashSet {

	public static void main(String[] args) {
		
		HashSet<String> list = new HashSet<String>();
		
		list.add("Kalp");
		list.add("Vidhi");
		list.add("Hash");
		list.add("Kalp");
		list.add("Hash");
		list.add("Vidhi");
		
		Iterator <String> itr = list.iterator();
		
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}

	}

}
