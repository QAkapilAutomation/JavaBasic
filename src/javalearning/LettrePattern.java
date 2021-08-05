package javalearning;

public class LettrePattern {

	public static void main(String[] args) {


		int alpa=65;
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				
				System.out.print((char)(alpa+j)+" ");
			}
			alpa++;
			System.out.println();
		}


		System.out.println("------------------------");
		int alpa1=65;
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				
				System.out.print((char)(alpa1)+" ");
			}
			alpa1++;
			System.out.println();
		}

	}

}
