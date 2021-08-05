package javalearning;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

	public static void main(String[] args) {
		
		
		String S1= "test is my test";
		
		String words[]= S1.split(" ");
		
		Map<String, Integer>wordCount= new HashMap<String, Integer>();
		
		for(String word:words) {
			
			if(wordCount.containsKey(word)) {
				
				wordCount.put(word.toLowerCase(), wordCount.get(word)+1 );
			}
			else {
				wordCount.put(word, 1 );
			}
		}
			System.out.println(wordCount);
	}

}
