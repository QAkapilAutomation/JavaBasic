package collectionsbasics;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArrays {

	public static void main(String[] args) {
		
		
		ArrayList<String>names= new ArrayList<String>(Arrays.asList("Kapil","Rahul","Gaurav","Ken","Shipra"));
		
		Object ar[]=names.toArray();
		
		for(Object o:ar) {
			
			System.out.println(o);
			
		}

	}

}
