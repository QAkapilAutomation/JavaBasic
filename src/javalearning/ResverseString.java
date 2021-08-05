package javalearning;

public class ResverseString {

	public static void main(String[] args) {
		
		
		String s= "my name is kapil kumar";
		
		String reverseString=" ";
		
		String[] Words=s.split(" ");
		
		for(String w:Words) {
			
			String reverseWord=" ";
			
			for(int i=w.length()-1;i>=0;i--) {
				
				reverseWord=reverseWord+w.charAt(i);
				
				
			}
			
			reverseString=reverseWord+reverseString;
			
			
		}
		System.out.println(reverseString);
		
		

	}

}
