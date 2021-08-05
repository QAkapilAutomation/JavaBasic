package collectionsbasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
		
		
		ArrayList<String>ar= new ArrayList<String>();
		ar.add("Java");
		ar.add("C#");
		ar.add("Python");
		ar.add("Rubby");
		ar.add("PHp");
		
		
		
		ArrayList<String>ar1= new ArrayList<String>();
		ar1.add("Selenium");
		ar1.add("Devops");
		
		
//		ar.addAll(ar1);
//		//System.out.println(ar);
//		
//		ar.addAll(3, ar1);
//		
//		System.out.println(ar);
//		
//		//ar.clear();
//		
//		//System.out.println(ar);
		
		ArrayList<String>clonelist=(ArrayList<String>)ar.clone();
		
		System.out.println(clonelist);
		
		ArrayList<String>list= new ArrayList<String>(Arrays.asList("Kapil","Rahul","rohan","Den","Kapil","Ken"));
		int index=list.lastIndexOf("Ken");
		
		System.out.println(index);
		
		ArrayList<Integer>numbers= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		numbers.removeIf(num-> num%2==0);
		System.out.println(numbers);
		
		list.retainAll(Collections.singleton("hds"));
		
		System.out.println(list);

	}

}
