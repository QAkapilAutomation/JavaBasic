package javalearning;

public class Rev {

	public static void main(String[] args) {
		
		
		String s="kapil";
		int length = s.length();
		String rev= "";
		
		for(int i=length-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);

	}

}
