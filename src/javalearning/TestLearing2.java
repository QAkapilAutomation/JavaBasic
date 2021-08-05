package javalearning;

public class TestLearing2 {

	public static void main(String[] args) {
		
		
		String S= "My name is jyoti";
		
		
		String revString=" ";
		
		for(int i=S.length()-1;i>=0;i--) {
			revString=revString+S.charAt(i);
			
		}
		
		
		System.out.println(revString);
	}

}
