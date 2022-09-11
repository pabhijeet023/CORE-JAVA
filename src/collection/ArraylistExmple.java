package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistExmple {

	public static void main(String[] args) {
  String [] array1 = {"abc", "pqr","xyz" };
  
  ArrayList<String> list1 = new ArrayList<String>();
   
  list1.add("John");
  list1.add("Leana");
  list1.add("Johny");
  list1.add("Leanel");
  list1.add("Johnathan");
  list1.add("Lean");
  
  System.out.println(" the items in list are"+ list1);
  System.out.println(" the size of list is "+list1.size());
  
  list1.remove(1);                       // removed Leana
  
  System.out.println(" the items in list after removing are"+ list1);
  System.out.println(" the size of list is "+list1.size());
  System.out.println(" the items on 4th point is "+ list1.get(3));               // to take data at 4th position
  
  list1.set(0,"James");
  System.out.println(" the items in updated list are"+ list1);
  System.out.println(" the size of list is "+list1.size());
  
  list1.add(1, "Leana");
  System.out.println(" the items in updated list are"+ list1);
  System.out.println(" the size of list is "+list1.size());
  
  Collections.sort(list1);
  System.out.println(" the items in updated list are"+ list1);
  
  for ( int index=0; index<list1.size(); index++) {          // simple for loop
	  System.out.println(list1.get(index));
  }
  
  for ( String name:list1) {
	  System.out.println(name);                                    // for each loop
	  
  }
  
  Collections.reverse(list1);
  System.out.println(" the items in updated list are"+ list1);
  
  for ( int index=0; index<list1.size(); index++) { 
	  if(list1.get(index).contains("Johny")) {                   // list1.get(index).equals("Johny")
          System.out.println(index);
          break;
 	  }
	 
  }
 		
	ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(77);
		list2.add(4);
	System.out.println(" the items in list are "+list2);
	System.out.println(" the size of list is "+list2.size());
	
		list2.add(45);
		list2.add(46);
	System.out.println(" the items in list are "+list2);
	System.out.println(" the size of list is "+list2.size());
		
	
		
		 
		
		
		
	}

}
