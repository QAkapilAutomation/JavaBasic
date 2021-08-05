package javalearning;

import java.util.HashMap;
import java.util.Map;

public class TestLearing {

	public static void main(String[] args) {

		String s = "test is test are test only one test";

		String[] words = s.split(" ");

		Map<String, Integer> wordCount = new HashMap<String, Integer>();

		for (String word : words) {

			if (wordCount.containsKey(word)) {

				wordCount.put(word.toLowerCase(), wordCount.get(word) + 1);

			} else {
				wordCount.put(word, 1);

			}
		}

		System.out.println(wordCount);

		System.out.println("char count in string or a word ");
		
		
		
		char[]chars=s.toCharArray();

		
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		
		for(char ch1:chars) {
			if(String.valueOf(ch1).isEmpty())
			if(charCount.containsKey(ch1)) {
				charCount.put(ch1, charCount.get(ch1)+1);
			}else {
				charCount.put(ch1,1 );
			}
		}
		System.out.println(charCount);
	}

}
