package javalearning;

public class JunkWordRemove {

	public static void main(String[] args) {
		
		String S="@^%@$@^#$!^%#@^%abcPQASD732873283";
		
		String S1=S.replaceAll("[^a-zA-Z]", "");
		
		System.out.println(S1);
		
		
	}

}
