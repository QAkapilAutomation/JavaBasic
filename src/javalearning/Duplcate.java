package javalearning;

public class Duplcate {

	public static void main(String[] args) {
		
		
		String[] names= {"java","PHP","Java"};
		
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate element is"   +names[i] );
				}
				//System.out.println("Duplicate element is"   +names[i] );
			}
		}

	}

}
