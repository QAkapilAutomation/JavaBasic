package javalearning;

import java.util.HashMap;
import java.util.Map;

public class CharDuplicate {

	public static void main(String[] args) {
		
		String S1= "test to test";
		//t=2
		//e=1
		//s=1
		
		Map<Character,Integer>charMap= new HashMap<Character,Integer>();
		
		
		char[] Words=S1.toCharArray();
		
		for(char word:Words) {
			//if(!String.valueOf(word).isEmpty()) {
			//System.out.println(word);
			
			if(charMap.containsKey(word)) {
				charMap.put(word,charMap.get(word)+1 );
				
				
			}else {
				charMap.put(word, 1);
				
			}
			
		}
		System.out.println(charMap);		
			
			
			
			
	}

}
