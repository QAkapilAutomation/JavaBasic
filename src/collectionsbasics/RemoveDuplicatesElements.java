package collectionsbasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesElements {

	public static void main(String[] args) {
	
		
		ArrayList<Integer>numbers=new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,5,6,7,8,8,9,9));//Remove duplicates values
		
		
		//LinkedHashSet
		
		LinkedHashSet<Integer>linkedHasSet= new LinkedHashSet<Integer>(numbers);
		
		ArrayList<Integer>withoutDuplicatesNum=new ArrayList<Integer>(linkedHasSet);
		
		System.out.println(withoutDuplicatesNum);
		
		
		System.out.println("----------------------------------");
		

		ArrayList<String>numbers1=new ArrayList<String>(Arrays.asList("kapil","rahul","kapil","jyoti"));//Remove duplicates values
		
		
		//LinkedHashSet
		
		LinkedHashSet<String>linkedHasSet1= new LinkedHashSet<String>(numbers1);
		
		ArrayList<String>withoutDuplicatesNum1=new ArrayList<String>(linkedHasSet1);
		
		System.out.println(withoutDuplicatesNum1);
		
		
		//Stream class jdk 8
		
		ArrayList<Integer>marks=new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,5,6,7,8,8,9,9));//Remove duplicates values
		List<Integer>uniquemarks=marks.stream().distinct().collect(Collectors.toList());
		
		System.out.println(uniquemarks);
		
		
	}

}
