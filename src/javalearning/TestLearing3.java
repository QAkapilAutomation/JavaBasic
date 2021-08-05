package javalearning;

public class TestLearing3 {

	public static void main(String[] args) {


		String[] word= {"Java","Php","C#","Java","C#"};
		
		for(int i=0;i<word.length;i++) {
			
			for(int j=i+1;j<word.length;j++) {
				
				if(word[i].equalsIgnoreCase(word[j])) {
					System.out.println(word[i]);
				}
				
			}
			
		}

	}

}
