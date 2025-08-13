package Collection_List;

import java.util.*;

public class Array_List {

    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<Object>();

        list.add(1);
        list.add(2.34);
        list.add("Kalp");
        list.add(8572L);
        list.add(5462f);
        list.add('M');

        Student s1 = new Student(1, "Kalp", 12);

        list.add(s1);

        System.out.println("List size = " + list.size());
        
//        System.out.println("\nList Elements: ");
//        
//        for (int i = 0; i < list.size(); i++) {
//        
//        	Object obj = list.get(i); 
//            
//        	if (obj instanceof Student) 
//                ((Student) obj).dispData();
//            else 
//                System.out.println(obj); 
//            
//        }
//
//        System.out.println("\nList Elements: ");
//        
//        for (Object obj : list) {
//            
//        	if (obj instanceof Student) 
//                ((Student) obj).dispData(); 
//            else 
//                System.out.println(obj); 
//            
//        }
        
//        Iterator itr = list.iterator();
//        
//        while(itr.hasNext()) {
//        	
//        	Object obj = itr.next();
//        	
//        	if (obj instanceof Student) 
//                ((Student) obj).dispData(); 
//            else 
//                System.out.println(obj);
//        	
//        }
        	
//        list.stream().forEach(System.out::println);
        
        list.stream().forEach(
        	
        	obj -> {
        		
        		if (obj instanceof Student) 
                    ((Student) obj).dispData(); 
                else 
                    System.out.println(obj);
        		
        	}
        		
        );
    	
        	
        
        
        
        
    }
}