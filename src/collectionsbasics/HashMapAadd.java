package collectionsbasics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapAadd {

	public static void main(String[] args) {

		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("teacher1", "Rahul");
		map1.put("teacher2", "Gaurav");
		map1.put("teacher3", "Vipin");
		map1.put("teacher4", "Shipra");
		map1.put("teacher5", "Test");

		Iterator<String> itr1 = map1.keySet().iterator();

		while (itr1.hasNext()) {
			String key = itr1.next();
			String value = map1.get(key);
			System.out.println("Key=" + key + "value=" + value);
		}

		
		System.out.println("--------------------------------");

		
		Iterator<Entry<String, String>> itr2 = map1.entrySet().iterator();

		while (itr2.hasNext()) {
			Entry<String, String> entry = itr2.next();
			System.out.println("key = " + entry.getKey()    + "   value =" + entry.getValue());

		}
		 System.out.println("--------------");
		 
		 map1.forEach((k,v) -> System.out.println("Key =" +      k  +  "value=" +v));  
	}

}
