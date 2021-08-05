package javalearning;

public class TestLearing4 {

	public static void main(String[] args) {


		String S1="My name is kapil";
		
		String S[]=S1.split(" ");
		
		for(String s2:S) {
			
			System.out.print(s2 +""+ " ");
		}
		System.out.println("    ");
		
		for(int i=S.length-1;i>=0;i--) {
			System.out.print(S[i]+""+"   ");
		}
		
	}

}
