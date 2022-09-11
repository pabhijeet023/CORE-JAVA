package collection;

import java.util.HashMap;

public class Mapexample {
	
public static void main ( String [] args) {
	
	HashMap<Integer, String> map1 = new HashMap<Integer, String>();
	
		map1.put(1,"Matt");
		map1.put(2,"Kate");
		map1.put(3,"John");
		map1.put(4,"Kathy");
		map1.put(5,"Matt");
		map1.put(2,"Arpita");           // Kate is replaced with Arpita
		map1.put(100,"Matthew");
	System.out.println(map1);
	System.out.println(map1.get(2));          // to get data at 2nd key
	
		map1.remove(100);
	System.out.println(map1);
	
	for ( Integer key: map1.keySet()) {
		System.out.print(key);
		System.out.println(" "+map1.get(key));
	}
		
		
		
	}

}
