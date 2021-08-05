package javalearning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestLearning5 {

	public static void main(String[] args) {
		
		
		
		Map<String, String>Map1= new HashMap<String, String>();
		
		Map1.put("QA", "Moha");
		Map1.put("SDET", "Kapil");
		Map1.put("BA", "Rahul");
		Map1.put("Manger", "Gaurav");
		
		
		//System.out.println(Map1);
		
	Iterator<String> it1=Map1.keySet().iterator();
	
	while(it1.hasNext()){
		String role=it1.next();
		
		//System.out.println(role);
		
		String name=Map1.get(role);
		
		System.out.println("Role="+role + ",Name="+name);

	}
	
	Iterator<Entry<String,String>>it2=Map1.entrySet().iterator();
	while(it2.hasNext()) {
		
		Entry<String,String>it3=it2.next();
		
		String role=it3.getKey();
		String Name =it3.getValue();
		
	System.out.println("Role is ="+role+"-Name is ="+Name);
		
	}

}
}
