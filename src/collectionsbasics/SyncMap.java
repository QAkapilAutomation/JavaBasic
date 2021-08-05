package collectionsbasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SyncMap {

	public static void main(String[] args) {
		
		
		Map<String, String>map1= new HashMap<String, String>();
		map1.put("1", "Kapil");
		map1.put("2", "Rahul");
		
		Map<String,String>Syncmap=Collections.synchronizedMap(map1);
		
		System.out.println(Syncmap);
		
		ConcurrentHashMap<String, String>Syncmap1= new ConcurrentHashMap<String, String>();
		
		Syncmap1.put("1", "Kapil");
		Syncmap1.put("2", "Rahul");
		
		System.out.println(Syncmap1.get("2"));
		
		
		System.out.println("----------------------------------------------");
		
		ArrayList<String> test = new ArrayList<>(map1.values());
		
		for(String t:test) {
			
			System.out.println(t);
		}
			
		
		

	}

}
